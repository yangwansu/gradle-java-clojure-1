import clojure.java.api.Clojure;
import clojure.lang.IFn;
import my.name.is.Helly;

/**
 * Created by coupang on 2016. 8. 4..
 */
public class Hello {
    private static IFn require = Clojure.var("clojure.core", "require");
    static {
        require.invoke(Clojure.read("[my.name.is.helly]"));
    }

    private static IFn hello = Clojure.var("my.name.is.helly", "i-am-helly");


    public static void main(String[] args) {

        Helly helly = new Helly();
        System.out.println(helly.hello("Clojure"));

        System.out.println(hello.invoke());
    }
}
