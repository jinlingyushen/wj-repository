package tk.mybatis.simple.model;
/**
 * 权限表
 * @author 华硕
 *
 */
public class SysPrivilege {
	
	/**
	 * 权限id
	 */
	private Long id;
	/**
	 * 权限名
	 */
	private String privilegeName;
	/**
	 * 权限url
	 */
	private String privilegeUrl;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public String getPrivilegeUrl() {
		return privilegeUrl;
	}
	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl = privilegeUrl;
	}
	@Override
	public String toString() {
		return "SysPrivilege [id=" + id + ", privilegeName=" + privilegeName + ", privilegeUrl=" + privilegeUrl + "]";
	}
	
	

}
