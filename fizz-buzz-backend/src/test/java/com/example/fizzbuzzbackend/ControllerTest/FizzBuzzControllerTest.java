package com.example.fizzbuzzbackend.ControllerTest;
import com.example.fizzbuzzbackend.Controller.FizzBuzzController;
import com.example.fizzbuzzbackend.Service.FizzBuzzService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FizzBuzzController.class)
@AutoConfigureMockMvc
public class FizzBuzzControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    FizzBuzzService fizzBuzzService;

    @Test
    public void FizzBuzzController_PlayFizzBuzz_ReturnCorrectResult() throws Exception {
//        given(fizzBuzzService.playFizzBuzz(ArgumentMatcher.any())).willAnswer((invocation -> invocation.getArgument(0)));

        Long input = 15L;

        when(fizzBuzzService.playFizzBuzz(input)).thenReturn("Fizz Buzz");
//        when(fizzBuzzService.playFizzBuzz(15L)).thenReturn("Fizz Buzz");
//
//        ResultActions response = mockMvc.perform(get("/play/15").
//                )

        mockMvc.perform(get("/FizzBuzz/play/" + input))
                .andExpect(status().isOk())
                .andExpect(content().string("Fizz Buzz"));
    }

}
