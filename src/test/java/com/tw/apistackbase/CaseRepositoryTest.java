package com.tw.apistackbase;


import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.repository.CaseRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CaseRepositoryTest {

    @Autowired
    CaseRepository caseRepository;

    @Test
    public void should_return_a_case_when_save_it() {
        // given
        Case newCase = new Case("A_New_Case",new Date().getTime());
        // when
        caseRepository.save(newCase);
        // then
        List<Case> cases = caseRepository.findAll();
        Assertions.assertEquals(1,cases.size());
        Assertions.assertEquals("A_New_Case",cases.get(0).getCaseName());
    }
}
