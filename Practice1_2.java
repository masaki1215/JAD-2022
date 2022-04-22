package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Practice1_2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Button helloButton = new Button("こんにちは、世界！"); // ボタンを作成
		BorderPane root = new BorderPane(); // BorderPaneコンテナを作成
		root.setCenter(helloButton); // ボタンを BorderPane コンテナへ追加
		// BorderPaneコンテナを追加したシーンを作成
		Scene scene = new Scene(root, 300, 100);
		stage.setScene(scene); // シーンをステージへ追加
		stage.show(); // ステージを表示

		helloButton.setOnAction((e) -> {
			System.out.println("Hello, world!");
		});
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
