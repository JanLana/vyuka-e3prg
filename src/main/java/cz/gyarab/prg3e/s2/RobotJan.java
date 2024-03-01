package cz.gyarab.prg3e.s2;

import dev.robocode.tankroyale.botapi.*;
import dev.robocode.tankroyale.botapi.events.*;

import java.util.Arrays;

public class RobotJan extends Bot {
    public RobotJan() {
        super(BotInfo.builder()
                .setName("Jan")
                .setVersion("1.0")
                .setAuthors(Arrays.asList(System.getProperty("user.name")))
                .build());
    }

    @Override
    public void run() {
        setBodyColor(Color.GREEN);
        setGunColor(Color.GREEN);

        while (isRunning()) {
            turnGunRight(360);
        }
    }

    @Override
    public void onScannedBot(ScannedBotEvent e) {
        fire(1);
    }



    public static void main(String[] args) {
        new RobotJan().start();
    }
}

