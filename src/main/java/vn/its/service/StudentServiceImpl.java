package vn.its.service;

import vn.its.model.Student;
import vn.its.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl {
    private StudentRepositoryImpl studentRepository = new StudentRepositoryImpl();

    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }
}
