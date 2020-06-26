package org.obovkaniuk.app.controller;

import org.obovkaniuk.app.dto.CourseDto;
import org.obovkaniuk.app.entity.LearningPath;
import org.obovkaniuk.app.repository.CourseRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/course/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseController {

    @Inject
    CourseRepository courseRepository;

    @GET
    public List<LearningPath> getAll() {
        return courseRepository.getAll();
    }

    @GET
    @Path("/{name}")
    public LearningPath getById(@PathParam("name") String name) {
        return courseRepository.findByName(name);
    }

    @POST
    public void add(CourseDto course) {
        courseRepository.save(course);
    }

}
