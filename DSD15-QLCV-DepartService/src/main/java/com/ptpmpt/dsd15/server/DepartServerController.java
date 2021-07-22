package com.ptpmpt.dsd15.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ptpmpt.dsd15.controller.DepartmentController;
import com.ptpmpt.dsd15.model.Department;
import com.ptpmpt.dsd15.model.Department;

@RestController
public class DepartServerController {
	@RequestMapping(value = "/Departments", method = RequestMethod.GET)
	@ResponseBody
	public List<Department> getDeparts() {
		List<Department> list = DepartmentController.getAllDepartments();
		return list;
	}

	@RequestMapping(value = "/Departments/{id}", method = RequestMethod.GET)
	public Department getDepart(@PathVariable("id") String Department_ID) {
		return DepartmentController.GetDepart(Department_ID);
	}

	@RequestMapping(value = "/Departments", method = RequestMethod.POST)
	@ResponseBody
	public Department createDepartment(@RequestBody Department Department) {
		System.out.println("(Service Side) Creating Department: " + Department.getDepart_ID());
		return DepartmentController.AddDepartment(Department);
	}

	@RequestMapping(value = "/Departments/{id}", method = RequestMethod.PUT)
	public Department updateDepartment(@PathVariable("id") String id, @RequestBody Department Department) {
		System.out.println("(Service Side) Update Department: " + Department.getDepart_ID());
		return DepartmentController.UpdateDepartment(id, Department);
	}

	@RequestMapping(value = "/Departments/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@PathVariable("id") String Department_ID) {
		System.out.println("(Service Side) Delete Department: " + Department_ID);
		DepartmentController.DeleteDepartment(Department_ID);
		return new ResponseEntity<>("Department is deleted successsfully", HttpStatus.OK);

	}
}
