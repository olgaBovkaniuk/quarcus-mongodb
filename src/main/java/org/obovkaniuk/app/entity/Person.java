package org.obovkaniuk.app.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.List;
import java.util.Objects;

@MongoEntity(collection = "person")
public class Person extends PanacheMongoEntityBase {

    @BsonProperty("person_id")
    @BsonId
    private String personId;

    @BsonProperty("first_name")
    private String firstName;

    @BsonProperty("last_name")
    private String lastName;

    @BsonProperty("courses")
    private List<Course> courseList;

    public Person() {
    }

    public Person(String personId, String firstName, String lastName, List<Course> courseList) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseList = courseList;
    }

    public String  getPersonId() {
        return personId;
    }

    public void setPersonId(String  personId) {
        this.personId = personId;
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

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(courseList, person.courseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, courseList);
    }
}
