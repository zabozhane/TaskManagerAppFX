package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    public TableView<Task> taskTable;
    public static int number = 0;
    public TextField taskName;
    public TextField taskDescription;
    public TextField taskPriority;

    public void add(ActionEvent actionEvent) {
        String name = taskName.getText();
        String description = taskDescription.getText();
        String priority = taskPriority.getText();
        Task task = new Task(new SimpleIntegerProperty(number)
                            ,new SimpleStringProperty(name)
                            ,new SimpleStringProperty(description)
                            ,new SimpleStringProperty(priority));

        taskTable.getItems().add(task);
        number++;
    }
}
