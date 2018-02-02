package com.rsupport.webviewer.core.service;


import com.rsupport.webviewer.core.domain.SupportRoom;
import com.rsupport.webviewer.core.repository.SupportRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("supportRoomManager")
@RequiredArgsConstructor
public class SupportRoomManagerImpl implements SupportRoomManager {

    private final SupportRoomRepository supportRoomRepository;

    @Override
    public SupportRoom getSupportRoomByName(String name) {
        return supportRoomRepository.findByName(name);
    }
}
