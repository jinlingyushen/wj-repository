package tk.mybatis.simple.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public interface UserMapper {
	/**
	 * 查询所有用户
	 * @return
	 */
	List<SysUser> selectAll();
	/**
	 * 根据主键查询用户
	 * @param id
	 * @return
	 */
	SysUser selectById(Long id);
	/**
	 * 关联查询-根据用户id查询角色
	 * @param userId
	 * @return
	 */
	List<SysRole> selectRolesByUserId(Long userId);
	/**
	 * 新增用户
	 * @param sysUser
	 * @return
	 */
	int insert(SysUser sysUser);
	/**
	 * 新增用户-使用useGeneratedKeys方式
	 * @param sysUser
	 * @return
	 */
	int insert2(SysUser sysUser);
	/**
	 * 新增用户-使用selectKey方式
	 * @param sysUser
	 * @return
	 */
	int insert3(SysUser sysUser);
	/**
	 * 根据主键更新
	 * @param sysUser
	 * @return
	 */
	int updateByUserId(SysUser sysUser);
	/**
	 * 根据主键删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Long id);
	/**
	 * 根据用户id和角色的enabled状态来获取用户的角色
	 * @param userId
	 * @param enabled
	 * @return
	 */
	List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId")Long userId,@Param("enabled")Integer enabled);
	List<SysUser> selectByUser(SysUser sysUser);
	int updateByIdSelective(SysUser sysUser);
	/**
	 * 根据用户id或用户名查询
	 * @param sysUser
	 * @return
	 */
	SysUser selectByIdOrUserName(SysUser sysUser);
	/**
	 * 根据用户id集合查询
	 * @param idList
	 * @return
	 */
	List<SysUser> selectByIdList(@Param("idList")List<Long> idList);
	/**
	 * 根据用户id数组查询
	 * @param idArray
	 * @return
	 */
	List<SysUser> selectByIdArray(@Param("idArray")Long[] idArray);
	/**
	 * 批量插入
	 * @param userList
	 * @return
	 */
	int insertList(@Param("userList")List<SysUser> userList);
	/**
	 * 通过map更新列
	 * @param map
	 * @return
	 */
	int updateByMap(Map<String,Object> map);
}
