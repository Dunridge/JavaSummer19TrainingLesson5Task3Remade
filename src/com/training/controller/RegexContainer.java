package com.training.controller;

public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_CASE0_LAT = "([a-zA-Z]{3,30}\\s*)+";
    String REGEX_CASE1_LAT = "[a-zA-Z]{3,30}";
    String REGEX_CASE2_LAT = "[a-zA-Z]{3,30}";
    String REGEX_CASE3_LAT = "[a-zA-Z]{3,30}";
    String REGEX_CASE6_LAT = "\\+?[\\d \\- ()]{5,}";
    String REGEX_CASE7_LAT = "\\+?[\\d \\- ()]{5,}";
    String REGEX_CASE8_LAT = "\\+?[\\d \\- ()]{5,}";
    String REGEX_CASE9_LAT = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    String REGEX_CASE10_LAT = "[a-zA-Z]{3,30}";
    String REGEX_CASE11_LAT = "\\d{4,}";
    String REGEX_CASE12_LAT = "[a-zA-Z]{3,30}";
    String REGEX_CASE13_LAT = "[a-zA-Z]{3,30}";
    String REGEX_CASE14_LAT = "^[-+]?\\d*$";
    String REGEX_CASE15_LAT = "^[-+]?\\d*$";
    String REGEX_CASE16_LAT = "20\\d{2}(-|\\/)((0[1-9])|(1[0-2]))(-|\\/)((0[1-9])|([1-2][0-9])|(3[0-1]))(T|\\s)(([0-1][0-9])|(2[0-3])):([0-5][0-9]):([0-5][0-9])";
    String REGEX_CASE17_LAT = "20\\d{2}(-|\\/)((0[1-9])|(1[0-2]))(-|\\/)((0[1-9])|([1-2][0-9])|(3[0-1]))(T|\\s)(([0-1][0-9])|(2[0-3])):([0-5][0-9]):([0-5][0-9])";

}
