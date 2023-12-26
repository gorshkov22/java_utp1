package utp;

public class IUStudent extends Student {
    public IUStudent(String fullName, int course, int examScore) {
        super(fullName, course, examScore);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " приступил к экзамену по информатике.");
    }
}
