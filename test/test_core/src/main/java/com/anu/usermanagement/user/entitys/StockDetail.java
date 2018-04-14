package com.anu.usermanagement.user.entitys;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "stock_detail")
public class StockDetail implements java.io.Serializable {

	@Id
	@GeneratedValue
	@Column(name = "STOCK_ID" )
	private Integer stockId;
	/*@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn*/
	@OneToOne(mappedBy = "stock_detail", cascade = CascadeType.ALL)
	private Stock stock;
	@Column(name = "COMP_NAME", nullable = true, length = 100)
	private String compName;
	@Column(name = "COMP_DESC", nullable = true)
	private String compDesc;
	@Column(name = "REMARK", nullable = true)
	private String remark;
	//private String listedDate;

	

	//@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "stock"))
	
	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	
	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	
	public String getCompName() {
		return this.compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	
	public String getCompDesc() {
		return this.compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	//@Temporal(TemporalType.DATE)
	/*@Column(name = "LISTED_DATE",  length = 10)
	public String getListedDate() {
		return this.listedDate;
	}

	public void setListedDate(String listedDate) {
		this.listedDate = listedDate;
	}*/

}
