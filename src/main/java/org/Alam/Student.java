package org.Alam;

public class Student {

    private int studentId;
    private String sName;
    private int sAge;

    public Student() {
    }

    public Student(int studentId, String sName, int sAge) {
        this.studentId = studentId;
        this.sName = sName;
        this.sAge = sAge;
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
                '}';
    }
}
