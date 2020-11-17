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


public class invoicesController implements Initializable{
	
	
	@FXML
	private TableView<InvoicesTable> invoicesData;
	
	@FXML
	private TableColumn<InvoicesTable, String> colInvoiceID;
	@FXML
	private TableColumn<InvoicesTable, String> colOrderNumber;
	@FXML
	private TableColumn<InvoicesTable, String> colItemName;
	@FXML
	private TableColumn<InvoicesTable, String> colUnitPrice;
	@FXML
	private TableColumn<InvoicesTable, String> colQuantity;
	@FXML
	private TableColumn<InvoicesTable, String> colTotal;
	@FXML
	private TableColumn<InvoicesTable, String> colTransactionID;
	
	ObservableList<InvoicesTable> oblist = FXCollections.observableArrayList();

	@Override
	public void initialize(URL url, ResourceBundle res) {
		// TODO Auto-generated method stub
		ConnectionClass connectionClass = new ConnectionClass();
		Connection connection = connectionClass.getConnection();
		
		try {
			ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM [Shipping Company].[dbo].[INVOICE]");
			
			while (rs.next()) {
				oblist.add(new InvoicesTable(rs.getString("InvoiceID"), rs.getString("OrderNumber"), rs.getString("ItemName"), rs.getString("UnitPrice"), rs.getString("Quantity"), rs.getString("Total"), rs.getString("TransactionID")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		colInvoiceID.setCellValueFactory(new PropertyValueFactory<>("invoiceID"));
		colOrderNumber.setCellValueFactory(new PropertyValueFactory<>("orderNumber"));
		colItemName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
		colUnitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
		colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
		colTransactionID.setCellValueFactory(new PropertyValueFactory<>("transactionID"));
		
		
		invoicesData.setItems(oblist);
		
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
