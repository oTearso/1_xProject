package demo2.dao;

import demo2.pojo.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAll();
    int insert(List<Student> list);
}
