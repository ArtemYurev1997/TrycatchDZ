package by.pvt.tasktry;

public class MyException1 extends Exception{
    private String code;

    public MyException1(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "MyException1{" +
                "code='" + code + '\'' +
                '}';
    }
}
