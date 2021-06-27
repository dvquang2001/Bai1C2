package com.example.model;

public class TruongHoc {
    private int hinh;
    private String ten;
    private String diachi;

    public TruongHoc() {
    }

    public TruongHoc(int hinh, String ten, String diachi) {
        this.hinh = hinh;
        this.ten = ten;
        this.diachi = diachi;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
