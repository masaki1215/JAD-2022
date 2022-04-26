package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Practice3_1 extends javafx.application.Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		TextField inputForm = new TextField();
		TextArea outputArea = new TextArea();
		BorderPane borderPane = new BorderPane();// コンテナ作成
		borderPane.setTop(inputForm);
		borderPane.setCenter(outputArea);
		Scene scene = new Scene(borderPane, 200, 100);//
		stage.setScene(scene); // シーンをステージへ追加
		stage.show(); // ステージを表示
		
		inputForm.setOnAction((e) -> {
			outputArea.setText(outputArea.getText()+inputForm.getText());
		});
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
