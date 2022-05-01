package jp.ac.kcg.foo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Practice3_2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		TextField textInput = new TextField();
		ListView<String> textList = new ListView<String>();
		textList.setEditable(true);
		textList.setCellFactory(TextFieldListCell.forListView());
		BorderPane root = new BorderPane();
		root.setTop(textInput);
		root.setCenter(textList);
		Scene scene = new Scene(root, 300, 200);
		stage.setScene(scene);
		stage.show();

		textInput.setOnAction((e) -> {
			textList.getItems().addAll(textInput.getText());
			textInput.setText("");
		});
		textList.setOnEditCommit((e) -> {
			textList.getItems().set(e.getIndex(), e.getNewValue());
		});
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
