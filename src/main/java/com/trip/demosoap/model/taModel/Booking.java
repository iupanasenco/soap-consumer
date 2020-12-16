package com.trip.demosoap.model.taModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    private String reservationId;

    private Integer roomNumber;

    private String specialRequests;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private String roomTypeCode;
    private String planRateCode;
    private String adultCount;
    private String childCount;
    private BigDecimal amountBeforeTax;
    private BigDecimal amountAfterTax;
    private Long taxRate;
    private String currencyCode;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime cancelledAt;
    private String source;



}
