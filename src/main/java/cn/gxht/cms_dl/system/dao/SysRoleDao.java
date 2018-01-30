package cn.gxht.cms_dl.system.dao;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.gxht.cms_dl.common.dao.BaseDao;
import cn.gxht.cms_dl.system.entity.SysRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleDao extends BaseDao<SysRole> {
	/**获取所有角色信息*/
	List<Map<String, Object>> findObjects();
	/**分页获取所有角色信息*/
	List<SysRole> findPageObjects(
			@Param("name")String name,
			@Param("startIndex")int startIndex,
			@Param("pageSize")int pageSize);
	/**根据id获取角色信息*/
	SysRole findObjectById(Integer id);
	/**根据参数获取名字记录数*/
	public int getRowCounts(@Param("name") String name);
	/**根据id删除对象信息*/
	int deleteObject(Integer id);

}
