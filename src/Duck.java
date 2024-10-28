public abstract class Duck  {
    private Fly fly;
    private Speek speek;

    Duck(Fly fly, Speek speek)
    {
        this.fly=fly;
        this.speek=speek;
    }

    public void flyB(){
        fly.fly();
    }
    public void speelB(){
        speek.speek();
    }

}
