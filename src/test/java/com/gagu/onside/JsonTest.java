package com.gagu.onside;

import com.gagu.onside.model.bean.User;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by pingfu on 16/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class JsonTest {
    private Gson gson;
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setup(){
        gson = new Gson();
    }

    @Test
    public void test() {
        User user = new User();
        user.username = "aa";
        user.uid = "idsf";
        System.out.println(gson.toJson(user));
    }
}
