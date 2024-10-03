package com.va.week5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.va.week5.model.Student;
import com.va.week5.repo.StudentRepo;

@Controller
public class StudentProgramEnrollmentController {
	
	
	
	@Autowired
private StudentRepo studentRepo;
	
	@RequestMapping("/index")
	public String home()
	{
		
		return "index";
	}
	
	@PostMapping("/studentadd")
	public @ResponseBody String add(
			@RequestParam("studentId") int studentId,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("address") String address,
			@RequestParam("city") String city,
			@RequestParam("postalCode") String postalCode
			)
	{
		Student student=new Student(studentId,userName,password,firstName,lastName,address,city,postalCode);
		studentRepo.save(student);
		return "An Student  info added";
		}
	
    @RequestMapping("/edit")
    public String Modify()
    {
              return "edit";
    }
/*
 * update below the code... as show above!!
 */
  /*  
    @PostMapping("/studentupdate")
    public @ResponseBody String edit(
    @RequestParam("empId") int empId,
    @RequestParam("empName") String empName,
    @RequestParam("jobTitle") String jobTitle,
    @RequestParam("salary") double salary,
    @RequestParam("deptNo") int deptNo
    )
{
    Employee employee=new Employee(empId,empName,jobTitle,salary,deptNo);
    empRepo.save(employee);
    return "updated";
}

    @RequestMapping("/show")
    public String show(Model model)
{
    model.addAttribute("employees", empRepo.findAll());
    return "show";
    }
*/
}
