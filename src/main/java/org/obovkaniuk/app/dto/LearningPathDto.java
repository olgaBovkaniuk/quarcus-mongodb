package org.obovkaniuk.app.dto;

import org.obovkaniuk.app.entity.LearningPathName;

public class LearningPathDto {

    private LearningPathName name;
    private String description;

    public LearningPathName getName() {
        return name;
    }

    public void setName(LearningPathName name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
