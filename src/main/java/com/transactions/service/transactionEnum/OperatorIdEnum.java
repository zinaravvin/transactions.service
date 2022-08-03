package com.transactions.service.transactionEnum;

public enum OperatorIdEnum {
    SUGAR("SUG"),
    WEBSIGHT("WEB"),
    PHONE("IVR");
    private final String name;

    OperatorIdEnum(String name) {
        this.name = name;
    }

    public static OperatorIdEnum getByName(final String name) {
        for (final OperatorIdEnum i : values()) {
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
