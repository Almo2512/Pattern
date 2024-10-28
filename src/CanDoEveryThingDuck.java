public class CanDoEveryThingDuck extends Duck {
    CanDoEveryThingDuck() {
        super(new CantFly(), new CanSpeek());
    }
}
