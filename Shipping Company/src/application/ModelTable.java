package application;

public class ModelTable {
	
	String orderNumber, customerID, orderDate, shipDate, receiveDate, shippingType, transactionID, driverID, invoiceID;

	public ModelTable(String orderNumber, String customerID, String orderDate, String shipDate, String receiveDate,
			String shippingType, String transactionID, String driverID, String invoiceID) {
		
		this.orderNumber = orderNumber;
		this.customerID = customerID;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.receiveDate = receiveDate;
		this.shippingType = shippingType;
		this.transactionID = transactionID;
		this.driverID = driverID;
		this.invoiceID = invoiceID;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getShippingType() {
		return shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	
}
