package idcard.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LoginView extends Application {

    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();

        Path loginPage = findLoginPage();
        if (loginPage != null) {
            webView.getEngine().load(loginPage.toUri().toString());
        } else {
            webView.getEngine().loadContent("<html><body><h2>Login page not found.</h2></body></html>");
        }

        Scene scene = new Scene(webView, 1000, 650);

        stage.setTitle("ID Card Generator");
        stage.setScene(scene);
        stage.show();
    }

    private Path findLoginPage() {
        Path[] candidates = new Path[] {
                Paths.get("resources", "html", "login.html"),
                Paths.get("..", "resources", "html", "login.html")
        };

        for (Path candidate : candidates) {
            Path normalizedPath = candidate.toAbsolutePath().normalize();
            if (Files.exists(normalizedPath)) {
                return normalizedPath;
            }
        }

        return null;
    }
}
