package oop.bai24;

import oop.bai2.InvalidExceptions;

public class SinhVien {
    private String maSv;
    private String hoTenSv;
    private String dob;
    private String lop;
    private double GPA;

    public SinhVien(String maSv, String hoTenSv, String dob, String lop, double GPA) {
        this.maSv = maSv;
        this.hoTenSv = formatTenSv(hoTenSv);
        this.dob = dob;
        this.lop = lop;
        this.GPA = GPA;
    }

    public String formatTenSv(String hoTenSv){
        String[] s = hoTenSv.split("\\s+");
        String result="";
        for (String x : s){
            result = result + Character.toUpperCase(x.charAt(0));

            for (int i = 1 ; i < x.length() ; i++){
                result = result + Character.toLowerCase(x.charAt(i));
            }
            result = result + " ";
        }
        hoTenSv = result;
        return hoTenSv.trim();
    }

    public String getHoTenSv(){
        return hoTenSv;
    }

    public String getLop () throws InvalidExceptions{
        if (lop.contains(" ")){
            throw new InvalidExceptions("Lớp không được chứa dấu cách");
        }
        return lop;
    }

    public String getDoB(){
        String[] s = dob.split("/");

        String dob ="";

        for (String x : s){
            dob = dob + String.format("%02d", Integer.parseInt(x)) + "/";
        }
        return this.dob = dob.replaceAll("/$", "");
    }

    public double getGPA() throws InvalidExceptions{
        if (GPA < 0 || GPA > 4){
            throw new InvalidExceptions("Vui long nhap diem trong thang diem 0 - 4.0");
        }
        return Math.round(GPA * 100.0) / 100.0;
    }

    public void getSvInfo() throws InvalidExceptions{
        System.out.print(getHoTenSv());
        System.out.print(getLop());
        System.out.print(getDoB());
        System.out.print(getGPA());
    }
}
