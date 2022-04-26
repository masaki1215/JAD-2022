package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Practice1_1 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BorderPane root = new BorderPane(); // コンテナ
		root.setCenter(new Button("こんにちは，世界！"));
		Scene scene = new Scene(root, 200, 80);
		stage.setScene(scene);
		stage.show(); // 表示
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
