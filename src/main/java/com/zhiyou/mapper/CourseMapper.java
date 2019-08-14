package com.zhiyou.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhiyou.model.Course;

public interface CourseMapper {
  void add(Course course);
  void update(Course course);
  void delete(int id);
  void deleteIn(ArrayList<Integer> ids);
  List<Course> SelectAll();
  List<Course> SelectById(int id);
  List<Course> SelectAllLimit(@Param("page")int page,@Param("number")int number);
  List<Course> selectIncludeVideoAndSubjectBySubjectId(int subjectId);
  
}
