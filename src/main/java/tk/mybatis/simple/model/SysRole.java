package tk.mybatis.simple.model;

import java.util.Date;

/**
 * 角色表
 * @author 华硕
 *
 */
public class SysRole {
	
	/**
	 * 角色id
	 */
	private Long id;
	/**
	 * 角色名
	 */
	private String roleName;
	/**
	 * 有效标志
	 */
	private Integer enabled;
	/**
	 * 创建人
	 */
	private Long createBy;
	/**
	 * 创建事间
	 */
	private Date createTime;
	
	private SysUser user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SysRole [id=" + id + ", roleName=" + roleName + ", enabled=" + enabled + ", createBy=" + createBy
				+ ", createTime=" + createTime + ", user=" + user + "]";
	}
	
	
	
	

}
