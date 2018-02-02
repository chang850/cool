package com.rsupport.webviewer.core.repository;


import com.rsupport.webviewer.core.domain.SupportRoom;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface SupportRoomRepositoryCustom {
    SupportRoom findByName(String name);
}
