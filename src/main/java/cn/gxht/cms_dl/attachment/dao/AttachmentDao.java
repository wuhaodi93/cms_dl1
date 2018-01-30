package cn.gxht.cms_dl.attachment.dao;

import java.util.List;

import cn.gxht.cms_dl.attachment.entity.Attachment;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentDao {
	int insertObject(Attachment entity);
	/**根据摘要信息获取记录数*/
	int getRowCountByDigest(String fileDisgest);
	/**获得所有上传的文件信息*/
	List<Attachment> findObjects();
	/**根据id查找某个对象*/
	Attachment findObjectById(Integer id);
	
}
