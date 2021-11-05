public class Course {
    private String[] studentNames;

    public Course(String ... names) {
        this.studentNames = names;
    }
public String toString() {
    String result = "";
    for (String names : studentNames) {
        result += names + "\n";
    }
    return result;
    
}
    
}
