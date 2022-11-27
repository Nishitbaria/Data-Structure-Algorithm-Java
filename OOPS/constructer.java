
public class constructer {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("Hello");
        student s3 = new student("Hello");


    }
}
class student{
  int rollno;
  String name;

    

    student(){
        System.out.println("constructer is called");
    }
student(String name){
this.name = name;
}

student(int rollno){
    this.rollno = rollno;
}


    }