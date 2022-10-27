package com.practical.backend.service.impl;

import com.practical.backend.entity.Details;
import com.practical.backend.repository.DetailRepo;
import com.practical.backend.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailRepo detailRepo;

    @Override
    public int addDetails(Details detail) {
        Details save = null;
        try {
            save = detailRepo.save(detail);

        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
        return save.getId();
    }

    @Override
    public List<Details> getAllDetails() {
        List<Details> all = detailRepo.findAll();
        return all;
    }
}
