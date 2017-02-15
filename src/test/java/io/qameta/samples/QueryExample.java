package io.qameta.samples;

import com.iciql.Db;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class QueryExample {

    private final String userName = "Artem";

    private UserDao userDao;

    @Before
    public void initUserDao() {
        Db db = DatabaseFactory.connect();
        this.userDao = db.open(UserDao.class);
    }

    @Test
    public void objectMappingShouldWorkByDefault() {
        User user = userDao.getUserByName(userName);
        assertThat(user.getName(), equalTo(userName));
    }

    @Test
    public void objectMappingShouldWorkWithCustomColumnName() {
        User2 user = userDao.getUser2ByName(userName);
        assertThat(user.getFullName(), equalTo(userName));
    }

}
