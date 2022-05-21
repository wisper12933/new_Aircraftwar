package com.hit.aircraft_war.RankPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RankDaoImpl implements RankDao{

    private List<RankMember> ranks;

    public RankDaoImpl() {
        ranks = new ArrayList<>();
    }

    @Override
    public List<RankMember> getAllInformation() {
        return ranks;
    }

    @Override
    public void doAdd(RankMember rankMember) {
        ranks.add(rankMember);
    }

    @Override
    public void doDelete(String time) {
        ranks.removeIf(information -> Objects.equals(information.getTime() , time));
    }

    @Override
    public void doSort() {
        ranks.sort((o1, o2) -> o2.getScore()-o1.getScore());
        for (int i=0; i<ranks.size(); i++) {
            ranks.get(i).setRank(i+1);
        }
    }
}
