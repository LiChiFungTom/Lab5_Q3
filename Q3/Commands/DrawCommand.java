package Commands;

import java.util.*;
import Shapes.*;

public class DrawCommand implements Command{
    
    private Vector shapes;
    
    public DrawCommand(Vector shapes){
        this.shapes = shapes;
    }

    public void execute(){
        
        for(int i=0;i< shapes.size(); i++){

            Shape s =(Shape) shapes.elementAt(i);
            Client.doAction(s);
            
        }
    }


    public void undo(){

    }


    public void redo(){

    }
}
