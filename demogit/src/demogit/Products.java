/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demogit;

/**
 *
 * @author maccuacu
 */
public class Products {
    private String id;
    private String name;
    private String status;
    private String date;
    private byte TrangThai;
    public Products() {
    }

    public Products(String id, String name, String status, String date, byte TrangThai) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.date = date;
        this.TrangThai = TrangThai;
    }

    

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public byte getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(byte TrangThai) {
        this.TrangThai = TrangThai;
    }

    

    
}
