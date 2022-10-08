package accessories;

public enum Color {
    Red("red"),
    White("white"),
    Silver("silver"),
    Gold("gold");
    private final String color;
    Color(String color) {
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public static Color getColorByName(String name) {
        for (Color color : values()) {
            if (color.getColor().equals(name)) {
                return color;
            }
        }
        throw new IllegalArgumentException("No enum found with colorname: [" + name + "]");
    }
}
