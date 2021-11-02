package Commands;

import java.util.*;

public class DrawCommandFactory implements CommandFactory{
    
    private Vector shapes;

    public DrawCommandFactory(Vector shapes){
        this.shapes=shapes;
    }
    
    public Command createCommand(){
        return new DrawCommand(shapes);
    }
}
