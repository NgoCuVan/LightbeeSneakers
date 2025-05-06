package com.poly.BeeShoes.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class VoucherRequest {
    Long id;
    String name;
    String type;
    LocalDateTime start_time;
    LocalDateTime end_time;
    BigDecimal money;
    Integer percent;
    BigDecimal condition;
    BigDecimal max_discount;
    Integer quantity;
    String description;
    Integer status;
}
