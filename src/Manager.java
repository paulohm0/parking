import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Manager {

    private Vehicle vehicle;
    private long interval;
    private double value;

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public long getInterval() {
        return interval / 60000 ;
    }

    public void setInterval() {
        this.interval = (vehicle.getEnd() - vehicle.getStart());
    }

    public String getValue() {
        DecimalFormat v = new DecimalFormat("0.00");
        String formatValue = v.format(value);
        return formatValue;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void park (Vehicle vehicle) {
        setVehicle(vehicle);
        vehicle.setStart();
        LocalDateTime horarioExato = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String horarioFormatado = horarioExato.format(formatter);
        System.out.println("O veículo " + vehicle.getModel() + ", com placa " + vehicle.getLicensePlate() +
                           ", estacionou as " + horarioFormatado);
    }

    public void exit (Vehicle vehicle) {
        vehicle.setEnd();
        setInterval();

        if (vehicle.getClass().equals(ResidentVehicle.class)) {
            this.value = getInterval() * 0.05;
            System.out.println("- Carro = " + vehicle.getModel() + "\n" +
                               "- Placa = " + vehicle.getLicensePlate() + "\n" +
                               "- Tempo Estacionado = " + getInterval() + " minutos" + "\n" +
                               "- Valor a Pagar = R$ " + getValue() + "\n");

        } else if (vehicle.getClass().equals(NoResidentVehicle.class)){
            this.value = getInterval() * 0.50;
            System.out.println("- Carro = " + vehicle.getModel() + "\n" +
                               "- Placa = " + vehicle.getLicensePlate() + "\n" +
                               "- Tempo Estacionado = " + getInterval() + " minutos" + "\n" +
                               "- Valor a Pagar = R$ " + getValue() + "\n");

        } else if(vehicle.getClass().equals(OfficialVehicle.class)) {
            this.value = 0.00;
            System.out.println("- Carro = " + vehicle.getModel() + "\n" +
                               "- Placa = " + vehicle.getLicensePlate() + "\n" +
                               "- Tempo Estacionado = " + getInterval() + " minutos" + "\n" +
                               "- Valor a Pagar = R$ " + getValue() + "\n");
        }
    }
}