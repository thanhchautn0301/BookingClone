package com.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.entities_api.*;
import com.demo.jwt.JwtTokenUtil;
import com.demo.services.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.services.ICityService;
import com.demo.services.ICustomerService;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping(value = {"api/customer"})
public class CustomerApiController {
	@Autowired
	AuthenticationManager authManager;

	@Autowired
	IMailService mailService;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Autowired
	private ICustomerService customerService;

	@RequestMapping(value="login", method= RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody AuthRequest request) {
		try {
			Authentication authentication = authManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
			);
			CustomerApi customerApi =(CustomerApi) authentication.getPrincipal();
			if(!customerApi.isStatus()) {
				String activateToken = jwtTokenUtil.generateCustomerActivateToken(customerApi);
				AuthResponse authResponse = new AuthResponse("inactivate", activateToken, customerApi.getId());
				// Thuc hien gui mail verify email o day
				try {
					String isSuccess = mailService.sendSimpleMail(customerApi.getEmail(),"Activate your account","Please click the link to activate your account: http://localhost:9597/customer/verify?token="+authResponse.getAccessToken()+"&id="+authResponse.getId());
				} catch (Exception e) {
					e.printStackTrace();
				}
				return ResponseEntity.ok(authResponse);
			}
			else {
				String accessToken = jwtTokenUtil.generateCustomerAccessToken(customerApi);
				AuthResponse authResponse = new AuthResponse(customerApi.getEmail(), accessToken, customerApi.getId(), "ROLE_CUSTOMER");
				System.out.println("Customer access token: "+authResponse.getAccessToken());
				System.out.println("Customer id: "+authResponse.getId());
				return ResponseEntity.ok(authResponse);
			}
		} catch(HttpClientErrorException.BadRequest ex) {
			System.out.println("Loi: "+ HttpStatus.UNAUTHORIZED);
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
	
	@RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<CustomerApi>> findAll() {
        try {
            return new ResponseEntity<List<CustomerApi>>(customerService.findAllCustomer(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CustomerApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	@RequestMapping(value="findallcustomerwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<CustomerApi>> findallcustomerwithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<CustomerApi>>(customerService.findAllCustomerWithSort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CustomerApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	 @RequestMapping(value="findallcustomerpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
	    public ResponseEntity<Object> findallcustomerpaginate(@PathVariable int offset, @PathVariable int pagesize) {
	        try {
	            return new ResponseEntity<Object>(new Object() {
	                public int totalQuantityCities = customerService.findAllCustomer().size();
	                public List<CustomerApi> cityDisplay = customerService.findAllPaginate(offset, pagesize);
	                public double pagequantity = Math.ceil(Double.parseDouble(String.valueOf(customerService.findAllCustomer().size()))/10);
	            }, HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="create", method=RequestMethod.POST)
	    public ResponseEntity<Boolean> create(@RequestBody CustomerApi customerApi) {
	        try {
	            return new ResponseEntity<Boolean>(customerService.create(customerApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="update", method=RequestMethod.PUT)
	    public ResponseEntity<Boolean> update(@RequestBody CustomerApi customerApi) {
	        try {
	            return new ResponseEntity<Boolean>(customerService.update(customerApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	    public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
	        try {
	            return new ResponseEntity<Boolean>(customerService.delete(id),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="findcustomerbyid/{id}", method=RequestMethod.GET)
	    public ResponseEntity<CustomerApi> findcustomerbyid(@PathVariable("id") int id) {
	        try {
				CustomerApi customerApi = customerService.findCustomerById(id);
				System.out.println("Customer email: "+customerApi.getEmail());
	            return new ResponseEntity<CustomerApi>(customerApi,HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<CustomerApi>(HttpStatus.BAD_REQUEST);
	        }
	    }
	@RequestMapping(value="findcustomerbyemail", method=RequestMethod.GET)
	public ResponseEntity<CustomerApi> findcustomerbyemail(@RequestParam("email") String email) {
		try {
			return new ResponseEntity<CustomerApi>(customerService.findByEmail(email),HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<CustomerApi>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="activateaccount", method=RequestMethod.GET)
	public ResponseEntity<Integer> activateaccount(@RequestParam("id") int id) {
		try {
			int result = customerService.activateAccount(id);
			return new ResponseEntity<Integer>(result,HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Integer>(-1,HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="resetpw", method= RequestMethod.POST)
	public ResponseEntity<?> resetpw(@RequestParam("id") int id,@RequestParam("password") String password) {
		try {
			System.out.println("Bat dau reset pw");
			int result = customerService.resetPassword(id, password);
			return new ResponseEntity<Integer>(result,HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Integer>(-1,HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="resetemail", method= RequestMethod.PUT)
	public ResponseEntity<?> resetemail(@RequestParam("id") int id,@RequestParam("email") String email) {
		try {
			int result = customerService.resetEmail(id, email);
			return new ResponseEntity<Integer>(result,HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Integer>(-1,HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="resetphone", method= RequestMethod.PUT)
	public ResponseEntity<?> resetphone(@RequestParam("id") int id,@RequestParam("phone") String phone) {
		try {
			int result = customerService.resetPhone(id, phone);
			return new ResponseEntity<Integer>(result,HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Integer>(-1,HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="register", method= RequestMethod.POST)
	public ResponseEntity<Boolean> register(@RequestParam("email") String email,@RequestParam("password") String password) {
		try {
			CustomerApi customerApi = new CustomerApi();
			customerApi.setEmail(email);
			customerApi.setPassword(password);

			Boolean isSuccess = customerService.create(customerApi);

			return new ResponseEntity<Boolean>(isSuccess,HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Boolean>(false,HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value="forgotpw", method= RequestMethod.POST)
	public ResponseEntity<?> forgotpw(@RequestParam("email") String email) {
		try {
			CustomerApi customerApi = customerService.findByEmail(email);
			if(customerApi != null) {
				String resetPwToken = jwtTokenUtil.generateCustomerResetPwToken(customerApi);
				AuthResponse authResponse = new AuthResponse("resetpw", resetPwToken, customerApi.getId());

				// Thuc hien gui mail confirm va cho phep reset password
				try {
					String isSuccess = mailService.sendSimpleMail(customerApi.getEmail(),"Reset your password","Please click the link to reset your password: http://localhost:9597/customer/requestresetpw?token="+authResponse.getAccessToken()+"&id="+authResponse.getId());
					System.out.println(isSuccess);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return ResponseEntity.ok(authResponse);
			}
			else {
				System.out.println("Invalid email");
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
			}
		} catch(HttpClientErrorException.BadRequest ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

}
