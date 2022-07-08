module ru.vk.level2_lesson5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vk.level2_lesson5 to javafx.fxml;
    exports ru.vk.level2_lesson5;
}