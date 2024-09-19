class Exam {

    String stu_name;
    int rollno;
    String sub_code;
    String sub_name;
    int InternalMarks;
    int ExternalMarks;

    public Exam(String stu_name, int rollno, String sub_code, String sub_name, int InternalMarks, int ExternalMarks) {
        this.stu_name = stu_name;
        this.rollno = rollno;
        this.sub_code = sub_code;
        this.sub_name = sub_name;
        this.InternalMarks = InternalMarks;
        this.ExternalMarks = ExternalMarks;
    }

    public String Calculate_result() {
        int total_marks = InternalMarks + ExternalMarks;
        return (total_marks > 40) ? "Pass" : "Fail";
    }

    public void Show_result() {
        System.out.println("Student Name: " + stu_name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Subject Code: " + sub_code);
        System.out.println("Subject Name: " + sub_name);
        System.out.println("Internal Marks: " + InternalMarks);
        System.out.println("External Marks: " + ExternalMarks);
        System.out.println("Result: " + Calculate_result());
        System.out.println("-------------------------");
    }
}

public class P4_3 {

    public static void main(String[] args) {

        Exam[] students = new Exam[3];

        students[0] = new Exam("OM KUSHWAHA", 11, "SC101", "Physics", 45, 40);
        students[1] = new Exam("KASHISH", 12, "SC102", "Chemistry", 50, 40);
        students[2] = new Exam("JAY", 17, "SC103", "Mathematics", 40, 45);

        for (int i = 0; i < students.length; i++) {
            students[i].Show_result();
        }
    }
}