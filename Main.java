import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города");
        String cityName = scanner.nextLine();
        System.out.println("Вы ввели город "+ cityName);



        String cityId = RequestSender.getCityId(cityName);


        System.out.println("Сity: "+ cityName +RequestSender.getMinAndMaxTemp (cityId));


    }

}