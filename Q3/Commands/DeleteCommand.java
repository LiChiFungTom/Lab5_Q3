package Commands;

import java.util.Vector;

import java.util.*;
import Shapes.*;

public class DeleteCommand implements Command{
    
    private Vector shapes;
    private int index;
    private Shape s; 

    public DeleteCommand(Vector shapes , int index){
        this.shapes=shapes;
        this.index = index;
        this.s =null;
    }

    public void execute(){

        if(index < shapes.size() ){
           Shape s = (Shape)shapes.remove(index);
        }else{
            System.out.println("out of size");
        }
       
    }

    public void undo(){
        if(s != null){
            shapes.add(index, s);
        }else{
            System.out.println("nothing to undo");
        }
     
    }

    public void redo(){

        if(s!= null){
            s =(Shape) shapes.remove(index);
        }else{
            System.out.println("nothing to redo");
        }

    }

}
