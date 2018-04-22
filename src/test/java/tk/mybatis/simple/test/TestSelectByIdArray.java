package tk.mybatis.simple.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestSelectByIdArray extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		Long[] idArray = new Long[]{1l,1001l};
		try{
			List<SysUser> userList = userMapper.selectByIdArray(null);
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
