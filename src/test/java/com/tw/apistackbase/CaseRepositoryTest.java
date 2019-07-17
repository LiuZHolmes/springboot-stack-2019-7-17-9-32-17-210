package com.tw.apistackbase;


import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.repository.CaseRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CaseRepositoryTest {

    @Autowired
    CaseRepository caseRepository;

    private List<Case> testCases;

    @Before
    public void setUp() throws Exception {
        testCases = IntStream.rangeClosed(1, 10).boxed()
                .map(x -> new Case("New_Case_" + x, new Date().getTime()))
                .collect(Collectors.toList());
    }

    @Test
    public void should_return_a_case_when_save_it() {
        // given

        // when
        caseRepository.save(testCases.get(0));
        // then
        List<Case> cases = caseRepository.findAll();
        assertEquals(1, cases.size());
        assertEquals("New_Case_1", cases.get(0).getCaseName());
    }

    @Test
    public void should_return_a_case_when_find_case_by_id() {
        // given
        caseRepository.save(testCases.get(0));
        // when
        Case foundCase = caseRepository.findById(1L).orElse(null);
        // then
        assertEquals("New_Case_1", foundCase.getCaseName());
    }

//    @Test
//    public void should_return_cases_order_by_time_asc_when_request_them() {
//        // given
//        caseRepository.saveAll(testCases);
//        // when
//        List<Case> foundCases = caseRepository.findAllOrderByTime();
//        // then
//        assertEquals(testCases.stream().sorted(Comparator.comparing(Case::getTime)).collect(Collectors.toList()),foundCases);
//    }


    @Test
    public void should_return_cases_by_name_when_request_them() {
        // given
        caseRepository.saveAll(testCases);
        // when
        List<Case> foundCases = caseRepository.findAllByCaseName("New_Case_2");
        // then
        assertEquals(1, foundCases.size());
    }
}
