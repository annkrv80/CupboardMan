public class Cupboard {
    private String status;
    private int number;
    

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


    @Override
    public String toString() {

        return "Шкаф № " + this.number + " " + this.status;
    }

}
