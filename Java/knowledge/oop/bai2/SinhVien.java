package knowledge.oop.bai2;

public class SinhVien {
    private String studentName;
    private String dob;
    private float score1;
    private float score2;
    private float score3;

    public SinhVien(){
    }

    public SinhVien(String studentName, String dob, float score1, float score2, float score3){
        this.studentName = studentName;
        this.dob = dob;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    private float getTotalScore(){
        return score1 + score2 + score3;
    }

    public void getStudentInfo(){
        System.out.println(studentName + " " + dob +" "+ getTotalScore());
    }
}
