package com.cf.classroster.dao;

import com.cf.classroster.dto.Course;
import com.cf.classroster.dto.Student;
import com.cf.classroster.dto.Teacher;

import java.util.List;

public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);

    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
