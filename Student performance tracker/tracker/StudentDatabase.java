package tracker;

import java.util.*;

public class StudentDatabase {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!\n");
    }

    public void displayAllStudents() {
        for (Student s : students) {
            printStudentDetails(s);
        }
    }

    public void searchStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                printStudentDetails(s);
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    private void printStudentDetails(Student s) {
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks:");
        for (Map.Entry<String, Integer> entry : s.getSubjectMarks().entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        double avg = StudentService.calculateAverage(s.getSubjectMarks());
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + StudentService.assignGrade(avg));
        System.out.println("-----------------------------\n");
    }
}