package com.durgasoft.dao;

import com.durgasoft.entity.Student;

public interface StudentDao {

	public String add(Student student);
	public Student search(String sid);
	public String update(Student student);
	public String delete(String sid);
}
