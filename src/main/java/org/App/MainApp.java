//package org.App;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class MainApp extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        // טוען את ה-FXML
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/wine_view.fxml"));
//        StackPane root = loader.load();
//
//        // יצירת סצנה והצגתה
//        Scene scene = new Scene(root, 800, 600);
//        primaryStage.setTitle("Wine Catalog");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//
//import javafx.collections.ObservableList;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class HelloApplication implements Initializable {
//
//    @FXML
//    private TableView<wineData> tableView;
//
//    @FXML
//    private TableColumn<wineData, String> fixedAcidityColumn;
//    @FXML
//    private TableColumn<wineData, String> volatileAcidityColumn;
//    @FXML
//    private TableColumn<wineData, String> citricAcidColumn;
//    @FXML
//    private TableColumn<wineData, String> residualSugarColumn;
//    @FXML
//    private TableColumn<wineData, String> chloridesColumn;
//    @FXML
//    private TableColumn<wineData, String> freeSulfurColumn;
//    @FXML
//    private TableColumn<wineData, String> totalSulfurColumn;
//    @FXML
//    private TableColumn<wineData, String> densityColumn;
//    @FXML
//    private TableColumn<wineData, String> pHColumn;
//    @FXML
//    private TableColumn<wineData, String> sulphatesColumn;
//    @FXML
//    private TableColumn<wineData, String> alcoholColumn;
//    @FXML
//    private TableColumn<wineData, String> qualityColumn;
//    @FXML
//    private TableColumn<wineData, String> colorColumn;
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        // Bind columns to wineData properties
//        fixedAcidityColumn.setCellValueFactory(new PropertyValueFactory<>("fixedAcidity"));
//        volatileAcidityColumn.setCellValueFactory(new PropertyValueFactory<>("volatileAcidity"));
//        citricAcidColumn.setCellValueFactory(new PropertyValueFactory<>("citricAcid"));
//        residualSugarColumn.setCellValueFactory(new PropertyValueFactory<>("residualSugar"));
//        chloridesColumn.setCellValueFactory(new PropertyValueFactory<>("chlorides"));
//        freeSulfurColumn.setCellValueFactory(new PropertyValueFactory<>("freeSulfurDioxide"));
//        totalSulfurColumn.setCellValueFactory(new PropertyValueFactory<>("totalSulfurDioxide"));
//        densityColumn.setCellValueFactory(new PropertyValueFactory<>("density"));
//        pHColumn.setCellValueFactory(new PropertyValueFactory<>("pH"));
//        sulphatesColumn.setCellValueFactory(new PropertyValueFactory<>("sulphates"));
//        alcoholColumn.setCellValueFactory(new PropertyValueFactory<>("alcohol"));
//        qualityColumn.setCellValueFactory(new PropertyValueFactory<>("quality"));
//        colorColumn.setCellValueFactory(new PropertyValueFactory<>("color"));
//
//        // Load data into TableView
//        DBConnection dbConnection = new DBConnection();
//        ObservableList<wineData> data = dbConnection.getDataFromDatabase();
//        tableView.setItems(data);
//    }
//}