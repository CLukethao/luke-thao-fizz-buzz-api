package com.example.fizzbuzzbackend.Service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public String playFizzBuzz(Long input) {

        if (input % 3 == 0 && input % 5 == 0) {
            return "Fizz Buzz";
        }

        if (input % 3 == 0) {
            return "Fizz";
        }

        if (input % 5 == 0) {
            return "Buzz";
        }

        else {
            return input.toString();
        }

    }

}
