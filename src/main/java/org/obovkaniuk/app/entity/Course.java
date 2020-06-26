package org.obovkaniuk.app.entity;

import io.quarkus.mongodb.panache.MongoEntity;

import java.util.Objects;

@MongoEntity(collection = "course")
public class Course {

    private String name;
    private int mark;

    public Course() {
    }

    public Course(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return mark == course.mark &&
                Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }
}
