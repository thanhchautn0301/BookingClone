package com.demo.controllers;

import com.demo.entities_api.InvoiceApi;
import com.demo.services.IInvoiceService;
import com.demo.services.ITurnoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = {"api/invoice"})
public class InvoiceApiController {
    @Autowired
    private IInvoiceService invoiceService;
    @Autowired
    private ITurnoverService turnoverService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<InvoiceApi>> findall() {
        try {
            return new ResponseEntity<List<InvoiceApi>>(invoiceService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<InvoiceApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallinvoicewithsort", method=RequestMethod.GET)
    public ResponseEntity<List<InvoiceApi>> findallinvoicetypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<InvoiceApi>>(invoiceService.findallinvoicewithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<InvoiceApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallinvoicewithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<InvoiceApi>> findallinvoicetypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<InvoiceApi>>(invoiceService.findallinvoicepaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<InvoiceApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<InvoiceApi> create(@RequestBody InvoiceApi invoiceApi) {
        try {
            return new ResponseEntity<InvoiceApi>(invoiceService.create(invoiceApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<InvoiceApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody InvoiceApi invoiceApi) {
        try {
            return new ResponseEntity<Boolean>(invoiceService.update(invoiceApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int invoiceApi_id) {
        try {
            return new ResponseEntity<Boolean>(invoiceService.delete(invoiceApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findinvoicebyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<InvoiceApi> findinvoicebyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<InvoiceApi>(invoiceService.findInvoiceById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<InvoiceApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallinvoicebycustomerid/{id}", method=RequestMethod.GET)
    public ResponseEntity<List<InvoiceApi>> findallinvoicebycustomerid(@PathVariable("id") int id) {
        try {
            List<InvoiceApi> invs = invoiceService.findallinvoicebycustomerid(id);
            return new ResponseEntity<List<InvoiceApi>>(invs,HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<InvoiceApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="turnoverOfHost", method=RequestMethod.POST)
    public ResponseEntity<Double> turnoverOfHost(@RequestParam("hostId") int hostId, @RequestParam(value = "accomodationId", required=false) Integer accomodationId,
    @RequestParam("fromDate") String fromDate, @RequestParam("untilDate") String untilDate) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date _fromDate = formatter.parse(fromDate);
            Date _untilDate = formatter.parse(untilDate);
            int _accomodationId = 0;
            if(accomodationId != null) _accomodationId = accomodationId.intValue();
            return new ResponseEntity<Double>(turnoverService.caculateTurnover(hostId,_accomodationId, _fromDate, _untilDate),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Double>(HttpStatus.BAD_REQUEST);
        }
    }
}
