package com.transactions.service.transactionEnum;

public enum SuspenseErrorsEnum {
    ARISTO_LEAD_TIME_PROBLEM("Problem getting Lead time from Aristo"),
    ARISTO_DATES_WARNING("Start/Restart Effective date(s) have been adjusted"),
    ARISTO_SUSCESS("Transaction has been successfully created"),
    ARISTO_DATES_OVERLAP("Transaction Date(s) are overlapping with existing transactions"),
    ARISTO_PROBLEM("Unsuccessful attempt"),
    ARISTO_CALL_FAILED("Exception invoking Aristo to get account info {}"),
    ARISTO_FUTURE_PC("Unapplied future dated Product Change transaction found {}"),

    ARISTO_ACCOUNT_NOT_FOUND("Aristo account is not found");

    private final String name;

    SuspenseErrorsEnum(String name) {
        this.name = name;
    }

    public static SuspenseErrorsEnum getByName(final String name) {
        for (final SuspenseErrorsEnum i : values()) {
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
