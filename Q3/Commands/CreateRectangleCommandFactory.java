package Commands;

import java.util.*;

public class CreateRectangleCommandFactory implements CommandFactory{
    
    private Vector shapes;
    private Scanner sc;
    private Stack commands;

    public CreateRectangleCommandFactory(Scanner sc , Stack commands,Vector shapes){
        this.sc=sc;
        this.shapes=shapes;
        this.commands = commands;

    }


    public Command createCommand(){
        Command c = new CreateRectangleCommand(shapes, sc);
        commands.push(c);
        return c;

    }

}
