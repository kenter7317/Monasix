package per.kenter7317;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Arrays;

public class Main {
    public static JDA instance;
    public static void main(String[] args) {
        GatewayIntent[] intent = { GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.GUILD_MESSAGE_REACTIONS, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGE_TYPING};
        String token;
        instance = JDABuilder.createDefault(token).addEventListeners().enableIntents(Arrays.stream(intent).toList()).build();
    }
}