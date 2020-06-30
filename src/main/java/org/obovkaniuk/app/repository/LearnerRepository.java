package org.obovkaniuk.app.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import org.bson.types.ObjectId;
import org.obovkaniuk.app.dto.LearnerDto;
import org.obovkaniuk.app.entity.Learner;
import org.obovkaniuk.app.mapper.LearnerMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class LearnerRepository implements PanacheMongoRepositoryBase<Learner, ObjectId> {

    @Inject
    LearnerMapper learnerMapper;

    public Learner getById(ObjectId id) {
        return findById(id);
    }

    public List<Learner> getAll() {
        return findAll().list();
    }

    public void save(LearnerDto learnerDto) {
        Learner learner = learnerMapper
                .mapToLearner(learnerDto);
        persist(learner);
    }

    public void remove(ObjectId id) {
        Learner learner = findById(id);
        delete(learner);
    }

    public void update(ObjectId id, LearnerDto learnerDto) {
        Learner learner = findById(id);
        learner.setFirstName(learnerDto.getFirstName());
        learner.setLastName(learnerDto.getLastName());
        learner.setLearnerPathList(learnerDto.getLearnerPaths());
        update(learner);
    }
}
