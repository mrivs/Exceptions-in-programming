package homework03;

import java.io.FileWriter;

import homework03.MyExeptions.MyWriterExeption;

public class MyWriter {
   public static void addEmployee(Employee employee) throws Exception {

      String str = employee.toString();
      String filename = "homework03/Employes/" + employee.getSecondName() + ".txt";
      try (FileWriter writer = new FileWriter(filename, true)) {
         writer.write(str + "\n");

      } catch (Exception e) {
         throw new MyWriterExeption("Ошибка записи файла!", e);
      }

   }

}
