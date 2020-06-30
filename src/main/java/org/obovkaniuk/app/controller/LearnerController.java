package org.obovkaniuk.app.controller;

import org.obovkaniuk.app.dto.LearnerDto;
import org.obovkaniuk.app.entity.Learner;
import org.obovkaniuk.app.repository.LearnerRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("api/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LearnerController {

    @Inject
    LearnerRepository learnerRepository;

    @GET
    public List<Learner> getAll() {
        return learnerRepository.getAll();
    }

    @GET
    @Path("/{id}")
    public Learner getById(@PathParam("id") String id) {
        return learnerRepository.getById(id);
    }

    @POST
    public void add(LearnerDto learnerDto) {
        learnerRepository.save(learnerDto);
    }

    @DELETE
    @Path("/{id}")
    public void remove(@PathParam("id") String id) {
        learnerRepository.remove(id);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") String id, LearnerDto learnerDto) {
        learnerRepository.update(id, learnerDto);
    }
}
