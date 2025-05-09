package com.poly.BeeShoes.service;

import com.poly.BeeShoes.model.User;

public interface UserService {

    User getByUsername(String email);

    boolean existByUsername(String email);

    User createNewUser(User user);

    User findByKhachHang_Id(Long id);

    User findByNhanVien_Id(Long id);

    User update(User user);

    boolean existsByEmail(String email);
}
