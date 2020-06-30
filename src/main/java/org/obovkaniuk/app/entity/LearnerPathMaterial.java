package org.obovkaniuk.app.entity;

import org.bson.types.ObjectId;

import java.util.Objects;

public class LearnerPathMaterial {

    private ObjectId materialId;
    private String sequenceNumber;
    private String title;
    private Type type;
    private String image;
    private String link;
    private String description;
    private Status status;

    public LearnerPathMaterial() {
    }

    public LearnerPathMaterial(String title, Type type, String image, String link, String description, Status status) {
        this.title = title;
        this.type = type;
        this.image = image;
        this.link = link;
        this.description = description;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LearnerPathMaterial that = (LearnerPathMaterial) o;
        return Objects.equals(materialId, that.materialId) &&
                Objects.equals(sequenceNumber, that.sequenceNumber) &&
                Objects.equals(title, that.title) &&
                type == that.type &&
                Objects.equals(image, that.image) &&
                Objects.equals(link, that.link) &&
                Objects.equals(description, that.description) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, sequenceNumber, title, type, image, link, description, status);
    }
}
