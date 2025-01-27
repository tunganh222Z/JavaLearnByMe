package oop.bai21DanhSachMatHang;

public class MatHang {
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;

    public MatHang(int maMatHang, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = String.format("MH"+"%04d", maMatHang);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getLoiNhuan(){
        return this.giaBan - this.giaMua;
    }

    public String getMaMatHang(){
        return maMatHang;
    }

    @Override
    public String toString(){
        return this.maMatHang + " " + this.tenMatHang + " " + this.donViTinh +  " " + this.giaMua + " " + this.giaBan + " " + getLoiNhuan();
    }
}
