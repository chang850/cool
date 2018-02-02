package com.rsupport.webviewer.core.repository;


import com.rsupport.webviewer.core.domain.SupportRoom;
import com.rsupport.webviewer.core.vo.SupportRoomResponseVO;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface SupportRoomRepositoryCustom {
    SupportRoom findByName(String name);
    SupportRoomResponseVO getSupportRoomResponseVO(String name);
}
