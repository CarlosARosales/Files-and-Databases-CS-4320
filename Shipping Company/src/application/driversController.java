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


public class driversController implements Initializable{
	
	
	@FXML
	private TableView<DriversTable> tblDrivers;
	
	@FXML
	private TableColumn<DriversTable, String> colDriverID;
	@FXML
	private TableColumn<DriversTable, String> colFirstName;
	@FXML
	private TableColumn<DriversTable, String> colLastName;
	
	
	ObservableList<DriversTable> oblist = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ConnectionClass connectionClass = new ConnectionClass();
		Connection connection = connectionClass.getConnection();
		
		try {
			ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM [Shipping Company].[dbo].[Driver]");
			
			while (rs.next()) {
				oblist.add(new DriversTable(rs.getString("DriverID"), rs.getString("FirstName"), rs.getString("LastName")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		colDriverID.setCellValueFactory(new PropertyValueFactory<>("DriverID"));
		colFirstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
		colLastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
		
		tblDrivers.setItems(oblist);
		
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

	

}
