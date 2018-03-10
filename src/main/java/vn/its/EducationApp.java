package vn.its;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vn.its.config.ApplicationConfiguration;
import vn.its.service.StudentService;

public class EducationApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        StudentService service = context.getBean("studentService", StudentService.class);
        System.out.println(service.getAllStudent().size());
    }
}
