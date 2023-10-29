/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demogit;

import java.util.List;

/**
 *
 * @author maccuacu
 */
public interface IService {
    List<Products>findAll();
    String add(Products p);
}
