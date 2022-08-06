package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane border = new BorderPane();
        Label text1 = new Label("NORTH");
        Label text2 = new Label("SOUTH");
        border.setTop(text1);
        border.setBottom(text2);
        border.setRight(new Label("EAST"));
        Scene scene = new Scene(border);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    

}
