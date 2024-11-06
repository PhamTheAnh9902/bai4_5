package WebService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;

@WebService
public interface StudentService {

    @WebMethod
    String check(String username, String password, String name, int age, int code, String className, String address, double mark) throws IOException;


}
