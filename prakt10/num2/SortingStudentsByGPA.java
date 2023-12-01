package prakt10.num2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortingStudentsByGPA {
    private List<Student> iDNumber;
    public SortingStudentsByGPA() {
        this.iDNumber = new ArrayList<>();
    }
    public void setArray(List<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void quicksort() {
        Collections.sort(iDNumber, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Double.compare(student2.getGPA(), student1.getGPA());
            }
        });
    }
    public void sortByName() {
        Collections.sort(iDNumber, Comparator.comparing(Student::getFirstName));
    }
    public void sortByCourse() {
        Collections.sort(iDNumber, Comparator.comparingInt(Student::getCourse));
    }
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() > list2.get(j).getGPA()) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }
    public void outArray() {
        for (Student i: iDNumber) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.iDNumber = new ArrayList<>();
        sorter.iDNumber.add(new Student("Тимур", "Ванин", "Информатика", 2, "Группа 1", 5.0));
        sorter.iDNumber.add(new Student("Никита", "Стоянов", "Программирование на языке джава", 3, "Группа 2", 2.1));
        sorter.iDNumber.add(new Student("Георгий", "Светов", "Химия", 1, "Группа 3", 3.9));
        sorter.iDNumber.add(new Student("Николай", "Иванов", "Биология", 4, "Группа 4", 3.5));
        sorter.outArray();
        sorter.sortByName();
        System.out.println();
        System.out.println("Сортировка по имени:");
        sorter.outArray();
        sorter.sortByCourse();
        System.out.println();
        System.out.println("Сортировка по курсу:");
        sorter.outArray();
    }
}