package cn.gxht.cms_dl.system.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleMenuDao{
	int insertRoleMenus(@Param("roleId")Integer roleId,@Param("menuIds")String[] menuIds);
	int deleteObject(Integer id);
	List<Integer> findMenuIdsByRoleId(Integer id);
	
}
