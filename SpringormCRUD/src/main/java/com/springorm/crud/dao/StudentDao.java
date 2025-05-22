package com.springorm.crud.dao;



import com.springorm.crud.entity.Student;
import java.util.List;

public interface StudentDao {
    int insert(Student student);
    void update(Student student);
    void delete(int id);
    Student getStudent(int id);
    List<Student> getAllStudents();
}

