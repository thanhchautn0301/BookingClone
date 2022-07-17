package com.demo.entities_api;

public class InvoiceApi {
    private Integer id;
	private Integer booking_id;
	private Integer voucher_id;
	private Double total;
	private Double deposit;
	private Boolean status;
	private Double oweMoney;
    public InvoiceApi(Integer id, Integer booking_id, Integer voucher_id, Double total, Double deposit, Boolean status,
            Double oweMoney) {
        this.id = id;
        this.booking_id = booking_id;
        if(voucher_id != null){
            this.voucher_id = voucher_id;
        }
        this.total = total;
        if(deposit != null){
            this.deposit = deposit;
        }
        this.status = status;
        this.oweMoney = oweMoney;
    }
    public InvoiceApi() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getBooking_id() {
        return booking_id;
    }
    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }
    public Integer getVoucher_id() {
        return voucher_id;
    }
    public void setVoucher_id(Integer voucher_id) {
        this.voucher_id = voucher_id;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Double getDeposit() {
        return deposit;
    }
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Double getOweMoney() {
        return oweMoney;
    }
    public void setOweMoney(Double oweMoney) {
        this.oweMoney = oweMoney;
    }

    
    
}
