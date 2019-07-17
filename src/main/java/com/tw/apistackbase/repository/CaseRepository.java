package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CaseRepository extends JpaRepository<Case,Long> {
    // List<Case> findAllOrderByCaseHappenTime();
    List<Case> findAllByCaseName(String caseName);
}
