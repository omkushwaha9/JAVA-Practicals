class Exam {
    private String stu_name, sub_code, sub_name;
    private int rollno;
    private double internalMarks, externalMarks, totalMarks;

    public Exam(String stu_name, int rollno, String sub_code, String sub_name, double internalMarks,
            double externalMarks) {
        this.stu_name = stu_name;
        this.rollno = rollno;
        this.sub_code = sub_code;
        this.sub_name = sub_name;
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
        calculateResult();
    }

    private void calculateResult() {
        totalMarks = internalMarks + externalMarks;
    }

    public void showResult() {
        System.out.println("Student Name: " + stu_name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Subject Code: " + sub_code);
        System.out.println("Subject Name: " + sub_name);
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class Exam_demo {
    public static void main(String[] args) {

        Exam exam = new Exam("OM KUSHWAHA", 011, "CS101", "Computer Science", 40.5, 0.0);
        exam.showResult();
    }
}
