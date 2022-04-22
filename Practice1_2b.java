package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Practice1_2b extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Button rightButton = new Button("右"); // ボタンを作成
		Button centerButton = new Button("中心"); // ボタンを作成
		Button leftButton = new Button("左"); // ボタンを作成
		BorderPane root = new BorderPane(); // BorderPaneコンテナを作成
		HBox hbox = new HBox();// HBoxコンテナを作成
		HBox.setHgrow(leftButton, Priority.ALWAYS);
		HBox.setHgrow(centerButton, Priority.ALWAYS);
		HBox.setHgrow(rightButton, Priority.ALWAYS);
		leftButton.setMaxWidth(Double.MAX_VALUE);
		centerButton.setMaxWidth(Double.MAX_VALUE);
		rightButton.setMaxWidth(Double.MAX_VALUE);
		hbox.getChildren().addAll(leftButton, centerButton, rightButton);
		root.setTop(hbox);// HBoxコンテナをBorderPaneコンテナに追加
		Circle circle = new Circle(); // Circleの作成
		circle.setRadius(30.0f);
		root.setCenter(circle);
		// BorderPaneコンテナを追加したシーンを作成
		Scene scene = new Scene(root, 250, 250);
		stage.setScene(scene); // シーンをステージへ追加
		stage.show(); // ステージを表示

		centerButton.setOnAction((e) -> {
			BorderPane.setAlignment(circle, Pos.CENTER);
		});

		leftButton.setOnAction((e) -> {
			BorderPane.setAlignment(circle, Pos.CENTER_LEFT);
			BorderPane.setMargin(circle, new Insets(0, 0, 0, 20));
		});

		rightButton.setOnAction((e) -> {
			BorderPane.setAlignment(circle, Pos.CENTER_RIGHT);
			BorderPane.setMargin(circle, new Insets(0, 20, 0, 0));
		});
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
