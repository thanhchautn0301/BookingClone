package com.demo.services;

import com.demo.entities_api.RoomApi;
import com.demo.entities_api.RoomTypeApi;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IRoomService {
    public List<RoomApi> findall();
    public RoomApi findByRoomId(int roomId);
    public RoomApi create(RoomApi roomId);
    public boolean update(RoomApi roomId);
    public boolean delete(Integer roomId);
    public List<RoomApi> findallroomwithsort(String field);
    public List<RoomApi> findallroompaginate(int offset, int no);
    public List<RoomApi> findroombyguestrequest(Integer id, Date from, Date to, int capacity, int childrenQuantity, int adultQuantity);
    public List<RoomApi> findroombyadminrequest(Integer id, int capacity, int childrenQuantity, int adultQuantity);
}
