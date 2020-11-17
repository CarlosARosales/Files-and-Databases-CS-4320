package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import connectivity.ConnectionClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class databaseController implements Initializable{
	
	@FXML private Button btnAddOrder;
		
	@FXML
	private TableView<ModelTable> tblData;
	@FXML
	private TableColumn<ModelTable, String> colOrderNumber;
	@FXML
	private TableColumn<ModelTable, String> colCustomerID;
	@FXML
	private TableColumn<ModelTable, String> colOrderDate;
	@FXML
	private TableColumn<ModelTable, String> colShipDate;
	@FXML
	private TableColumn<ModelTable, String> colReceiveDate;
	@FXML
	private TableColumn<ModelTable, String> colShippingType;
	@FXML
	private TableColumn<ModelTable, String> colTransactionID;
	@FXML
	private TableColumn<ModelTable, String> colDriverID;
	@FXML
	private TableColumn<ModelTable, String> colInvoiceID;
	
	ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		ConnectionClass connectionClass = new ConnectionClass();
		Connection connection = connectionClass.getConnection(); //Creates connection to DB
		
		try {
			ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM [Shipping Company].[dbo].[ORDER]");
			
			while (rs.next()) {
				oblist.add(new ModelTable(rs.getString("OrderNumber"), rs.getString("CustomerID"), rs.getString("OrderDate"), rs.getString("ShipDate"), rs.getString("ReceiveDate"), rs.getString("ShippingType"), rs.getString("TransactionID"), rs.getString("DriverID"), rs.getString("InvoiceID")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		colOrderNumber.setCellValueFactory(new PropertyValueFactory<>("orderNumber"));
		colCustomerID.setCellValueFactory(new PropertyValueFactory<>("customerID"));
		colOrderDate.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
		colShipDate.setCellValueFactory(new PropertyValueFactory<>("shipDate"));
		colReceiveDate.setCellValueFactory(new PropertyValueFactory<>("receiveDate"));
		colShippingType.setCellValueFactory(new PropertyValueFactory<>("shippingType"));
		colTransactionID.setCellValueFactory(new PropertyValueFactory<>("transactionID"));
		colDriverID.setCellValueFactory(new PropertyValueFactory<>("driverID"));
		colInvoiceID.setCellValueFactory(new PropertyValueFactory<>("invoiceID"));
		
		tblData.setItems(oblist);
		
	}
	
	
	public void changeInvoiceUI(ActionEvent event) {
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
	
	public void changeTransactionsUI(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("TransactionsUI.fxml"));
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
