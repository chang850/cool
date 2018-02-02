package com.rsupport.webviewer.web.support;

import com.rsupport.webviewer.core.service.SupportRoomManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;


//기본 API Server 가 될 확률이 있는데......
//기본 저장
@RestController
@RequestMapping(value = "/supportRoom")
@RequiredArgsConstructor
public class SupportRoomController {

    private final SupportRoomManager supportRoomManager;
    private final SupportRoomListRepository supportRoomListRepository;

    //만약여기서 현재 하려고 하는 건
    @GetMapping(value = "/list")
    public SupportRoomListResponseVO list(SupportRoomRequestVO requestVO) {
        return Optional.ofNullable(supportRoomListRepository.getSupportRoomResponseVO("4444"))
                .orElseThrow(SupportNotFoundException::new);

//        SupportRoom supportRoom = supportRoomManager.getSupportRoomByName("chang850");
//        if (supportRoom == null) {
//            throw new SupportNotFoundException();
//        }
//        return new ResponseEntity<Object>(new SupportRoomResponseVO(), HttpStatus.OK);
    }

    //첫번째 테스트 Json 들어오면 Json , Xml 들어오면 xml 이런식으로
//    @GetMapping(value = "/list")
//    public ResponseEntity<?> list(SupportRoomRequestVO requestVO) {
//        SupportRoom supportRoom = supportRoomManager.getSupportRoomByName("chang850");
//        if (supportRoom == null) {
//            throw new SupportNotFoundException();
//        }
//        return new ResponseEntity<Object>(new SupportRoomResponseVO(), HttpStatus.OK);
//    }
}
