package Keywords;

import static Keywords.Client.getStaticName;
import static Keywords.Client.setStaticName;

public class Main {
    public static void main(String[] args) {
        setStaticName("teste");
        System.out.println(getStaticName());
    }
}
