package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrackServiceImpl implements TrackService
{
     private TrackRepository trackRepository;
     @Autowired
     public TrackServiceImpl(TrackRepository userRepository)
     {
         this.trackRepository=userRepository;
     }

    @Override
    public Track saveUser(Track user)
    {
        Track savedUser=trackRepository.save(user);
        return savedUser;
    }catch(Exception e){
        e.printStackTrace();
        }
    }

    @Override
    public List<Track> getAllUsers() {
        return trackRepository.findAll();
    }
}
