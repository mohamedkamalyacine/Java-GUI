package WelcomeMesg;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class WelcomeMesg extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        Text t = new Text("Mohamed Kamal - IoT intake 43");
        t.setId("t");
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        t.setEffect(r);
        Rectangle rect = new Rectangle(0,0,800,400);
        rect.setId("r1");
        StackPane root = new StackPane();
        root.getChildren().add(rect);
        root.getChildren().add(t);
        Scene scene = new Scene(root, 800, 400);
         scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        primaryStage.setTitle("Welcome Boss");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}