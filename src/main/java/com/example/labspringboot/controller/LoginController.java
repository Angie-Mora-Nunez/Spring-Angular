package com.example.labspringboot.controller;

import com.example.labspringboot.JWT.JwtResponse;
import com.example.labspringboot.JWT.JwtTokenUtil;
import com.example.labspringboot.domain.User;
import com.example.labspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/login")
public class LoginController {


    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/autenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody User UserLG)  {
        User loginUser=new User();
        for (User us:service.listAll() ) {
            if(us.getEmail().toLowerCase().equals(UserLG.getEmail().toLowerCase())  && us.getPassword().equals(UserLG.getPassword()) )
            {
                loginUser.setId(us.getId());
                loginUser.setPassword(us.getPassword());
                loginUser.setAddress(us.getAddress());
                loginUser.setName(us.getName());
                loginUser.setEmail(us.getEmail());
                loginUser.setFirst_surname(us.getFirst_surname());
                loginUser.setSecond_surname(us.getSecond_surname());
                loginUser.setPhone(us.getPhone());
                loginUser.setSecondphone(us.getSecondphone());
                break;
            }
        }
        if(loginUser.getEmail() != null )
        {
            final String token = jwtTokenUtil.generateToken(loginUser);

            return ResponseEntity.ok(new JwtResponse(token));
        }
        return ResponseEntity.ok(new JwtResponse(""));
    }


}