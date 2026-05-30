package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider  {
    @Override
    public String getUserDetails(){
        return "user Details from Database";
    }
}
