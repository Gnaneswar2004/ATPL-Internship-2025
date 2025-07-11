import java.util.*;

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

class Student {
    String name;
    int id, age, marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return "\nStudent {id : " + id + ", name : '" + name + "', age : " + age + ", marks : " + marks + "}";
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        students.add(new Student(21, "Gnani", 21, 95));
        students.add(new Student(22, "Sai", 22, 90));
        students.add(new Student(23, "Prasanth", 21, 98));
        students.add(new Student(24, "Hemanth", 22, 92));
        students.add(new Student(25, "Rajith", 22, 90));

        // Sorting by Name (Alphabetically)
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name (Alphabetically): " + students);

        // Sorting by Marks (Descending)
        Collections.sort(students, new MarksComparator());
        System.out.println("Sorted by Marks (Descending): " + students);

        // Sorting by Age (Ascending)
        Collections.sort(students, new AgeComparator());
        System.out.println("Sorted by Age (Ascending): " + students);

        // Sorting by Marks (Descending) then by Name (Ascending)
        Collections.sort(students, Comparator.comparingInt((Student s) -> s.marks).reversed().thenComparing(s -> s.name));
        System.out.println("Sorted by Marks (Descending) then Name (Ascending): " + students);

        // Sorting a list of integers in descending order using an anonymous Comparator
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Original list of numbers: " + numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("Sorted list of numbers in descending order (using anonymous Comparator): " + numbers);

    }
}