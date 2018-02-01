package com.rsupport.webviewer.web.support;


import com.rsupport.webviewer.core.domain.SupportRoom;
import com.rsupport.webviewer.core.repository.SupportRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("supportRoomManager")
@RequiredArgsConstructor
public class SupportRoomManagerImpl implements SupportRoomManager {

    @Autowired
    private SupportRoomRepository supportRoomRepository;

    @Override
    public SupportRoom getSupportRoomByName(String name) {
        return supportRoomRepository.findByName(name);
    }
}
