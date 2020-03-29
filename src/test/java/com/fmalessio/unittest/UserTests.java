package com.fmalessio.unittest;

import com.fmalessio.unittest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;

    @Test
    void findAllUnitTest() throws Exception {
        Mockito.when(userRepository.findAll()).thenReturn(
                Collections.emptyList()
        );

        mockMvc.perform(
                get("/user/findall").accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());

        Mockito.verify(userRepository).findAll();
    }

}
