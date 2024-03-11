package com.example.fizzbuzzbackend.ServiceTest;

import com.example.fizzbuzzbackend.Service.FizzBuzzService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzServiceTest {

//    @Autowired
//    FizzBuzzService fizzBuzzService;

    @InjectMocks
    private FizzBuzzService fizzBuzzService;

    @Test
    void FizzBuzzService_returnFizzBuzz() {
        //arrange
        Long mockInput = 15L;

        //act
        String result = fizzBuzzService.playFizzBuzz(mockInput);

        //assert
        Assertions.assertEquals("Fizz Buzz", result);
    }

    @Test
    void FizzBuzzService_returnFizz() {
        //arrange
        Long mockInput = 6L;

        //act
        String result = fizzBuzzService.playFizzBuzz(mockInput);

        //assert
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void FizzBuzzService_returnBuzz() {
        //arrange
        Long mockInput = 10L;

        //act
        String result = fizzBuzzService.playFizzBuzz(mockInput);

        //assert
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void FizzBuzzService_returnInput() {
        //arrange
        Long mockInput = 14L;

        //act
        String result = fizzBuzzService.playFizzBuzz(mockInput);

        //assert
        Assertions.assertEquals("14", result);
    }


}
