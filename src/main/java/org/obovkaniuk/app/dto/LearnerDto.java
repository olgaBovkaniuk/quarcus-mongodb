package org.obovkaniuk.app.dto;

import org.obovkaniuk.app.entity.LearnerPath;

import java.util.List;

public class LearnerDto {

    private String firstName;
    private String lastName;
    private String division;
    private List<LearnerPath> learnerPaths;

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

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<LearnerPath> getLearnerPaths() {
        return learnerPaths;
    }

    public void setLearnerPaths(List<LearnerPath> learningPaths) {
        this.learnerPaths = learningPaths;
    }
}
