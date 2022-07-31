package com.booking.customer;

import com.booking.entities.Voucher;
import com.booking.services.IVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "customer/voucher")
public class VoucherAjaxController {
    @Autowired
    private IVoucherService voucherService;
    @RequestMapping(value = "check" , method = RequestMethod.GET,produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public Voucher check(@RequestParam("name") String name){
        return voucherService.findVoucherByName(name);
    }
}
