package com.company.java;

import java.util.Arrays;
import java.util.logging.Logger;

public enum ChairState {
    READY, NOT_READY, IN_PROCESS;
    public static final Logger log = Logger.getLogger(ChairState.class.getName());

    public static void showState(ChairState state) {
        log.info("state ->" + state);
    }

    @Override
    public String toString() {
        return Arrays.toString(super.toString().toLowerCase().split("_"))
                .replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
    }
}
