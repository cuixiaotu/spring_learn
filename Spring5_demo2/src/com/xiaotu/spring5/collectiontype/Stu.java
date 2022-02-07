package com.xiaotu.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
  private String courses[];
  private List<String> list;
  private Map<String,String> maps;
  private List<Integer> likeNums;

  private Set<String> sets;
  private List<Courses> coursesList;

  public void setCourses(String[] courses) {
    this.courses = courses;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public void setMaps(Map<String, String> maps) {
    this.maps = maps;
  }

  public void setSets(Set<String> sets) {
    this.sets = sets;
  }

  public void setCoursesList(List<Courses> coursesList) {
    this.coursesList = coursesList;
  }

  public void setLikeNums(List<Integer> likeNums) {
    this.likeNums = likeNums;
  }

  public void show(){
    System.out.println();
    System.out.println(Arrays.toString(courses));
    System.out.println(list);
    System.out.println(maps);
    System.out.println(likeNums);
    System.out.println(sets);
    System.out.println(coursesList);
  }
}
