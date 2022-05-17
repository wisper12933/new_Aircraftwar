package com.hit.aircraft_war.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayerDaoImpl implements PlayerDao{

    private List<Player> ranks;

    public PlayerDaoImpl(){
        ranks = new ArrayList<>();
    }
    @Override
    public List<Player> getAllInformation() {
        return ranks;
    }
    @Override
    public void doAdd(Player player) {
        ranks.add(player);
    }
    @Override
    public void doDelete(String date) {
        ranks.removeIf(information -> Objects.equals(information.getPlayDate(), date));
    }
    @Override
    public void doSort() {
        ranks.sort((o1, o2) -> o2.getScore()-o1.getScore());
    }

    public int getNum(){
        int num=0;
        for (Player ignored :ranks){
            num++;
        }
        return num;
    }

}
