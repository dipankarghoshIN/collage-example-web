package com.collage.student.managment.model;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Created by dipankar on 13-07-2018.
 */
public class StudentDetail {
    @NotNull(message = "USN cann't be NULL")
    private String studentUsn;
    private String studentName;
    private String specialzation;
    private String city;
    private String state;
    private Integer pin;
    private float firstYearAvg;
    private float secoundYearAvg;
    private float thirdYearAvg;
    private float fourYearAvg;


    public StudentDetail() {
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

    public String getSpecialzation() {
        return specialzation;
    }

    public void setSpecialzation(String specialzation) {
        this.specialzation = specialzation;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDetail that = (StudentDetail) o;
        return Objects.equals(studentUsn, that.studentUsn) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(specialzation, that.specialzation) &&
                Objects.equals(city, that.city) &&
                Objects.equals(state, that.state) &&
                Objects.equals(pin, that.pin) &&
                Objects.equals(firstYearAvg, that.firstYearAvg) &&
                Objects.equals(secoundYearAvg, that.secoundYearAvg) &&
                Objects.equals(thirdYearAvg, that.thirdYearAvg) &&
                Objects.equals(fourYearAvg, that.fourYearAvg);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentUsn, studentName, specialzation, city, state, pin, firstYearAvg, secoundYearAvg, thirdYearAvg, fourYearAvg);
    }

    @Override
    public String toString() {
        return "StudentDetail{" +
                "studentUsn='" + studentUsn + '\'' +
                ", studentName='" + studentName + '\'' +
                ", specialzation='" + specialzation + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                ", firstYearAvg='" + firstYearAvg + '\'' +
                ", secoundYearAvg='" + secoundYearAvg + '\'' +
                ", thirdYearAvg='" + thirdYearAvg + '\'' +
                ", fourYearAvg='" + fourYearAvg + '\'' +
                '}';
    }

}
