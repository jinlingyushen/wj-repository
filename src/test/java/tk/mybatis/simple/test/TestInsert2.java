package tk.mybatis.simple.test;


import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestInsert2 extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		SysUser sysUser = new SysUser();
		//sysUser.setId(1l);
		sysUser.setUserName("tom");
		sysUser.setUserPassword("123456789");
		sysUser.setUserEmail(null);
		sysUser.setUserInfo("test info"); 
		sysUser.setHeadImg(new byte[]{1,2,3});
		sysUser.setCreateTime(new Date());
		try{
			int result = userMapper.insert2(sysUser);
			System.out.println(result);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				sqlSession.close();
				sqlSession.rollback();
			}
	}
}
