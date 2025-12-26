public class ManageStudent1 {

    public static void main(String[] args) {
        Student1[] student=null;
        ManageStudent1 ms=new ManageStudent1();
        student=ms.addStudent();
        ms.printStudents(student);

    }

    public Student1[] addStudent() {
        Student1[] student=new Student1[3];
        student[0] = new Student1("Lim");
        student[1] = new Student1("Min");
        student[2] = new Student1("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return student;
    }

    public void printStudents(Student1[] student) {
        for (Student1 data : student)
            System.out.println(data);

    }
}
