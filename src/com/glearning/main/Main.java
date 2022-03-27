package com.glearning.main;

import com.glearning.departments.AdminDepartment;
import com.glearning.departments.HrDepartment;
import com.glearning.departments.TechDepartment;

public class Main {

    public static void main(String args[]) {

        // Admin Department
        AdminDepartment adminDepartment = new AdminDepartment();
        System.out.println(adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println(" ");

        // Hr Department
        HrDepartment hrDepartment = new HrDepartment();
        System.out.println(hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println(" ");
        
        // Tech Department
        TechDepartment techDepartment = new TechDepartment();
        System.out.println(techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
        System.out.println(" ");
    }
}