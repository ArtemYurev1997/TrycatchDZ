package by.pvt.tasktry;

public interface AbstractTrain {
    void refill(int quantity);
    void departure() throws  MyException;
    void changeOfStatus() throws MyException1;
    void download() throws MyException1;
    void unload() throws MyException2;
}
