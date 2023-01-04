package eu.ase.mongotodolistlicenta.controllers;

import eu.ase.mongotodolistlicenta.models.User;
import eu.ase.mongotodolistlicenta.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

@GetMapping("/alex")
   public String hello() {
       return "alex";
   }


}
