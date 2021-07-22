package com.ptpmpt.dsd15.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ptpmpt.dsd15.model.Department;

public class DepartmentController {
	private static Map<String, Department> DepartmentRepo = new HashMap<String, Department>();
	static {
		initDepart();
	}

	private static void initDepart() {
			Department depart = new Department();
			depart.setDepart_ID("1");
			depart.setDepart_Name("Phòng nhân sự");
			depart.setDepart_Des("Phòng quản lý các công việc liên quan đến nhân sự của tổ chức, quản lý thông tin nhân sự, ...");		
			DepartmentRepo.put(depart.getDepart_ID(), depart);

			Department depart2 = new Department();
			depart2.setDepart_ID("2");
			depart2.setDepart_Name("Phòng kế toán");
			depart2.setDepart_Des("Phòng quản lý các công việc liên quan đến số liệu hoán đơn chứng từ thu nhập csủa công ty, ...");		
			DepartmentRepo.put(depart2.getDepart_ID(), depart2);
	}
	// lấy ra thông tin Department theo ID	
	public static  Department GetDepart(String Department_ID) {
		return DepartmentRepo.get(Department_ID);
	}
	// Thêm Department
	public static Department AddDepartment(Department Department) {
		DepartmentRepo.put(Department.getDepart_ID(), Department);
		return Department;
	}
	// Update Department
	public static Department UpdateDepartment(String id, Department Department) {
		DepartmentRepo.remove(id);
		Department.setDepart_ID(id);
		DepartmentRepo.put(id, Department);
		return Department;
	}
	//Delete Department
	public static void DeleteDepartment(String Department_ID) {
		DepartmentRepo.remove(Department_ID);
	}
	// Lấy ra tất cả thông tin các đoạn Department
	public static List<Department> getAllDepartments() {
		Collection<Department> d = DepartmentRepo.values();
		List<Department> list = new ArrayList<Department>();
		list.addAll(d);
		return list;
	}
}
