package entities;
// Generated Apr 15, 2016 4:34:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Menu generated by hbm2java
 */
public class Menu  implements java.io.Serializable {


     private String maMenu;
     private String tenGoi;
     private String hinh;
     private int gia;
     private float khuyenMai;
     private Set chitiethoadons = new HashSet(0);
     private Set chitietgoimenus = new HashSet(0);

    public Menu() {
    }

	
    public Menu(String maMenu, String tenGoi, String hinh, int gia, float khuyenMai) {
        this.maMenu = maMenu;
        this.tenGoi = tenGoi;
        this.hinh = hinh;
        this.gia = gia;
        this.khuyenMai = khuyenMai;
    }
    public Menu(String maMenu, String tenGoi, String hinh, int gia, float khuyenMai, Set chitiethoadons, Set chitietgoimenus) {
       this.maMenu = maMenu;
       this.tenGoi = tenGoi;
       this.hinh = hinh;
       this.gia = gia;
       this.khuyenMai = khuyenMai;
       this.chitiethoadons = chitiethoadons;
       this.chitietgoimenus = chitietgoimenus;
    }
   
    public String getMaMenu() {
        return this.maMenu;
    }
    
    public void setMaMenu(String maMenu) {
        this.maMenu = maMenu;
    }
    public String getTenGoi() {
        return this.tenGoi;
    }
    
    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }
    public String getHinh() {
        return this.hinh;
    }
    
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    public int getGia() {
        return this.gia;
    }
    
    public void setGia(int gia) {
        this.gia = gia;
    }
    public float getKhuyenMai() {
        return this.khuyenMai;
    }
    
    public void setKhuyenMai(float khuyenMai) {
        this.khuyenMai = khuyenMai;
    }
    public Set getChitiethoadons() {
        return this.chitiethoadons;
    }
    
    public void setChitiethoadons(Set chitiethoadons) {
        this.chitiethoadons = chitiethoadons;
    }
    public Set getChitietgoimenus() {
        return this.chitietgoimenus;
    }
    
    public void setChitietgoimenus(Set chitietgoimenus) {
        this.chitietgoimenus = chitietgoimenus;
    }




}

