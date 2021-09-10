package day15.party;

import day14.inherit.player.Player;

public class Main {

    public static void main(String[] args) {

        Party party = new Party(3);

        party.addPlayer(new Player("김까까"));
        party.addPlayer(new Player("박꼬꼬"));
        party.addPlayer(new Player("최까까"));
        party.addPlayer(new Player("송까까"));   //3인으로 만들었는데 4인이 되어서 터지낟.

        party.kickPlayer("최까까");

        party.showPartyInfo();

    }
}
