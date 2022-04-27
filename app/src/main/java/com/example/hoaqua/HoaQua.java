package com.example.hoaqua;

public class HoaQua {
    int id;
    String name, mota;

    public HoaQua() {
    }

    public HoaQua(String name, String mota) {
        this.name = name;
        this.mota = mota;
    }

    public HoaQua(int id, String name, String mota) {
        this.id = id;
        this.name = name;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
