package org.javarush;

import org.javarush.dao.PlayerDao;
import org.javarush.entity.Player;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        PlayerDao playerDao = new PlayerDao();

        Optional<Player> player = playerDao.findById(1L);
        System.out.println(player);

    }
}
