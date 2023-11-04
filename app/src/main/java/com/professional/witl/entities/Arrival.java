package com.professional.witl.entities;
//Arrival Class (as a nested class inside Station for simplicity)

import java.util.Date;

public class Arrival
{
    private Date time;
    private Date date;
    private String line;
    private String fillStatus;

    // Constructors, getters, and setters
    public Arrival(Date time, Date date, String line, String fillStatus)
    {
        this.time = time;
        this.date = date;
        this.line = line;
        this.fillStatus = fillStatus;
    }

    public Date getTime()
    {
        return time;
    }

    public void setTime(Date time)
    {
        this.time = time;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getLine()
    {
        return line;
    }

    public void setLine(String line)
    {
        this.line = line;
    }

    public String getFillStatus()
    {
        return fillStatus;
    }

    public void setFillStatus(String fillStatus)
    {
        this.fillStatus = fillStatus;
    }

}
