package com.example.capstonejdbc.Service;

import com.example.capstonejdbc.dao.StudentDAO;
import com.example.capstonejdbc.dao.StudentDAOImpl;
import com.example.capstonejdbc.model.Student;

import java.util.List;

public class StudentService {
    StudentDAO dao = new StudentDAOImpl();

    public void addStudent(Student s){
        if (s.getAge() <= 0|| s.getName().isEmpty()){
            System.out.println("Invalid Data..");
            return;
        }
        if (dao.getStudentbyId(s.getId())!= null){
            System.out.println("ID already Exits...");
            return;
        }
        dao.addStudent(s);
    }



    public void viewAllStudent(){
        List<Student> list = dao.getAllStudents();
        if (list.isEmpty()){
            System.out.println("No Data Found..");
            return;
        }
        for (Student s : list){
            System.out.println(s);
        }

    }

    public void searchById(int id){
        Student s = dao.getStudentbyId(id);
        if (s == null){
            System.out.println("Not Found...");
        }else {
            System.out.println("\nID | Name | Age | course | mobile");
            System.out.println(s);
        }
    }


    public void searchByName(String name){
        List<Student> list = dao.searchByName(name);
        if (list.isEmpty()){
            System.out.println("No matching record Found...");
            return;
        }else {
            System.out.println("\nID | Name | Age | course | mobile");
            list.forEach(System.out::println);
        }
    }

    public void updateStudent(Student s){
        if (dao.getStudentbyId(s.getId())==null){
            System.out.println("Student Not Found..");
            return;
        }
        dao.updateStudent(s);
    }

    public void updateName(int id, String name) {
        if (dao.getStudentbyId(id) == null) {
            System.out.println("Student Not Found...");
            return;
        }
        dao.updateName(id, name);
    }


    public void updateAge(int id, int age) {
        if (dao.getStudentbyId(id) == null) {
            System.out.println("Student Not Found...");
            return;
        }
        dao.updateAge(id, age);
    }

    public void updateCourse(int id, String course) {
        if (dao.getStudentbyId(id) == null) {
            System.out.println("Student Not Found...");
            return;
        }
        dao.updateCourse(id, course);
    }



    public void updateMobile(int id, long mobile) {
        if (dao.getStudentbyId(id) == null) {
            System.out.println("Student Not Found...");
            return;
        }
        dao.updateMobile(id, mobile);
    }

    public Student getStudentById(int id){

        return dao.getStudentbyId(id);

    }


    public void deleteStudent(int id){
        if (dao.getStudentbyId(id)==null){
            System.out.println("Student Not Found../..");
            return;
        }
        dao.deleteStudent(id);
    }
}
