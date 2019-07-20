package com.training.controller;

import com.training.view.View;

import java.util.Scanner;
import static com.training.controller.RegexContainer.*;
import static com.training.controller.RegexContainer.REGEX_LOGIN;

import static com.training.view.TextConstants.FIRST_NAME;
import static com.training.view.TextConstants.LOGIN_DATA;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    //
    private String surnameOfSubscriber;
    private String nameOfSubscriber;
    private String patronimicOfSubscriber;
    private String enteredData;
    private String nicknameOfSubscriber;
    private String commentaryOfSubscriber;
    private String groupOfSubscriber;
    private String homeNumber;
    private String phoneNumber;
    private String secondPhoneNumber;
    private String emailOfSubscriber;
    private String skypeOfSubscriber;
    //private Address address;
    private String fullAddress;
    private String datesOfEntryToPhoneBook;
    private String lastChangeEntryDates;
    private String enteredByUser;
    //

    //here you write all of the fields, write them in the input notes
    //and pass with the appropriate Regex in the RegexContainer
    //TODO:
    //(1) Copy all of the regular expressions from your previous version (*)
    //(2) Set them up in the inputNote method below

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);

        //This is uncharted territory
        this.surnameOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE0_LAT);
        this.nameOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE1_LAT);

        this.patronimicOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE2_LAT);

        this.nicknameOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE3_LAT);

        this.commentaryOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE3_LAT);

        this.groupOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE3_LAT);

        this.homeNumber =
                utilityController.inputStringValueWithScanner
                        ("text",REGEX_CASE6_LAT);

        this.phoneNumber =
                utilityController.inputStringValueWithScanner
                        ("text",REGEX_CASE7_LAT);

        this.secondPhoneNumber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE8_LAT);

        this.emailOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE9_LAT);

        this.skypeOfSubscriber =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE10_LAT);

        this.datesOfEntryToPhoneBook =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE11_LAT);

        this.lastChangeEntryDates =
                utilityController.inputStringValueWithScanner
                        ("text", REGEX_CASE12_LAT);

    }
}
