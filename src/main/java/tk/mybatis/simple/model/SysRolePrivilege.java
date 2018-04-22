package tk.mybatis.simple.model;
/**
 * 角色权限关联表
 * @author 华硕
 *
 */
public class SysRolePrivilege {
	
	/**
	 * 角色id
	 */
	private Long roleId;
	/**
	 * 权限id
	 */
	private Long privilegeId;
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getPrivilegeId() {
		return privilegeId;
	}
	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}
	@Override
	public String toString() {
		return "SysRolePrivilege [roleId=" + roleId + ", privilegeId=" + privilegeId + "]";
	}
	
	
}
