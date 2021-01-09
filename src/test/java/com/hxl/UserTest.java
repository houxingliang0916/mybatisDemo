package com.hxl;

import com.hxl.dao.UserDao;
import com.hxl.pojo.User;
import com.hxl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static com.hxl.utils.MybatisUtils.getSqlSession;

/**
 * @author houxl
 * @create 2021-01-06-16:48
 */
public class UserTest {

    @Test
    public void userList(){
        SqlSession sqlSession = getSqlSession();
//        SqlSession sqlSession = getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> listUser = mapper.getListUser();
        for (User user : listUser){
            System.out.println(user);
        }
        sqlSession.close();

    }
}
