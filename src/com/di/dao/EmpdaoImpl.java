package com.di.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.di.bo.EmpBo;

public class EmpdaoImpl implements EmpDao {
		
	private String insertQuery="INSERT INTO EMP VALUES(?,?,?);";
	private String selectQuery="SELECT * FROM EMP;";
		
	private DataSource ds=null;
		
	public EmpdaoImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public int insert(EmpBo bo) throws Exception {
		
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(insertQuery);
		ps.setInt(1, bo.getEmpId());
		ps.setString(2, bo.getEmpName());
		ps.setFloat(3, bo.getSalery());
		return ps.executeUpdate();
	}

	@Override
	public int select(EmpBo bo) {
		
		return 0;
	}

}
