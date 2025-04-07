package ExercicioDIO;

public class Pet {
    private String name;

    private boolean clean;

    public void Pet(final String name) {
        this.name = name;
        this.clean = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
