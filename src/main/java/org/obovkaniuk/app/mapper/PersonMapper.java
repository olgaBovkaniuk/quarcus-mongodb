package org.obovkaniuk.app.mapper;

import org.obovkaniuk.app.dto.PersonDto;
import org.obovkaniuk.app.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class PersonMapper {

    public Person mapToPerson(PersonDto dto) {
        Person person = new Person();
        UUID uuid = UUID.randomUUID();
        person.setPersonId(uuid.toString());
        person.setFirstName(dto.getFirstName());
        person.setLastName(dto.getLastName());
        person.setCourseList(dto.getCourses());
        return person;
    }
}