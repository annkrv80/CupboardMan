public class Man {
    private String name;
    private String key;

    public Man(String name) {
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {

        return this.name;
    }

}
