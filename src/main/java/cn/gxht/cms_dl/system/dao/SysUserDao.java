package cn.gxht.cms_dl.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.gxht.cms_dl.common.dao.BaseDao;
import cn.gxht.cms_dl.system.entity.SysUser;
import org.springframework.stereotype.Repository;
@Repository
public interface SysUserDao extends BaseDao<SysUser> {

	List<SysUser> findPageObjects(
			@Param("username")String username,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize") Integer pageSize);
	
	int getRowCount(@Param("username")String username);

	SysUser findObjectById(Integer id);

	int validById(@Param("id")Integer id,@Param("valid")Integer valid);

	SysUser findObjectByName(@Param("username") String username);
	/**
	 * 查询用户得权限
	 * @param userId
	 */
	List<String> findUserPermissions(Integer userId);
	List<Map<String,Object>> findUserMenus(Integer userId);
	
	

}
