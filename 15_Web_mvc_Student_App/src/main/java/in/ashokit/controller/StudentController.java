package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexStage(Model model) {

		init(model);
  		return "index";
	}

	@PostMapping("/save")
	public String SaveStudent(Student s, Model model) {

		service.saveStudent(s);
		System.out.println(s);
		init(model);
		return "index";
	}
	
	public void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("prefTimings", service.getTimings());
	}
}
