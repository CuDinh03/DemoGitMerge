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
    private int id;
    private String name;
    private String status;

    public Products() {
    }

    public Products(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
