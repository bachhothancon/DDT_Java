package entities;
// Generated Apr 15, 2016 4:34:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Trinhdovitinh generated by hbm2java
 */
public class Trinhdovitinh  implements java.io.Serializable {


     private String maTdvt;
     private String tenGoi;
     private Set nhanviens = new HashSet(0);

    public Trinhdovitinh() {
    }

	
    public Trinhdovitinh(String maTdvt, String tenGoi) {
        this.maTdvt = maTdvt;
        this.tenGoi = tenGoi;
    }
    public Trinhdovitinh(String maTdvt, String tenGoi, Set nhanviens) {
       this.maTdvt = maTdvt;
       this.tenGoi = tenGoi;
       this.nhanviens = nhanviens;
    }
   
    public String getMaTdvt() {
        return this.maTdvt;
    }
    
    public void setMaTdvt(String maTdvt) {
        this.maTdvt = maTdvt;
    }
    public String getTenGoi() {
        return this.tenGoi;
    }
    
    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }
    public Set getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set nhanviens) {
        this.nhanviens = nhanviens;
    }




}


