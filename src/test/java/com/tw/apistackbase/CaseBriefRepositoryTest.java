package com.tw.apistackbase;

import com.tw.apistackbase.entity.Case;
import com.tw.apistackbase.entity.CaseBrief;
import com.tw.apistackbase.repository.CaseBriefRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CaseBriefRepositoryTest {
    @Autowired
    CaseBriefRepository caseBriefRepository;

    private List<CaseBrief> testCaseBriefs;

    @Before
    public void setUp() throws Exception {
        testCaseBriefs = IntStream.rangeClosed(1, 10).boxed()
                .map(x -> new CaseBrief("This is subjective brief." , "This is objective brief."))
                .collect(Collectors.toList());
    }

    @Test
    public void should_return_a_case_when_find_case_by_id() {
        // given
        caseBriefRepository.save(testCaseBriefs.get(0));
        // when
        CaseBrief foundCaseBrief = caseBriefRepository.findById(testCaseBriefs.get(0).getCaseBriefID()).orElse(null);
        // then
        assertEquals("This is subjective brief.", foundCaseBrief.getSubjectiveBrief());
    }
}
