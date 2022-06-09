import com.xinqi.domain.Account;
import com.xinqi.mapper.AccountMapper;
import com.xinqi.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class TestSSM {

    @Test
    public void testMyBatis() throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = ssf.openSession();

        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        List<Account> accounts = accountMapper.selectAll();
        System.out.println(accounts);

        is.close();
        session.close();
    }

    @Test
    public void testSpring() throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = (AccountService) ac.getBean("accountServiceImpl");
        accountService.queryAll();
        System.out.println(accountService);
    }

    @Test
    public void testSpringAndMyBatis() throws Exception{
        ApplicationContext ac =  new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountServiceImpl");
        List<Account> accounts = accountService.queryAll();
        System.out.println(accounts);
    }
}
