public class Profile_self2 {
    String name;
    int age;
    public static void main(String[] args) {
        Profile_self2 profile=new Profile_self2();
        profile.setName("Min");
        profile.setAge(20);
        profile.printName();
        profile.printAge();
    }
    public void setName(String str) {
        name=str;
    }
    public void setAge(int val) {
        age=val;
    }

    public void printName() {
        System.out.println("Name = "+name );
    }

    public void printAge() {
        System.out.println("Age = " + age);
    }

}
