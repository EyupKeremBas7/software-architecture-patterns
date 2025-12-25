package Strategy;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student eyup = new Student("eyup", 90, 20);
        Student nurefsan = new Student("nurefsan", 100, 22);
        Student salim = new Student("salim", 100, 20);
        Student samed = new Student("samed", 100, 21);
        
        List<Student> students = new ArrayList<>();
        students.add(samed);
        students.add(salim);
        students.add(nurefsan);
        students.add(eyup);
        
        Principal principal = new Principal(new ListingStudentsByAge(),students);
        principal.getListingStrategy().soutList(principal.getStudents());

        principal.setListingStrategy(new ListingStudentsByScore());
        principal.getListingStrategy().soutList(principal.getStudents());
        
        principal.setListingStrategy(new ListingStudentsByName());
        principal.getListingStrategy().soutList(principal.getStudents());
    }    
}
