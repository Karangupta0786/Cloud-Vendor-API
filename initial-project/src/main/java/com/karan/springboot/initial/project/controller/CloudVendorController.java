package com.karan.springboot.initial.project.controller;

import com.karan.springboot.initial.project.model.Vendor;
import com.karan.springboot.initial.project.response.ResponseHandler;
import com.karan.springboot.initial.project.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {
    //    Vendor vendor;
    CloudVendorService vendorService;

    public CloudVendorController(CloudVendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("/{vendorId}")
    public ResponseEntity<Object> getCloudVendor(@PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("requested vendor details are given here!!",
                HttpStatus.OK, vendorService.getCloudVendor(vendorId));
//        return vendorService.getCloudVendor(vendorId);
    }

    @GetMapping("/getAll")
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    @PostMapping
    public String createVendor(@RequestBody Vendor vendor) {
//        this.vendor = vendor;
        vendorService.createCloudVendor(vendor);
        return "vendor is created successfully!!";
    }

    @PutMapping
    public String updateVendor(@RequestBody Vendor vendor) {
//        this.vendor = vendor;
        vendorService.updateCloudVendor(vendor);
        return "vendor is updated successfully!!";
    }

    @DeleteMapping("/{id}")
    public String deleteVendor(@PathVariable("id") String id) {
//        this.vendor = null;
        vendorService.deleteCloudVendor(id);
        return "vendor deleted successfully!!";
    }


}
