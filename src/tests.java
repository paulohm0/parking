
//    public static void main(String[] args) throws InterruptedException {
//
//        long start = System.currentTimeMillis();
//        Thread.sleep(10000);
//        long end = System.currentTimeMillis();
//        long dif = end - start;
//        System.out.println("passou " + dif / 1000 + " segundos");
//
//    }
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class tests {
        public static void main(String[] args) {
            LocalDateTime horarioExato = LocalDateTime.now();

            // Formatar o horário como uma string, se desejado
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String horarioFormatado = horarioExato.format(formatter);

            System.out.println("Horário exato do sistema: " + horarioExato);
            System.out.println("Horário formatado: " + horarioFormatado);
        }
    }

