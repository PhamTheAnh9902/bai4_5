package WebService;

import Model.Student;

import javax.jws.WebService;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import Thread.threadOne;

@WebService(endpointInterface = "WebService.StudentService")
public class StudentServiceImpl implements StudentService {


    @Override
    public String check(String username, String password, String name, int age, int code, String className, String address, double mark) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("app.conf"));
        if(properties.getProperty("username").equalsIgnoreCase(username)
            && properties.getProperty("password").equalsIgnoreCase(password)){
            Student student = new Student(name,className,address,age,code,mark);
            threadOne threadOne = new threadOne(student);
            threadOne.run();
            return "Thanh cong";
        }
        else return "username/password Khoong ";

    }
}
