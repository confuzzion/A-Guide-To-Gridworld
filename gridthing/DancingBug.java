import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import jdk.jshell.execution.DirectExecutionControl;

import java.awt.Color;

public class DancingBug extends Bug
{
    private int[] directionList;
    private int directionListIndexer = 0;

    public DancingBug()
    {
        directionList = new int[] {1, 2, 3, 4, 5};
    }
    public DancingBug(int[] newDirectionList)
    {
        super();
        directionList = newDirectionList;
    }

    public void act()
    {
        if(directionList.length != directionListIndexer)// probably not the best solution but the one I can think of right now
        {
            // System.out.println("Turning " + directionList[directionListIndexer] + " times");
            // System.out.println("which is " + directionList[directionListIndexer]*45 + " degrees");
            for(int j = 0; j < directionList[directionListIndexer]; j++) // turns # times
            {
                turn();
            }
            if(canMove())
            {
                // System.out.println("Moved");
                move();
            }
            else
            {
                turn();
            }
            directionListIndexer++; // to shift over the index
        }
        else
        {
            directionListIndexer = 0;
            act();// just to avoid that akward step in between looping through the array
        }
    }
}