package tk.mybatis.simple.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestInsertList extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		SysUser sysUser1 = new SysUser();
		sysUser1.setUserName("Tom");
		sysUser1.setUserPassword("123456789");
		sysUser1.setUserEmail("test@mybatis.tk");
		sysUser1.setUserInfo("test info");
		sysUser1.setHeadImg(new byte[]{1,2,3});
		sysUser1.setCreateTime(new Date());
		SysUser sysUser2 = new SysUser();
		sysUser2.setUserName("Jack");
		sysUser2.setUserPassword("123456789");
		sysUser2.setUserEmail("test@mybatis.tk");
		sysUser2.setUserInfo("test info");
		sysUser2.setHeadImg(new byte[]{1,2,3});
		sysUser2.setCreateTime(new Date());
		List<SysUser> userList = new ArrayList<>();
		userList.add(sysUser1);
		userList.add(sysUser2);
		try{
			int result = userMapper.insertList(userList);
			System.out.println(result);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				sqlSession.close();
				sqlSession.rollback();
			}
	}
}
