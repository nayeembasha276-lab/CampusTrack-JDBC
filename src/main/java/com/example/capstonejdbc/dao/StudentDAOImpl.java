package com.example.capstonejdbc.dao;

import com.example.capstonejdbc.model.Student;
import com.example.capstonejdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    Connection con = DBConnection.getConnection();
    //insert
    public void addStudent(Student s){
        try {
            String quary ="insert into students(id,name,age,course,mobile) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(quary);
            ps.setInt(1,s.getId());
            ps.setString(2,s.getName());
            ps.setInt(3,s.getAge());
            ps.setString(4,s.getCourse());
            ps.setLong(5,s.getMobile());
            ps.executeUpdate();
            System.out.println("student added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //select

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try {
            String quary = "select * from students";
            PreparedStatement ps = con.prepareStatement(quary);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getLong("mobile")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    //update
    @Override
    public void updateStudent(Student s) {
        try {
            String quary = "update students set name = ?, age = ?, course = ?, mobile = ? where id = ?";
            PreparedStatement ps = con.prepareStatement(quary);
            ps.setString(1,s.getName());
            ps.setInt(2,s.getAge());
            ps.setInt(5,s.getId());
            ps.setString(3,s.getCourse());
            ps.setLong(4,s.getMobile());
            ps.executeUpdate();
            System.out.println("Student Updeted Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //update name
    @Override
    public void updateName(int id, String name) {
        try {
            String query = "update students set name=? where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Name Updated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //updateAge
    @Override
    public void updateAge(int id, int age) {
        try {
            String query = "update students set age=? where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, age);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Age Updated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //updatecourse
    @Override
    public void updateCourse(int id, String course) {
        try {
            String query = "update students set course=? where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, course);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Course Updated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //updatemobile
    @Override
    public void updateMobile(int id, long mobile) {
        try {
            String query = "update students set mobile=? where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, mobile);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Mobile Updated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //getStudentById

    @Override
    public Student getStudentbyId(int id) {
        try {
            String quary = "select * from students where id= ?";
            PreparedStatement ps = con.prepareStatement(quary);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getLong("mobile"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //searchByName
    @Override
    public List<Student> searchByName(String name) {
        List<Student> list = new ArrayList<>();
        try {
            String quary = "select * from students where name like ?";
            PreparedStatement ps = con.prepareStatement(quary);
            ps.setString(1,"%"+name+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getLong("mobile")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    //delete

    @Override
    public void deleteStudent(int id) {
        try {
            String quary ="delete from students where id=?";
            PreparedStatement ps = con.prepareStatement(quary);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Student Deleted Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
