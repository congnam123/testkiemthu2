package entity;

public class SanPham {
    private int idSP;
    private  String ten;
    private int soLuong;
    private Double donGia;
    private String moTa;

    public SanPham() {
    }

    public SanPham(int idSP, String ten, Double donGia, int soLuong, String moTa) {
        this.idSP = idSP;
        this.ten = ten;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
