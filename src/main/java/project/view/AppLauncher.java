package project.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project.ImagePathLibrary;
import project.QuoteLibrary;
import project.controller.Controller;
import project.controller.ControllerImpl;
import project.model.Model;
import project.model.ModelImpl;

public class AppLauncher extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    // Include model
    Model model = new ModelImpl(ImagePathLibrary.createPaths(), QuoteLibrary.createQuotes());

    // Include controller
    Controller controller = new ControllerImpl(model);

    // Include view
    View view = new View(controller);

    // Make scene
    stage.setScene(new Scene(view.render(), 800, 600));

    // Add observers for refresh (using lambda function)
    model.addObserver((Model m) -> stage.setScene(new Scene(view.render(), 800, 600)));

    // Project the GUI
    stage.setTitle("Winter Project");
    stage.show();
  }
}
