package calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;
    private TextField sisi;
    private TextField tinggi;
    private TextField jarijari;
    private Label hasilVolume;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        scene1();
        stage.show();
    }

    private void scene1() {
        Image image = new Image("/logoo.png");
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        HBox hBox2 = new HBox(imageView);
        hBox2.setAlignment(Pos.CENTER);

        Label label = new Label("Kalkulator Geometri");
        label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 30px; -fx-font-weight: bold;");
        label.setTextFill(Color.web("#FFFFFF"));
        HBox hBox1 = new HBox(label);
        hBox1.setAlignment(Pos.CENTER);

        Button button = new Button("MENU");
        button.setStyle("-fx-background-color: #FFD95A;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px 110px;-fx-font-size: 20px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        button.setTextFill(Color.web("#FFFFFF"));
        button.setOnAction(v -> {scene2();});
        HBox hBox3 = new HBox(button);
        hBox3.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(20, hBox1, hBox2, hBox3);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: BLACK;");

        Scene scene1 = new Scene(vBox,620, 620);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(scene1);
    }

    private void scene2() {
        Label label = new Label("PILIH MENU");
        label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 35px; -fx-font-weight: bold;");
        label.setTextFill(Color.web("#FFFFFF"));
        HBox hBox1 = new HBox(label);
        hBox1.setAlignment(Pos.CENTER);

        Button button1 = new Button("KUBUS");
        button1.setStyle("-fx-background-color: #FFD95A;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px 80px;-fx-font-size: 20px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        button1.setTextFill(Color.web("#FFFFFF"));
        button1.setOnAction(v -> {sceneKubus();});
        HBox hBox2 = new HBox(button1);
        hBox2.setAlignment(Pos.CENTER);

        Button button2 = new Button("TABUNG");
        button2.setStyle("-fx-background-color: #FFD95A;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px 72px;-fx-font-size: 20px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        button2.setTextFill(Color.web("#FFFFFF"));
        button2.setOnAction(v -> {sceneTabung();});
        HBox hBox3 = new HBox(button2);
        hBox3.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(15, hBox1, hBox2, hBox3);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: BLACK;");

        Scene scene2 = new Scene(vBox,620, 620);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(scene2);
    }

    private void sceneKubus() {
        Label label = new Label("KUBUS");
        label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 29px; -fx-font-weight: bold;");
        label.setTextFill(Color.web("#FFFFFF"));
        HBox hBox1 = new HBox(label);
        hBox1.setAlignment(Pos.CENTER);

        Text sisiii = new Text("Sisi:");
        sisiii.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 25px; -fx-font-weight: bold");
        sisiii.setFill(Color.web("#FFFFFF"));
        HBox hBox2 = new HBox(sisiii);
        hBox2.setAlignment(Pos.CENTER);

        sisi = new TextField();
        sisi.setPromptText("Masukkan sisi kubus");
        sisi.setStyle("-fx-padding: 1px 80px;-fx-text-fill:BLACK;-fx-font-weight: bold;-fx-font-size: 15px;-fx-background-color: #FFFAF4; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        sisi.setAlignment(Pos.CENTER);
        HBox hBox3 = new HBox(sisi);
        hBox3.setAlignment(Pos.CENTER);

        hasilVolume = new Label();
        hasilVolume.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 18px;-fx-font-weight: bold;");
        hasilVolume.setTextFill(Color.web("#FFFFFF"));
        HBox hBox5 = new HBox(hasilVolume);
        hBox5.setAlignment(Pos.CENTER);
        
        Button vol =  new Button("VOLUME");
        vol.setStyle("-fx-background-color: #FFD95A;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px;-fx-font-size: 15px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        vol.setTextFill(Color.web("#FFFFFF"));
        vol.setOnAction(e -> {calculateKubus();});
        HBox hBox6 = new HBox(vol);
        hBox6.setAlignment(Pos.CENTER);

        Button clear =  new Button("CLEAR");
        clear.setStyle("-fx-background-color: #9DB2BF;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px;-fx-font-size: 15px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        clear.setTextFill(Color.web("#FFFFFF"));
        clear.setOnAction(e -> {clearFieldsKubus();});
        Button back =  new Button("BACK");
        back.setStyle("-fx-background-color: #9DB2BF;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px;-fx-font-size: 15px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        back.setTextFill(Color.web("#FFFFFF"));
        back.setOnAction(e -> {scene2();});
        HBox hBox7 = new HBox(10, clear, back);
        hBox7.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10, hBox1, hBox2, hBox3, hBox5, hBox6, hBox7);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: BLACK;");

        Scene sceneBalok = new Scene(vBox,620, 620);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(sceneBalok);
    }

    private void sceneTabung() {
        Label label = new Label("TABUNG");
        label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 29px; -fx-font-weight: bold;");
        label.setTextFill(Color.web("#FFFFFF"));
        HBox hBox1 = new HBox(label);
        hBox1.setAlignment(Pos.CENTER);

        Text tinggitbg = new Text("Tinggi:");
        tinggitbg.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 25px; -fx-font-weight: bold;");
        tinggitbg.setFill(Color.web("#FFFFFF"));
        HBox hBox2 = new HBox(tinggitbg);
        hBox2.setAlignment(Pos.CENTER);

        tinggi = new TextField();
        tinggi.setPromptText("Masukkan tinggi tabung");
        tinggi.setStyle("-fx-padding: 1px 80px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-font-weight: bold;-fx-background-color: #FFFAF4; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        tinggi.setAlignment(Pos.CENTER);
        HBox hBox3 = new HBox(tinggi);
        hBox3.setAlignment(Pos.CENTER);

        Text jaritbg = new Text("Jari-jari:");
        jaritbg.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 25px; -fx-font-weight: bold;");
        jaritbg.setFill(Color.web("#FFFFFF"));
        HBox hBox4 = new HBox(jaritbg);
        hBox4.setAlignment(Pos.CENTER);

        jarijari = new TextField();
        jarijari.setPromptText("Masukkan jari-jari tabung");
        jarijari.setStyle("-fx-padding: 1px 80px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-font-weight: bold;-fx-background-color: #FFFAF4; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        jarijari.setAlignment(Pos.CENTER);
        HBox hBox5 = new HBox(jarijari);
        hBox5.setAlignment(Pos.CENTER);

        hasilVolume = new Label();
        hasilVolume.setStyle("-fx-font-family: 'Arial';-fx-font-weight: bold; -fx-font-size: 18px;");
        hasilVolume.setTextFill(Color.web("#FFFFFF"));
        HBox hBox6 = new HBox(hasilVolume);
        hBox6.setAlignment(Pos.CENTER);
        
        Button vol =  new Button("VOLUME");
        vol.setStyle("-fx-background-color: #FFD95A;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px;-fx-font-size: 15px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        vol.setTextFill(Color.web("#FFFFFF"));
        vol.setOnAction(e -> {calculateTabung();});
        HBox hBox7 = new HBox(vol);
        hBox7.setAlignment(Pos.CENTER);

        Button clear =  new Button("CLEAR");
        clear.setStyle("-fx-background-color: #9DB2BF;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px;-fx-font-size: 15px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        clear.setTextFill(Color.web("#FFFFFF"));
        clear.setOnAction(e -> {clearFieldsTabung();});
        Button back =  new Button("BACK");
        back.setStyle("-fx-background-color: #9DB2BF;-fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-padding: 10px;-fx-font-size: 15px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-background-radius: 30px; -fx-border-radius: 30;");
        back.setTextFill(Color.web("#FFFFFF"));
        back.setOnAction(e -> {scene2();});
        HBox hBox8 = new HBox(10, clear, back);
        hBox8.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7, hBox8);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: BLACK;");

        Scene sceneTabung = new Scene(vBox,620, 620);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(sceneTabung);
    }

    private void calculateTabung() {
        try {
            double tinggii = Double.parseDouble(tinggi.getText());
            double jari = Double.parseDouble(jarijari.getText());
            double volume = tinggii * Math.PI * Math.pow(jari, 2);
            hasilVolume.setText(volume + " cm");
        } catch (Exception e) {
            hasilVolume.setText("Masukkan angka yang valid");
        }
    }

    private void calculateKubus() {
        try {
            double panjangSisi = Double.parseDouble(sisi.getText());
            double volume = panjangSisi * panjangSisi * panjangSisi;
            hasilVolume.setText(volume + " cm");
        } catch (Exception e) {
            hasilVolume.setText("Masukkan angka yang valid");
        }
    }

    private void clearFieldsKubus() {
        sisi.clear();
        hasilVolume.setText("");
    }

    private void clearFieldsTabung() {
        tinggi.clear();
        jarijari.clear();
        hasilVolume.setText("");
    }
}