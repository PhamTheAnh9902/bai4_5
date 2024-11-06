package Model;

import java.io.Serializable;
import java.util.Scanner;

    public class Student implements Serializable {
    private String name,className,address;
    private int age,code;
    private double mark;

    public Student(String name, String className, String address, int age, int code,double mark) {
        this.name = name;
        this.className = className;
        this.address = address;
        this.age = age;
        this.code = code;
        this.mark = mark;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void add1Student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter code: ");
        code = input.nextInt();
        input.nextLine();
        System.out.print("Enter classname: ");
        className = input.nextLine();
        System.out.print("Enter address: ");
        address = input.nextLine();
        System.out.print("Enter mark: ");
        mark = input.nextInt();
    }
}
