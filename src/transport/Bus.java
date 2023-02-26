package transport;

public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Автобус " + getBrand() + " завершил движение");
    }

    @Override
    public void printType() {

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автобуса");
    }

    @Override
    public void bestTimeLap() {
        int minLimit = 25;
        int maxLimit = 40;
        int bestTime = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Лучшее время за круг автобуса в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minLimit = 90;
        int maxLimit = 120;
        int maxSpeed = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeed);

    }

    enum capacityType {
        Особо_малая(0, 10),
        Малая(10, 25),
        Средняя(40, 50),
        Большая(60, 80),
        Особо_большая(100, 120);

        private int minLimit;
        private int maxLimit;

        capacityType(int minLimit, int maxLimit) {
            this.minLimit = minLimit;
            this.maxLimit = maxLimit;
        }

        public int getMinLimit() {
            if (minLimit <= 10) {
                System.out.println("Вместимость: до " + getMaxLimit() + " мест");
            }
            return minLimit;
        }

        public void setMinLimit(int minLimit) {
            this.minLimit = minLimit;
        }

        public int getMaxLimit() {
            if (maxLimit >= 120) {
                System.out.println("Вместимос=ть: до " + getMaxLimit() + " мест");
            }
            return maxLimit;
        }

        public void setMaxLimit(int maxLimit) {
            this.maxLimit = maxLimit;
        }

        @Override
        public String toString() {
            return "Вместимость: " + getMinLimit() +
                    " - " + getMaxLimit() + " мест";
        }
    }

}
