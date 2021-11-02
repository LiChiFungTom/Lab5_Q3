
import Commands.*;
import Shapes.*;
import java.util.*;

public class Lab05Q3 {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Vector shapes = new Vector(); // a vector to store all shapes
    Stack commands = new Stack(); // a stack to store the executed commands (for undo)
    Stack redos = new Stack(); // a stack to store the commands which were undid (for redo)

    // use a HashMap to store the command factories
    CommandFactory[]  f= new CommandFactory[7];

    f[0] = new ExitCommandFactory();
    f[1] = new UndoCommandFactory(commands, redos);
    f[2] = new RedoCommandFactory(commands, redos);
    f[3] = new DrawCommandFactory(shapes);
    f[4] = new DeleteCommandFactory(sc, commands, shapes);
    f[5] = new CreateCircleCommandFactory(sc, commands,shapes);
    f[6] = new CreateRectangleCommandFactory(sc, commands,shapes);



    String command;
    while (true) {
      System.out.println(
          "Enter command: 0 = exit, 1 = undo, 2 = redo, 3 = draw all shapes, 4 = delete a shape, 5 = create circle, 6 = create rectangle");
      command = sc.next();
      int commandes;
      commandes = Integer.parseInt(command);
      Command c = f[commandes].createCommand();
      c.execute();
      switch(command){
        case "4":
        case "5":
        redos.clear();
      }

    }
  }
}
