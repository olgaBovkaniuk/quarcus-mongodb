package org.obovkaniuk.app.controller;

import org.obovkaniuk.app.dto.LearningPathDto;
import org.obovkaniuk.app.entity.LearningPath;
import org.obovkaniuk.app.entity.LearningPathName;
import org.obovkaniuk.app.repository.LearningPathRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/learning-path/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LearningPathController {

    @Inject
    LearningPathRepository learningPathRepository;

    @GET
    public List<LearningPath> getAll() {
        return learningPathRepository.getAll();
    }

    @GET
    @Path("/{name}")
    public List<LearningPath> getById(@PathParam("name") LearningPathName name) {
        return learningPathRepository.findByName(name);
    }

    @POST
    public void add(LearningPathDto course) {
        learningPathRepository.save(course);
    }

}
