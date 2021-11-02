package Commands;

import java.util.*;

public class CreateCircleCommandFactory implements CommandFactory{
    
    private Scanner sc;
    private Vector shapes;
    private Stack commands;

    public CreateCircleCommandFactory(Scanner sc, Stack commands , Vector shapes){

        this.shapes =shapes;
        this.sc = sc;
        this.commands = commands;

    }

    public Command createCommand(){
        
        Command c = new CreateCircleCommand(shapes, sc);
        commands.push(c);
        return c;
        
    }

}
