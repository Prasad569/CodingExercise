package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Course;
import com.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {

	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("course");
        return view;
    }
	
	@Autowired
	private CourseService courseService;
	
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map<String, Object> getAll(Course course) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        List<Course> list = courseService.getAllCourses();
 
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
    public Map<String, Object> getSaved(Course course) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (courseService.saveOrUpdate(course)) {
            map.put("status", "200");
            map.put("message", "Course added/updated successfully");
        }
 
        return map;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Map<String, Object> delete(Course course) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (courseService.delete(course)){
            map.put("status", "200");
            map.put("message", "Course deleted successfully");
        }
 
        return map;
    }

}
