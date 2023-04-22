package by.pvt.tasktry;

    public class Train implements AbstractTrain {
        private int number;
        private String route;
        private int distanceOfCity;
        private Status status;
        private int litres;
        private int consumption;
        private Workload workload;

        public Train(int number, String route, int distanceOfCity, Status status, int litres, int consumption, Workload workload) {
            this.number = number;
            this.route = route;
            this.distanceOfCity = distanceOfCity;
            this.status = status;
            this.litres = litres;
            this.consumption = consumption;
            this.workload = workload;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getRoute() {
            return route;
        }

        public void setRoute(String route) {
            this.route = route;
        }

        public int getDistanceOfCity() {
            return distanceOfCity;
        }

        public void setDistanceOfCity(int distanceOfCity) {
            this.distanceOfCity = distanceOfCity;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public int getLitres() {
            return litres;
        }

        public void setLitres(int litres) {
            this.litres = litres;
        }

        public int getConsumption() {
            return consumption;
        }

        public void setConsumption(int consumption) {
            this.consumption = consumption;
        }

        public Workload getWorkload() {
            return workload;
        }

        public void setWorkload(Workload workload) {
            this.workload = workload;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", route='" + route + '\'' +
                    ", distanceOfCity=" + distanceOfCity +
                    ", status=" + status +
                    ", litres=" + litres +
                    ", consumption=" + consumption +
                    ", workload=" + workload +
                    '}';
        }

        @Override
        public void refill(int quantity) {
            this.litres += quantity;
            System.out.println(this.litres);
        }

        @Override
        public void departure() throws MyException {
        double neededFuel = (double) getLitres() / getConsumption();
        if(neededFuel < getDistanceOfCity()) {
            throw new MyException("Не хватает топлива в баке", "401");
            }
        }

        @Override
        public void changeOfStatus()  {

        }

        @Override
        public void download() throws MyException1 {
            if (getStatus() == Status.ON) {
                throw new MyException1("Нельзя выполнить загрузку", "403");
            }
        }

        @Override
        public void unload() throws MyException2 {
            if(getStatus() == Status.OFF) {
                throw new MyException2("Нельзя выполнить разгрузку", "405");
            }
        }

        public void departing() throws MyException3 {
            if (getStatus() == Status.GO) {
                throw new MyException3("Нельзя выполнить загрузку и разгрузку", "404");
            }
        }

    }

