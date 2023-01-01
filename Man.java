import java.util.Random;

public class Man {
    private String name;
    private int key;

    public Man(String name){
        this.name=name;
        this.key=new Random().nextInt(5);
    }

    public String getName() {
        return name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        
        return this.name;
    }
    
}
