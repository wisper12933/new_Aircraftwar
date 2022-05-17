package com.hit.aircraft_war.dao;

import java.util.List;

public interface PlayerDao {

    List<Player> getAllInformation();

    void doAdd(Player player);

    void doDelete(String date);

    void doSort();
}
