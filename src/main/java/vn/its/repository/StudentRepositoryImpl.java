package vn.its.repository;

import vn.its.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("nguyen", "ha noi"));
        studentList.add(new Student("tuan", "ha noi"));
        return studentList;
    }
}
