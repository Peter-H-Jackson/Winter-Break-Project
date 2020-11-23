package project.view;

import java.io.IOException;
import javafx.scene.Parent;

public interface FXComponent {

  /** Renders the component and returns the resulting Parent object **/
  Parent render() throws IOException;
}
