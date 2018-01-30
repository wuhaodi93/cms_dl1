package product;
import javax.sql.DataSource;

import cn.gxht.cms_dl.system.dao.SysUserDao;
import cn.gxht.cms_dl.system.entity.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	@Test
	public void testDruid(){
		
		ApplicationContext  ctx=
		new ClassPathXmlApplicationContext("spring-mybatis.xml");

		SysUserDao userDao= ctx.getBean("sysUserDao",SysUserDao.class);
		SysUser user1= userDao.findObjectByName("admin");
		System.out.println(user1.toString());
	}
}
