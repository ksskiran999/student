package com.durgasoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.durgasoft.entity.Student;


@Repository
public class StudentDaoImpl implements StudentDao {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	public String add(Student student) {
		String status="";
		Student  std=search(student.getSid());
		if(std==null)
		{
			int rowCount=jdbcTemplate.update("insert into student values('"+student.getSid()+"','"+student.getSname()+"','"+student.getSaddr()+"')");
			if(rowCount==1)
			{
				status="success";
				
			}
			else
			{
				status="failure";
			}
			
		}
		else {
			status="existed";
		}
		
		return status;
	}

	@Override
	public Student search(String sid) {
	 Student student=null;
	 List<Student> studentsList=jdbcTemplate.query("select * from student where SID='"+sid+"'", (rs,rowNum) -> {
		 Student s=new Student();
	s.setSid(rs.getString("SID"));
	s.setSname(rs.getString("SNAME"));
	s.setSaddr(rs.getString("SADDR"));
	 return s;
	 });
	 if(studentsList.isEmpty()==true)
{
	student=null;
	
}
	 else {
		 student=studentsList.get(0);
	 }
		return student;
	}

	@Override
	public String update(Student student) {
		String status="";
int rowCount=jdbcTemplate.update("update student set SNAME='"+student.getSname()+"',SADDR='"+student.getSaddr()+"' where SID='"+student.getSid()+"'");
if(rowCount ==1)
{
	status="success";
	
}
else
{
	status="failure";
}
				
		return status;
	}

	@Override
	public String delete(String sid) {
		String status="";
		Student std=search(sid);
		if(std==null) {
			status="notexisted";
		}
		else {
			
		
		int rowCount=jdbcTemplate.update("delete from student where SID='"+sid+"'");
		
		if(rowCount ==1)
		{
			status="success";
			
		}
		else
		{
			status="failure";
		}
						
		}
		return status;
	

}
}