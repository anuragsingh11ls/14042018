package com.anu.usermanagement.user.bean;

import java.util.Date;

import com.anu.usermanagement.user.entitys.Stock;
import com.anu.usermanagement.user.entitys.StockDetail;

public class StockBean {
	private String stockId;
	private String stockCode;
	private String stockName;
	private StockDetail stockDetail;

	private Stock stock;
	private String compName;
	private String compDesc;
	private String remark;
	private String listedDate;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public StockDetail getStockDetail() {
		return stockDetail;
	}
	public void setStockDetail(StockDetail stockDetail) {
		this.stockDetail = stockDetail;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompDesc() {
		return compDesc;
	}
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getListedDate() {
		return listedDate;
	}
	public void setListedDate(String listedDate) {
		this.listedDate = listedDate;
	}
}
