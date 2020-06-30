package org.obovkaniuk.app.mapper;

import org.bson.types.ObjectId;
import org.obovkaniuk.app.dto.LearningPathDto;
import org.obovkaniuk.app.entity.LearningPath;

import javax.enterprise.context.ApplicationScoped;
import java.util.Objects;
import java.util.UUID;

@ApplicationScoped
public class LearningPathMapper {

    public LearningPath mapToLearningPath(LearningPathDto learningPathDto) {
        LearningPath learningPath = new LearningPath();
        learningPath.setLearningPathId(ObjectId.get());
        learningPath.setName(learningPathDto.getName());
        learningPath.setDescription(learningPathDto.getDescription());
        learningPath.setImage(learningPathDto.getImage());
        learningPath.setLink(learningPathDto.getLink());
        learningPath.setMaterialList(learningPathDto.getMaterialList());
        return learningPath;
    }
}