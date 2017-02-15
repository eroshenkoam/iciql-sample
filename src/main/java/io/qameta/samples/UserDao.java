package io.qameta.samples;

import com.iciql.Dao;

public interface UserDao extends Dao {

    @SqlQuery("select * from users WHERE name = :name")
    User getUserByName(@Bind("name") String name);

    @SqlQuery("select * from users WHERE name = :name")
    User2 getUser2ByName(@Bind("name") String name);

}
