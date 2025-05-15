package com.ibm.springJdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {

	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		this.setJdbcTemplateObject(new JdbcTemplate(dataSource));
	}

	@Override
	public void create(String firstName, String lastName, Integer salary) {
		// TODO Auto-generated method stub
		String SQL = "insert into Empolyee (firstname,lastname,salary) values (?,?,?)";
		jdbcTemplateObject.update(SQL, firstName, lastName, salary);
		System.out.println("Created Record Name = "+firstName+" and Salary = "+salary);
	}

	@Override
	public Employee getEmpolyee(Integer id) {
		// TODO Auto-generated method stub
		 String SQL = "SELECT * FROM Empolyee WHERE id = ?";
		 Employee employee = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new EmployeeMapper());
		 return employee;
	}

	@Override
	public List<Employee> listEmpolyees() {
		// TODO Auto-generated method stub
		String SQL = "select * from empolyee";
		List<Employee> employee = jdbcTemplateObject.query(SQL, new EmployeeMapper());
		return employee;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from empolyee where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
		// TODO Auto-generated method stub

	}
	@Override
	public void update(Integer id, String firstName, String lastName, Integer salary) {
		// TODO Auto-generated method stub
		String SQL = "update empolyee set salary = ? where id = ?";
        jdbcTemplateObject.update(SQL, salary, id);

	}

	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

}
