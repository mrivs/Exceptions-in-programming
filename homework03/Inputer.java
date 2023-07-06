package homework03;

import java.util.Scanner;

import homework03.MyExeptions.DataCountExeption;
import homework03.MyExeptions.ExitExeption;

public class Inputer {
    static Scanner scanner = new Scanner(System.in);
    public static Employee InputEmployee() throws Exception {
        {
            try {
                String userInput = scanner.nextLine();
                
                if (userInput.equals("q")) {
                    throw new ExitExeption("Приложение завершает работу.");
                }
                userInput=userInput.trim();
                userInput=userInput.replaceAll("\\s+", " ");
                String[] userData = userInput.split(" ");
                String surname = userData[0];
                String firstName = userData[1];
                String middleName = userData[2];
                long phoneNumber = Long.parseLong(userData[3]);
                if (userData.length > 4) {
                    throw new DataCountExeption("Неверный формат ввода: введено больше данных");
                }
                return new Employee(surname, firstName, middleName, phoneNumber);

            } 
            catch (ExitExeption e) {
                throw e;
            } 
            catch (DataCountExeption e) {
                throw e;
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                throw new DataCountExeption("Неверный формат ввода: введено меньше данных");
            } 
            catch (NumberFormatException e) {
                throw new NumberFormatException("Неверно введен номер телефона");
            } 
            catch (Exception e) {
                throw new Exception("Error in Inputer: неизвестная ошибка!");
            }
        }
    }

}
