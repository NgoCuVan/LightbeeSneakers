package com.poly.BeeShoes.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class chiTietSanPhamApiRquest {
    Long id;
    String maSanPham;
    String mauSac;
    String ten;
    String tenMau;
    String KichCo;
    String anh;
    Integer giaGoc;
    Integer giaBan;
    int soLuongTon;
    boolean isSale;
}
