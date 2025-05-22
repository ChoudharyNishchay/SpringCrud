package com.springorm.crud.dao;

import com.springorm.crud.dao.StudentDao;
import com.springorm.crud.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import javax.transaction.Transactional;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Student student) {
        return (int) hibernateTemplate.save(student);
    }

    public Student getStudent(int id) {
        return hibernateTemplate.get(Student.class, id);
    }

    public List<Student> getAllStudents() {
        return hibernateTemplate.loadAll(Student.class);
    }

    @Transactional
    public void delete(int id) {
        Student s = hibernateTemplate.get(Student.class, id);
        if (s != null) hibernateTemplate.delete(s);
    }

    @Transactional
    public void update(Student student) {
        hibernateTemplate.update(student);
    }
}
