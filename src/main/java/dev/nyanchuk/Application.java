package dev.nyanchuk;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.nyanchuk.models.Computer;
import dev.nyanchuk.models.OperatingSystem;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 // Create a computer with the enum value for operating system
        Computer computer1 = new Computer(1, "Dell", 16, "Intel i7", OperatingSystem.MS_WINDOWS, 1200);
        Computer computer2 = new Computer(2, "Apple", 8, "M1", OperatingSystem.APPLE_MACOS, 1500);

        // Display the information of both computers
        computer1.displayInfo();
        System.out.println();
        computer2.displayInfo();
	}

}
