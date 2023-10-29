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
    private  List<Products> listProducts = new ArrayList<>();

    @Override
    public List<Products> findAll() {
return listProducts;
    }

}
