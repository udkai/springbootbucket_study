package com.balance.mapper;

import com.balance.model.Student;

import java.util.List;

/**
 * Created by liukai on 2018/9/13.
 */
public interface StudentMapper {
    Student findById(int id);
    int save(Student student);
    List<Student> list();
    List<Student>query(Student student);
}
