package knowledge.oop.bai21DanhSachMatHang;

import knowledge.oop.bai2.InvalidExceptions;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<MatHang> matHangList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String tenmatHang = nhapTenMatHang(sc, i);
            String donViTinh = nhapDonViTinh(sc, i);
            int giaMua = nhapGiaMua(sc, i);
            int giaBan = nhapGiaBan(sc, i);
            matHangList.add(new MatHang(i+1, tenmatHang, donViTinh, giaMua, giaBan));
        }

        Collections.sort(matHangList, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()){
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                } else {
                    return o1.getMaMatHang().compareTo(o2.getMaMatHang());
                }
            }
        });

        for (MatHang matHang : matHangList){
            System.out.println(matHang);
        }
    }

    public static String nhapTenMatHang(Scanner sc, int maSo) {
//        System.out.println("Vui lòng nhập tên mặt hàng " + String.format("MH" + "%04d", maSo + 1));
        String tenMatHang = null;
        while (tenMatHang == null) {
            try {
                tenMatHang = sc.nextLine();
                if (tenMatHang.length() > 100) {
                    throw new InvalidExceptions("Tên không được quá 100 ký tự");
                }
            } catch (InvalidExceptions ie) {
                System.out.println(ie.getMessage());
                System.out.println("Vui lòng nhập lại tên mặt hàng mã " + String.format("MH" + "%04d", maSo + 1));
                tenMatHang = null;
            }
        }
        return tenMatHang;
    }

    public static String nhapDonViTinh(Scanner sc, int maSo) {
//        System.out.println("Vui lòng nhập tên mặt hàng " + String.format("MH" + "%04d", maSo + 1));
        String donViTinh = null;
        while (donViTinh == null) {
            try {
                donViTinh = sc.nextLine();
                if (donViTinh.length() > 10) {
                    throw new InvalidExceptions("Đơn vị tính không được quá 10 ký tự");
                }
            } catch (InvalidExceptions ie) {
                System.out.println(ie.getMessage());
                System.out.println("Vui lòng nhập lại đơn vị tính mặt hàng mã" + String.format("MH" + "%04d", maSo + 1));
                donViTinh = null;
            }
        }
        return donViTinh;
    }

    public static int nhapGiaMua(Scanner sc, int maSo) {
//        System.out.println("Vui lòng nhập tên mặt hàng " + String.format("MH" + "%04d", maSo + 1));
        int giaMua = Integer.MIN_VALUE;
        while (giaMua == Integer.MIN_VALUE ) {
            try {
                giaMua = sc.nextInt();
                sc.nextLine();
                if (giaMua > 9999999) {
                    throw new InvalidExceptions("giá mua không được quá 7 chữ số");
                }
            } catch (InvalidExceptions ie) {
                System.out.println(ie.getMessage());
                System.out.println("Vui lòng nhập lại giá mua mặt hàng mã" + String.format("MH" + "%04d", maSo + 1));
                giaMua = Integer.MIN_VALUE;
            }
        }
        return giaMua;
    }

    public static int nhapGiaBan(Scanner sc, int maSo) {
//        System.out.println("Vui lòng nhập tên mặt hàng " + String.format("MH" + "%04d", maSo + 1));
        int giaBan = Integer.MIN_VALUE;
        while (giaBan ==Integer.MIN_VALUE) {
            try {
                giaBan = sc.nextInt();
                sc.nextLine();
                if (giaBan > 9999999) {
                    throw new InvalidExceptions("Giá bán không được quá 7 chữ số");
                }
            } catch (InvalidExceptions ie) {
                System.out.println(ie.getMessage());
                System.out.println("Vui lòng nhập lại giá bán mặt hàng mã" + String.format("MH" + "%04d", maSo + 1));
                giaBan = Integer.MIN_VALUE;
            }
        }
        return giaBan;
    }
}
