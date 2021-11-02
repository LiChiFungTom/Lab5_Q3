package Commands;

import java.util.Scanner;
import java.util.Vector;

import Shapes.*;

public class CreateCircleCommand implements Command{

    private static ShapeFactory sf = new CircleFactory();
    private  Scanner sc;
    private Vector shapes;
    private Shape circle;

    public CreateCircleCommand(Vector shapes,Scanner sc){
        this.sc = sc;
        this.shapes = shapes;
        this.circle = null;
    }

    public void execute(){
        Shape c = sf.createShape(sc);
        shapes.add(c);
    }

    public void undo(){
        if(circle != null){
            shapes.remove(circle);
        }else{
            System.out.println("nothing to undo");
        }
        
    }

    public void redo(){
        if(circle !=null){
            shapes.add(circle);
        }else{
            System.out.println("nothing to redo");
        }
           
    }
}
