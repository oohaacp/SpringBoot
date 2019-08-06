package com.stackroute.controller;

import com.stackroute.domain.Track;
import com.stackroute.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v1")
public class TrackController
{
    //Declarations
    private TrackService trackService;
    @Autowired
    // Performing CRUD operations....
    public TrackController(TrackService userService)
    {
        this.trackService=userService;

    }
    
// Implementing POST method
    @PostMapping("track")
    public ResponseEntity<?> saveUser(@RequestBody Track user)
    {
      ResponseEntity responseEntity;
      try
      {
          trackService.saveUser(user);
          responseEntity=new ResponseEntity<String>("successfully completed", HttpStatus.CREATED);

      }catch (Exception ex)
      {
          responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
      }

      return responseEntity;
    }
    
// Implementing Get method

    @GetMapping("track")
    public ResponseEntity<?>getAllUsers()
    {
return new ResponseEntity<List<Track>>(trackService.getAllUsers(), HttpStatus.OK);
    }
}

