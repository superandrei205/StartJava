public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String category;
    private String classification;
    private float height;
    private float weight;
    private int streight;
    private int armour;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setStreight(int streight) {
        this.streight = streight;
    }

    public int getStreight() {
        return streight;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scaning";
    }

    void useVordetCannon() {
        System.out.println("activated");
    }
}
