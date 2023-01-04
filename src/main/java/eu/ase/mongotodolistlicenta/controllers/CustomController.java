package eu.ase.mongotodolistlicenta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class CustomController {

    @GetMapping()
    public String helloApp(@PathVariable String name) {
        return "Hello " + name;
    }

}