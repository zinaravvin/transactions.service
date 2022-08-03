package com.transactions.service.transactionEnum;

public enum TransactionTypeEnum {
    TEMP_STOP("ST"),
    PERM_STOP("SP"),
    PRODUCT_CHANGE("PC");
    private final String name;

    TransactionTypeEnum(String name) {
        this.name = name;
    }

    public static TransactionTypeEnum getByName(final String name) {
        for (final TransactionTypeEnum i : values()) {
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
