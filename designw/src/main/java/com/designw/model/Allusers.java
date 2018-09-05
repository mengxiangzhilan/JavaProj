package com.designw.model;

public class Allusers {
    private Integer Alluserid;
    private Student student;
    private Teacher teacher;
    private Users users;
    private String AlluserNmae;

    public String getAlluserNmae() {
        return AlluserNmae;
    }

    public void setAlluserNmae(String alluserNmae) {
        AlluserNmae = alluserNmae;
    }

    public Integer getAlluserid() {
        return Alluserid;
    }

    public void setAlluserid(Integer alluserid) {
        Alluserid = alluserid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Allusers{" +
                "Alluserid=" + Alluserid +
                ", student=" + student +
                ", teacher=" + teacher +
                ", users=" + users +
                ", AlluserNmae='" + AlluserNmae + '\'' +
                '}';
    }
}
