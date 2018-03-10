package vn.its.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.its.repository.StudentRepository;
import vn.its.repository.StudentRepositoryImpl;
import vn.its.service.StudentService;
import vn.its.service.StudentServiceImpl;

@Configuration
public class ApplicationConfiguration {

    @Bean("studentService")
    public StudentService getStudentService(){
        StudentServiceImpl service = new StudentServiceImpl();
        service.setStudentRepository(getStudentRepository());
        return service;
    }

    @Bean("studentRepository")
    public StudentRepository getStudentRepository(){
        return new StudentRepositoryImpl();
    }

}
