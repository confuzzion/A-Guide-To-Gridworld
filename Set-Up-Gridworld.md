# A-Guide-To-Gridworld
How to set up Gridworld, without using BlueJ

If you've moved on with the world and are using VS-Code and not BlueJ, welcome to a guide for Gridworld.
Here are explicit instructions.

You should have recieved a .zip (usually called gwcode.zip file with a bunch of stuff in it, unzip it 
(prefferably not in your downloads)
To unzip, right click and unzip, and if it asks you where to put it put it in desktop.

Inside the folder you just unzipped, GridWorldCode, are 3 folders, a build.properties file, a build.xml 
file, and a gridworld.jar


Create a folder. Put gridworld.jar in that folder, and then unzip it inside of that folder you just created.
If you've done everything right, that folder you created should have two folders and the jar file you just 
unzipped. 

To run anything, you will need a tester class, which will have the public static void main method you need.
Go look at my "Runner.java" file for an example of a tester class. Note that I call DancingBug, but you can 
call any actor (eg. new Bug, or new ZBug, new Flower, new Rock, etc).
The import statements are actually what import those files to use. 

To create new actors, you can create the new Bugs, or actors, in the same folder as the Tester (or in my case
"Runner") and you won't need to import. 

To look at the source code, look at the other folders that were unzipped in the original zip file (eg framework,
javadoc, and projects).

The attatched folder is what my directories look like. Good luck.
0:43 AM
