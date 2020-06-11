package com.durgasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.durgasoft.entity.Student;
import com.durgasoft.service.StudentService;

@Controller
public class StudentController {
@Autowired
StudentService studentService;
	

@RequestMapping("/welcome")
	public String showWelcomePage()
	{
		return "welcome";
	}

@RequestMapping("/addform")
public String showAddPage()
{
	return "addform";
}

@RequestMapping("/searchform")
public String showSearchPage()
{
	return "searchform";
}
@RequestMapping("/updateform")
public String showUpdatePage()
{
	return "updateform";
}
@RequestMapping("/editform")
public String showEditPage()
{
	return "editform";
}

@RequestMapping("/deleteform")
public String showDeletePage()
{
	return "deleteform";
}


//@RequestMapping(value="/add",method=RequestMethod.POST)
@PostMapping(value="/add")
public String add(ModelMap map, @RequestParam String sid, @RequestParam String sname,@RequestParam String saddr)
{
	map.addAttribute("studentOperation","Student Insertion");
	Student student=new Student();
	student.setSid(sid);
	student.setSname(sname);
	student.setSaddr(saddr);
	String status=studentService.addStudent(student);
	
	return status;
}

@RequestMapping(value="/search",method=RequestMethod.POST)
public String search(ModelMap map, @RequestParam String sid)
{

Student student=studentService.searchStudent(sid);
if(student!=null)
{
	
map.addAttribute("student",student);
return "display";
	
}

else {
	return "notexisted";
	}
}


@RequestMapping(value="/editform",method=RequestMethod.POST)
public String getEditForm(ModelMap map, @RequestParam String sid)
{

Student student=studentService.searchStudent(sid);
if(student!=null)
{
	
map.addAttribute("student",student);
return "editform";
	
}

else {
	return "notexisted";
	}
}




@RequestMapping(value="/update",method=RequestMethod.POST)
public String update(ModelMap map, @RequestParam String sid, @RequestParam String sname,@RequestParam String saddr)
{
	map.addAttribute("studentOperation","Student Updation");
	Student student=new Student();
	student.setSid(sid);
	student.setSname(sname);
	student.setSaddr(saddr);
	String status=studentService.updateStudent(student);
	
	return status;
}


@RequestMapping(value="/delete",method=RequestMethod.POST)
public String delete(ModelMap map, @RequestParam String sid)
{
	map.addAttribute("studentOperation","Student Deletion");
Student student=studentService.searchStudent(sid);
if(student!=null)
{
	
String status=studentService.deleteStudent(sid);
return "status";
	
}

else {
	return "notexisted";
	}
}
}