package tk.mybatis.simple.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestSelectByIdList extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<Long> idList = new ArrayList<>();
		idList.add(1l);
		idList.add(1001l);
		try{
			List<SysUser> userList = userMapper.selectByIdList(new ArrayList<>());
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
