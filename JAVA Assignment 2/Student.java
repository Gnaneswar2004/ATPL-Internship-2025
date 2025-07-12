public class Student 
{
    public static String SchoolName = "Lendi";
    String StudentName;
    int RoolNumber;

    public Student (String StudentName, int RoolNumber)
    {
        this.StudentName = StudentName;
        this.RoolNumber = RoolNumber;
    } 
    
    public static void main(String[] args) 
    {
        Student s1 = new Student("Gnani", 21);
        System.out.println("The Student Name is : " + s1.StudentName + "and the School Name is : " + Student.SchoolName + " and the Roll Number is : " + s1.RoolNumber);
        Student s2 = new Student("Gnani", 21);
        Student.SchoolName = "ARDAR";
        System.out.println("The Student Name is : " + s2.StudentName + "and the School Name is : " + Student.SchoolName + " and the Roll Number is : " + s2.RoolNumber);
    }
}
