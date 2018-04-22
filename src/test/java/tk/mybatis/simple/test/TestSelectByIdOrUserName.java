package tk.mybatis.simple.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestSelectByIdOrUserName extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		SysUser sysUser = new SysUser();
		//sysUser.setId(1l);
		//sysUser.setUserName("admin");
		try{
			SysUser user = userMapper.selectByIdOrUserName(sysUser);
			System.out.println(user);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				sqlSession.close();
				sqlSession.rollback();
			}
	}
}
