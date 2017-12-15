package com.china317.p2p.dao;



import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.china317.p2p.BaseTest;
import com.china317.p2p.entity.Area;

public class AreaDaoTest extends BaseTest{

	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea(){
		List<Area> areaList = areaDao.queryArea();
		System.out.println(areaList.get(0).getAreaName());
	
	}
	

}
