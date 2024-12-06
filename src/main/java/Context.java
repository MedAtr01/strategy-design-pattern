public class Context {
    //initialising by DefaultStrategy
    private Strategy strategy = new DefaultStrategyImpl();
    public void perform(){
        System.out.println("####### start #######");
        System.out.println("***** initialisation *****");
         strategy.apply();
        System.out.println("----- ending -----");

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
