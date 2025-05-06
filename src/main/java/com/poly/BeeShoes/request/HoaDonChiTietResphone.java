package com.poly.BeeShoes.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HoaDonChiTietResphone {
    Long id;
    Integer giaGoc;
    Integer giaBan;
    int soLuong;
    String maSanPham;
    String tenSanPham;
    String maMauSac;
    String tenMauSac;
    String kichCo;
    String anh;
    int soLuongTon;
}
