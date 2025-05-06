package com.poly.BeeShoes.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LichSuHoaDonResphone {
    Long id;
    String hanhDong;
    LocalDateTime thoiGian;
    String nguoiThucHien;
}
