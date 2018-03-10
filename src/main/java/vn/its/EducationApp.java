package vn.its;

import vn.its.model.Student;
import vn.its.service.StudentService;
import vn.its.service.StudentServiceImpl;

import java.util.List;

public class EducationApp {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentList = studentService.getAllStudent();
        System.out.println(studentList.size());
        Student student = studentList.get(0);
        System.out.println(student);
    }
}
