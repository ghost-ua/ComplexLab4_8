package menu;

import java.util.List;

public class ExitCommand implements Command {
    @Override
    public String getKey(){
        return "exit";
    }
    @Override
    public void execute(List<String> params) {
        System.out.println("До зустрічі");
        System.exit(0);
    }

}
