package project.view;

import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import project.controller.Controller;

public class View implements FXComponent {

  private final Controller controller;

  public View (Controller controller) { this.controller = controller; }

  @Override
  public Parent render() throws IOException {
    BorderPane layout = new BorderPane();

    if (controller.getPage() == 0) {
      GenerateView gv = new GenerateView(controller);
      layout.setCenter(gv.render());
    } else if (controller.getPage() == 1){
      DisplayView dv = new DisplayView(controller);
      layout.setCenter(dv.render());
    }

    return layout;
  }
}
