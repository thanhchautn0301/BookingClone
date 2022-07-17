package com.demo.controllers;

import com.demo.entities_api.ReviewApi;
import com.demo.services.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/review"})
public class ReviewApiController {
    @Autowired
    private IReviewService reviewService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<ReviewApi>> findall() {
        try {
            return new ResponseEntity<List<ReviewApi>>(reviewService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ReviewApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallreviewwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<ReviewApi>> findallreviewtypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<ReviewApi>>(reviewService.findallreviewwithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ReviewApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallreviewwithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<ReviewApi>> findallreviewtypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<ReviewApi>>(reviewService.findallreviewpaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ReviewApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<ReviewApi> create(@RequestBody ReviewApi reviewApi) {
        try {
            return new ResponseEntity<ReviewApi>(reviewService.create(reviewApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ReviewApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody ReviewApi reviewApi) {
        try {
            return new ResponseEntity<Boolean>(reviewService.update(reviewApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int reviewApi_id) {
        try {
            return new ResponseEntity<Boolean>(reviewService.delete(reviewApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findreviewbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<ReviewApi> findreviewbyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<ReviewApi>(reviewService.findReviewById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ReviewApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
