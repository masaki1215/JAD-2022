package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Practice1_2b extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Button centerButton = new Button("中心"); // ボタンを作成
		Button rightButton = new Button("右"); // ボタンを作成
		Button leftButton = new Button("左"); // ボタンを作成
		BorderPane root = new BorderPane(); // BorderPaneコンテナを作成
		BorderPane.setAlignment(leftButton, Pos.TOP_LEFT);
		BorderPane.setMargin(leftButton, new Insets(20, 0, 0, 20));
		BorderPane.setAlignment(rightButton, Pos.TOP_RIGHT);
		BorderPane.setMargin(rightButton, new Insets(20, 20, 0, 0));
		BorderPane.setAlignment(centerButton, Pos.TOP_CENTER);
		BorderPane.setMargin(centerButton, new Insets(20, 0, 0, 0));
		Circle circle = new Circle();
		root.setCenter(centerButton); // ボタンを BorderPane コンテナへ追加
		root.setLeft(leftButton);
		root.setRight(rightButton);
		// BorderPaneコンテナを追加したシーンを作成
		Scene scene = new Scene(root, 300, 300);
		stage.setScene(scene); // シーンをステージへ追加
		stage.show(); // ステージを表示

		centerButton.setOnAction((e) -> {
			root.setBottom(circle);
			circle.setCenterX(100.0f);
			circle.setCenterY(100.0f);
			circle.setRadius(50.0f);
		});
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
