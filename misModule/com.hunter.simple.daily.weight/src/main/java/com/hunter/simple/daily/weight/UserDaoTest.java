package com.hunter.simple.daily.weight;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Administrator
 * @date 2020/8/21
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Before
    public void before() {
        UserPo userPo = new UserPo();
        userPo.setGid("444");
        userPo.setUserName("444");
        userDao.save(userPo);
    }

    @Test
    public void testAdd() {
        UserPo userPo = new UserPo();
        userPo.setGid("555");
        userPo.setUserName("555");
        userDao.save(userPo);
    }

    @After
    public void after() {
        UserPo userPo = new UserPo();
        userPo.setGid("666");
        userPo.setUserName("666");
        userDao.save(userPo);
    }

}
