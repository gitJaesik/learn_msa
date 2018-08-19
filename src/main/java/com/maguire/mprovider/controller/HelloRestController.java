package com.maguire.mprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloRestController {
    @GetMapping("/")
    public String hello() {
        List<String> bookList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            // char 1byte
            bookList.add("abcdefghijk" + i);
        }

        return "Hello";
    }
}
