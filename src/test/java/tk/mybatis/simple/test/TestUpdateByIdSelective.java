package tk.mybatis.simple.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestUpdateByIdSelective extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		SysUser sysUser = new SysUser();
		sysUser.setId(1l);
		sysUser.setUserName("admin1");
		//sysUser.setUserEmail("admin@mybatis.tk");
		try{
			int result = userMapper.updateByIdSelective(sysUser);
			System.out.println(result);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				sqlSession.close();
				sqlSession.rollback();
			}
	}
}
