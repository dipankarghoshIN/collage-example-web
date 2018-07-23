package com.collage.student.managment.service;

import com.collage.student.managment.data.DdpaStudentDetail;
import com.collage.student.managment.model.StudentDetail;


/**
 * Created by dipankar on 13-07-2018.
 */
public interface IStudentRecordService {
    void createStudentRecord(StudentDetail studentDetail);

    DdpaStudentDetail getStudentDetails(String studentUsn);
}
