package demogit;

import java.util.List;

/**
 *
 * @author maccuacu
 */
public interface IService {
    List<Products> findAll();
    Integer add(Products p);
    Integer update(Products p);
    Integer datele(String id);
    List<Products> findByID(String id);
}
