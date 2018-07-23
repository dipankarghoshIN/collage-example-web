package com.collage.student.managment.controller;

import com.collage.student.managment.data.DdpaStudentDetail;
import com.collage.student.managment.model.StudentDetail;
import com.collage.student.managment.service.IStudentRecordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by dipankar on 13-07-2018.
 */

@RestController
@RequestMapping("record")
public class StudentRecordController {
    private IStudentRecordService studentRecordService;

    public StudentRecordController() {
        super();
    }

    @Autowired
    public StudentRecordController(final IStudentRecordService studentRecordService) {
        this.studentRecordService = studentRecordService;
    }

    @ApiOperation(httpMethod = "POST", value = "Save Student Record into the Database", consumes = "application/json")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> createStudentRecord(@RequestBody @Valid final StudentDetail studentDetail) {
        this.studentRecordService.createStudentRecord(studentDetail);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @ApiOperation(httpMethod = "GET", value = "Fetch Student Record from the Database", consumes = "application/json")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<DdpaStudentDetail> getStudentDetails(@RequestParam String studentUsn) {
        DdpaStudentDetail ddpaStudentDetail = this.studentRecordService.getStudentDetails(studentUsn);
        return new ResponseEntity<>(ddpaStudentDetail, HttpStatus.OK);
    }
}
