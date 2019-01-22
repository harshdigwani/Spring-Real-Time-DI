package com.di.service;

import com.di.bo.EmpBo;
import com.di.dao.EmpDao;
import com.di.dto.EmpDto;

public class EmpServiceImpl implements EmpService {

	EmpDao dao;
	
	public EmpServiceImpl(EmpDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String empDetail(EmpDto dto) throws Exception {
		EmpBo bo=null;
		float grossSal=0.0f;
		grossSal=dto.getSalery()*1.3f;
		bo=new EmpBo();
		bo.setEmpId(dto.getEmpId());
		bo.setEmpName(dto.getEmpName());
		bo.setSalery(dto.getSalery());
		dao.insert(bo);		
		return dto.getEmpId()+ "\t" + dto.getEmpName() + "\t" + dto.getSalery() + "\t" + grossSal;
	}


}
