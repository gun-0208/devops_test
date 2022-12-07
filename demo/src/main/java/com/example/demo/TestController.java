package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("{name}")
    public ResponseEntity<?> healthCheck(@PathVariable String name) {
        System.out.println(name);
        return ResponseEntity.ok().body("hello " + name);
    }
}
