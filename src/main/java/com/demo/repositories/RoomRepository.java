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

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true")
    public List<RoomApi> findAllRoom();
    
    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true and roomType.staffId = :hostId")
    public List<RoomApi> findAllRoomByHostId(int hostId);

    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true")
    public List<RoomApi> findAllRoomSort(Sort sort);

    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true")
    public List<RoomApi> findAllRoomPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.RoomApi(id, accomodation.id, accomodation.name, roomType.id , roomType.name , roomType.staffId , name, description, status, price) from Room where status =true and id =:id")
    public RoomApi findRoomById(@Param("id") int id);
}
