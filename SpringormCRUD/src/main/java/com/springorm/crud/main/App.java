package com.springorm.crud.main;

import com.springorm.crud.dao.StudentDao;
import com.springorm.crud.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = context.getBean("studentDao", StudentDao.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Scanner sc = new Scanner(System.in);
        boolean go = true;
        while (go) {
            System.out.println("\n=== Student CRUD Menu ===");
            System.out.println("Press 1 for add new student");
            System.out.println("Press 2 for display all students");
            System.out.println("Press 3 for get details of single student");
            System.out.println("Press 4 for delete student");
            System.out.println("Press 5 for update student");
            System.out.println("Press 6 for exit");

            try {

               int input =  Integer.parseInt(br.readLine());
//               if(input==1){
//                   //add a new student
//               } else if (input==2) {
//                   //display
//               }

                switch (input){

                    case 1 :
                        //add a new student
                        break;
                    case 2 :
                        //display all student
                        break;
                    case 3 :
                        //get single student data
                        break;
                    case 4 :
                        //delete student
                        break;
                    case 5 :
                        //update the student
                        break;
                    case 6 :
                        //exit
                        go = false;
                        break;

                }

            } catch (Exception e) {

                System.out.println("invalid input try with another one ..!!");
                System.out.println(e.getMessage());

            }

           //by using switch   ` and condition

//            int input = sc.nextInt();
//
//            switch (input) {
//                case 1:
//                    System.out.print("Enter name: ");
//                    String name = sc.next();
//                    System.out.print("Enter city: ");
//                    String city = sc.next();
//                    Student s = new Student();
//                    s.setName(name);
//                    s.setCity(city);
//                    int id = dao.insert(s);
//                    System.out.println("Inserted with ID: " + id);
//                    break;
//
//                case 2:
//                    List<Student> list = dao.getAllStudents();
//                    for (Student st : list) {
//                        System.out.println(st);
//                    }
//                    break;
//
//                case 3:
//                    System.out.print("Enter student ID: ");
//                    int sid = sc.nextInt();
//                    Student student = dao.getStudent(sid);
//                    System.out.println(student);
//                    break;
//
//                case 4:
//                    System.out.print("Enter student ID to delete: ");
//                    int did = sc.nextInt();
//                    dao.delete(did);
//                    System.out.println("Deleted.");
//                    break;
//
//                case 5:
//                    System.out.print("Enter ID to update: ");
//                    int uid = sc.nextInt();
//                    Student updateStudent = dao.getStudent(uid);
//                    if (updateStudent == null) {
//                        System.out.println("Student not found!");
//                        break;
//                    }
//                    System.out.print("Enter new name: ");
//                    updateStudent.setName(sc.next());
//                    System.out.print("Enter new city: ");
//                    updateStudent.setCity(sc.next());
//                    dao.update(updateStudent);
//                    System.out.println("Updated.");
//                    break;
//
//                case 6:
//                    System.out.println("Exiting...");
//                    sc.close();
//                    System.exit(0);
//            }
        }

        System.out.println("thankyou using my application");
        System.out.println("see you soon !!");
    }
}
