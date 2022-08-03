package com.demo.controllers;

import com.demo.entities_api.BookingApi;
import com.demo.entities_api.RoleApi;
import com.demo.services.IBookingService;
import com.demo.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping(value = {"api/booking"})
public class BookingApiController {
    @Autowired
    private IBookingService bookingService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<BookingApi>> findall() {
        try {
            return new ResponseEntity<List<BookingApi>>(bookingService.findAll(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<BookingApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallbookingwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<BookingApi>> findallbookingwithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<BookingApi>>(bookingService.findAllBookingWithSort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<BookingApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallbookingpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<Object> findallbookingpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<Object>(new Object() {
                public int totalQuantityBookings = bookingService.findAll().size();
                public List<BookingApi> bookingsDisplay = bookingService.findAllPaginate(offset, pagesize);
                public double pagequantity = Math.ceil(Double.parseDouble(String.valueOf(bookingService.findAll().size()))/10);
            }, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<BookingApi> create(@RequestBody BookingApi bookingApi) {
        try {
            return new ResponseEntity<BookingApi>(bookingService.create(bookingApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<BookingApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody BookingApi bookingApi) {
        try {
            return new ResponseEntity<Boolean>(bookingService.update(bookingApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int bookingApi_id) {
        try {
            return new ResponseEntity<Boolean>(bookingService.delete(bookingApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findbookingbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<BookingApi> findbookingbyid(@PathVariable int id) {
        try {
            return new ResponseEntity<BookingApi>(bookingService.findByBookingId(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<BookingApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
