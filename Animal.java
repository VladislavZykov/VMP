interface IAnimal {

    public abstract boolean run(double distance);

    public abstract boolean swim(double distance);

    public abstract boolean jump(double distance);
}

public abstract class Animal implements IAnimal {
    protected String name;
    protected double run;
    protected double swim;
    protected double jump;

    public boolean run(double distance) {
        return (this.run >= distance);
    }

    public boolean swim(double distance) {
        return (this.swim >= distance);
    }

    public boolean jump(double distance) {
        return (this.jump >= distance);
    }

    public Animal(String name, double run, double swim, double jump){
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
}