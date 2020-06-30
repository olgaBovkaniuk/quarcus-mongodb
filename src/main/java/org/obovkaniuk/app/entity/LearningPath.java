package org.obovkaniuk.app.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Objects;

@MongoEntity(collection = "learning_path")
public class LearningPath {

    @BsonProperty("learning_path_id")
    private ObjectId learningPathId;
    private LearningPathName name;
    private String description;
    private String image;
    private String link;
    private List<Material> materialList;

    public LearningPath() {
    }

    public LearningPath(LearningPathName name, String description, String image, String link, List<Material> materialList) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.link = link;
        this.materialList = materialList;
    }

    public ObjectId getLearningPathId() {
        return learningPathId;
    }

    public void setLearningPathId(ObjectId learningPathId) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
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
