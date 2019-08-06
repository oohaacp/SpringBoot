package com.stackroute.service;

import com.stackroute.domain.Track;

import java.util.List;

public interface TrackService 
{
     // Methods to implement CRUD.
    public Track saveUser(Track track);
    public List<Track>getAllUsers();
    public Track deleteTrack(int id);
    public Track updateTrack(Track track);


    }

