package com.example.fizzbuzzbackend.Controller;
import com.example.fizzbuzzbackend.Service.FizzBuzzService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/FizzBuzz")
@CrossOrigin
public class FizzBuzzController {

    FizzBuzzService fizzBuzzService;

    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping("/play/{input}")
    public String playFizzBuzz(@PathVariable Long input) {

        return fizzBuzzService.playFizzBuzz(input);
    }

}
