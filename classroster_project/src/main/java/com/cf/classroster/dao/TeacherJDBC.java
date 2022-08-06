package com.cf.classroster.dao;

import com.cf.classroster.dto.Teacher;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TeacherJDBC implements TeacherDao{
    JdbcTemplate jdbc;

    @Override
    public Teacher getTeacherById(int id) {
        try {
            final String GET_TEACHER_BY_ID = "SELECT * FROM teacher WHERE id = ?";
            return jdbc.queryForObject(GET_TEACHER_BY_ID, new TeacherMapper(), id);
        } catch(DataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacherById(int id) {

    }

    public static final class TeacherMapper implements RowMapper<Teacher> {

        @Override
        public Teacher mapRow(ResultSet rs, int index) throws SQLException {
            Teacher teacher = new Teacher();
            teacher.setId(rs.getInt("id"));
            teacher.setFirstName(rs.getString("firstName"));
            teacher.setLastName(rs.getString("lastName"));
            teacher.setSpecialty(rs.getString("specialty"));

            return teacher;
        }
    }
}
