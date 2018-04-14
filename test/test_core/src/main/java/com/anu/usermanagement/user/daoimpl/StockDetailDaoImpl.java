package com.anu.usermanagement.user.daoimpl;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.impl.AbstractDaoImpl;
import com.anu.usermanagement.user.dao.StockDetailsDao;
import com.anu.usermanagement.user.entitys.StockDetail;

@Repository("stockDetailDao")
public class StockDetailDaoImpl extends AbstractDaoImpl<StockDetail, String> implements StockDetailsDao{



	protected StockDetailDaoImpl() {
		super(StockDetail.class);
		// TODO Auto-generated constructor stub
	}

	public void addStockDetail(StockDetail stockDetail) {
		// TODO Auto-generated method stub
		System.out.println("core method");
		//getCurrentSession().save(employee);
		saveOrUpdate(stockDetail);
		
	}

}
