public class Student1 {
    String name;
    String address;
    String phone;
    String email;
    public Student1(String name){
        this.name=name;
    }
    public Student1(String name,String address,String phone,String email){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }

    public String toString() {
        return name+" "+address+" "+phone+" "+email;
    }


}
