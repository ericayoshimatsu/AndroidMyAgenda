package com.motchan.myagenda.model;

public class ListEntry {

    private final String name;
    private final String phone;
    private final String email;

    public ListEntry(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
