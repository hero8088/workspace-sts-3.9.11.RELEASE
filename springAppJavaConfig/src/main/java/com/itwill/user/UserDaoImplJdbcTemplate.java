package com.itwill.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDaoImplJdbcTemplate implements UserDao {
	private JdbcTemplate jdbcTemplate;

	public UserDaoImplJdbcTemplate() {
		System.out.println("#### UserDaoImplJdbcTemplate() : 디폴트생성자 호출  ");
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("#### UserDaoImplJdbcTemplate : setJdbcTemplate(" + jdbcTemplate + ") 호출  ");
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(User user) throws Exception {
		System.out.println("#### UserDaoImplJdbcTemplate : create() 호출  ");
		return 0;
	}

	@Override
	public int update(User user) throws Exception {
		System.out.println("#### UserDaoImplJdbcTemplate : update() 호출  ");
		return 0;
	}

	@Override
	public int remove(String userId) throws Exception {
		System.out.println("#### UserDaoImplJdbcTemplate : remove() 호출  ");
		return 0;
	}

	@Override
	public User findUser(String userId) throws Exception {
		System.out.println("#### UserDaoImplJdbcTemplate : findUser() 호출  ");
		return jdbcTemplate.queryForObject("select userId,password,name,email from userinfo where userId=?",
				new Object[] { userId },
				new RowMapper<User>() {
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User user = 
								new User(rs.getString("userId"),
										rs.getString("password"), 
										rs.getString("name"),
										rs.getString("email"));
						return user;
					}
				});
	}

	@Override
	public List<User> findUserList() throws Exception {
		System.out.println("#### UserDaoImplJdbcTemplate : findUserList 호출  ");
		return jdbcTemplate.query(
				"select * from userinfo",
				new BeanPropertyRowMapper<User>(User.class));
	}

	@Override
	public boolean existedUser(String userId) throws Exception {
		System.out.println("#### UserDaoImplJdbcTemplate : existedUser() 호출  ");
		return true;
	}
}
