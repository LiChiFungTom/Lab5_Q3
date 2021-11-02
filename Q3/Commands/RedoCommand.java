package Commands;

import java.util.*;
import Shapes.*;

public class RedoCommand implements Command{
    

    private Stack redos;
    private Stack commands;

    public RedoCommand(Stack commands , Stack redos){
        this.commands = commands;
        this.redos = redos;
    }

    public void execute(){
        if(redos != null){
            Command c = (Command)redos.pop();
            c.redo();
            commands.push(c);
        }else{
            System.out.println("nothing to redo");
        }
  
    }
    
    
    public void undo(){

    }
    
    public void redo(){

    }

}
