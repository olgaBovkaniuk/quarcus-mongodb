package org.obovkaniuk.app.mapper;

import org.obovkaniuk.app.dto.CourseDto;
import org.obovkaniuk.app.entity.Course;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CourseMapper {

    public Course mapToCourse(CourseDto courseDto) {
        Course course = new Course();
        course.setName(courseDto.getName());
        course.setMark(courseDto.getMark());
        return course;
    }
}