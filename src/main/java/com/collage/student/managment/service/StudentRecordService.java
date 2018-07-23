package com.collage.student.managment.service;

import com.collage.student.managment.controller.exception.ValidationException;
import com.collage.student.managment.data.DdpaStudentDetail;
import com.collage.student.managment.model.StudentDetail;
import com.collage.student.managment.model.StudentRequest;
import com.collage.student.managment.repo.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;

/**
 * Created by dipankar on 13-07-2018.
 */

@Service
public class StudentRecordService implements IStudentRecordService {


    private IStudentRepository studentRepository;

    public StudentRecordService() {
        super();
    }


    @Autowired
    public StudentRecordService(final IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    @Transactional
    public void createStudentRecord(final StudentDetail studentDetail) {
        DdpaStudentDetail ddpaStudentDetail = new DdpaStudentDetail(studentDetail.getStudentUsn(), studentDetail.getStudentName(), studentDetail.getSpecialzation(), studentDetail.getCity(),
                studentDetail.getState(), studentDetail.getPin(), studentDetail.getFirstYearAvg(), studentDetail.getSecoundYearAvg(), studentDetail.getThirdYearAvg(),
                studentDetail.getFourYearAvg());
        this.studentRepository.save(ddpaStudentDetail);
    }


    @Override
    @Transactional
    public DdpaStudentDetail getStudentDetails (String studentUsn) {
        DdpaStudentDetail ddpaStudentDetail = this.studentRepository.findByStudentUsn(studentUsn);
        return ddpaStudentDetail;
    }

}