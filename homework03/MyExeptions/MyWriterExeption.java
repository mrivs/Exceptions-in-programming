package homework03.MyExeptions;

public class MyWriterExeption extends Exception{
    private Exception e;
    public MyWriterExeption (String message, Exception e){
        super(message);
        this.e=e;

    }
    public void printStackTrace(){
        e.printStackTrace();
    }
}
