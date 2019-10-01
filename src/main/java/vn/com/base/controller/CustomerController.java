package vn.com.base.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.base.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Value("${spring.application.name}")
    String applicationName;

    private Logger LOGGER = LogManager.getLogger(CustomerController.class);

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public ResponseEntity<Object> getCustomers() {
        LOGGER.info("[Application Name]: " + applicationName);
        return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);
    }

//    @PostMapping
//    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
//
//    }
//
//    @PatchMapping("cusId/{cusId}")
//    public ResponseEntity<Object> updateCustomer(@PathVariable String cusId) {
//
//    }
//
//    @GetMapping("/cusId/{cusId}")
//    public ResponseEntity<Object> getCustomer(@PathVariable String cusId,
//                                              @RequestParam(value = "gender", required = false) boolean gender) {
//
//    }

}
