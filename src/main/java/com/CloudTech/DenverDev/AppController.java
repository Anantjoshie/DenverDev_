package com.CloudTech.DenverDev;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

     @GetMapping("/isup")
     public ResponseEntity<?> isApplicationUp(){


     return new ResponseEntity<>("Application is Up",HttpStatus.OK);
     }


}
