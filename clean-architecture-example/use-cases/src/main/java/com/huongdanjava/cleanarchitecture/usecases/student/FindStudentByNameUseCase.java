package com.huongdanjava.cleanarchitecture.usecases.student;

import com.huongdanjava.cleanarchitecture.usecases.adapter.StudentAdapter;
import com.huongdanjava.cleanarchitecture.entities.Student;

public class FindStudentByNameUseCase {

  private StudentAdapter adapter;

  public FindStudentByNameUseCase(StudentAdapter adapter) {
    this.adapter = adapter;
  }

  public Student find(String name) {
    return adapter.findByName(name);
  }
}
