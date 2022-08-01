package com.demo.services;

import com.demo.entities.Accomodation;
import com.demo.entities.Room;
import com.demo.entities.RoomType;
import com.demo.entities_api.RoomApi;
import com.demo.entities_api.RoomDetail;
import com.demo.repositories.AccomodationRepository;
import com.demo.repositories.RoomRepository;
import com.demo.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoomService implements IRoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private AccomodationRepository accomodationRepository;

    @Autowired
    private RoomTypeRepository roomTypeRepository;
    @Override
    public List<RoomApi> findall() {
        return roomRepository.findAllRoom();
    }

    @Override
    public RoomApi findByRoomId(int roomId) {
        return roomRepository.findRoomById(roomId);
    }

    @Override
    public RoomApi create(RoomApi roomApi) {
        try {
            Room room = new Room();

            room.setDescription(roomApi.getDescription());
            room.setName(roomApi.getName());
            room.setStatus(roomApi.isStatus());
            room.setPrice(roomApi.getPrice());

            RoomType roomType = roomTypeRepository.findById(roomApi.getRoomType_id()).get();

            room.setRoomType(roomType);

            Accomodation accomodation = accomodationRepository.findById(roomApi.getAccomodation_id()).get();
            room.setAccomodation(accomodation);

            Room newRoom = roomRepository.save(room);
            roomApi.setId(newRoom.getId());
            return roomApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(RoomApi roomApi) {
       try {
           Room room = roomRepository.findById(roomApi.getId()).get();

           room.setDescription(roomApi.getDescription());
           room.setName(roomApi.getName());
           room.setStatus(roomApi.isStatus());
           room.setPrice(roomApi.getPrice());

           RoomType roomType = roomTypeRepository.findById(roomApi.getRoomType_id()).get();

           room.setRoomType(roomType);

           Accomodation accomodation = accomodationRepository.findById(roomApi.getAccomodation_id()).get();
           room.setAccomodation(accomodation);


           return roomRepository.save(room)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(Integer roomId) {
        try {
            Room room = roomRepository.findById(roomId).get();
            room.setStatus(false);
            return roomRepository.save(room)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<RoomApi> findallroomwithsort(String field) {
        return roomRepository.findAllRoomSort(Sort.by(field));
    }

    @Override
    public List<RoomApi> findallroompaginate(int offset, int no) {
        return roomRepository.findAllRoomPagination(PageRequest.of(offset,no));
    }

	@Override
	public List<RoomApi> findAllByHostId(int hostId) {
		return roomRepository.findAllRoomByHostId(hostId);
	}
    @Override
    public List<RoomApi> findroombyguestrequest(Integer id, Date from, Date to, int capacity, int childrenQuantity, int adultQuantity ) {
        return roomRepository.findRoomByGuestRequest(id, from, to, capacity,childrenQuantity, adultQuantity);
    }

    @Override
    public List<RoomApi> findroombyadminrequest(Integer id, int capacity, int childrenQuantity, int adultQuantity) {
        return roomRepository.findRoomByAdminRequest(id, capacity,childrenQuantity, adultQuantity);
    }

    // loc_home_accomm_detail
    @Override
    public List<RoomDetail> findAllByAccommodationId(int accommodationId) {
        return roomRepository.findRoomByAccommodationId(accommodationId);
    }

    @Override
    public List<RoomDetail> findRoomByAccommodationId1(int accommodationId, Date from, Date to, int childrenQuantity, int adultQuantity) {
        return roomRepository.findRoomByAccommodationId1(accommodationId,from,to,childrenQuantity,adultQuantity);
    }

    @Override
    public List<RoomApi> findRoomByCityDateRequest(String nameCity, Date from, Date to,  int childrenQuantity, int adultQuantity) {
        return roomRepository.findRoomByCityDateRequest(nameCity, from, to,  childrenQuantity, adultQuantity);
    }

	@Override
	public double findPriceByRoomId(int id) {
		return roomRepository.findPriceByRoomId(id);
	}


}
