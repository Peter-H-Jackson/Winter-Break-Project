package project.view;

import java.awt.DisplayMode;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    // TODO: Include model

    // TODO: Include controller

    // Include view
    // -- Generate --
    GenerateView generateView = new GenerateView();
    // -- Display --
    DisplayView displayView = new DisplayView();

    // Make scene
    stage.setScene(new Scene(generateView.render(), 800, 600));

    // TODO: Add observers for refresh (using lambda function)

    // Project the GUI
    stage.setTitle("Winter Project");
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
