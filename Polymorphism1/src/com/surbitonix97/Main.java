package com.surbitonix97;

class Movie
{
    private String name;

    public Movie(String name)
    {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String plot(){
        return "no plot in here";
    }
}

class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }
    @Override
    public String plot()
    {
        return "An hungry shark eating some people";
    }

}

class IndependenceDay extends Movie
{
    public IndependenceDay()
    {
        super("Independence Day");
    }

    @Override
    public String plot()
    {
        return "Aliens attack to conquer planet Earth";
    }
}

class MazeRunner extends Movie
{
    public MazeRunner()
    {
        super("Maze Runner");
    }

    @Override
    public String plot()
    {
        return "dudes running around a Maze";
    }
}

class StarWars extends Movie
{
    public StarWars ()
    {
        super("Star Wars");
    }

    @Override
    public String plot()
    {
        return "other dudes fighting galaxies and who knows what...";
    }
}

class ForgetableMovie extends Movie{
    public ForgetableMovie(){
        super("TO FORGET");
    }

    //no plot method here...
}

public class Main {

    public static void main(String[] args) {
	    for (int i=1; i<11; i++){
	        Movie myMovie = randomMovie();
            System.out.println(i+". Movie name is -> " +
                    myMovie.getName() +
                    "\nPlot -> "+myMovie.plot() + "\n");

        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) ((Math.random() * 5 ) + 1);
        System.out.println("random number generated was -> "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovie();
            default:
                return null;
        }

    }
}



