package org.obovkaniuk.app.mapper;

import org.bson.types.ObjectId;
import org.obovkaniuk.app.dto.LearnerDto;
import org.obovkaniuk.app.entity.Learner;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class LearnerMapper {

    public Learner mapToLearner(LearnerDto learnerDto) {
        Learner learner = new Learner();
        learner.setLearnerId(ObjectId.get());
        learner.setFirstName(learnerDto.getFirstName());
        learner.setLastName(learnerDto.getLastName());
        learner.setDivision(learnerDto.getDivision());
        learner.setLearnerPathList(learnerDto.getLearnerPaths());
        return learner;
    }
}