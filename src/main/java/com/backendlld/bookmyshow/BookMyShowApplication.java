package com.backendlld.bookmyshow;

import com.backendlld.bookmyshow.controllers.UserController;
import com.backendlld.bookmyshow.dtos.SignUpRequestDTO;
import com.backendlld.bookmyshow.dtos.SignUpResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
    @Autowired
    private UserController userController;

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDTO requestDTO = new SignUpRequestDTO();
        requestDTO.setFirstName("John");
        requestDTO.setEmail("john@gmail.com");
        requestDTO.setPassword("password");

        SignUpResponseDTO responseDTO = userController.signUp(requestDTO);
        System.out.println(responseDTO.getResponseStatus());
    }


    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApplication.class, args);
    }

}
