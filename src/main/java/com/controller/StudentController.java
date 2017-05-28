package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Student;
import com.entities.University;
import com.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("student");
        return view;
    }
	
	@Autowired
	private StudentService studentService;
	
    @RequestMapping(value = "/enrolled", method = RequestMethod.POST)
    public Map<String, Object> getAll(Student student) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        List<Student> list = studentService.getAllStudents();
 
        if (list != null) {
            map.put("status", "200");
            map.put("message", "Data found");
            map.put("data", list);
        } else {
            map.put("status", "404");
            map.put("message", "Data not found");
 
        }
 
        return map;
    }
    
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public Map<String, Object> getSaved(Student student) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (studentService.saveOrUpdate(student)) {
            map.put("status", "200");
            map.put("message", "Student data added/updated successfully");
        }
 
        return map;
    }

    @RequestMapping(value = "/deregister", method = RequestMethod.POST)
    public Map<String, Object> delete(Student student) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (studentService.deRegister(student)){
            map.put("status", "200");
            map.put("message", "Student is deregistered successfully");
        }
 
        return map;
    }

}
