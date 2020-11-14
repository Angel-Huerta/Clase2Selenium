package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo Cool Testers");
		
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; //seteando el path del driver.
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Identificando el .exe para el driver.
		WebDriver driver = new ChromeDriver(); //Creación en tiempo de ejecución en el ChromeDriver.
		driver.get("https://www.instagram.com/anspeld/"); //Abriendo la URL especificada.

	}

}
