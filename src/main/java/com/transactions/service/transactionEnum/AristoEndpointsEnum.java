package com.transactions.service.transactionEnum;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

public enum AristoEndpointsEnum {
        DIGITAL_PRODUCT ( "HDWBDGIO"),
        TEMP_STOP ( "HDWBSTIO"),
        ACCOUNT_INFO ( "HDWBINFO"),
        PRODUCT_INFO ( "HDWBPROD"),
        ROUTE_INFO ( "HDWBROUT"),
        TRANSACTION_HISTORY( "HDWBTXHS");

        private final String value;
        private static Map<String, AristoEndpointsEnum> constants = new HashMap<>();

        static {
            for (AristoEndpointsEnum c : values()) {
                constants.put(c.value, c);
            }
        }


        AristoEndpointsEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static AristoEndpointsEnum fromValue(String value) {
            AristoEndpointsEnum constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
    }


