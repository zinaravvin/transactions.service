package com.transactions.service.transactionEnum;

import java.util.Arrays;
import java.util.Optional;

public enum AristoResponseCodeEnum {

    SUCCESS("00S"),
    WARNING("00W"),
    FAIL("99X"),
    ACCOUNT_NOT_FOUND("04S");
    private final String name;

    AristoResponseCodeEnum(String name) {
        this.name = name;
    }

    public static AristoResponseCodeEnum getByName(final String name) {
        for (final AristoResponseCodeEnum i : values()) {
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