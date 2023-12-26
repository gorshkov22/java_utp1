package utp;

public abstract class Student {
    String fullName;
    int course;
    int examScore;

    public Student(String fullName, int course, int examScore) {
        this.fullName = fullName;
        this.course = course;
        this.examScore = examScore;
    }

    public abstract void writeExam();
}
