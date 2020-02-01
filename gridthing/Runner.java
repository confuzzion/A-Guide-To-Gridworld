import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;

public class Runner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        int[] directions = {8,2,9,4,1};
        world.add(new DancingBug(directions));
        world.show();
    }
}
