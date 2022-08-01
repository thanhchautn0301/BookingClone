package com.demo.controllers;

import com.demo.entities.RoomType;
import com.demo.entities_api.RoomApi;
import com.demo.entities_api.RoomTypeApi;
import com.demo.helper.Util;
import com.demo.services.IRoomService;
import com.demo.services.IRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@RestController
@RequestMapping(value = {"api/room"})
public class RoomApiController implements ServletContextAware {
    @Autowired
    private IRoomService roomService;
    private ServletContext servletContext;
    
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findall() {
        try {
            return new ResponseEntity<List<RoomApi>>(roomService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findAllByHostId/{hostId}", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findAllByHostId(@PathVariable("hostId") int hostId) {
        try {
            return new ResponseEntity<List<RoomApi>>(roomService.findAllByHostId(hostId), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findroombyguestrequest", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findroombyguestrequest(@RequestParam("id") int id,@RequestParam(value = "daterange") String dateRange,@RequestParam("capacity") int capacity,@RequestParam("childrenquantity") int childrenQuantity,@RequestParam("adultquantity") int adultQuantity) {
        try {
            Date from = null;
            Date to = null;
            if(dateRange !=null) {
                String[] dates = dateRange.split("to");

                String f = dates[0].trim().replace("-","/");
                String t = dates[1].trim().replace("-","/");

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                from = sdf.parse(f);
                to = sdf.parse(t);
            }
            return new ResponseEntity<List<RoomApi>>(roomService.findroombyguestrequest(id, from, to, capacity, childrenQuantity, adultQuantity), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findroombyadminrequest", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findroombyadminrequest(@RequestParam("id") int id, @RequestParam("capacity") int capacity,@RequestParam("childrenquantity") int childrenquantity,@RequestParam("adultquantity") int adultquantity) {
        try {
            return new ResponseEntity<List<RoomApi>>(roomService.findroombyadminrequest(id,capacity, childrenquantity, adultquantity), HttpStatus.OK);
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
//
//    @RequestMapping(value="findallroomwithaccomidandbookingdetail", method=RequestMethod.GET)
//    public ResponseEntity<List<RoomApi>> findallroomwithaccomidandbookingdetail(@RequestParam("id") int id, @RequestParam("daterange") String dateRange) {
//        try {
//            String[] dates = dateRange.split("to");
//
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
////            Date from = sdf.parse(dates[0].trim());
//            Date from = sdf.parse("02/07/2022");
////            Date to = sdf.parse((dates[1]).trim());
//            Date to = sdf.parse("03/07/2022");
//            System.out.println(from);
//            System.out.println(to);
//            return new ResponseEntity<List<RoomApi>>(roomService.findallroomwithaccomidandbookingdetail(id, from, to), HttpStatus.OK);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
//        }
//    }

    @RequestMapping(value="findroombyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<RoomApi> findroombyid(@PathVariable int id) {
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
  

	@Override
	public void setServletContext(ServletContext servletContext) {
		// TODO Auto-generated method stub
		this.servletContext = servletContext;
	}
	
	@RequestMapping(value="findprice/{id}", method=RequestMethod.GET)
    public ResponseEntity<Double> findPrice(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<Double>(roomService.findPriceByRoomId(id), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Double>(0.0,HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value="findroombycitydaterequest", method=RequestMethod.GET)
    public ResponseEntity<List<RoomApi>> findroombycitydaterequest(@RequestParam("name") String name,@RequestParam(value = "daterange") String dateRange, @RequestParam(value = "category") String category) {
        try {
            Date from = null;
            Date to = null;
            RoomType roomType = null;
            if(dateRange !=null) {
                String[] dates = dateRange.split("to");

                String f = dates[0].trim().replace("-","/");
                String t = dates[1].trim().replace("-","/");

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                from = sdf.parse(f);
                to = sdf.parse(t);
            }
            if(category != null){
                roomType = Util.GetRoomType(category);
            }
            System.out.print("Quantity: "+ roomType.getQuantityAdult());
            List<RoomApi> result = roomService.findRoomByCityDateRequest(name, from, to, roomType.getQuantityChildren(), roomType.getQuantityAdult());
            return new ResponseEntity<List<RoomApi>>(result, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoomApi>>(HttpStatus.BAD_REQUEST);
        }
    }

}
