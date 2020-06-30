package org.obovkaniuk.app.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import org.obovkaniuk.app.dto.LearningPathDto;
import org.obovkaniuk.app.entity.LearningPath;
import org.obovkaniuk.app.entity.LearningPathName;
import org.obovkaniuk.app.mapper.LearningPathMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class LearningPathRepository implements PanacheMongoRepositoryBase<LearningPath, String> {

    @Inject
    LearningPathMapper learningPathMapper;

    public List<LearningPath> findByName(LearningPathName name) {
        return find("name", name).list();
    }

    public List<LearningPath> getAll() {
        return findAll().list();
    }

    public void save(LearningPathDto course) {
        LearningPath learningPath = learningPathMapper
                .mapToLearningPath(course);
        persist(learningPath);
    }
}
