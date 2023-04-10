import java.util.ArrayList;
import java.util.List;

public class StudentUtils {
    public static List<Student> filterStudents(List<Student> students, Filter filter){
        List<Student> filteredList = new ArrayList<>();
        for(Student student : students){
            if(filter.filter(student)){
                filteredList.add(student);
            }
        }
        return filteredList;
    }
    public static List<Student> mapStudents(List<Student> students, Mapper mapper){
        List<Student> mappedList = new ArrayList<>();
        for(Student student : students){
            mappedList.add(mapper.map(student));
        }
        return mappedList;
    }
}
