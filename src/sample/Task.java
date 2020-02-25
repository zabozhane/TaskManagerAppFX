package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Task {
    private SimpleIntegerProperty nr = new SimpleIntegerProperty();
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty description = new SimpleStringProperty();
    private SimpleStringProperty priority = new SimpleStringProperty();


    public Task(SimpleIntegerProperty nr, SimpleStringProperty name, SimpleStringProperty description, SimpleStringProperty priority) {
        this.nr = nr;
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public int getNr() {
        return nr.get();
    }

    public SimpleIntegerProperty nrProperty() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr.set(nr);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getPriority() {
        return priority.get();
    }

    public SimpleStringProperty priorityProperty() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority.set(priority);
    }
}
