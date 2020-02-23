import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) {
    Map<String, Integer> student = new LinkedHashMap<>();
    student.put("Linda", 18);
    student.put("Cindy", 19);
    student.put("Mary", 19);
    Teacher bob = new Teacher("Bob", student);
    bob.addStudent(new Student("Ben", 19));
    bob.addStudent(new Student("Solider", 20));
  }

}
