package tk.mybatis.simple.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public class UserMapperTest extends BaseMapperTest {
	
	@Test
	public void testUserMapper(){ 
		SqlSession session = getSqlSession();
		
		try {
//			List<SysUser> userList = session.selectList("tk.mybatis.simple.mapper.UserMapper.selectAll");
//			for(SysUser user : userList){
//				System.out.printf("%-4d%4s%4s\n",user.getId(),
//												 user.getUserName(),
//												 user.getUserPassword(),
//												 user.getUserInfo(),
//												 user.getUserEmail(),
//												 user.getHeadImg(),
//												 user.getCreateTime()
//												 );
//			}
			UserMapper userMapper = session.getMapper(UserMapper.class);
//			SysUser user = userMapper.selectById(1l);
//			System.out.println(user);
//			List<SysRole> roleList  = userMapper.selectRolesByUserId(1l);
			
//			SysUser sysUser = new SysUser();
//			sysUser.setId(1l);
//			sysUser.setUserName("tom");
//			sysUser.setUserPassword("123456789");
//			sysUser.setUserEmail("test@mybatis.tk");
//			sysUser.setUserInfo("test info");
//			sysUser.setHeadImg(new byte[]{1,2,3});
//			sysUser.setCreateTime(new Date());
			//int result = userMapper.insert3(sysUser);
			//int result = userMapper.updateByUserId(sysUser);
			//System.out.println(sysUser.getId());
			//int result = userMapper.deleteByPrimaryKey(1l);
//			List<SysRole> roleList = userMapper.selectRolesByUserIdAndRoleEnabled(1l, 1);
//			for(SysRole role : roleList){
//				System.out.println(role);
//			}
			//Assert.assertEquals(1, result);
			//Assert.assertNull(sysUser.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.rollback();
			session.close();
		}
	}

}
