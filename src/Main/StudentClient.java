package Main;

import WebService.StudentService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.URL;

public class StudentClient {
    public static void main(String[] args) throws IOException {
                URL url = new URL("http://localhost:8080/ws/student?wsdl");

        QName qName = new QName("http://ws/","StudentServiceImplService");
        Service service = Service.create(url,qName);
        StudentService studentService = service.getPort(StudentService.class);







    }
}
