package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CaseBrief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CaseBriefRepository extends JpaRepository<CaseBrief, Long> {
}
