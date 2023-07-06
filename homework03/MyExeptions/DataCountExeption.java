package homework03.MyExeptions;

public class DataCountExeption extends ArrayIndexOutOfBoundsException {
    public DataCountExeption(String message){
        super(message);
    }
        public DataCountExeption(String message, Exception e ){
        super(message);
    }
}
