package Strategy;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int score;
    private int age;
    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

interface ListingStrategy{ 
    List<Student> listingStudents(List<Student> studentsList);
    void soutList(List<Student> listedStudents);
}

class ListingStudentsByName implements ListingStrategy{
    @Override
    public List<Student> listingStudents(List<Student> studentsList) {
           List<Student> sortedList = new ArrayList<>(studentsList);
           sortedList.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
           return sortedList;
    }

    @Override
    public void soutList(List<Student> listedStudents){
        for(Student student:listedStudents){
            System.out.println(student.getName());
        }
    }

}

class ListingStudentsByScore implements ListingStrategy{
    @Override
    public List<Student> listingStudents(List<Student> studentsList) {
           List<Student> sortedList = new ArrayList<>(studentsList);
           sortedList.sort((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));
           return sortedList;
    }

    @Override
    public void soutList(List<Student> listedStudents){
        for(Student student:listedStudents){
            System.out.println(student.getScore());
        }
    }

}

class ListingStudentsByAge implements ListingStrategy{
    @Override
    public List<Student> listingStudents(List<Student> studentsList) {
           List<Student> sortedList = new ArrayList<>(studentsList);
           sortedList.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
           return sortedList;
    }


    @Override
    public void soutList(List<Student> listedStudents){
        for(Student student:listedStudents){
            System.out.println(student.getAge());
        }
    }

}

class Principal {
    private List<Student> studentsList;
    private ListingStrategy listingStrategy;
    
    public Principal(ListingStrategy listingStrategy,List<Student> studentsList){
        this.studentsList = studentsList;
        this.listingStrategy = listingStrategy;

    }

    public List<Student> getStudents(){
        return listingStrategy.listingStudents(studentsList);
    }

    public void setListingStrategy(ListingStrategy listingStrategy) {
        this.listingStrategy = listingStrategy;
    }

    public ListingStrategy getListingStrategy() {
        return listingStrategy;
    }
    
    
}

