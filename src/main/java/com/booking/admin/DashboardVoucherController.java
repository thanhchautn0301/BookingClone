package com.booking.admin;

import com.booking.services.IAccommodationService;
import com.booking.services.IVoucherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.Voucher;

import java.io.IOException;

@Controller
@RequestMapping(value = "admin/dashboard/voucher")
public class DashboardVoucherController {
	@Autowired
	private IVoucherService voucherService;

	@Autowired
	private IAccommodationService accommodationService;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String voucher(ModelMap modelMap) {
		int hostId = 2;
		modelMap.put("vouchers", voucherService.findAllByHostId(hostId));
		modelMap.put("accommodations", accommodationService.findAllByHostId(hostId));
		return "admin/dashboard/voucher";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String voucher(Voucher voucher,RedirectAttributes redirectAttributes) throws IOException {
		voucher.setStatus(true);	
		Voucher result = voucherService.create(voucher);
			if (result != null) {
				redirectAttributes.addFlashAttribute("result", "failed");
			} else {
				redirectAttributes.addFlashAttribute("result", "success");
			}
			return "redirect:/admin/dashboard/voucher";
	}
	
	@RequestMapping(value = "edit",method = RequestMethod.POST)
	public String voucher(Voucher voucher,@RequestParam("expDate") String expDate
			,RedirectAttributes redirectAttributes) {
			voucher.setStatus(true);			
			boolean result = voucherService.update(voucher);
			if(result) {
				redirectAttributes.addFlashAttribute("result","success");
			}
			else {
				redirectAttributes.addFlashAttribute("result","failed");
			}
		return "redirect:/admin/dashboard/voucher";
	}
	
	@RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
	public String voucher(@PathVariable("id") int id
			,RedirectAttributes redirectAttributes) {
			boolean result = voucherService.delete(id);
			if(result) {
				redirectAttributes.addFlashAttribute("result","success");
			}
			else {
				redirectAttributes.addFlashAttribute("result","failed");
			}
		return "redirect:/admin/dashboard/voucher";
	}
}
