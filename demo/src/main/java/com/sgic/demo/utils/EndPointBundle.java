package com.sgic.demo.utils;

public class EndPointBundle {
    //common
    public static final String BASE_URL = "/api/v1";
    public static final String ID = "/{id}";
    public static final String SEARCH = "/search";

    //user controller
    public static final String USER= "/users";
    public static final String USER_ID = USER+ID;

    //school controller
    public static final String SCHOOL = BASE_URL+"/school";
    public static final String SCHOOL_ID = SCHOOL+ID;

    //student controller
    public static final String STUDENT= BASE_URL+"/student";
    public static final String STUDENT_ID=STUDENT+ID;

    //student controller
    public static final String STUDENTPROFILE= BASE_URL+"/studentprofile";
    public static final String STUDENTPROFILE_ID=STUDENT+ID;

    //course controller
    public static final String COURSE= BASE_URL+"/course";
    public static final String COURSE_ID=COURSE+ID;


}
