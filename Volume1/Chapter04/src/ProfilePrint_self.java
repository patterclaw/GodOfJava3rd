public class ProfilePrint_self {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint_self profilePrintSelf=new ProfilePrint_self();
        profilePrintSelf.setAge((byte) 26);
        profilePrintSelf.setName("Brian");
        profilePrintSelf.setMarried(false);
        System.out.println("my age is "+ profilePrintSelf.getAge());
        System.out.println("my name is "+ profilePrintSelf.getName());
        System.out.println("I did not married. So,"+ profilePrintSelf.isMarried());


    }
    public void setAge(byte paramAge){
        age=paramAge;
    }
    public byte getAge(){
        return age;
    }
    public void setName(String paramName){
        name=paramName;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean flag) {
        isMarried=flag;
    }

    public boolean isMarried() {
        return isMarried;
    }


}
