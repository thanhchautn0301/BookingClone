package com.demo.controllers;

import com.demo.entities_api.AccommodationDetail;
import com.demo.entities_api.AccomodationApi;
import com.demo.entities_api.RoomDetail;
import com.demo.entities_api.ServiceApi;
import com.demo.repositories.*;
import com.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = {"api/accomodation"})
public class AccomodationApiController {
    @Autowired
    private IAccomodationService accomodationService;

    @Autowired
    private CityService cityService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private RoomTypeService roomTypeService;

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private ImageService imageService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findall() {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallaccomodationwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findallaccomodationtypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findallaccomodationwithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallaccomodationwithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findallaccomodationtypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findallaccomodationpaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<AccomodationApi> create(@RequestBody AccomodationApi accomodationApi) {
    	
        try {
            return new ResponseEntity<AccomodationApi>(accomodationService.create(accomodationApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<AccomodationApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody AccomodationApi accomodationApi) {
        try {
            return new ResponseEntity<Boolean>(accomodationService.update(accomodationApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int accomodationApi_id) {
        try {
            return new ResponseEntity<Boolean>(accomodationService.delete(accomodationApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findaccomodationbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<AccomodationApi> findaccomodationbyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<AccomodationApi>(accomodationService.findAccomodationById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<AccomodationApi>(HttpStatus.BAD_REQUEST);
        }
    }

//    @RolesAllowed("SUPERADMIN")
    @RequestMapping(value="findaccomodationbyhostid/{id}", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findaccomodationbyhostid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findallaccomodationbyhost(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findaccomodationbycityid/{id}", method=RequestMethod.GET)
    public ResponseEntity<Object> findaccomodationbycityid(@PathVariable("id") int id) {
        try {
            List<AccomodationApi> accommodations = accomodationService.findallaccomodationbycityid(id);
            return new ResponseEntity<Object>(new Object() {
                public int accomodationQuantity = accommodations.size();
                public List<AccomodationApi> accomodations = accommodations;
            },HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Object>(null,HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findaccomodationbycategoryid/{id}", method=RequestMethod.GET)
    public ResponseEntity<Object> findaccomodationbycategoryid(@PathVariable("id") int id) {
        try {
            List<AccomodationApi> accommodations = accomodationService.findallaccomodationbycategoryid(id);
            return new ResponseEntity<Object>(new Object() {
                public int accomodationQuantity = accommodations.size();
                public List<AccomodationApi> accomodations = accommodations;
            },HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Object>(null,HttpStatus.BAD_REQUEST);
        }
    }

  

    @RequestMapping(value="findaccomodationbycityname", method=RequestMethod.GET)
    public ResponseEntity<Object> findaccomodationbycityname(@RequestParam("name") String name) {
        try {
            System.out.println("You are here !!!");
            List<AccomodationApi> accommodations = accomodationService.findallaccomodationbycityname(name);
            return new ResponseEntity<Object>(new Object() {
                public int accomodationQuantity = accommodations.size();
                public List<AccomodationApi> accomodations = accommodations;
            },HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Object>(null,HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findaccommodationdetail/{id}", method=RequestMethod.GET)
    public ResponseEntity<AccommodationDetail> findaccomodationdetail(@PathVariable("id") int id) {
        try {
            AccommodationDetail accommodationDetail = new AccommodationDetail();
            if((Integer)id != null) {
                List<RoomDetail> roomDetails = new ArrayList<RoomDetail>();


                List<ServiceApi> services = new ArrayList<ServiceApi>();

                List<String> images = new ArrayList<String>();

                AccomodationApi accomodationApi = new AccomodationApi();



                roomDetails = roomService.findAllByAccommodationId(id);

                services = serviceService.findServiceByAccommodationId(id);

                images =  imageService.findImageByAccommodationId(id);

                accomodationApi = accomodationService.getAccommodationById(id);

                accommodationDetail.setServices(services);
                accommodationDetail.setImages(images);
                accommodationDetail.setRooms(roomDetails);
                accommodationDetail.setAccommodation(accomodationApi);

            }



            return new ResponseEntity<AccommodationDetail>(accommodationDetail,HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<AccommodationDetail>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findaccommodationdetail1/{id}", method=RequestMethod.GET)
    public ResponseEntity<AccommodationDetail> findaccomodationdetail1(@PathVariable("id") int id,@RequestParam("fromDate") String fromDate,
                                                                      @RequestParam("toDate") String toDate, @RequestParam("adult") Integer adult, @RequestParam("children") Integer child) {
        try {
            AccommodationDetail accommodationDetail = new AccommodationDetail();
            if((Integer)id != null) {
                List<RoomDetail> roomDetails = new ArrayList<RoomDetail>();


                List<ServiceApi> services = new ArrayList<ServiceApi>();

                List<String> images = new ArrayList<String>();

                AccomodationApi accomodationApi = new AccomodationApi();

                Date from = null;
                Date to = null;

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                from = sdf.parse(fromDate.replace('-','/'));
                to = sdf.parse(toDate.replace('-','/'));

                roomDetails = roomService.findRoomByAccommodationId1(id,from,to,child,adult);

                services = serviceService.findServiceByAccommodationId(id);

                images =  imageService.findImageByAccommodationId(id);

                accomodationApi = accomodationService.getAccommodationById(id);

                accommodationDetail.setServices(services);
                accommodationDetail.setImages(images);
                accommodationDetail.setRooms(roomDetails);
                accommodationDetail.setAccommodation(accomodationApi);

            }



            return new ResponseEntity<AccommodationDetail>(accommodationDetail,HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<AccommodationDetail>(HttpStatus.BAD_REQUEST);
        }
    }
}
