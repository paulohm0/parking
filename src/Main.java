import java.time.Duration;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Manager manager = new Manager();

        System.out.println();
        Vehicle toyota = new OfficialVehicle
                ("Corolla", "ABC-1234");
        Vehicle fiat = new ResidentVehicle
                ("Uno", "CDE-4567");
        Vehicle chevrolet = new NoResidentVehicle
                ("Chevete","FGH-6789");

        manager.park(chevrolet);
        Thread.sleep(60000);
        manager.exit(chevrolet);
        manager.park(toyota);
        Thread.sleep(60000);
        manager.exit(toyota);
        manager.park(fiat);
        Thread.sleep(60000);
        manager.exit(fiat);

        }
    }

