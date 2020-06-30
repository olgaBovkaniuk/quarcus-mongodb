package org.obovkaniuk.app.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Objects;

@MongoEntity(collection = "learner")
public class Learner {

    @BsonProperty("learner_id")
    private ObjectId learnerId;

    @BsonProperty("first_name")
    private String firstName;

    @BsonProperty("last_name")
    private String lastName;

    private String division;

    @BsonProperty("person_learning_paths")
    private List<LearnerPath> learnerPathList;

    public Learner() {
    }

    public Learner(ObjectId learnerId, String firstName, String lastName, String division, List<LearnerPath> learnerPathList) {
        this.learnerId = learnerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.division = division;
        this.learnerPathList = learnerPathList;
    }

    public ObjectId getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(ObjectId learnerId) {
        this.learnerId = learnerId;
    }

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

    public List<LearnerPath> getLearnerPathList() {
        return learnerPathList;
    }

    public void setLearnerPathList(List<LearnerPath> learnerPathList) {
        this.learnerPathList = learnerPathList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Learner learner = (Learner) o;
        return Objects.equals(firstName, learner.firstName) &&
                Objects.equals(lastName, learner.lastName) &&
                Objects.equals(learnerPathList, learner.learnerPathList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, learnerPathList);
    }
}
