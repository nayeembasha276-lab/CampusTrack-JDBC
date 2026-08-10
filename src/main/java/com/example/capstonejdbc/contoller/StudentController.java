package com.example.capstonejdbc.contoller;

import com.example.capstonejdbc.Service.StudentService;
import com.example.capstonejdbc.model.Student;

import java.util.Scanner;

public class StudentController {
        private Scanner sc = new Scanner(System.in);
        private StudentService studentService = new StudentService();

        public void start() {
            while (true){
                showMenu();
                int choice = sc.nextInt();
                sc.nextLine();

                handleChoice(choice);
            }
        }
        private void showMenu(){
            System.out.println("=======================STUDENT MANAGEMENT SYSTEM=====================");
            System.out.println("1. Add student");
            System.out.println("2. view all students");
            System.out.println("3. Search by Id");
            System.out.println("4. Search by Name");
            System.out.println("5. Update student");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
        }
        private void handleChoice(int choice){
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentService.viewAllStudent();
                    break;
                case 3:
                    System.out.println("Enter ID: ");
                    studentService.searchById(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter Name: ");
                    studentService.searchByName(sc.nextLine());
                    break;
                case 5:
                    updateStudent();
                    break;
                case 6:
                    System.out.println("Enter ID: ");
                    studentService.deleteStudent(sc.nextInt());
                    break;
                case 7:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.........");
            }
        }

        private void addStudent(){
            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Course: ");
            String course = sc.next();


            System.out.println("Mobile: ");
            long mobile = sc.nextLong();
            sc.nextLine();

            studentService.addStudent(new Student(id,name,age,course,mobile));
        }

        private void updateAllStudent(){
            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Course: ");
            String course = sc.next();

            System.out.println("Mobile: ");
            long mobile = sc.nextLong();
            sc.nextLine();

            studentService.updateStudent(new Student(id,name,age,course,mobile));

        }


        private void updateStudent() {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            Student student = studentService.getStudentById(id);
            if (student == null) {
                System.out.println("Student Not Found...");
                return;
            }

            System.out.println(student);

            System.out.println("\n===== UPDATE MENU =====");
            System.out.println("1. Update Name");
            System.out.println("2. Update Age");
            System.out.println("3. Update Course");
            System.out.println("4. Update Mobile");
            System.out.println("5. Update All");
            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter New Name : ");
                    String name = sc.nextLine();
                    studentService.updateName(id, name);
                    break;
                case 2:
                    System.out.print("Enter New Age : ");
                    int age = sc.nextInt();
                    studentService.updateAge(id, age);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter New Course : ");
                    String course = sc.nextLine();
                    studentService.updateCourse(id, course);
                    break;
                case 4:
                    System.out.print("Enter New Mobile : ");
                    long mobile = sc.nextLong();
                    studentService.updateMobile(id, mobile);
                    break;
                case 5:
                    updateAllStudent();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }

}
