package top.meethigher.dao.impl;

import top.meethigher.dao.PersonDao;
import top.meethigher.domain.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * PersonDaoImpl
 *
 * @autho kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021/1/17
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public List<Person> findAll() {
        //获取connection对象
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Person> personList = new ArrayList<Person>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql:///beauty?serverTimezone=Asia/Shanghai&useSSL=false", "root", "root");
            String sql = "select * from fairy";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getInt("id"));
                person.setName(rs.getString("name"));
                person.setAge(rs.getInt("age"));
                person.setGender(rs.getString("gender"));
                person.setGrade(rs.getInt("grade"));
                person.setPosition(rs.getString("position"));
                person.setSchool(rs.getString("school"));
                personList.add(person);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return personList;
    }
}
