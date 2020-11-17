package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import connectivity.ConnectionClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class transactionController implements Initializable{
	
	@FXML
	private TableView<transactionTable> tblTransactions;
	
	@FXML
	private TableColumn<transactionTable, String> colTransactionID;
	@FXML
	private TableColumn<transactionTable, String> colOrderNumber;
	@FXML
	private TableColumn<transactionTable, String> colTransactionAmount;
	@FXML
	private TableColumn<transactionTable, String> colTransactionDate;
	@FXML
	private TableColumn<transactionTable, String> colCreditCardNum;
	@FXML
	private TableColumn<transactionTable, String> colCreditCardExpiration;
	@FXML
	private TableColumn<transactionTable, String> colCreditCardSecurityCode;
	@FXML
	private TableColumn<transactionTable, String> colCreditCardHolderName;
	
	ObservableList<transactionTable> oblist = FXCollections.observableArrayList();
	
	

	@Override
	public void initialize(URL url, ResourceBundle resource) {
		// TODO Auto-generated method stub
		
		ConnectionClass connectionClass = new ConnectionClass();
		Connection connection = connectionClass.getConnection();
		
		try {
			ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM [Shipping Company].[dbo].[TRANSACTION]");
			
			while (rs.next()) {
				oblist.add(new transactionTable(rs.getString("TransactionID"), rs.getString("OrderNumber"), rs.getString("TransactionAmount"), rs.getString("TransactionDate"), rs.getString("CreditCardNum"), rs.getString("CreditCardExpiration"), rs.getString("CreditCardSecurityCode"), rs.getString("CreditCardHolderName")));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		colTransactionID.setCellValueFactory(new PropertyValueFactory<>("transactionID"));
		colOrderNumber.setCellValueFactory(new PropertyValueFactory<>("orderNumber"));
		colTransactionAmount.setCellValueFactory(new PropertyValueFactory<>("transactionAmount"));
		colTransactionDate.setCellValueFactory(new PropertyValueFactory<>("transactionDate"));
		colCreditCardNum.setCellValueFactory(new PropertyValueFactory<>("creditCardNum"));
		colCreditCardExpiration.setCellValueFactory(new PropertyValueFactory<>("creditCardExpiration"));
		colCreditCardSecurityCode.setCellValueFactory(new PropertyValueFactory<>("creditCardSecurityCode"));
		colCreditCardHolderName.setCellValueFactory(new PropertyValueFactory<>("creditCardHolderName"));
		
		tblTransactions.setItems(oblist);
	}
	
	public void changeOrdersUI(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("DatabaseUI.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(scene);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void changeInvoicesUI(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("InvoicesUI.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(scene);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void changeDriversUI(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("DriversUI.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(scene);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
