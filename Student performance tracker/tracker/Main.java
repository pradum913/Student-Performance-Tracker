package tracker;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentDatabase db = new StudentDatabase();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("===== Student Performance Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> db.displayAllStudents();
                case 3 -> {
                    System.out.print("Enter ID to search: ");
                    int id = scanner.nextInt();
                    db.searchStudentById(id);
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        Map<String, Integer> marks = new HashMap<>();
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter subject name: ");
            String subject = scanner.nextLine();
            System.out.print("Enter marks for " + subject + ": ");
            int score = scanner.nextInt();
            scanner.nextLine();
            marks.put(subject, score);
        }
        Student s = new Student(id, name, marks);
        db.addStudent(s);
    }
}
