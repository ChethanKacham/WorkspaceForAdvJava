package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.EmployeeData;


public class EmployeeDAO {
	static final String USER = "root";
	static final String PASSWD = "root";
	
	private Connection conn = null;
	private Statement stmt = null;
	
	public EmployeeDAO() {
		makeConnection("employees");
	}
	
	void makeConnection(String dbName) {
		final String dbURL = "jdbc:mysql://localhost/" + dbName +
							 "?autoReconnect=true&useSSL=false";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, USER, PASSWD);
			stmt = conn.createStatement();
			
			System.out.println("Database Connected");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void close() {
		try {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	List<Map<String,Object>> runSQL(String sql) {
		System.out.println(sql);
		if(stmt == null) return null;
		
		List<Map<String,Object>> res = new ArrayList<Map<String,Object>>();
		
		try {
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData metaData  = rs.getMetaData();
			int size = metaData.getColumnCount();
			
			while(rs.next()) {
				Map<String, Object> row = new HashMap<String, Object>();
				for(int i=1; i <= size; i++) {
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
				res.add(row);
			}
			
			System.out.println(size);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		return res;
	}
	
	public String getDeptNum(String dept) {
		String sql = "SELECT dept_no FROM departments WHERE dept_name=" + 
					 "\"" + dept + "\"" + ";";
		List<Map<String,Object>> res = runSQL(sql);
//		System.out.println(sql);
		if(res.size() == 0) return null;
		
		return (String) res.get(0).get("dept_no");
	}
	
	public ArrayList<String> getEmpNoFromDept(String dept_no) {
		String sql = "SELECT emp_no FROM dept_emp WHERE dept_no = " + 
					 "\"" + dept_no + "\"" + " LIMIT 100;";
		List<Map<String,Object>> res = runSQL(sql);
		if(res.size() == 0) return null;
		
		ArrayList<String> data = new ArrayList<>();
		for(int i=0; i < res.size(); i++) {
			Map<String,Object> row = res.get(i);
			Object emp_no = (Object) row.get("emp_no");
			
			data.add(emp_no.toString());
		}
		
		return data;
	}
	
	public ArrayList<EmployeeData> getEmpInfo(String emp_no, String dept) {
		String sql = "SELECT * FROM employees WHERE emp_no = " + 
				 "\"" + emp_no + "\"" + ";";
		
		List<Map<String,Object>> res = runSQL(sql);
		if(res.size() == 0) return null;
		
		sql = "SELECT salary FROM salaries WHERE emp_no = " + 
				 "\"" + emp_no + "\"" + " AND YEAR(to_date)=9999;";
		
		List<Map<String,Object>> res2 = runSQL(sql);
		if(res2.size() == 0) return null;
		
		ArrayList<EmployeeData> data = new ArrayList<>();
		
		for(int i=0; i < res.size(); i++) {
			Map<String,Object> row = res.get(i);
			EmployeeData emp = new EmployeeData();
			
			emp.setEmp_no(emp_no);
			emp.setDept(dept);
			
			Object first_name = (Object) row.get("first_name");
			emp.setFirst_name(first_name.toString());
			
			Object last_name = (Object) row.get("last_name");
			emp.setLast_name(last_name.toString());
			
			Object gender = (Object) row.get("gender");
			emp.setGender(gender.toString());
			
			Object hire_date = (Object) row.get("hire_date");
			emp.setHire_date(hire_date.toString());
			
			Object birth_date = (Object) row.get("birth_date");
			emp.setBirth_date(birth_date.toString());
			
			row = res2.get(i);
			Object salary = (Object) row.get("salary");
			emp.setSalary(salary.toString());
			
			
			data.add(emp);
		}
		
		return data;
		
	}

}
