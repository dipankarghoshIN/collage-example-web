package com.collage.student.managment.repo;

import com.collage.student.managment.data.DdpaStudentDetail;
import com.collage.student.managment.data.key.StudentKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dipankar on 13-07-2018.
 */
@Repository
public interface IStudentRepository extends CrudRepository<DdpaStudentDetail, StudentKey> {

    DdpaStudentDetail findByStudentUsn(String studentUsn);
}
