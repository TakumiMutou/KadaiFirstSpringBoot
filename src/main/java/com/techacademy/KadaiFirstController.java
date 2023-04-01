package com.techacademy;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable int val) {
        int year = 0;
        int month = 0;
        int day = 0;
        year = val / 10000;
        month = val / 100 % 100;
        day = val % 100;
        var date = LocalDate.of(year, month, day);
        var week = date.getDayOfWeek();
        var yobi = week.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return yobi;

    }
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res =val1 + val2;
        return res;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res =val1 - val2;
        return res;
    }
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res =val1 * val2;
        return res;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res =val1 / val2;
        return res;
    }


}
