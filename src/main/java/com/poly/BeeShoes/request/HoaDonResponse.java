package com.poly.BeeShoes.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HoaDonResponse {

    Long id;
    String maHoaDon;
    String maVanChuyen;
    String voucher;
    String diaChiNhan;
    String sdtNhan;
    String tenNguoiNhan;
    String emailNguoiNhan;
    Integer tongTien;
    Integer giamGia;
    Integer thucThu;
    Integer phiShip;
    Integer soTienCanThanhToan;
    Integer soTienDaThanhToan;
    List<HoaDonChiTietResphone> hoaDonChiTiet;
    List<LichSuHoaDonResphone> lichSuHoaDon;
    String trangThai;
}
