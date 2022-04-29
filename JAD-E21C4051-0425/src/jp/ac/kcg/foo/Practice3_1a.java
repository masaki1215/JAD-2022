package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practice3_1a extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		TextField heightInput = new TextField();
		heightInput.setPromptText("身長");
		TextField weightInput = new TextField();
		weightInput.setPromptText("体重");
		Button calcButton = new Button("計算");
		Label bmiOutput = new Label();
		VBox vbox = new VBox();
		BorderPane root = new BorderPane();
		vbox.getChildren().addAll(heightInput, weightInput, calcButton, bmiOutput);
		root.setCenter(vbox);
		Scene scene = new Scene(root, 250, 200);
		stage.setScene(scene);
		stage.show();

		calcButton.setOnAction((e) -> {
			double BMI = 10000 * Integer.parseInt(weightInput.getText())
					/ Math.pow(Integer.parseInt(heightInput.getText()), 2.0);

			String judgement = "";
			if (BMI >= 25) {
				judgement = "【肥満】";
			} else if (BMI < 18.5) {
				judgement = "【痩せ】";
			} else {
				judgement = "【標準体重】";
			}
			bmiOutput.setText("BMI = " + ((double) Math.round(BMI * 10)) / 10 + judgement);
		});
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
