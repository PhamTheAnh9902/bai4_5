package Main;

import WebService.StudentServiceImpl;

import javax.xml.ws.Endpoint;

public class StudentPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9090/Model/student", new StudentServiceImpl());
    }
}
