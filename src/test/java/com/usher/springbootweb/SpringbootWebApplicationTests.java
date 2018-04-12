package com.usher.springbootweb;

import com.usher.springbootweb.bean.Person;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

    @Qualifier("dataSource")
    @Autowired
    DataSource dataSource;

	@Ignore
	@Test
	public void testHelloService(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);
	}

	@Test
    public void contextLoads() throws SQLException{
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();

        System.out.println(connection);
        connection.close();
    }
}
