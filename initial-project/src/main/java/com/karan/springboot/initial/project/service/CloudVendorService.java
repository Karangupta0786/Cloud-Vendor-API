package com.karan.springboot.initial.project.service;

import com.karan.springboot.initial.project.model.Vendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(Vendor vendor);
    public String updateCloudVendor(Vendor vendor);
    public String deleteCloudVendor(String id);
    public Vendor getCloudVendor(String id);
    public List<Vendor> getAllVendors();

}
