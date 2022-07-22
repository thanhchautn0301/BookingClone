package com.demo.repositories;

import com.demo.entities.Room;
import com.demo.entities.RoomType;
import com.demo.entities_api.RoleApi;
import com.demo.entities_api.RoomTypeApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {
    @Query("select new com.demo.entities_api.RoomTypeApi(id, name, capacity, quantityAdult, quantityChildren, description, status, staffId) from RoomType where status =true")
    public List<RoomTypeApi> findAllRoomType();

    @Query("select new com.demo.entities_api.RoomTypeApi(id, name, capacity, quantityAdult, quantityChildren, description, status, staffId) from RoomType where status =true")
    public List<RoomTypeApi> findAllRoomTypeSort(Sort sort);

    @Query("select new com.demo.entities_api.RoomTypeApi(id, name, capacity, quantityAdult, quantityChildren, description, status, staffId) from RoomType where status =true")
    public List<RoomTypeApi> findAllRoomTypePagination(Pageable pageable);

    @Query("select new com.demo.entities_api.RoomTypeApi(id, name, capacity, quantityAdult, quantityChildren, description, status, staffId) from RoomType where status =true and id = :id")
    public RoomTypeApi findRoomTypeById(@Param("id") int id);
    
    @Query("select new com.demo.entities_api.RoomTypeApi(id, name, capacity, quantityAdult, quantityChildren, description, status, staffId) from RoomType where status =true and staffId = :staffId")
    public List<RoomTypeApi> findAllByHostId(@Param("staffId") int staffId);
}
