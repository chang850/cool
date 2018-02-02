package com.rsupport.webviewer.web.support;

import com.rsupport.webviewer.core.domain.SupportRoom;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SupportRoomControllerTest {

    @Autowired
    private MockMvc mvc;
//
//    @MockBean
//    private SupportRoomManager supportRoomManager;

    @Ignore
    @Test
    public void testExample() throws Exception {
//        BDDMockito.given(this.supportRoomManager.getSupportRoomByName("4444"))
//                .willReturn(new SupportRoom("1", "2222", "4444"));
//
//        this.mvc.perform(MockMvcRequestBuilders.get("/supportRoom/list?name=4444").accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andExpect(MockMvcResultMatchers.content().json("{ \"devicekey\":\"changhee\",\"deviceNo\":\"changhe2\",\"supportType\":\"supportType\"}"));
    }
}
