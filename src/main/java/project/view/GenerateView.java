package project.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javax.imageio.ImageIO;

public class GenerateView implements FXComponent {

  // TODO: add controller as a private final variable and create its constructor

  @Override
  public Parent render() throws IOException {
    /** Create overarching GUI layout **/
    BorderPane layout = new BorderPane();

    /** Setting a background image **/
    FileInputStream inputStream = new FileInputStream("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/java/project/view/sunset.jpg");
    Image image = new Image(inputStream);
    BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
    Background background = new Background(backgroundImage);
    layout.setBackground(background);

    /** Creating a title section **/
    VBox title = new VBox();
    // -- Title Name --
    Text titleName = new Text("Hyper-Generic Motivational Picture Generator");
    titleName.setFont(Font.font(30));
    titleName.setTextAlignment(TextAlignment.CENTER);
    // -- My Name --
    Text name = new Text("GUI created by Peter Jackson");
    name.setFont(Font.font(15));
    name.setTextAlignment(TextAlignment.CENTER);
    // -- Add children to VBox layout and change its characteristics --
    title.getChildren().addAll(titleName, name);
    title.setAlignment(Pos.CENTER);
    title.setPadding(new Insets(30));
    // -- Add children to VBox layout --
    layout.setTop(title);

    /** Create button and add attributes **/
    Button generate = new Button("Generate");
    generate.setAlignment(Pos.CENTER);
    generate.setStyle("-fx-background-color: #FFFFFF;");
    generate.setMinSize(200, 60);
    generate.setFont(Font.font(20));
    // -- Add button child to BorderPane layout --
    layout.setCenter(generate);

    return layout;
  }
}
