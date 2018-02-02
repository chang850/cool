package com.rsupport.webviewer.web.support;

import com.querydsl.core.types.Projections;
import com.rsupport.webviewer.core.domain.QSupportRoom;
import com.rsupport.webviewer.core.domain.SupportRoom;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class SupportRoomListRepositoryImpl extends QueryDslRepositorySupport implements SupportRoomListRepository {

    public SupportRoomListRepositoryImpl() {
        super(SupportRoom.class);
    }

    @Override
    public SupportRoomListResponseVO getSupportRoomResponseVO(String name) {
        SupportRoomListResponseVO listVO = new SupportRoomListResponseVO();
        QSupportRoom supportRoom = QSupportRoom.supportRoom;
        //List<SupportRoom> result = from(supportRoom).where(supportRoom.name.eq(name)).fetch();
        //두가지 타입으로 사용 가능하다.......

        listVO.setList(from(supportRoom).where(supportRoom.name.eq(name))
                .select(Projections.bean(SupportRoomListResponseVO.class, supportRoom.age)).fetch());

//        listVO.setList(from(supportRoom).where(supportRoom.name.eq(name))
//                .select(new QSupportRoomResponseVO(
//                        supportRoom.age,
//                        supportRoom.name
//                )).fetch());

        return listVO;
    }


}
