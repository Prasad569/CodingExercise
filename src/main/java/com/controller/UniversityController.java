package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entities.University;
import com.service.UniversityService;

@RestController
@RequestMapping("university")
public class UniversityController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getUniversityList() {
        ModelAndView view = new ModelAndView("university");
        return view;
    }

	
	@Autowired
	private UniversityService universityService;
	
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map<String, Object> getAll(University university) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        List<University> list = universityService.getAllUniversities();
 
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

}
