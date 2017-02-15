package io.qameta.samples;

import com.iciql.Db;

class DatabaseFactory {

    private DatabaseFactory() {
    }

    public static Db connect() {
        return Db.open("jdbc:mysql://0.0.0.0:3306/jdbi", "root", "root");
    }

}
