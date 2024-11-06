package Thread;

import Model.Student;
import Xfile.xFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class threadOne extends Thread{
    private static Queue<Student> studentQueue = new LinkedList<>();
    Student student = new Student();
    public threadOne(Student student1){
        student = student1;
    }
    @Override
    public void run() {
        studentQueue.add(student);
        xFile xFile = new xFile();
        xFile.writeFile((List<Student>) studentQueue);
    }
}
