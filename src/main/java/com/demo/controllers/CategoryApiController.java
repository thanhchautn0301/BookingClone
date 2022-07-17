package com.demo.controllers;

import com.demo.entities_api.AccomodationApi;
import com.demo.entities_api.CategoryApi;
import com.demo.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/category"})
public class CategoryApiController {
    @Autowired
    private ICategoryService categoryService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<CategoryApi>> findall() {
        try {
            return new ResponseEntity<List<CategoryApi>>(categoryService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CategoryApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallcategorywithsort", method=RequestMethod.GET)
    public ResponseEntity<List<CategoryApi>> findallcategorytypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<CategoryApi>>(categoryService.findallcategorywithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CategoryApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallcategorywithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<CategoryApi>> findallcategorytypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<CategoryApi>>(categoryService.findallcategorypaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CategoryApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<CategoryApi> create(@RequestBody CategoryApi categoryApi) {
        try {
            return new ResponseEntity<CategoryApi>(categoryService.create(categoryApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<CategoryApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody CategoryApi categoryApi) {
        try {
            return new ResponseEntity<Boolean>(categoryService.update(categoryApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int categoryApi_id) {
        try {
            return new ResponseEntity<Boolean>(categoryService.delete(categoryApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findcategorybyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<CategoryApi> findcategorybyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<CategoryApi>(categoryService.findCategoryById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<CategoryApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
