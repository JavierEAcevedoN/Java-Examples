package Example20.ExpresionesLambda.FLambda.FInterfaz;

import java.util.function.Function;

public class TamañoString implements Function<String, Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}