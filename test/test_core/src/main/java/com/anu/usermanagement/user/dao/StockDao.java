package com.anu.usermanagement.user.dao;

import com.anu.usermanagement.core.dao.AbstractDao;
import com.anu.usermanagement.user.entitys.Stock;

public interface StockDao extends AbstractDao<Stock, String>{
	
	public void addStock(Stock stock); 

}
