package com.rsupport.webviewer.core.repository;

import com.rsupport.webviewer.core.domain.SupportRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SupportRoomRepository extends JpaRepository<SupportRoom, String>, SupportRoomRepositoryCustom {

}
