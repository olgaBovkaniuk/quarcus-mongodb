package org.obovkaniuk.app.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import org.obovkaniuk.app.dto.PersonDto;
import org.obovkaniuk.app.entity.Person;
import org.obovkaniuk.app.mapper.PersonMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PersonRepository implements PanacheMongoRepositoryBase<Person, String> {

    @Inject
    PersonMapper personMapper ;

    public Person getById(String id) {
        return findById(id);
    }

    public List<Person> getAll() {
        return findAll().list();
    }

    public void save(PersonDto person) {
        personMapper
                .mapToPerson(person)
                .persist();
    }

    public void remove(String id) {
        Person person = findById(id);
        person.delete();
    }

    public void update(String id, PersonDto personDto) {
        Person person = findById(id);
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        person.setLearningPathList(personDto.getPersonLearningPaths());
        update(person);
    }
}
