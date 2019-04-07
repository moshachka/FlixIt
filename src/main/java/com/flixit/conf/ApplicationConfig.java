package com.flixit.conf;


import com.flixit.server.MovieServiceAPI;
import com.flixit.ws.HelloResource;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("v1")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> set = new HashSet<>();
        set.add(HelloResource.class);
        set.add(MovieServiceAPI.class);
        return set;
    }
}
