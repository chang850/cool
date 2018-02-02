package com.rsupport.webviewer.core.repository;

import com.querydsl.core.types.Projections;
import com.rsupport.webviewer.core.domain.QSupportRoom;
import com.rsupport.webviewer.core.domain.SupportRoom;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



@Repository("supportRoomRepository")
public class SupportRoomRepositoryImpl extends QueryDslRepositorySupport implements SupportRoomRepositoryCustom {

    public SupportRoomRepositoryImpl() {
        super(SupportRoom.class);
    }

    @Override
    public SupportRoom findByName(String name) {
        QSupportRoom supportRoom = QSupportRoom.supportRoom;
        SupportRoom result = from(supportRoom).where(supportRoom.name.eq(name)).fetchOne();

        return result;
    }
    /*@Override
    public SupportRoomResponseVO getSupportRoomResponseVO(String name) {
        SupportRoomResponseVO listVO = new SupportRoomResponseVO();
        QSupportRoom supportRoom = QSupportRoom.supportRoom;
        List<SupportRoom> result = from(supportRoom).where(supportRoom.name.eq(name)).fetch();

        listVO.setList(from(supportRoom).where(supportRoom.name.eq(name))
                .select(new QSupportRoomResponseVO(
                        supportRoom.age,
                        supportRoom.name
                )).fetch());


        return null;
    }*/

    /*@Override
    public Optional<SupportRoom> findByName(String name) {
        QSupportRoom supportRoom = QSupportRoom.supportRoom;
        SupportRoom result = from(supportRoom).where(supportRoom.name.eq(name)).fetchOne();

        return Optional.ofNullable(result);
    }*/
}
