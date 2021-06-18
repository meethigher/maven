package top.meethigher.test;

import org.junit.Test;
import top.meethigher.dao.PersonDao;
import top.meethigher.dao.impl.PersonDaoImpl;
import top.meethigher.domain.Person;

import java.util.List;

/**
 * PersonTest
 *
 * @autho kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021/1/17
 */
public class PersonTest {
    @Test
    public void findAll(){
        PersonDao personDao = new PersonDaoImpl();
        List<Person> all = personDao.findAll();
        for(Person p:all){
            System.out.println(p);
        }
    }
}
