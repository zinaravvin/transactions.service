package com.transactions.service.transactionEnum;

public enum TransactionStatusEnum {
    APPLIED("A"),
    UNAPPLIED("U");
    private final String name;

    TransactionStatusEnum(String name) {
        this.name = name;
    }

    public static TransactionStatusEnum getByName(final String name) {
        for (final TransactionStatusEnum i : values()) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
