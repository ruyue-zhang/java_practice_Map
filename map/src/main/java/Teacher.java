import java.util.Map;

public class Teacher {
    private String name;
    private Map<String, Integer> student;

    public Teacher(String name, Map<String, Integer> student) {
        this.name = name;
        this.student = student;
    }

    public void addStudent(Student stu) {
        student.put(stu.getName(), stu.getAge());
    }
}
