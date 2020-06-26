package org.obovkaniuk.app.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.obovkaniuk.app.dto.CourseDto;
import org.obovkaniuk.app.entity.Course;
import org.obovkaniuk.app.mapper.CourseMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CourseRepository implements PanacheMongoRepository<Course> {

    @Inject
    CourseMapper courseMapper;

    public Course findByName(String name) {
        return find("name", name).firstResult();
    }

    public List<Course> getAll() {
        return findAll().list();
    }

    public void save(CourseDto course) {
        courseMapper
                .mapToCourse(course)
                .persist();
    }
}
