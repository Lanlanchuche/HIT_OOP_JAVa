package baitaptrenlop.bai2;

public class NhanVien {
    protected String maNV;
    protected String ten;
    protected int tuoi;
    protected String email, soDienThoai;

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, int tuoi, String email, String soDienThoai) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public double tinhLuong(){
        return 0;
    }
    public void hienThiThongTin(){
        System.out.println("Ma nhan vien: " + maNV + ", ho ten: " + ten + ", tuoi: " + tuoi + ", Email: " + email + ", so dienthoai: " + soDienThoai + ", luong: " + tinhLuong());
    }
}
