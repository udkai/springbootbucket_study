package com.balance.test;

import com.balance.mapper.PeopleMapper;
import com.balance.mapper.StudentMapper;
import com.balance.mapper.TeacherMapper;
import com.balance.mapper.UserMapper;
import com.balance.model.Student;
import com.balance.model.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by liukai on 2018/9/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanTest {
    @Autowired
    @Qualifier("student")
    private Map<String, String> student;
    @Autowired
    @Qualifier("teacher")
    private Map<String, String> teacher;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private PeopleMapper peopleMapper;
    @Test
    public void test1() {
        System.out.println(student.get("name"));
        System.out.println("---------------");
        System.out.println(teacher.get("name"));
    }

    @Test
    public void test2() {
        Student student = new Student("李四", 26, "男");
        studentMapper.save(student);
    }

    @Test
    public void test3() {
        Student student = new Student("张三", 23, "nan ");
        List<Student> list = studentMapper.query(student);
        System.out.println(list);
    }

    @Test
    public void test4() {
        Teacher teacher=new Teacher();
        teacher.setName("张三");
        teacher.setAge(26);
        teacher.setSex("男");
//        teacherMapper.insert(teacher);
    }
    @Test
    public void test5(){
        List<Student>list=peopleMapper.list1();
        System.out.println(list);
    }
}
