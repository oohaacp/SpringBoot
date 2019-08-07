package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;
// Methods to implement CRUD.
public interface TrackService
{
    public Track saveUser(Track track) throws TrackAlreadyExistsException;
    public List<Track>getAllUsers();
    public Track deleteTrack(int id);
    public Track updateTrack(Track track) throws TrackNotFoundException;
    public Track trackByName(String firstName);
}




