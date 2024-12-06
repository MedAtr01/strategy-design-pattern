import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Context ctx = new Context();
        //dynamic instantiation
        Scanner scanner = new Scanner(System.in);
        Map<String,Strategy> strategyMap = new HashMap<>();
        strategyMap.put("st1",new StrategyImpl1());
        strategyMap.put("st2",new StrategyImpl2());
        strategyMap.put("st3",new StrategyImpl3());
        strategyMap.put("default",new DefaultStrategyImpl());

        while(true){
            System.out.println("Provide strategy : \n");
//            String strategyClassName = scanner.nextLine();
//            Strategy strategy = (Strategy) Class.forName(strategyClassName).getConstructor().newInstance();


            String st = scanner.nextLine();
            Strategy strategy = strategyMap.get(st);


            ctx.setStrategy(strategy);
            ctx.perform();

        }

    }
}
