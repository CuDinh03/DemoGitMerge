/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demogit;

import Connection.DBContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author maccuacu
 */
public class ProductService implements IService {

    Connection cn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    @Override
    public List<Products> findAll() {
        List<Products> lp = new ArrayList<>();
        try {
            
            cn = DBContext.getConnection();
            String sql = "Select * from SanPham where TrangThai = 0";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setId(rs.getString("MaSanPham"));
                p.setName(rs.getString("Ten"));
                p.setStatus(rs.getString("GhiChu"));
                p.setDate(rs.getString("NgayTao"));
                p.setTrangThai(rs.getByte("TrangThai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
                pstm.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return lp;
    }

    @Override
    public Integer add(Products p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer update(Products p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer datele(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Products> findByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
