package Commands;

import java.util.*;
import Shapes.*;

public class UndoCommand implements Command{
    
    private Stack commands;
    private Stack redos;

    public UndoCommand(Stack commands , Stack redos){
        this.commands = commands;
        this.redos = redos;
    }

    public void execute(){
        if(commands != null){
            Command c =(Command) commands.pop();
            c.undo();
            redos.push(c);
        }else{
            System.out.println("nothing to undo");
        }
        
    }
    
    public void undo(){

    }
    
    
    public void redo(){

    }

}
