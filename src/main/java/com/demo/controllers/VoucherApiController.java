package com.demo.controllers;

import com.demo.entities_api.VoucherApi;
import com.demo.services.IVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping(value = {"api/voucher"})
public class VoucherApiController {
    @Autowired
    private IVoucherService voucherService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<VoucherApi>> findall() {
        try {
            return new ResponseEntity<List<VoucherApi>>(voucherService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<VoucherApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallvoucherwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<VoucherApi>> findallvouchertypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<VoucherApi>>(voucherService.findallvoucherwithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<VoucherApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallvoucherwithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<VoucherApi>> findallvouchertypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<VoucherApi>>(voucherService.findallvoucherpaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<VoucherApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<VoucherApi> create(@RequestBody VoucherApi voucherApi) {
        try {
            return new ResponseEntity<VoucherApi>(voucherService.create(voucherApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<VoucherApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody VoucherApi voucherApi) {
        try {
            return new ResponseEntity<Boolean>(voucherService.update(voucherApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int voucherApi_id) {
        try {
            return new ResponseEntity<Boolean>(voucherService.delete(voucherApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findvoucherbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<VoucherApi> findvoucherbyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<VoucherApi>(voucherService.findVoucherById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<VoucherApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallbyhostid/{id}", method=RequestMethod.GET)
    public ResponseEntity<List<VoucherApi>> findallbyhostid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<List<VoucherApi>>(voucherService.findallbyhostid(id), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<VoucherApi>>(HttpStatus.BAD_REQUEST);
        }
    }
            @RequestMapping(value="findvoucherbyname", method=RequestMethod.GET)
    public ResponseEntity<VoucherApi> findvoucherbyname(@RequestParam("name") String name) {
        try {
            return new ResponseEntity<VoucherApi>(voucherService.findVoucherByName(name),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<VoucherApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
