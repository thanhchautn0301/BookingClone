package com.demo.services;

import com.demo.entities_api.RoleApi;
import com.demo.entities_api.RoomTypeApi;

import java.util.List;

public interface IRoomTypeService {
    public List<RoomTypeApi> findall();
    public RoomTypeApi findByRoomTypeId(int roomTypeApi_id);
    public RoomTypeApi create(RoomTypeApi roomTypeApi);
    public boolean update(RoomTypeApi roomTypeApi);
    public boolean delete(Integer id);
    public List<RoomTypeApi> findallroomtypewithsort(String field);
    public List<RoomTypeApi> findallpaginate(int offset, int no);
    public List<RoomTypeApi> findAllByHostId(int hostId);
}
