package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfer {

    private long transferId;
    private long transferTypeId;
    private String transferTypeDesc;
    private long transferStatusId;
    private String transferStatusDesc;
    private long accountFrom;
    private long accountTo;
    private BigDecimal amount;


    public long getTransferId() {
        return transferId;
    }

    public long getAccountFrom() {
        return accountFrom;
    }

    public String getTransferTypeDesc() {
        return transferTypeDesc;
    }
    public String getTransferStatusDesc() {
        return transferStatusDesc;
    }
    public long getAccountTo() {
        return accountTo;
    }
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "\nId: " + transferId +
                "\nType: " + transferTypeDesc  +
                "\nStatus: " + transferStatusDesc +
                "\nFrom: " + accountFrom +
                "\nTo: " + accountTo +
                "\nAmount: $" + amount;
    }
}

