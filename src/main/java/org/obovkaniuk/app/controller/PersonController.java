package org.obovkaniuk.app.controller;

import org.obovkaniuk.app.dto.PersonDto;
import org.obovkaniuk.app.entity.Person;
import org.obovkaniuk.app.repository.PersonRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/person/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    @Inject
    PersonRepository personRepository;

    @GET
    public List<Person> getAll() {
        return personRepository.getAll();
    }

    @GET
    @Path("/{id}")
    public Person getById(@PathParam("id") String id) {
        return personRepository.getById(id);
    }

    @POST
    public void add(PersonDto person) {
        personRepository.save(person);
    }

    @DELETE
    @Path("/{id}")
    public void remove(@PathParam("id") String id) {
        personRepository.remove(id);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") String id, PersonDto personDto) {
        personRepository.update(id, personDto);
    }
}
