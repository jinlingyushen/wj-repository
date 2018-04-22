package tk.mybatis.simple.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestSelectByUser extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		SysUser sysUser = new SysUser();
		sysUser.setUserName("ad");
		sysUser.setUserEmail(null);
		try{
			List<SysUser> userList = userMapper.selectByUser(sysUser);
			for(SysUser user : userList){
				System.out.println(user);
			}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				sqlSession.close();
				sqlSession.rollback();
			}
	}
}
