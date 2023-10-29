package demogit;

import java.util.List;

/**
 *
 * @author maccuacu
 */
public interface IService {

    String add(Products p);

    List<Products> findAll();
       
    String update(Products hihi);
}
