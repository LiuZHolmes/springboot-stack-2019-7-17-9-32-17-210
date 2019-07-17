package com.tw.apistackbase;


import com.tw.apistackbase.repository.ProcuratorateRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProcuratorateRepositoryTest {

    @Autowired
    ProcuratorateRepository procuratorateRepository;


}
