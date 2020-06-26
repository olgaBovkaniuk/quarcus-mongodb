package org.obovkaniuk.app.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

@MongoEntity(collection = "learning_path")
public class LearningPath extends PanacheMongoEntityBase {

    @BsonProperty("learning_path_id")
    @BsonId
    private String learningPathId;
    private LearningPathName name;
    private String description;

    public LearningPath() {
    }

    public LearningPath(LearningPathName name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getLearningPathId() {
        return learningPathId;
    }

    public void setLearningPathId(String learningPathId) {
        this.learningPathId = learningPathId;
    }

    public LearningPathName getName() {
        return name;
    }

    public void setName(LearningPathName name) {
        this.name = name;
    }

    public String  getDescription() {
        return description;
    }

    public void setDescription(String  mark) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LearningPath learningPath = (LearningPath) o;
        return description == learningPath.description &&
                Objects.equals(name, learningPath.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
