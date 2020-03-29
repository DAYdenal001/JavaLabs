package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;

public class Controller {
    private ObservableList<Intern> internData = FXCollections.observableArrayList();

    @FXML
    private ChoiceBox<String> parametrSelect;

    @FXML
    private TextField textVew;

    @FXML
    private TableView<Intern> table;

    @FXML
    private TableColumn<Intern, String> firstName;

    @FXML
    private TableColumn<Intern, String> secondName;

    @FXML
    private TableColumn<Intern, Integer> salary;

    @FXML
    private TableColumn<Intern, Integer> hours;

    @FXML
    private TableColumn<Intern, String> department;


    @FXML
    private void initialize() {
        ObservableList<String> fields = FXCollections.observableArrayList("Имя", "Фамилия", "Зарплата", "Рабочие часы", "Отдел");
        parametrSelect.setItems(fields);

        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        secondName.setCellValueFactory(new PropertyValueFactory<>("secondName"));
        salary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        hours.setCellValueFactory(new PropertyValueFactory<>("hours"));
        department.setCellValueFactory(new PropertyValueFactory<>("department"));

        internData.add(new Intern("Ivan","Ivanov",30000,40,"Dev"));
        internData.add(new Intern("Petrov","Petr",50000,35,"Design"));
        internData.add(new Intern("Gordienko","Nastya",15000,45,"Manager"));
        internData.add(new Intern("Semenov","Semenov",90000,20,"Admin"));
        internData.add(new Intern("Petrov","Petr",50000,35,"Design"));
        internData.add(new Intern("Gordienko","Nastya",15000,45,"Manager"));

        FilteredList<Intern> filteredData = new FilteredList<>(internData, b -> true);
        textVew.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(intern -> {
                // Если текст фильтра пуст, показать всех интернов.

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                switch (parametrSelect.getValue()) {
                    case "Имя":
                        return intern.getFirstName().toLowerCase().indexOf(lowerCaseFilter) != -1;

                    case "Фамилия":
                        return intern.getSecondName().toLowerCase().indexOf(lowerCaseFilter) != -1;
                    case "Зарплата":
                        return String.valueOf(intern.getSalary()).indexOf(lowerCaseFilter) != -1;
                    case "Рабочие часы":
                        return String.valueOf(intern.getHours()).indexOf(lowerCaseFilter) != -1;
                    case "Отдел":
                        return intern.getDepartment().toLowerCase().indexOf(lowerCaseFilter) != -1;
                    default:
                        System.out.println();
                }
                return false;
            });
        });
        // 3. Оберните FilteredList в SortedList.
        SortedList<Intern> sortedData = new SortedList<>(filteredData);

        // 4. Свяжите компаратор SortedList с компаратором TableView.
        // В противном случае сортировка TableView не будет иметь никакого эффекта.
        sortedData.comparatorProperty().bind(table.comparatorProperty());

        // 5. Добавить отсортированные (и отфильтрованные) данные в таблицу.
        table.setItems(sortedData);
    }
}
