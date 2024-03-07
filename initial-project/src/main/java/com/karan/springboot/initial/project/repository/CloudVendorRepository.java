package com.karan.springboot.initial.project.repository;

import com.karan.springboot.initial.project.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<Vendor,String> {
}
