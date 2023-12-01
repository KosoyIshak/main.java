package prakt10.num3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MergeStudentsLists {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        students1.add(new Student("Тимур", 4.5));
        students1.add(new Student("Антон", 4.0));
        students1.add(new Student("Георгий", 3.7));
        students2.add(new Student("Александр", 1.7));
        students2.add(new Student("Протопоп", 2.2));
        List<Student> mergedList = mergeAndSort(students1, students2);
        for (Student i: mergedList) {
            System.out.println(i);
        }
    }
    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList, Comparator.comparingDouble(Student::getGPA).reversed());
        return mergedList;
    }
}