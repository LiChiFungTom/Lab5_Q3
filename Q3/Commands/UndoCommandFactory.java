package Commands;

import java.util.*;

public class UndoCommandFactory implements CommandFactory{

    private Stack commands;
    private Stack redos;

    public UndoCommandFactory(Stack commands, Stack redos){
        this.commands= commands;
        this.redos = redos;

    }

    public Command createCommand(){
        return new UndoCommand(commands, redos);
    }
}
