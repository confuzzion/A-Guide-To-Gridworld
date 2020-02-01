import info.gridworld.actor.Bug;

public class Zbug extends Bug
{
    private int stepsTaken;
    private int length;

    public Zbug()
    {
        super();
        length = 1;
        act();
    }

    public void act()
    {
        if (stepsTaken < length && canMove())
        {
            move();
            stepsTaken++;
        }
        if(length == 1 && stepsTaken <= length && canMove())
        {
            turn();
            turn();
            stepsTaken = 0;
        }
        else
        {
            turn();
            stepsTaken = 0;
        }
    }
}