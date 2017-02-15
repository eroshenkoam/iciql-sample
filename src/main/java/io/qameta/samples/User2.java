package io.qameta.samples;

import com.iciql.Iciql;

public class User2 {

    private int id;

    @Iciql.IQColumn(name = "name")
    private String fullName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
