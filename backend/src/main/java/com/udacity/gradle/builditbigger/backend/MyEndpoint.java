package com.udacity.gradle.builditbigger.backend;

import com.example.jokelib.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;


/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

    @ApiMethod(name = "getJoke")
    public MyBean getJoke()
    {
        // take joke from the joke library
        MyBean response = new MyBean();
        response.setData(
                 "poorjoke");
        return response;
    }

    public MyBean sayName()
    {
        MyBean myBean  = new MyBean();
        myBean.setData("hello");
        return myBean;
    }

}
