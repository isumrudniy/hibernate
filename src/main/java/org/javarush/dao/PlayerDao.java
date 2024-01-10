package org.javarush.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.javarush.entity.Player;
import org.javarush.util.HibernateUtil;

import java.util.Optional;

public class PlayerDao {

    public Optional<Player> findById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Player player = session.find(Player.class, id);
            return Optional.ofNullable(player);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
