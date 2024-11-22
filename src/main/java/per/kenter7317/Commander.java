package per.kenter7317;

import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

import java.util.ArrayList;

public class Commander {

    private final ArrayList<CommandData> commandData
            = new ArrayList<CommandData>(){};
    protected void update_command() {
       CommandListUpdateAction action = Main.instance.updateCommands();
       action.addCommands(commandData).complete();
    }

    protected void add_command(String name, String description) {
        CommandData command = new CommandDataImpl(name, description);
        commandData.add(command);
    }

    protected void remove_command(String name) {
        commandData.removeIf(command -> command.getName().equals(name));
    }
}
