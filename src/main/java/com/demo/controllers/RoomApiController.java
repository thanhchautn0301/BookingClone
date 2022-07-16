package com.demo.controllers;

import com.demo.entities_api.RoomApi;
import com.demo.entities_api.RoomTypeApi;
import com.demo.services.IRoomService;
import com.demo.services.IRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/room"})
public class RoomApiController {
    @Autowired
    private IRoomService roomService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findall() {
        try {
            return new ResponseEntity<List<RoomApi>>(roomService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallroomwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findallroomtypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<RoomApi>>(roomService.findallroomwithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallroomwithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findallroomtypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<RoomApi>>(roomService.findallroompaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findroombyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<RoomApi> findallroomtypewithpaginate(@PathVariable int id) {
        try {
            return new ResponseEntity<RoomApi>(roomService.findByRoomId(id), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<RoomApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<RoomApi> create(@RequestBody RoomApi roomApi) {
        try {
            return new ResponseEntity<RoomApi>(roomService.create(roomApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<RoomApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody RoomApi roomApi) {
        try {
            return new ResponseEntity<Boolean>(roomService.update(roomApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int roomApi_id) {
        try {
            return new ResponseEntity<Boolean>(roomService.delete(roomApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
}
