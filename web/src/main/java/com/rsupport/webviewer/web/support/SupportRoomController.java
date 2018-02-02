package com.rsupport.webviewer.web.support;

import com.rsupport.webviewer.core.domain.SupportRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/supportRoom")
public class SupportRoomController {

    private final SupportRoomManager supportRoomManager;

    @Autowired
    public SupportRoomController(SupportRoomManager supportRoomManager) {
        this.supportRoomManager = supportRoomManager;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> list(SupportRoomRequestVO requestVO) {

        SupportRoom supportRoom = supportRoomManager.getSupportRoomByName("chang850");

        if (supportRoom == null) {
            throw new SupportNotFoundException();
        }

        return new ResponseEntity<Object>(new SupportRoomResponseVO(), HttpStatus.OK);
    }
}
