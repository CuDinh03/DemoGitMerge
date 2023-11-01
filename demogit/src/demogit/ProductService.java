/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demogit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maccuacu
 */
     
public class ProductService implements IService{
    List<Products> lp = new ArrayList<>();

    public String update(Products hihi) {
       if(hihi != null){
           lp.update(hihi);
           return "Sửa thành công";
       }else{
           return "Sửa thất bại";
       }
    }


    public ProductService() {
        lp.add(new Products(1, "SP1", "Đá"));
        lp.add(new Products(2, "SP2", "Cỏ"));
        lp.add(new Products(3, "SP3", "Thuốc lá"));
        lp.add(new Products(4, "SP4", "Thuốc lào"));
        
    }
    
    @Override
    public String add(Products p) {
       if(p != null){
           lp.add(p);
           return "Thêm thành công";
       }else{
           return "Thêm thất bại";
       }
    }

    @Override
    public List<Products> findAll() {
        return lp;
    }
    
    

}
