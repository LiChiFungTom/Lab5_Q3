package Commands;

public class ExitCommandFactory implements CommandFactory{
    
    public Command createCommand(){
        return new ExitCommand();
    }

}