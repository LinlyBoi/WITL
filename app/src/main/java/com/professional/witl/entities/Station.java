package com.professional.witl.entities;

import java.util.Date;
import java.util.List;

public class Station
{
    private String sid;
    private String nameEN;
    private String nameAR;
    private String geoLocation;
    private List<String> tramLines;

    // Constructors, getters, and setters

    public Station(String sid, String nameEN, String nameAR, String geoLocation, List<String> tramLines)
    {
        this.sid = sid;
        this.nameEN = nameEN;
        this.nameAR = nameAR;
        this.geoLocation = geoLocation;
        this.tramLines = tramLines;
    }

    public String getSid()
    {
        return sid;
    }

    public void setSid(String sid)
    {
        this.sid = sid;
    }

    public String getNameEN()
    {
        return nameEN;
    }

    public void setNameEN(String nameEN)
    {
        this.nameEN = nameEN;
    }

    public String getNameAR()
    {
        return nameAR;
    }

    public void setNameAR(String nameAR)
    {
        this.nameAR = nameAR;
    }

    public String getGeoLocation()
    {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation)
    {
        this.geoLocation = geoLocation;
    }

    public List<String> getTramLines()
    {
        return tramLines;
    }

    public void setTramLines(List<String> tramLines)
    {
        this.tramLines = tramLines;
    }
}