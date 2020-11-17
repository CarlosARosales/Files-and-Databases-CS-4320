package application;

public class transactionTable {
	
	String transactionID, orderNumber, transactionAmount, transactionDate, creditCardNum, creditCardExpiration, creditCardSecurityCode, creditCardHolderName;

	public transactionTable(String transactionID, String orderNumber, String transactionAmount, String transactionDate,
			String creditCardNum, String creditCardExpiration, String creditCardSecurityCode, String creditCardHolderName) {
		
		this.transactionID = transactionID;
		this.orderNumber = orderNumber;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.creditCardNum = creditCardNum;
		this.creditCardExpiration = creditCardExpiration;
		this.creditCardSecurityCode = creditCardSecurityCode;
		this.creditCardHolderName = creditCardHolderName;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public String getCreditCardNum() {
		return creditCardNum;
	}
	
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public String getCreditCardExpiration() {
		return creditCardExpiration;
	}

	public void setCreditCardExpiration(String creditCardExpiration) {
		this.creditCardExpiration = creditCardExpiration;
	}

	public String getCreditCardSecurityCode() {
		return creditCardSecurityCode;
	}

	public void setCreditCardSecurityCode(String creditCardSecurityCode) {
		this.creditCardSecurityCode = creditCardSecurityCode;
	}

	public String getCreditCardHolderName() {
		return creditCardHolderName;
	}

	public void setCreditCardHolderName(String creditCardHolderName) {
		this.creditCardHolderName = creditCardHolderName;
	}
	
	
	
	
	
}
