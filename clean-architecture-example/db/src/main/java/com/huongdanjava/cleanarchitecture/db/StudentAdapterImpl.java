package com.huongdanjava.cleanarchitecture.db;

import com.huongdanjava.cleanarchitecture.usecases.adapter.StudentAdapter;
import com.huongdanjava.cleanarchitecture.db.mapper.StudentMapper;
import com.huongdanjava.cleanarchitecture.db.model.StudentModel;
import com.huongdanjava.cleanarchitecture.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentAdapterImpl implements StudentAdapter {

  @Autowired
  private StudentRepostitory studentRepository;

  @Override
  public Student findByName(String name) {
    StudentModel findByName = studentRepository.findByName(name);

    return StudentMapper.toEntity(findByName);
  }
}
