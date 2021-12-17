package com.example.cdidemo.application;

import com.example.cdidemo.service.Student;
import com.example.cdidemo.service.Database;
import com.example.cdidemo.service.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class DemoResource {
    // Field Injection
    @Inject
    private Database db;

    // Field Injection
    @Inject
    private Logger logger;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAll() {
        logger.log("GET /");
        return db.getAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getOne(@PathParam("id") int id) {
        logger.log("GET /" + id);
        return db.getOneById(id);
    }
}
