package org.obovkaniuk.app.dto;

import org.obovkaniuk.app.entity.PersonLearningPath;

import java.util.List;

public class PersonDto {

    private String firstName;
    private String lastName;
    private List<PersonLearningPath> personLearningPaths;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PersonLearningPath> getPersonLearningPaths() {
        return personLearningPaths;
    }

    public void setPersonLearningPaths(List<PersonLearningPath> learningPaths) {
        this.personLearningPaths = learningPaths;
    }
}
