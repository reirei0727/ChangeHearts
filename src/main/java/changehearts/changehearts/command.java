package changehearts.changehearts;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command implements CommandExecutor {
    public static boolean ss = false;
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("azhearts")){
            if(args.length == 0){
                sender.sendMessage("on または　offを入力");
                return true;
            } else if (args[0].equalsIgnoreCase("on")){
                ss = true;
                Bukkit.broadcastMessage("ChangeHeartsがonになりました");
            } else if (args[0].equalsIgnoreCase("off")){
                ss = false;
                Bukkit.broadcastMessage("ChangeHeartsがoffになりました");
            } else {
                sender.sendMessage("コマンドが正しくありません");
            }
            return true;
        }
        return true;
    }

}