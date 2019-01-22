package com.di.dao;

import com.di.bo.EmpBo;

public interface EmpDao {

	public int insert(EmpBo bo) throws Exception;	
	public int select(EmpBo bo);
	
}
		