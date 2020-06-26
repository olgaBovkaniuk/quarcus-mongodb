package org.obovkaniuk.app.mapper;

import org.obovkaniuk.app.dto.LearningPathDto;
import org.obovkaniuk.app.entity.LearningPath;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class LearningPathMapper {

    public LearningPath mapToLearningPath(LearningPathDto learningPathDto) {
        LearningPath learningPath = new LearningPath();
        learningPath.setLearningPathId(UUID.randomUUID().toString());
        learningPath.setName(learningPathDto.getName());
        learningPath.setDescription(learningPathDto.getDescription());
        return learningPath;
    }
}