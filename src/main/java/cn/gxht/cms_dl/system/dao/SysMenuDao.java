package cn.gxht.cms_dl.system.dao;

import java.util.List;
import java.util.Map;

import cn.gxht.cms_dl.common.dao.BaseDao;
import cn.gxht.cms_dl.system.entity.SysMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuDao extends BaseDao<SysMenu> {

	List<Map<String,Object>> findObjects();
	int getRowCount();
	List<Map<String, Object>> findZtreeNodes();
	int hasChild(Integer menuId);
	Map<String,Object> findMapById(Integer id);
	int deleteObject(Integer id);

}
