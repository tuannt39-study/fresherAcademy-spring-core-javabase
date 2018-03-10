package vn.its.service;

import vn.its.model.Student;
import vn.its.repository.StudentRepository;
import vn.its.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }
}
