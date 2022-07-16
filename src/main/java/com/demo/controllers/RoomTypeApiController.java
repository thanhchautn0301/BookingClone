package com.demo.controllers;

import com.demo.entities_api.RoleApi;
import com.demo.entities_api.RoomTypeApi;
import com.demo.entities_api.StaffApi;
import com.demo.services.IRoleService;
import com.demo.services.IRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/roomtype"})
public class RoomTypeApiController {
    @Autowired
    private IRoomTypeService roomTypeService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<RoomTypeApi>> findall() {
        try {
            return new ResponseEntity<List<RoomTypeApi>>(roomTypeService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomTypeApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallroomtypewithsort", method=RequestMethod.GET)
    public ResponseEntity<List<RoomTypeApi>> findallroomtypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<RoomTypeApi>>(roomTypeService.findallroomtypewithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomTypeApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallroomtypewithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<RoomTypeApi>> findallroomtypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<RoomTypeApi>>(roomTypeService.findallpaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomTypeApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findroomtypebyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<RoomTypeApi> findroomtypebyid(@PathVariable int id) {
        try {
            return new ResponseEntity<RoomTypeApi>(roomTypeService.findByRoomTypeId(id), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<RoomTypeApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<RoomTypeApi> create(@RequestBody RoomTypeApi roomTypeApi) {
        try {
            return new ResponseEntity<RoomTypeApi>(roomTypeService.create(roomTypeApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<RoomTypeApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody RoomTypeApi roomTypeApi) {
        try {
            return new ResponseEntity<Boolean>(roomTypeService.update(roomTypeApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int roomTypeApi_id) {
        try {
            return new ResponseEntity<Boolean>(roomTypeService.delete(roomTypeApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
}
