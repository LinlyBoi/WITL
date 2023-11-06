package com.professional.witl.entities;

public class Prefers
{
    private User user;
    private Station station;

    // Constructors, getters, and setters
    public Prefers(User user, Station station)
    {
        this.user = user;
        this.station = station;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Station getStation()
    {
        return station;
    }

    public void setStation(Station station)
    {
        this.station = station;
    }

}
