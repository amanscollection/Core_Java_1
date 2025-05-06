package OOPS;

public class Demo_recall {
    public static void main(String[] args) {


        //creating object of student
        Student stud1 = new Student();

        stud1.studentCity = "Chandigarh";
        stud1.studentId = 1234;
        stud1.studentName = "Aman";
        System.out.println(stud1.studentName + " " + stud1.studentId + " " + stud1.studentCity);

        stud1.study();
        stud1.showFullDetails();

        //second object creating
        Student stud2 = new Student(3,"Shivam","Amritsar");

       //stud2.studentCity = "Amritsar";
       //stud2.studentId = 5;
       //stud2.studentName = "Shivam";

        //System.out.println(stud1.studentName + " " + stud1.studentId + " " + stud1.studentCity);

        stud2.study();
        stud2.showFullDetails();
        System.out.println(stud2.studentName + " " + stud2.studentId + " " + stud2.studentCity);
    }
}
