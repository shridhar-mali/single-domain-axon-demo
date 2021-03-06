package com.axon.command;

public class AccountAddressChangeCommand {

    private String accountId;

    private String address;

    public AccountAddressChangeCommand(String accountId, String address) {
        this.accountId = accountId;
        this.address = address;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAddress() {
        return address;
    }
}
