package OOPS;

public class Student {

    //instance variable
    int studentId;
    String studentName;
    String studentCity;

    public Student(){
        System.out.println("creating object");
    }
    //Methods
    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void showFullDetails() {
        System.out.println("My name is " + studentName);
        System.out.println("my Id is " + studentId);
        System.out.println("My ciy is " + studentCity);
    }

}