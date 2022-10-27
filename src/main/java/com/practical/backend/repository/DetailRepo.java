package com.practical.backend.repository;

import com.practical.backend.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepo extends JpaRepository<Details, Integer> {

}
