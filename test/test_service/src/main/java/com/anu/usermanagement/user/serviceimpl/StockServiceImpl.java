package com.anu.usermanagement.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.user.bean.StockBean;
import com.anu.usermanagement.user.dao.StockDao;
import com.anu.usermanagement.user.dao.StockDetailsDao;
import com.anu.usermanagement.user.entitys.Stock;
import com.anu.usermanagement.user.entitys.StockDetail;
import com.anu.usermanagement.user.service.StockService;

@Service
public class StockServiceImpl implements StockService{
	
	@Autowired(required=true)
	StockDao stockDao;
	
	@Autowired
	StockDetailsDao stockDetailsDao;

	@Transactional
	public void addStock(StockBean stockBean) {
		// TODO Auto-generated method stub
		Stock stock=new Stock();
		StockDetail stockDetail=new StockDetail();
		stock.setStockCode(stockBean.getStockCode());
		//stock.setStockDetail(stockBean.getStockDetail());
		stock.setStockName(stockBean.getStockName());
		stockDetail.setCompDesc(stockBean.getCompDesc());
		stockDetail.setCompName(stockDetail.getCompName());
		//stockDetail.setListedDate(stockBean.getListedDate());
		stockDetail.setRemark(stockBean.getRemark());
		stockDao.addStock(stock);
		stockDetailsDao.addStockDetail(stockDetail);
		
	}

}
