package tracker;

import java.util.Map;

public class StudentService {
    public static double calculateAverage(Map<String, Integer> marks) {
        int total = 0;
        for (int score : marks.values()) {
            total += score;
        }
        return marks.size() > 0 ? (double) total / marks.size() : 0.0;
    }

    public static String assignGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }
}