package com.huongdanjava.cleanarchitecture.db;

import com.huongdanjava.cleanarchitecture.db.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepostitory extends JpaRepository<StudentModel, Long> {

  StudentModel findByName(String name);
}
