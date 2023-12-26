package utp;

public class MathStudent extends Student {
    public MathStudent(String fullName, int course, int examScore) {
        super(fullName, course, examScore);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " is writing an exam of Math subject.");
    }
}

