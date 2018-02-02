package com.rsupport.webviewer.core.repository;

import com.rsupport.webviewer.core.domain.QSupportRoom;
import com.rsupport.webviewer.core.domain.SupportRoom;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.stereotype.Repository;

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
    public Optional<SupportRoom> findByName(String name) {
        QSupportRoom supportRoom = QSupportRoom.supportRoom;
        SupportRoom result = from(supportRoom).where(supportRoom.name.eq(name)).fetchOne();

        return Optional.ofNullable(result);
    }*/
}
