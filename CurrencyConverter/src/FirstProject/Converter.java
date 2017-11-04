package FirstProject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Converter extends Application {

	final Label[] labelsForText = new Label[4];
	final TextField fieldForInput = new TextField();
	final TextField fieldForResult = new TextField();
	final Button calcButton = new Button("Розрахувати");
	final Button clearButton = new Button("Очистити");
	final ComboBox<String> chooseCurrency = new ComboBox<String>();
	final ComboBox<String> resultCurrency = new ComboBox<String>();
	private String[] stringsForParsing = new String[7];
	private double[] doublesForParsing = new double[7];

	public static double convertFromUSDtoUAH(double a) {
		double course = 26.97;
		return a * course;
	}

	public static double convertFromEURtoUAH(double a) { // +
		double course = 31.42;
		return a * course;
	}

	public static double convertFromUAHtoUSD(double a) {
		double course = 0.041;
		return a * course;
	}

	public static double convertFromUAHtoEUR(double a) { // +
		double course = 0.032;
		return a * course;
	}

	public static double convertFromEURtoUSD(double a) {
		double course = 1.17;
		return a * course;
	}

	public static double convertFromUSDtoEUR(double a) {
		double course = 0.86;
		return a * course;
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Валютний конвертор");
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(30);
		grid.setVgap(10);
		Scene scene = new Scene(grid, 400, 250);
		stage.setScene(scene);
		stage.show();

		chooseCurrency.getItems().addAll("UAH - гривня", "USD - доллар", "EUR - євро");
		chooseCurrency.setPrefSize(150, 20);
		resultCurrency.getItems().addAll("UAH - гривня", "USD - доллар", "EUR - євро");
		resultCurrency.setPrefSize(150, 20);
		calcButton.setPrefSize(130, 40);
		clearButton.setPrefSize(130, 40);

		grid.add(new Label("Введіть суму"), 0, 0);
		grid.add(new Label("Результат"), 2, 0);
		grid.add(new Label("Оберіть валюту"), 0, 2);
		grid.add(new Label("Конвертувати в"), 2, 2);
		grid.add(chooseCurrency, 0, 3);
		grid.add(resultCurrency, 2, 3);
		grid.add(fieldForInput, 0, 1);
		grid.add(fieldForResult, 2, 1);
		grid.add(calcButton, 0, 6);
		grid.add(clearButton, 2, 6);

		calcButton.setOnAction(event -> {
			stringsForParsing[0] = fieldForInput.getText();
			try {
				doublesForParsing[0] = Double.parseDouble(stringsForParsing[0]);
				if (chooseCurrency.getValue() == "USD - доллар" && resultCurrency.getValue() == "UAH - гривня") {
					doublesForParsing[1] = convertFromUSDtoUAH(doublesForParsing[0]);
					stringsForParsing[1] = Double.toString(doublesForParsing[1]);
					fieldForResult.setText(stringsForParsing[1] + "UAH");
				} else if (chooseCurrency.getValue() == "EUR - євро" && resultCurrency.getValue() == "UAH - гривня") {
					doublesForParsing[2] = convertFromEURtoUAH(doublesForParsing[0]);
					stringsForParsing[2] = Double.toString(doublesForParsing[2]);
					fieldForResult.setText(stringsForParsing[2] + "UAH");
				} else if (chooseCurrency.getValue() == "UAH - гривня" && resultCurrency.getValue() == "USD - доллар") {
					doublesForParsing[3] = convertFromUAHtoUSD(doublesForParsing[0]);
					stringsForParsing[3] = Double.toString(doublesForParsing[3]);
					fieldForResult.setText(stringsForParsing[3] + "USD");
				} else if (chooseCurrency.getValue() == "UAH - гривня" && resultCurrency.getValue() == "EUR - євро") {
					doublesForParsing[4] = convertFromUAHtoEUR(doublesForParsing[0]);
					stringsForParsing[4] = Double.toString(doublesForParsing[4]);
					fieldForResult.setText(stringsForParsing[4] + "EUR");
				} else if (chooseCurrency.getValue() == "EUR - євро" && resultCurrency.getValue() == "USD - доллар") {
					doublesForParsing[5] = convertFromEURtoUSD(doublesForParsing[0]);
					stringsForParsing[5] = Double.toString(doublesForParsing[5]);
					fieldForResult.setText(stringsForParsing[5] + "USD");
				} else if (chooseCurrency.getValue() == "USD - доллар" && resultCurrency.getValue() == "EUR - євро") {
					doublesForParsing[6] = convertFromUSDtoEUR(doublesForParsing[0]);
					stringsForParsing[6] = Double.toString(doublesForParsing[6]);
					fieldForResult.setText(stringsForParsing[6] + "EUR");
				}
			} catch (Exception e) {

				System.out.println("Введіть число в строку для вводу!");
			}

		});
		clearButton.setOnAction(event -> {
			fieldForInput.clear();
			fieldForResult.clear();

		});

	}

}
