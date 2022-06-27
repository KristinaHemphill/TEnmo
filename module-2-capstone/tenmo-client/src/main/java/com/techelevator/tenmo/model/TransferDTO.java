package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class TransferDTO {

    private long userId;
    private BigDecimal amount;

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public TransferDTO(long userId, BigDecimal amount) {
        this.userId = userId;
        this.amount = amount;
    }


}