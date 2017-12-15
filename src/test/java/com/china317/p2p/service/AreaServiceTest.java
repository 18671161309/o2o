package com.china317.p2p.service;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.china317.p2p.BaseTest;
import com.china317.p2p.entity.Area;

public class AreaServiceTest extends BaseTest{

	
	@Autowired
	private AreaService areaService;
	
	
	@Test
	public void testGetAreaList(){
		List<Area> list =areaService.getAreaList();
		System.out.println(list.get(0).getAreaName());
	}
}
