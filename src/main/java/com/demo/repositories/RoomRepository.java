package com.demo.repositories;

import com.demo.entities.Room;
import com.demo.entities.RoomType;
import com.demo.entities_api.RoomApi;
import com.demo.entities_api.RoomTypeApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true")
    public List<RoomApi> findAllRoom();
    
    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true and roomType.staffId = :hostId")
    public List<RoomApi> findAllRoomByHostId(@Param("hostId")int hostId);

    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true")
    public List<RoomApi> findAllRoomSort(Sort sort);

    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true")
    public List<RoomApi> findAllRoomPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true and id =:id")
    public RoomApi findRoomById(@Param("id") int id);

    @Query("select new com.demo.entities_api.RoomApi(R.id, R.accomodation.id , R.accomodation.name , R.roomType.id, R.roomType.name , R.roomType.staffId, R.name, R.description, R.status, R.price) " +
            "from Room R, RoomType RT " +
            "where R.status =true and R.accomodation.id =:id and " +
            "RT.id = R.roomType.id and RT.quantityAdult >= :adultQuantity and RT.quantityChildren >= :childrenQuantity and RT.capacity >= :total ")
    public List<RoomApi> findRoomByAdminRequest(@Param("id") int id, @Param("total") int total, @Param("childrenQuantity") int childrenQuantity, @Param("adultQuantity") int adultQuantity);

    @Query("select new com.demo.entities_api.RoomApi(R.id, R.accomodation.id , R.accomodation.name , R.roomType.id, R.roomType.name , R.roomType.staffId, R.name, R.description, R.status, R.price) " +
            "from Room R, RoomType RT " +
            "where R.status =true and R.accomodation.id =:id and RT.id = R.roomType.id and " +
            "RT.quantityAdult >= :adultQuantity and RT.quantityChildren >= :childrenQuantity and RT.capacity >= :total and " +
            "R.id not in ( " +
            "select BDT.room.id " +
            "from BookingDetail BDT " +
            "where (( BDT.checkout > :from and  BDT.checkin = :from) or (BDT.checkout > :to and  BDT.checkin < :to )) " +
            ") " +
            "group by R.id, R.accomodation.id , R.accomodation.name , R.roomType.id, R.roomType.name , R.roomType.staffId, R.name, R.description, R.status, R.price")
    public List<RoomApi> findRoomByGuestRequest(@Param("id") int id, @Param("from") Date from, @Param("to") Date to, @Param("total") int total, @Param("childrenQuantity") int childrenQuantity, @Param("adultQuantity") int adultQuantity);
}
