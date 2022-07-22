package com.demo.controllers;

import com.demo.entities_api.ImageApi;
import com.demo.services.IImageService;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;

@RestController
@RequestMapping(value = {"api/image"})
public class ImageApiController {
    @Autowired
    private IImageService imageService;
    
    private ServletContext servletContext ;
    
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<ImageApi>> findall() {
        try {
            return new ResponseEntity<List<ImageApi>>(imageService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ImageApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallimagewithsort", method=RequestMethod.GET)
    public ResponseEntity<List<ImageApi>> findallimagetypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<ImageApi>>(imageService.findallimagewithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ImageApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallimagewithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<ImageApi>> findallimagetypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<ImageApi>>(imageService.findallimagepaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ImageApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<ImageApi> create(@RequestBody ImageApi imageApi, MultipartFile file) {
        try {
            return new ResponseEntity<ImageApi>(imageService.create(imageApi, file), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ImageApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody ImageApi imageApi) {
        try {
            return new ResponseEntity<Boolean>(imageService.update(imageApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int imageApi_id) {
        try {
            return new ResponseEntity<Boolean>(imageService.delete(imageApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findimagebyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<ImageApi> findimagebyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<ImageApi>(imageService.findImageById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ImageApi>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="getimage/{name}", method=RequestMethod.GET ,produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImage(@PathVariable("name") String name) {
    
    	try {
    		InputStream in = servletContext.getResourceAsStream("/images/"+ name);
			return  IOUtils.toByteArray(in) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    	
    }
}
