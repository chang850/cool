package com.rsupport.webviewer.web.support;

import com.rsupport.webviewer.core.domain.SupportRoom;
import com.rsupport.webviewer.core.repository.SupportRoomRepository;
import com.rsupport.webviewer.web.common.BaseRepositoryTest;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

//해당 빈만 수행 하면 될것인디..........

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SupportRoomBaseRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private SupportRoomRepository supportRoomRepository;

    @Ignore
    @Test
    public void Test() {
        SupportRoom supportRoom = supportRoomRepository.findByName("4444");
        supportRoom.setAge("989898");
        entityManager.persist(supportRoom);
        entityManager.flush();
    }


}
