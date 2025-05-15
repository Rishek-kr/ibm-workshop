package com.ibm.springJdbc;

import java.util.List;
import javax.sql.DataSource;

public interface EmployeeDAO {
	public void setDataSource(DataSource ds);

	public void create(String firstName, String lastName, Integer salary);

	public Employee getEmpolyee(Integer id);

	public List<Employee> listEmpolyees();

	public void delete(Integer id);

	public void update(Integer id, String firstName, String lastName, Integer salary);
}
