package creational.builder;

public class Computer {

    private CPU cpu;
    private String keyboard;
    private String mouse;
    private String monitor;

    public CPU getCpu() {
        return cpu;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    private Computer(){}

    public static class ComputerBuilder {
        private CPU cpu;
        private String keyboard;
        private String mouse;
        private String monitor;

        public ComputerBuilder cpu(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder mouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public ComputerBuilder monitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer();

            if (this.cpu != null) {
                computer.cpu = this.cpu;
            } else {
                throw new IllegalArgumentException("CPU cannot be null!");
            }
            computer.monitor = this.monitor;
            computer.keyboard = this.keyboard;
            computer.mouse = this.mouse;

            return computer;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }
}
