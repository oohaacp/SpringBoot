package com.stackroute.service;

import com.stackroute.domain.Track;

import java.util.List;
// Methods to implement CRUD.
public interface TrackService {
    public Track saveUser(Track track);
    public List<Track>getAllUsers();
    public Track deleteTrack(int id);
    public Track updateTrack(Track track);
    public Track trackByName(String firstName);
}




