import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Circlebug extends Bug
{
    private int stepsTaken;
    private int length;
    private int totalStepsTaken;

    public Circlebug()
    {
        super();
        setDirection(90);
        length = 5;
        act();
    }

    public void act()
    {
        if(totalStepsTaken == 2*length + (length - 1))
        {
            removeSelfFromGrid();

        }
        else if(stepsTaken == length && !(getDirection() == 225))
        {
            turn();
            turn();
            turn();
            stepsTaken = 1;
        }
        else if(stepsTaken == length)
        {
            setDirection(90);
            stepsTaken = 0;
        }
        else
        {
            move();
            totalStepsTaken++;
            stepsTaken++;
        } 
    }
}