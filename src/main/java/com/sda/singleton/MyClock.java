package com.sda.singleton;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class MyClock {

    private static MyClock instance;

    public static MyClock instanceOf() {
        if (instance == null) {
            instance = new MyClock();
        }
        return instance;
    }


    private MyClock() {

    }


    public static String getCurrentTime() {

        Instant date = Instant.now();
        return date.toString();

    }


}
