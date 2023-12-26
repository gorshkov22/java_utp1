package utp;

public class Run {
    public static void main(String[] args) {
        IUStudent iuStudent = new IUStudent("Андрей Горшков", 1, 99);
        MathStudent mathStudent = new MathStudent("Travis Scott", 4, 52);

        iuStudent.writeExam(); // Андрей Горшков приступил к экзамену по информатике
        mathStudent.writeExam(); // Travis Scott is writing an exam of Maths
    }
}
