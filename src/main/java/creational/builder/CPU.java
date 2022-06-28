package creational.builder;

public class CPU {

    private String motherboard;
    private String ram;
    private String rom;
    private String processor;

    public String getMotherboard() {
        return motherboard;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public String getProcessor() {
        return processor;
    }

    private CPU() {}

    public static class CPUBuilder {
        private String motherboard;
        private String ram;
        private String rom;
        private String processor;

        public CPUBuilder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public CPUBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public CPUBuilder rom(String rom) {
            this.rom = rom;
            return this;
        }
        public CPUBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public CPU build() {
            CPU cpu = new CPU();

            cpu.motherboard = this.motherboard;
            cpu.ram = this.ram;
            cpu.rom = this.rom;
            cpu.processor = this.processor;

            return cpu;
        }

    }

    @Override
    public String toString() {
        return "CPU{" +
                "motherboard='" + motherboard + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
