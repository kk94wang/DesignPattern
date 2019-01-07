public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.perfomFly();

        Duck model = new ModelDuck();
        model.perfomFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();
    }
}
