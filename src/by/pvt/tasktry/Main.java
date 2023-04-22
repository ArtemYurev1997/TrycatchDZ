package by.pvt.tasktry;

public class Main {
    public static void main(String[] args) throws Exception {
            Train train1 = new Train(22, "Stern", 89, Status.ON, 240, 4, Workload.DOWNLOAD);
            Train train2 = new Train(24, "Tron", 56, Status.GO, 280, 3, Workload.EMPTY);
            train1.refill(5);
            System.out.println(train1);
            train2.departure();
            train1.departure();
        }

}
