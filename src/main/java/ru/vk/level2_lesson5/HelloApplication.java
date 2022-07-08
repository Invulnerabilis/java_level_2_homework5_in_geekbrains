package ru.vk.level2_lesson5;

/*
Java. Уровень 2. Урок 5. "JavaFX. Продвинутые вопросы создания графического интерфейса"

Создать окно для клиентской части чата:
Большое текстовое поле для отображения переписки в центре окна.
Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
При «отсылке» сообщение перекидывается из нижнего поля в центральное.
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome to the chat room!");
        stage.setScene(scene);
        stage.setX(750);
        stage.setY(220);
        stage.setMinWidth(570);
        stage.setMinHeight(373);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}