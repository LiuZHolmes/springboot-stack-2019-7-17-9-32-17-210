package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Procuratorate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProcuratorateRepository extends JpaRepository<Procuratorate,Long> {
}
