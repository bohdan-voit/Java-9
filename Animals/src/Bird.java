public class Bird extends Animal implements CanRun,Flyable {

    @Override
    public void massofanimalinpounds() throws Exception {
        super.massofanimalinpounds();
    }

    @Override
    public void run() {
        System.out.println("Птах біжить ");

    }


    public  void eat () {
        System.out.println("Пташиний корм");
    }

    @Override
    public void fly() {
        System.out.println("Птах летить");

    }
}
