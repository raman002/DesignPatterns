package creational.builder;

public class BuilderPattern {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder()
				.cpu(new CPU.CPUBuilder()
						.motherboard("intel")
						.rom("500 GB SSD")
						.ram("32 GB DDR4")
						.processor("AMD Ryzen 9")
						.build())
				.monitor("Gigabyte")
				.mouse("Logitech")
				.keyboard("Mechanical Keyboard")
				.build();

		System.out.println(computer);

	}
}
