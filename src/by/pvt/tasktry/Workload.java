package by.pvt.tasktry;

public enum Workload {
    DOWNLOAD("Загружен"),
    EMPTY("Пустой");
    private String status;

    Workload(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Workload{" +
                "status='" + status + '\'' +
                '}';
    }
}
