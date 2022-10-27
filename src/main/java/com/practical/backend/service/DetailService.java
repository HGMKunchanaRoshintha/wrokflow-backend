package com.practical.backend.service;

import com.practical.backend.entity.Details;

import java.util.List;

public interface DetailService {

    int addDetails(Details detail);

    List<Details> getAllDetails();

}
