package Commands;

import Shapes.*;
import java.util.*;


public class CreateRectangleCommand implements Command{
    
    private static ShapeFactory sf = new RectangleFactory();
    private  Scanner sc;
    private Vector shapes;
    private Shape rectangle;

    public CreateRectangleCommand(Vector shapes,Scanner sc){
        this.sc = sc;
        this.shapes = shapes;
        this.rectangle = null;
    }

    public void execute(){
        Shape c = sf.createShape(sc);
        shapes.add(c);
    }

    public void undo(){
        if(rectangle != null){
            shapes.remove(rectangle);
        }else{
            System.out.println("nothing to undo");
        }

    }

    public void redo(){

        if(rectangle!=null){
            shapes.add(rectangle);
        }else{
            System.out.println("nothing to redo");
        }
    }

}
