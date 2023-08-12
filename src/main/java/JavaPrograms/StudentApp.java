package JavaPrograms;

import net.datafaker.Faker;

public class StudentApp {

    public static void main(String args[]){

        Student student=new Student("Hezekiah", "465465");

        student.setPhone("6472207769");
        System.out.println(student.getPhone());
        student.setCity("Kottayam");
        System.out.println(student.getCity());
        student.setState("Kerala");
        System.out.println(student.getState());

    }
}

class Student{

    private String name;
    private String SSN;
    private static int ID=1000; //ID+4 digit number (1000- 9000) + last SSN
    private String emailID;
    private String phone;
    private String city;
    private String state;

    Faker faker=new Faker();

    private String getRandomID(){
        double random=faker.number().numberBetween(1000, 9000);
        String randomID=ID+""+random+""+SSN.substring(2,6);
        return randomID;

    }
    Student(String name,String SSN){
        System.out.println("The Student APP");
        this.name=name;
        this.SSN=SSN;
        System.out.println("name is "+name);
        System.out.println("SSN is "+SSN);
        System.out.println("ID is  "+getRandomID());

    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }




    public void enroll(){

    }
    public void pay(){

    }
    public void checkBalance(){

    }

    public void showCourses(){

    }



}
