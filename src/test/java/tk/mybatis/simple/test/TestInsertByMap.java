package tk.mybatis.simple.test;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

public class TestInsertByMap extends BaseMapperTest {
	
	SqlSession sqlSession = getSqlSession();
	
	@Test
	public void test(){
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		Map<String,Object> map = new HashMap<>();
		map.put("id", 1l);
		map.put("user_name", "Jack");
		map.put("user_password", "111111");
		
		try{
			int result = userMapper.updateByMap(map);
			System.out.println(result);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				sqlSession.close();
				sqlSession.rollback();
			}
	}
}
