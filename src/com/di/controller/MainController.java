package com.di.controller;

import com.di.dto.EmpDto;
import com.di.service.EmpServiceImpl;
import com.di.vo.EmpVo;

public class MainController {
	
	private EmpServiceImpl service;

	public MainController(EmpServiceImpl service) {
		super();
		this.service = service;
	}
	
	public String process(EmpVo vo) throws Exception
	{
		String empDetail=null;
		EmpDto dto=new EmpDto();
		dto.setEmpId(Integer.parseInt(vo.getEmpId()));
		dto.setEmpName(vo.getEmpName());
		dto.setSalery(Float.parseFloat(vo.getSalery()));
		
		empDetail=this.service.empDetail(dto);
		
		return empDetail;
	}

}
