package com.demo.controllers;

import com.demo.entities_api.BookingApi;
import com.demo.entities_api.BookingDetailApi;
import com.demo.services.IBookingDetailService;
import com.demo.services.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/bookingdetail"})
public class BookingDetailApiController {
    @Autowired
    private IBookingDetailService bookingDetailService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<BookingDetailApi>> findall() {
        try {
            return new ResponseEntity<List<BookingDetailApi>>(bookingDetailService.findAll(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<BookingDetailApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallbookingdetailwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<BookingDetailApi>> findallbookingdetailwithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<BookingDetailApi>>(bookingDetailService.findAllBookingDetailWithSort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<BookingDetailApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallbookingdetailpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<Object> findallbookingdetailpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<Object>(new Object() {
                public int totalQuantityBookingDetails = bookingDetailService.findAll().size();
                public List<BookingDetailApi> bookingDetailsDisplay = bookingDetailService.findAllDetailPaginate(offset, pagesize);
                public double pagequantity = Math.ceil(Double.parseDouble(String.valueOf(bookingDetailService.findAll().size()))/10);
            }, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<Boolean> create(@RequestBody BookingDetailApi bookingDetailApi) {
        try {
            return new ResponseEntity<Boolean>(bookingDetailService.create(bookingDetailApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody BookingDetailApi bookingDetailApi) {
        try {
            return new ResponseEntity<Boolean>(bookingDetailService.update(bookingDetailApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int bookingDetailApi_id) {
        try {
            return new ResponseEntity<Boolean>(bookingDetailService.delete(bookingDetailApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findbookingdetailbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<BookingDetailApi> findbookingdetailbyid(@PathVariable int id) {
        try {
            return new ResponseEntity<BookingDetailApi>(bookingDetailService.findByBookingDetailId(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<BookingDetailApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
