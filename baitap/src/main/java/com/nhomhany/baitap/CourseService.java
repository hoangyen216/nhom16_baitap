package com.nhomhany.baitap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CourseService {
	private List<Course> listCourse = new ArrayList<>() ;
	public void add(Course newproduct) {
		listCourse.add(newproduct);
	}
	public List<Course> getAll(){
		return listCourse;
	}
}
