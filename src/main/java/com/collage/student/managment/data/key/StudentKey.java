package com.collage.student.managment.data.key;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by dipankar on 13-07-2018.
 */
public class StudentKey implements Serializable {
    private String studentUsn;


    public StudentKey() {
    }

    public StudentKey(String studentUsn) {
        this.studentUsn = studentUsn;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentKey that = (StudentKey) o;
        return Objects.equals(studentUsn, that.studentUsn);

    }

    @Override
    public int hashCode() {

        return Objects.hash(studentUsn);
    }

    public String getStudentUsn() {
        return studentUsn;
    }

    public void setStudentUsn(String studentUsn) {
        this.studentUsn = studentUsn;
    }


}
