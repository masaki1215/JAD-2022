package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Practice1_2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Button helloButton = new Button("こんにちは、世界！"); // ボタンを作成
		Button rightButton = new Button("右"); // ボタンを作成
		Button leftButton = new Button("左"); // ボタンを作成
		BorderPane root = new BorderPane(); // BorderPaneコンテナを作成
		BorderPane.setAlignment(leftButton, Pos.CENTER_LEFT);
		BorderPane.setMargin(leftButton, new Insets(0, 0, 0, 20));
		BorderPane.setAlignment(rightButton, Pos.CENTER_RIGHT);
		BorderPane.setMargin(rightButton, new Insets(0, 20, 0, 0));
		root.setCenter(helloButton); // ボタンを BorderPane コンテナへ追加
		root.setLeft(leftButton);
		root.setRight(rightButton);
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
