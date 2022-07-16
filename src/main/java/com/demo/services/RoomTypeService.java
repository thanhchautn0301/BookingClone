package com.demo.services;

import com.demo.entities.RoomType;
import com.demo.entities_api.RoleApi;
import com.demo.entities_api.RoomTypeApi;
import com.demo.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeService implements IRoomTypeService {
    @Autowired
    private RoomTypeRepository roomTypeRepository;
    @Override
    public List<RoomTypeApi> findall() {
        return roomTypeRepository.findAllRoomType();
    }

    @Override
    public RoomTypeApi findByRoomTypeId(int roomTypeApi_id) {
        return roomTypeRepository.findRoomTypeById(roomTypeApi_id);
    }

    @Override
    public RoomTypeApi create(RoomTypeApi roomTypeApi) {
        try {
            RoomType roomType = new RoomType();

            roomType.setName(roomTypeApi.getName());
            roomType.setCapacity(roomTypeApi.getCapacity());
            roomType.setDescription(roomTypeApi.getDescription());
            roomType.setStatus(roomTypeApi.isStatus());
            roomType.setQuantityAdult(roomTypeApi.getQuantityAdult());
            roomType.setQuantityChildren(roomTypeApi.getQuantityChildren());
            roomType.setStaffId(roomTypeApi.getStaffId());

            RoomType newRoomType = roomTypeRepository.save(roomType);
            roomTypeApi.setId(newRoomType.getId());
            return roomTypeApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(RoomTypeApi roomTypeApi) {
        try {
            RoomType roomType = roomTypeRepository.findById(roomTypeApi.getId()).get();

            roomType.setName(roomTypeApi.getName());
            roomType.setCapacity(roomTypeApi.getCapacity());
            roomType.setDescription(roomTypeApi.getDescription());
            roomType.setStatus(roomTypeApi.isStatus());
            roomType.setQuantityAdult(roomTypeApi.getQuantityAdult());
            roomType.setQuantityChildren(roomTypeApi.getQuantityChildren());
            roomType.setStaffId(roomTypeApi.getStaffId());


            return roomTypeRepository.save(roomType) != null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        try {
            roomTypeRepository.deleteById(id);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<RoomTypeApi> findallroomtypewithsort(String field) {
        return roomTypeRepository.findAllRoomTypeSort(Sort.by(field));
    }

    @Override
    public List<RoomTypeApi> findallpaginate(int offset, int no) {
        List<RoomTypeApi> roomtypes = roomTypeRepository.findAllRoomTypePagination(PageRequest.of(offset,no));
        return roomtypes;
    }
}
