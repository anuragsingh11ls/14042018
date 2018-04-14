package com.anu.usermanagement.user.daoimpl;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.impl.AbstractDaoImpl;
import com.anu.usermanagement.user.dao.StockDao;
import com.anu.usermanagement.user.entitys.Stock;

@Repository("stockDao")
public class StockDaoImpl extends AbstractDaoImpl<Stock, String> implements StockDao{

	protected StockDaoImpl() {
		super(Stock.class);
		// TODO Auto-generated constructor stub
	}

	public void addStock(Stock stock) {
		saveOrUpdate(stock);
		
	}
 

}
