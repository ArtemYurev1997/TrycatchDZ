package by.pvt.tasktry;

public class MyException2 extends Exception {
        private String code;

    public MyException2(String message, String code) {
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
        return "MyException2{" +
                "code='" + code + '\'' +
                '}';
    }
}
