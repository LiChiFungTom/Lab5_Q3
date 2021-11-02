package Commands;

import java.util.*;

public class DeleteCommandFactory implements CommandFactory{
    
    private Scanner sc;
    private Stack commands;
    private Vector shapes;


    public DeleteCommandFactory(Scanner sc , Stack commands ,Vector shapes){
        this.sc = sc;
        this.commands = commands;
        this.shapes = shapes;

    }


    public Command createCommand(){
        int index = sc.nextInt();
        System.out.println("Enter index");
        Command c = new DeleteCommand(shapes, index);
        commands.push(c);
        return c;
    }

}
