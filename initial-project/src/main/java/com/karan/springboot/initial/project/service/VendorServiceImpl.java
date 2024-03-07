package com.karan.springboot.initial.project.service;

import com.karan.springboot.initial.project.exception.CloudVendorNotFoundException;
import com.karan.springboot.initial.project.model.Vendor;
import com.karan.springboot.initial.project.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements CloudVendorService{
    CloudVendorRepository vendorRepository;

    public VendorServiceImpl(CloudVendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public String createCloudVendor(Vendor vendor) {
        vendorRepository.save(vendor);
        return "vendor created successfully!!";
    }

    @Override
    public String updateCloudVendor(Vendor vendor) {
//        if (vendorRepository.findById(id).isEmpty()){
//            return "Incorrect id!!";
//        }
        vendorRepository.save(vendor);
        return "vendor updated successfully!!";
    }

    @Override
    public String deleteCloudVendor(String id) {
        vendorRepository.delete(vendorRepository.getReferenceById(id));
        return "vendor deleted successfully!!";
    }

    @Override
    public Vendor getCloudVendor(String id) {
        if (vendorRepository.findById(id).isEmpty()){
            throw new CloudVendorNotFoundException("Invalid vendor Id!!");
        }
        return vendorRepository.findById(id).get();
//        return vendorRepository.getReferenceById(id);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
