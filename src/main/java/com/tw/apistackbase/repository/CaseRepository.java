package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.entity.CaseBrief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public interface CaseRepository extends JpaRepository<Case,Long> {
    // List<Case> findAllOrderByCaseHappenTime();
    List<Case> findAllByCaseName(String caseName);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Case c Set c.caseBrief = ?1 Where c.caseID = ?2")
    int updateCaseSetCaseBriefByCaseID(CaseBrief caseBrief,Long caseID);
}
