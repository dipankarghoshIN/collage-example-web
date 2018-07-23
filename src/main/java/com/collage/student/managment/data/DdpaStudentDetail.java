package com.collage.student.managment.data;

import com.collage.student.managment.data.key.StudentKey;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by dipankar on 13-07-2018.
 */
@Entity
@IdClass(StudentKey.class)
@Table(name = "student_details_record")
public class DdpaStudentDetail implements Serializable {

    @Id
    @Column(name = "student_usn")
    private String studentUsn;


    @Column(name = "student_name")
    private String studentName;

    @Id
    @Column(name = "student_specalization")
    private String specialization;

    private String city;

    private String state;

    private Integer pin;

    @Column(name = "year_one")
    private float firstYearAvg;

    @Column(name = "year_two")
    private float secoundYearAvg;

    @Column(name = "year_three")
    private float thirdYearAvg;

    @Column(name = "year_four")
    private float fourYearAvg;

    public DdpaStudentDetail() {
    }

    public DdpaStudentDetail(String studentUsn, String studentName, String specialization, String city, String state,
                             Integer pin, float firstYearAvg, float secoundYearAvg, float thirdYearAvg, float fourYearAvg) {
        this.studentUsn = studentUsn;
        this.studentName = studentName;
        this.specialization = specialization;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.firstYearAvg = firstYearAvg;
        this.secoundYearAvg = secoundYearAvg;
        this.thirdYearAvg = thirdYearAvg;
        this.fourYearAvg = fourYearAvg;
    }

    public String getStudentUsn() {
        return studentUsn;
    }

    public void setStudentUsn(String studentUsn) {
        this.studentUsn = studentUsn;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public float getFirstYearAvg() {
        return firstYearAvg;
    }

    public void setFirstYearAvg(float firstYearAvg) {
        this.firstYearAvg = firstYearAvg;
    }

    public float getSecoundYearAvg() {
        return secoundYearAvg;
    }

    public void setSecoundYearAvg(float secoundYearAvg) {
        this.secoundYearAvg = secoundYearAvg;
    }

    public float getThirdYearAvg() {
        return thirdYearAvg;
    }

    public void setThirdYearAvg(float thirdYearAvg) {
        this.thirdYearAvg = thirdYearAvg;
    }

    public float getFourYearAvg() {
        return fourYearAvg;
    }

    public void setFourYearAvg(float fourYearAvg) {
        this.fourYearAvg = fourYearAvg;
    }
}
