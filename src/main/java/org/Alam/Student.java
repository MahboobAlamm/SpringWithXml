package org.Alam;

public class Student {

    private int studentId;
    private String sName;
    private int sAge;
    //constructor injection
    private Computer comp;


    public Student (Computer comp1) {
        this.comp = comp1;
    }

    public Student() {
        System.out.println("Student no args construtor");
    }

    public Student(int studentId, String sName, int sAge, Computer comp) {
        this.studentId = studentId;
        this.sName = sName;
        this.sAge = sAge;
        this.comp = comp;
    }

    public void code() {
        System.out.println("Student is coding...");
        comp.compile();
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", comp=" + getComp() +
                '}';
    }
}
