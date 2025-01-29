package knowledge.oop.bai2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) throws InvalidExceptions {
        Scanner sc = new Scanner(System.in);

        String studentName = sc.nextLine();
        try{
            System.out.println("Vui lòng nhập họ và tên sinh viên");

            if (studentName.length() > 50) {
                throw new InvalidExceptions("Họ tên không được vượt quá 50 ký tự.");
            }
        } catch (InvalidExceptions ie){
            System.err.println(ie.getMessage());
        }

        String dob = sc.nextLine();
        try {
            if (!Pattern.matches("\\d{2}/\\d{2}/\\d{4}", dob)) {
                throw new InvalidExceptions("Ngày tháng năm sinh không hợp lệ");
            }
        } catch (InvalidExceptions ie){
            System.err.println(ie.getMessage());
        }

        float score1 = nhapDiem(sc, "Nhập điểm môn 1");

        float score2 = nhapDiem(sc, "Nhập điểm môn 2");

        float score3 = nhapDiem(sc, "Nhập điểm môn 3");

        SinhVien sv = new SinhVien(studentName, dob, score1, score2, score3);

        sv.getStudentInfo();
    }

    public static float nhapDiem (Scanner sc, String message) throws InvalidExceptions{
        System.out.println(message);
        float diem = sc.nextFloat();

        if (diem < 0 || diem > 10){
            throw new InvalidExceptions("Vui lòng nhập điểm hợp lệ từ 0 - 10");
        }
        return diem;
    }
}
