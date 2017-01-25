package com.dayone;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class ConnectionUtil {
public static BasicDataSource getsource()
{
	BasicDataSource ds=new BasicDataSource();
	ds.setDriverClassName("com.mysql.jdbc.Driver");
	ds.setUsername("root");
	ds.setPassword("root");
	ds.setUrl("jdbc:mysql://LocalHost:3306/student");
	return ds;

}
public static JdbcTemplate gettemplate()
{
	JdbcTemplate jd=new JdbcTemplate();
	jd.setDataSource(getsource());
	return jd;
}
}