package i.am.helly;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class GoodLuck {
    private static IFn require = Clojure.var("clojure.core", "require");
    static {
        require.invoke(Clojure.read("[i.am.helly]"));
    }

    private static IFn hello = Clojure.var("i.am.helly", "hello");


    public static void main(String[] args) {
        System.out.println(hello.invoke("Clojure"));
    }
}
