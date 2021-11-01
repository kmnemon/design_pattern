package static_factory_method;

public class Foo {
    public static Foo valueOf(int a){
        return new Foo(a);
    }

    Foo(int a){
    }
}
