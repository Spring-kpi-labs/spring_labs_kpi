package rest.service.implementations;

import rest.dao.interfaces.StudentDAO;
import rest.entity.Student;
import rest.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDao;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        List<Student> students = studentDao.getAllStudents();
        for(Student s : students) {
            System.out.println(s);
        }
        return students;
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    @Override
    @Transactional
    public List<Student> getAllStudentsWithoutGroup() {
        return studentDao.getAllStudentsWithoutGroup();
    }

    @Override
    @Transactional
    public List<Student> getFilteredStudentsByLastName(String lastName) {
        return studentDao.getFilteredStudentsByLastName(lastName);
    }
}
