package com.niderkvel.neoflex_calculate;

import java.time.Month;
import java.time.MonthDay;
import java.util.List;

public class Holidays {
    public static List<MonthDay> holidays = List.of(
            MonthDay.of(Month.JANUARY, 1),
            MonthDay.of(Month.JANUARY, 2),
            MonthDay.of(Month.JANUARY, 3),
            MonthDay.of(Month.JANUARY, 4),
            MonthDay.of(Month.JANUARY, 5),
            MonthDay.of(Month.JANUARY, 6),
            MonthDay.of(Month.JANUARY, 7),
            MonthDay.of(Month.JANUARY, 8),
            MonthDay.of(Month.FEBRUARY, 23),
            MonthDay.of(Month.MARCH, 8),
            MonthDay.of(Month.MAY, 1),
            MonthDay.of(Month.MAY, 9),
            MonthDay.of(Month.JUNE, 12),
            MonthDay.of(Month.NOVEMBER, 4)
    );
}
