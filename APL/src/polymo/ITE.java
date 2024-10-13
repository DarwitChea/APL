package polymo;

public class ITE {
    int numOfStu;
    String roomName;
    float statistic;
    public ITE(){

    }
    public ITE(int numOfStu, String roomName, float statistic) {
        this.numOfStu = numOfStu;
        this.roomName = roomName;
        this.statistic = statistic;
    }

    public int getNumOfStu() {
        return numOfStu;
    }

    public void setNumOfStu(int numOfStu) {
        this.numOfStu = numOfStu;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public float getStatistic() {
        return statistic;
    }

    public void setStatistic(float statistic) {
        this.statistic = statistic;
    }
}
