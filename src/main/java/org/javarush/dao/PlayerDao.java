package org.javarush.dao;

import org.hibernate.Session;
import org.javarush.entity.Player;
import org.javarush.util.HibernateUtil;

import java.util.List;
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

    public List<Player> findByAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("select p from Player p", Player.class).stream().toList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
