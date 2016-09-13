
public class Bug267256 {

    public Bug267256(java.util.Collection<? extends Base> parameter) {
        java.util.Collection<Base> variable = new java.util.ArrayList<>(parameter);
    }

}

class Base {
}

class Derived extends Base {
}
