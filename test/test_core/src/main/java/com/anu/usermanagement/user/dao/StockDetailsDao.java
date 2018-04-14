package com.anu.usermanagement.user.dao;

import com.anu.usermanagement.core.dao.AbstractDao;
import com.anu.usermanagement.user.entitys.StockDetail;

public interface StockDetailsDao extends AbstractDao<StockDetail, String>{

	public void addStockDetail(StockDetail stock); 

}
