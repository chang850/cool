package jpa;


import com.rsupport.webviewer.core.domain.SupportRoom;
import com.rsupport.webviewer.core.repository.SupportRoomRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

//여기서 DaoTest 를 가져온다.
//문제 1번 데이터 가 없는 상태에서 어떻게 테스트를 진행 할 것 인가.
//@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.rsupport.webviewer.core.repository"})
public class DaoTest {

    @Autowired
    private SupportRoomRepository supportRoomRepository;

    @Test
    public void getSupportRoomRepository(){
        SupportRoom supportRoom = supportRoomRepository.findByName("4444");
        String temp = "changhee";
    }


}
