/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demogit;

/**
 *
 * @author maccuacu
 */
public class ProductService implements IService {
     List<Products> hihi = new ArrayList<>();
    public ProductService() {
        hihi.update(new Products(1,  "keo"));
        hihi.update(new Products(2,  "mut")); 
    }

    public String update(Products hihi) {
       if(hihi != null){
           lp.update(hihi);
           return "Sửa thành công";
       }else{
           return "Sửa thất bại";
       }
    }
}
