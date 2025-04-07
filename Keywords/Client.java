package Keywords;

public final class Client {
    private static String staticName;

    private String name;

    private Client(){

    }

    protected static String getStaticName() {
        return staticName;
    }

    protected static void setStaticName(String param) {
        staticName = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
