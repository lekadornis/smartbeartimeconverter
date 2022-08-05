import services.SmartBearTime;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Rasaq Sulaimon
 * @date 04/08/2022 20:36
 */
public class AppLauncher {
    public static void main(String[] args) {
        SmartBearTime smartBearTime = new SmartBearTime();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter 0 to stop/end application");
            while(true){
                System.out.print("Enter time (HH:MM format): ");
                String time = scanner.next();
                if (!Objects.isNull(time) && time.equals("0")) break;
                else{
                    System.out.println(smartBearTime.convertEntry(time));
                }
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
