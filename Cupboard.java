public class Cupboard {
    private String status;
    private int number;
    private int lock;

    public Cupboard(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String string) {
        this.status = string;
    }

    public int getLock() {
        return lock;
    }

    public void setLock(int lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {

        return "Шкаф № " + this.number + " " + this.status;
    }

}
