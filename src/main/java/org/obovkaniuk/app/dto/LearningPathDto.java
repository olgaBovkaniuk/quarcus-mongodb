package org.obovkaniuk.app.dto;

import org.obovkaniuk.app.entity.LearningPathName;
import org.obovkaniuk.app.entity.Material;

import java.util.List;

public class LearningPathDto {

    private LearningPathName name;
    private String description;
    private String image;
    private String link;
    private List<Material> materialList;

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
}
