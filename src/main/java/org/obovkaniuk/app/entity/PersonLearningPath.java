package org.obovkaniuk.app.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;

import java.util.Objects;

@MongoEntity(collection = "person_learning_path")
public class PersonLearningPath extends PanacheMongoEntityBase {

    private LearningPathName name;
    private int mark;

    public PersonLearningPath() {
    }

    public PersonLearningPath(LearningPathName name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public LearningPathName getName() {
        return name;
    }

    public void setName(LearningPathName name) {
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
        PersonLearningPath that = (PersonLearningPath) o;
        return mark == that.mark &&
                name == that.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }
}
