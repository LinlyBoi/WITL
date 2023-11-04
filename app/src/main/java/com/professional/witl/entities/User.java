package com.professional.witl.entities;

import java.util.List;

public class User
{
    private String uid;
    private String email;
    private String password;
    private String nameFirst;
    private String nameLast;
    private List<Station> preferredStations;

    // Constructors, getters, and setters
    public User(String uid, String email, String password, String nameFirst, String nameLast, List<Station> preferredStations)
    {
        this.uid = uid;
        this.email = email;
        this.password = password;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.preferredStations = preferredStations;
    }

    public String getUid()
    {
        return uid;
    }

    public void setUid(String uid)
    {
        this.uid = uid;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getNameFirst()
    {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst)
    {
        this.nameFirst = nameFirst;
    }

    public String getNameLast()
    {
        return nameLast;
    }

    public void setNameLast(String nameLast)
    {
        this.nameLast = nameLast;
    }

    public List<Station> getPreferredStations()
    {
        return preferredStations;
    }

    public void setPreferredStations(List<Station> preferredStations)
    {
        this.preferredStations = preferredStations;
    }

}