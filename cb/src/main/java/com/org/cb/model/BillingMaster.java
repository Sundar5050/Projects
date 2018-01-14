package com.org.cb.model;
// Generated 08-Jan-2018 22:34:00 by Hibernate Tools 5.1.6.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BillingMaster generated by hbm2java
 */
@Entity
@Table(name = "billing_master", catalog = "devsample")
public class BillingMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer masterBillId;
	private Integer masterIndInvoiceNo;
	private String masterIndBillerName;
	private String masterReceiverName;
	private Date masterIndBillDate;
	private Integer masterIndBillQuantity;
	private BigDecimal masterIndBillAmount;

	public BillingMaster() {
	}

	public BillingMaster(Integer masterIndInvoiceNo, String masterIndBillerName, String masterReceiverName,
			Date masterIndBillDate, Integer masterIndBillQuantity, BigDecimal masterIndBillAmount) {
		this.masterIndInvoiceNo = masterIndInvoiceNo;
		this.masterIndBillerName = masterIndBillerName;
		this.masterReceiverName = masterReceiverName;
		this.masterIndBillDate = masterIndBillDate;
		this.masterIndBillQuantity = masterIndBillQuantity;
		this.masterIndBillAmount = masterIndBillAmount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Master_BillID", unique = true, nullable = false)
	public Integer getMasterBillId() {
		return this.masterBillId;
	}

	public void setMasterBillId(Integer masterBillId) {
		this.masterBillId = masterBillId;
	}

	@Column(name = "Master_ind_invoiceNo")
	public Integer getMasterIndInvoiceNo() {
		return this.masterIndInvoiceNo;
	}

	public void setMasterIndInvoiceNo(Integer masterIndInvoiceNo) {
		this.masterIndInvoiceNo = masterIndInvoiceNo;
	}

	@Column(name = "Master_ind_billerName", length = 30)
	public String getMasterIndBillerName() {
		return this.masterIndBillerName;
	}

	public void setMasterIndBillerName(String masterIndBillerName) {
		this.masterIndBillerName = masterIndBillerName;
	}

	@Column(name = "Master_ReceiverName", length = 30)
	public String getMasterReceiverName() {
		return this.masterReceiverName;
	}

	public void setMasterReceiverName(String masterReceiverName) {
		this.masterReceiverName = masterReceiverName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Master_Ind_BillDate", length = 10)
	public Date getMasterIndBillDate() {
		return this.masterIndBillDate;
	}

	public void setMasterIndBillDate(Date masterIndBillDate) {
		this.masterIndBillDate = masterIndBillDate;
	}

	@Column(name = "Master_Ind_BillQuantity")
	public Integer getMasterIndBillQuantity() {
		return this.masterIndBillQuantity;
	}

	public void setMasterIndBillQuantity(Integer masterIndBillQuantity) {
		this.masterIndBillQuantity = masterIndBillQuantity;
	}

	@Column(name = "Master_Ind_BillAmount", precision = 5, scale = 3)
	public BigDecimal getMasterIndBillAmount() {
		return this.masterIndBillAmount;
	}

	public void setMasterIndBillAmount(BigDecimal masterIndBillAmount) {
		this.masterIndBillAmount = masterIndBillAmount;
	}

}
