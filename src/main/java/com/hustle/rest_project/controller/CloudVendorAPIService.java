package com.hustle.rest_project.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hustle.rest_project.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    private CloudVendor cloudVendor;

    @GetMapping("/{VendorId}")
    public CloudVendor getCloudVendorDetails(String vendorID) {
        return cloudVendor;
        // return new CloudVendor("C1", "Vendor 1", "Address 1", "xxxxxxxx");
    }

    @PostMapping("/")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping("/{vendorId}")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(String vendorID) {

        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }

}
