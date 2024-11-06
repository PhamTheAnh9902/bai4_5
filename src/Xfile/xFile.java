package Xfile;

import Model.Student;

import java.io.*;
import java.util.List;

public class xFile {

    public  synchronized void writeFile(List<Student> studentList){
        try {
            OutputStream os = new FileOutputStream("students.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(studentList);
            oos.flush();
            oos.close();
            os.close();
            System.out.println("Xong");
        }
        catch (Exception e){
            System.out.println("Thất bại");
            e.printStackTrace();
        }
    }

    public synchronized List<Student> readFile() throws FileNotFoundException {
        List<Student>  list = null;
        try {
            InputStream is = new FileInputStream("students.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            list = (List<Student>) ois.readObject();
            ois.close();
            is.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return list;

    }
}
