package day15.party;

import day14.inherit.player.Player;

public class Party {

    Player[] players;
    int count; //현재 파티에 참여한 인원

    //못찾았다는 플래그
    public static final int NOT_FOUND = -1;

    //num 파티인원수
    public Party(int num) {
        players = new Player[num];
        System.out.println(num + "인 파티가 생성되었습니다.");
    }

    //파티원 추가 기능
    public void addPlayer(Player p) {
        //파티 인원수 초과 검증
        if (count >= players.length) {
            System.out.printf("풀 파티입니다. %s님\n", p.nickName);
            return;
        }
        players[count++] = p;
        System.out.printf("%s님 파티 참여 완료!\n", p.nickName);//패키지가 달라서 오류가 난다.
    }

    //파티원 전체정보 보기
    public void showPartyInfo() {
        System.out.printf("******** 현재 파티원 정보(%d명 참여중) ********\n", count);
        for (int i = 0; i < count ; i++) {//length하면 빈 칸까지 세니까 인원수만큼 세기
            players[i].info();
        }
    }

    //파티원 추방 기능
    public void kickPlayer(String targetNick) {
        int idx = findIndexByNick(targetNick);
        if (idx != NOT_FOUND) {
            for (int i = idx; i < count-1; i++) {
                players[i] = players[i + 1];
            }
            players[--count] = null;
            System.out.printf("%s님을 추방했습니다.\n", targetNick);
        } else {
            System.out.println("파티원을 찾을 수 없습니다.");
        }
    }
    //닉네임으로 해당 플레이어의 인덱스 번호를 찾는 메서드
    private int findIndexByNick(String nick) {
        for (int i = 0; i < count; i++) {
            if (nick.equals(players[i].nickName));
            return i;
        }
        //return -1 이건 나만 아는 거라 다른사람들이 어려움
        return NOT_FOUND;
    }
}
