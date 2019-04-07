package com.flixit.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "movieRequest")
public class MovieRequest {
    private int id;
    private String name;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
