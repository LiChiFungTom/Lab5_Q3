package Commands;

import java.util.*;

public class RedoCommandFactory implements CommandFactory{
    
    private Stack commands;
    private Stack redos;

    public RedoCommandFactory(Stack commands , Stack redos){
        this.commands = commands;
        this.redos = redos;
    }



    public Command createCommand(){
        return new RedoCommand(commands, redos);
    }

}
