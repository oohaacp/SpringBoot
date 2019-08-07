package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrackServiceImpl implements TrackService {
    TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository userRepository) {
        this.trackRepository = userRepository;
    }

    @Override
    public Track saveUser(Track user) {
        Track savedUser = trackRepository.save(user);
        return savedUser;
    }

    @Override
    public List<Track> getAllUsers() {
        return trackRepository.findAll();
    }

   
    @Override
    public Track updateTrack(int id) {
        Optional<Track> track =null;
        if(trackRepository.existsById(id) == true) {
            trackRepository.updateById(id);
            track= trackRepository.findById(id);
        }
        return track.get();
    }


    
    @Override
    public Track deleteTrack(int id) {
        Optional<Track> track =null;
        if(trackRepository.existsById(id) == true) {
            trackRepository.deleteById(id);
            track= trackRepository.findById(id);
        }
        return track.get();
    }
    @Override
    public Track trackByName(String firstName) {
        return trackRepository.trackByName(firstName);
    }
}



