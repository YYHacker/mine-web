package com.test.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.test.web.bean.Emp;

@Repository
public class BaseDao {
	
	private JdbcTemplate jdbcTemplate;
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
   public void setDataSource(DataSource dataSource) {
      this.jdbcTemplate = new JdbcTemplate(dataSource);
      this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
   }
   
	
   public int findEmpCount() {
	   int rowCount = this.jdbcTemplate.queryForObject("select count(*) from emp", Integer.class);
      return rowCount;
   }
   
   public int findObject(){
	   int count = this.jdbcTemplate.queryForObject(
		        "SELECT count(*) FROM emp t  WHERE t.job = ?", Integer.class, "CLERK");
	   return count;
   }
   
   public String findForString(){
	   String str = this.jdbcTemplate.queryForObject(
			   "SELECT t.ename FROM emp t  WHERE t.empno = ?", new Object[]{7788}, String.class);
	   return str;
   }
   
   public Emp findForEmp(){
	   Emp emp = this.jdbcTemplate.queryForObject(
			   "SELECT * FROM emp t  WHERE t.empno = ?", 
			   new Object[]{7788},new empRowMapper());
	   return emp;
   }
   
   public List<Emp> findForListEmp(){
	   List<Emp> list = this.jdbcTemplate.query(
			   "SELECT * FROM emp", new empRowMapper());
	   return list;
	}
   
   public static class empRowMapper implements RowMapper<Emp> {
		@Override
		public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
			Emp emp = new Emp();
			emp.setEmpno(rs.getString("empno"));
			emp.setEname(rs.getString("ename"));
			emp.setJob(rs.getString("job"));
			return emp;
		}
   }
   
   public int inseEmp(){
	   int i = this.jdbcTemplate.update("insert into emp(empno,ename,job)values(?,?,?)","0000","god","sleep");
	   return i;
   }
   
   public int updateEmp(){
	   int i = this.jdbcTemplate.update("update emp set job = ? WHERE empno = ?","coooo","0000");
	   return i;
   }
   
   public int delEmp(){
	   int i = this.jdbcTemplate.update("delete emp WHERE empno = ?","0000");
	   return i;
   }
   
   public void execute(){
	   this.jdbcTemplate.execute("insert into emp(empno,ename,job)values('222','asdf','fffff')");
   }
   
   public int countOfEmpByJob(String firstName) {
	    String sql = "SELECT count(*) FROM emp t  WHERE t.job = :job";
	    SqlParameterSource namedParameters = new MapSqlParameterSource("job", firstName);
	    return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
	} 
}
