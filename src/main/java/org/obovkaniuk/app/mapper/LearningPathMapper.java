package org.obovkaniuk.app.mapper;

import org.obovkaniuk.app.dto.CourseDto;
import org.obovkaniuk.app.entity.LearningPath;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CourseMapper {

    public LearningPath mapToCourse(CourseDto courseDto) {
        LearningPath learningPath = new LearningPath();
        learningPath.setName(courseDto.getName());
        learningPath.setMark(courseDto.getMark());
        return learningPath;
    }
}