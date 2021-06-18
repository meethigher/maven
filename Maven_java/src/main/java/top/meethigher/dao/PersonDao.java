package top.meethigher.dao;

import top.meethigher.domain.Person;

import java.util.List;

/**
 * PersonDao
 *
 * @autho kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021/1/17
 */
public interface PersonDao {
    public List<Person> findAll();
}
