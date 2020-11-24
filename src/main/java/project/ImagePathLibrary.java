package project;

import java.util.ArrayList;

public class ImagePathLibrary {

  private static ArrayList<String> imagePaths;

  /** Image Paths **/
  // Create image paths
  public static ArrayList<String> createPaths() {
    if (imagePaths == null) {
      populateImagePaths();
    }
    return imagePaths;
  }
  // Initialize image paths
  private static void populateImagePaths() {
    imagePaths = new ArrayList<>();

    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img0.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img1.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img2.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img3.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img4.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img5.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img6.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img7.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img8.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img9.jpg");
    imagePaths.add("C:/Users/peter/Coding-Projects/Winter-Break-Project/src/main/picture-library/img10.jpg");
  }
}
