package services;

import models.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showAll() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void searchById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found: " + s + "\n");
                return;
            }
        }
        System.out.println("No student found with ID: " + id + "\n");
    }
}
