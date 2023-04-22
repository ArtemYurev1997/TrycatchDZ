package by.pvt.tasktry;

public class MyException3 extends Exception {
    private String code;

    public MyException3(String message, String code) {
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
        return "MyException3{" +
                "code='" + code + '\'' +
                '}';
    }
}
