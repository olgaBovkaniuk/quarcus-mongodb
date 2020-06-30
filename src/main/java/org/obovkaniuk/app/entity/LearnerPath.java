package org.obovkaniuk.app.entity;

import org.bson.types.ObjectId;

import java.util.List;
import java.util.Objects;
import java.util.TimeZone;

public class LearnerPath {

    private ObjectId learningPathId;
    private String description;
    private LearningPathName name;
    private int mark;
    private Status status;
    private TimeZone startDate;
    private TimeZone endDate;
    private List<LearnerPathMaterial> learnerPathMaterials;

    public LearnerPath() {
    }

    public LearnerPath(String description, LearningPathName name, int mark, Status status, TimeZone startDate, TimeZone endDate, List<LearnerPathMaterial> learnerPathMaterials) {
        this.description = description;
        this.name = name;
        this.mark = mark;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.learnerPathMaterials = learnerPathMaterials;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ObjectId getLearningPathId() {
        return learningPathId;
    }

    public void setLearningPathId(ObjectId learningPathId) {
        this.learningPathId = learningPathId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TimeZone getStartDate() {
        return startDate;
    }

    public void setStartDate(TimeZone startDate) {
        this.startDate = startDate;
    }

    public TimeZone getEndDate() {
        return endDate;
    }

    public void setEndDate(TimeZone endDate) {
        this.endDate = endDate;
    }

    public List<LearnerPathMaterial> getLearnerPathMaterials() {
        return learnerPathMaterials;
    }

    public void setLearnerPathMaterials(List<LearnerPathMaterial> learnerPathMaterials) {
        this.learnerPathMaterials = learnerPathMaterials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LearnerPath that = (LearnerPath) o;
        return mark == that.mark &&
                name == that.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }
}
