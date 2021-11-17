package northwind.dataAccsess.concretes;

import java.util.ArrayList;
import java.util.List;

import northwind.dataAccsess.abstracts.EmployeeRepository;
import northwind.entities.concretes.Employee;

public class EmployeeDao implements EmployeeRepository {
	List<Employee> employees;

	public EmployeeDao() {
		employees = new ArrayList<Employee>();
	}

	@Override
	public void add(Employee employee) {

		employees.add(employee);
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return employees;
	}
}
