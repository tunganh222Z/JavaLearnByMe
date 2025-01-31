package sorting;


import java.util.Arrays;
import java.util.Comparator;

public class JavaSortingLibrary {

    public static void main(String[] args) {
        // #1 Sort an integer array
        int[] intArray = {3,2,1,0};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // #2 Sort an String array
        String[] s = {"abc","tung anh","provip","provip123", "1", "0000", "2"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        // #3 Sort a Student array with comparable

        Student[] students = {new Student("Van", 27), new Student("Tung anh", 28)};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // #4 Sort a student arrayt with comparator

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student before, Student after) {
                // 0 ? before == after
                if (before.name.equals(after.name)){
                    return 0;
                } return before.name.compareTo(after.name.toString());

                // 1 ? before > after
                // -1 > before < after
            }
        });

        System.out.println(Arrays.toString(students));
    }

    static class Student implements Comparable {
        int age;
        String name;
        public Student (String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return "Student{" +
                    "age = " + age +
                    ", name = " + name + "\n" +
                    "}";
        }

        @Override
        public int compareTo(Object other) {
            //So sanh this va other
            Student otherStudent = (Student) other;
            // 0 ? this = other
            // 1 ? this > other
            // -1 ? this < other
            if (this.age == otherStudent.age){
                return 0;
            } else if (this.age > otherStudent.age){
                return 1;
            } else {
                return -1;
            }
        }
    }
}
