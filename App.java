import java.io.FileNotFoundException;
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    private double TCH, SCH;
    private double cgpa, sgpa;

    private double getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.0;
            case "A":
                return 4.0;
            case "A-":
                return 3.67;
            case "B+":
                return 3.33;
            case "B":
                return 3.0;
            case "B-":
                return 2.67;
            case "C+":
                return 2.33;
            case "C":
                return 2.0;
            case "C-":
                return 1.67;
            case "D+":
                return 1.33;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a grid pane for layout
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // GridPane gridpane = new GridPane();
        // Image image = new Image("F:\\image\\wallpaper.jpg");
        // gridpane.getChildren().add(new ImageView(image));

        // InputStream stream = new FileInputStream("F:\\image\\wallpaper.jpg");
        // Image image = new Image(stream);
        // ImageView imageView = new ImageView(image);

        // Create labels and text fields for grade input
        TextField subjectLabel1 = new TextField("Subject 1:");
        TextField subjectField1 = new TextField();
        TextField subjectCH1 = new TextField();
        TextField subjectLabel2 = new TextField("Subject 2:");
        TextField subjectField2 = new TextField();
        TextField subjectCH2 = new TextField();
        TextField subjectLabel3 = new TextField("Subject 3:");
        TextField subjectField3 = new TextField();
        TextField subjectCH3 = new TextField();
        TextField subjectLabel4 = new TextField("Subject 4:");
        TextField subjectField4 = new TextField();
        TextField subjectCH4 = new TextField();
        TextField subjectLabel5 = new TextField("Subject 5:");
        TextField subjectField5 = new TextField();
        TextField subjectCH5 = new TextField();
        TextField subjectLabel6 = new TextField("Subject 6:");
        TextField subjectField6 = new TextField();
        TextField subjectCH6 = new TextField();
        TextField subjectLabel7 = new TextField("Subject 7:");
        TextField subjectField7 = new TextField();
        TextField subjectCH7 = new TextField();
        Label l1 = new Label("Grades");
        Label l2 = new Label("CreditHours");
        Label l3 = new Label("SGPA");
        Label l4 = new Label("Semester CH");

        TextField Sgpa = new TextField();
        TextField SemesterCH = new TextField();

        // Add labels and text fields to the grid pane
        gridPane.add(l1, 1, 0);
        gridPane.add(l2, 2, 0);
        gridPane.add(subjectLabel1, 0, 1);
        gridPane.add(subjectField1, 1, 1);
        gridPane.add(subjectCH1, 2, 1);
        gridPane.add(subjectLabel2, 0, 2);
        gridPane.add(subjectField2, 1, 2);
        gridPane.add(subjectCH2, 2, 2);
        gridPane.add(subjectLabel3, 0, 3);
        gridPane.add(subjectField3, 1, 3);
        gridPane.add(subjectCH3, 2, 3);
        gridPane.add(subjectLabel4, 0, 4);
        gridPane.add(subjectField4, 1, 4);
        gridPane.add(subjectCH4, 2, 4);
        gridPane.add(subjectLabel5, 0, 5);
        gridPane.add(subjectField5, 1, 5);
        gridPane.add(subjectCH5, 2, 5);
        gridPane.add(subjectLabel6, 0, 6);
        gridPane.add(subjectField6, 1, 6);
        gridPane.add(subjectCH6, 2, 6);
        gridPane.add(subjectLabel7, 0, 7);
        gridPane.add(subjectField7, 1, 7);
        gridPane.add(subjectCH7, 2, 7);

        // Create a button to calculate the CGPA
        Button calculateButton = new Button("CGPA");
        Button newCGPA = new Button("new CGPA");

        // Create a label to display the CGPA
        Label cgpaLabel = new Label();
        Label newCgpaLabel = new Label();

        // Add the button and CGPA label to the grid pane
        gridPane.add(calculateButton, 1, 8);
        gridPane.add(cgpaLabel, 1, 9);

        gridPane.add(l4, 2, 11);
        gridPane.add(l3, 1, 11);
        gridPane.add(newCGPA, 0, 12);
        gridPane.add(Sgpa, 1, 12);
        gridPane.add(SemesterCH, 2, 12);
        gridPane.add(newCgpaLabel, 0, 13);

        // Set the action for the calculate button
        calculateButton.setOnAction(event -> {
            // Get the grades entered by the user
            double grade1 = getGradePoint(subjectField1.getText());
            double grade2 = getGradePoint(subjectField2.getText());
            double grade3 = getGradePoint(subjectField3.getText());
            double grade4 = getGradePoint(subjectField4.getText());
            double grade5 = getGradePoint(subjectField5.getText());
            double grade6 = getGradePoint(subjectField6.getText());
            double grade7 = getGradePoint(subjectField7.getText());

            double Ch1 = Double.parseDouble(subjectCH1.getText());
            double Ch2 = Double.parseDouble(subjectCH2.getText());
            double Ch3 = Double.parseDouble(subjectCH3.getText());
            double Ch4 = Double.parseDouble(subjectCH4.getText());
            double Ch5 = Double.parseDouble(subjectCH5.getText());
            double Ch6 = Double.parseDouble(subjectCH6.getText());
            double Ch7 = Double.parseDouble(subjectCH7.getText());
            TCH = Ch1 + Ch2 + Ch3 + Ch4 + Ch5 + Ch6 + Ch7;

            // Calculate the CGPA
            cgpa = (grade1 * Ch1 + grade2 * Ch2 + grade3 * Ch3 + grade4 * Ch4 + grade5 * Ch5 + grade6 * Ch6
                    + grade7 * Ch7) / TCH;
            DecimalFormat df2 = new DecimalFormat(".##");
            double formatDecimal = new Double(df2.format(cgpa)).doubleValue();

            // Display the CGPA
            cgpaLabel.setText("CGPA: " + formatDecimal);
        });

        newCGPA.setOnAction(event -> {
            sgpa = Double.parseDouble(Sgpa.getText());
            SCH = Double.parseDouble(SemesterCH.getText());

            cgpa = ((cgpa * TCH) + (sgpa * SCH)) / (TCH + SCH);
            DecimalFormat df2 = new DecimalFormat(".##");
            double formatDecimal = new Double(df2.format(cgpa)).doubleValue();
            newCgpaLabel.setText("CGPA: " + formatDecimal);
        });

        // Create a scene and set it on the stage
        Scene scene = new Scene(gridPane, 333, 485);
        primaryStage.setTitle("CGPA Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}