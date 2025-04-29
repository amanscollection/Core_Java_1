package OOPS;

public class Demo {

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
        Student stud2 = new Student();

        stud1.studentCity = "Amritsar";
        stud1.studentId = 7654;
        stud1.studentName = "Shivam";

        //System.out.println(stud1.studentName + " " + stud1.studentId + " " + stud1.studentCity);

        stud1.study();
        stud1.showFullDetails();

    }
}
