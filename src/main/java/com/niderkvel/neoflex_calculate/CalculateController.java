package com.niderkvel.neoflex_calculate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.ArrayList;

@RestController
public class CalculateController {

    @GetMapping("/calculate")
    public float calculate(
            @RequestParam(name="salary") float avgMonthlySalary,
            @RequestParam(name="days") int vacationDays,
            @RequestParam(required = false, name = "start")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate vacationStartDate
    ) {
        float avgDailySalary = avgMonthlySalary / 21;

        if (vacationStartDate == null)
            return avgDailySalary * vacationDays;

        ArrayList<LocalDate> vacationDates = new ArrayList<>();

        for (long i = 0; i < vacationDays; ++i)
            vacationDates.add(vacationStartDate.plusDays(i));

        return vacationDates
                .stream()
                .filter(date ->
                        !Holidays.holidays.contains(
                                MonthDay.of(
                                        date.getMonthValue(),
                                        date.getDayOfMonth()
                                )
                        )
                )
                .count() * avgDailySalary;
    }
}
