package com.china317.p2p.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china317.p2p.dao.AreaDao;
import com.china317.p2p.entity.Area;
import com.china317.p2p.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDao areadao;
	
	
	@Override
	public List<Area> getAreaList() {
		return areadao.queryArea();
	}

}
