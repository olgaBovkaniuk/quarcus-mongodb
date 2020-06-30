package org.obovkaniuk.app.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Objects;

@MongoEntity(collection = "material")
public class Material {

    @BsonProperty("material_id")
    private ObjectId materialId;

    @BsonProperty("sequence_number")
    private String sequenceNumber;

    private String title;
    private Type type;
    private String image;
    private String link;
    private String description;

    public Material() {
    }

    public Material(String title, Type type, String image, String link, String description) {
        this.title = title;
        this.type = type;
        this.image = image;
        this.link = link;
        this.description = description;
    }

    public ObjectId getMaterialId() {
        return materialId;
    }

    public void setMaterialId(ObjectId materialId) {
        this.materialId = materialId;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(materialId, material.materialId) &&
                Objects.equals(sequenceNumber, material.sequenceNumber) &&
                Objects.equals(title, material.title) &&
                type == material.type &&
                Objects.equals(image, material.image) &&
                Objects.equals(link, material.link) &&
                Objects.equals(description, material.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, sequenceNumber, title, type, image, link, description);
    }
}
