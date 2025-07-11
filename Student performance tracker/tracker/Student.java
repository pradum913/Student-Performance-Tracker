package tracker;

import java.util.Map;

public class Student {
    private int id;
    private String name;
    private Map<String, Integer> subjectMarks;

    public Student(int id, String name, Map<String, Integer> subjectMarks) {
        this.id = id;
        this.name = name;
        this.subjectMarks = subjectMarks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Map<String, Integer> getSubjectMarks() { return subjectMarks; }
}