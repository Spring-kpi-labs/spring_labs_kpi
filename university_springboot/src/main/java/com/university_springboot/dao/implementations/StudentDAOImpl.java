package com.university_springboot.dao.implementations;

import com.university_springboot.dao.interfaces.StudentDAO;
import com.university_springboot.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    /*private SessionFactory sessionFactory;

    @Autowired
    public StudentDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();

        Query<Student> query = session.createQuery("select s from Student s", Student.class);
        List<Student> allStudents = query.list();

        return allStudents;
    }*/
/*
    @Override
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(student);
    }

    @Override
    public Student getStudent(int id) {
        Session session = sessionFactory.getCurrentSession();

        Student student = session.get(Student.class, id);
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Student> query = session.createQuery("delete from Student " +
                "where id=:studentId");

        query.setParameter("studentId", id);
        query.executeUpdate();
    }

    @Override
    public List<Student> getAllStudentsWithoutGroup() {
        Session session = sessionFactory.getCurrentSession();

        Query<Student> query = session.createQuery("select s from Student s where s.universityGroup is null",
                Student.class);
        List<Student> students = query.list();

        return students;
    }

    @Override
    public List<Student> getFilteredStudentsByLastName(String lastName) {
        Session session = sessionFactory.getCurrentSession();

        Query<Student> query = session.createQuery("select s from Student s " +
                "where s.lastName like :studentLastName");

        query.setString("studentLastName", "%" + lastName + "%");
        List<Student> filteredStudents = query.getResultList();

        return filteredStudents;
    }*/
}
