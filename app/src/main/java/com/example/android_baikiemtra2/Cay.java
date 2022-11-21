package com.example.android_baikiemtra2;

public class Cay {
    private String tenCay;
    private int img;
    private String tenNhomCay;
    private String ThuocTinh;
    private String moTa;

    public Cay(String tenCay, int img, String tenNhomCay, String tenThuocTinh, String moTa) {
        this.tenCay = tenCay;
        this.img = img;
        this.tenNhomCay = tenNhomCay;
        this.ThuocTinh = ThuocTinh;
        this.moTa = moTa;
    }

    public String getMoTa() {

        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Cay() {
    }

    public String getTenCay() {
        return tenCay;
    }

    public void setTenCay(String tenNhac) {
        this.tenCay = tenCay;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String tenNhomCay() {
        return tenNhomCay;
    }

    public void setThuocTinh(String tenCaSi) {
        this.ThuocTinh = ThuocTinh;
    }

    public String getTacGia() {
        return ThuocTinh;
    }

    public void setTacGia(String tacGia) {
        this.ThuocTinh = tacGia;
    }

    @Override
    public String toString() {
        return "Cay{" +
                "tenCay='" + tenCay + '\'' +
                ", img=" + img +
                ", tenNhomCay='" + tenNhomCay + '\'' +
                ", ThuocTinh='" + ThuocTinh+ '\'' +
                '}';
    }
}
