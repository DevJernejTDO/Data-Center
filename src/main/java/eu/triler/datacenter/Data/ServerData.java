package eu.triler.datacenter.Data;

public class ServerData {

    private String ServerID;
    private String ServerMacAddress;
    private String ServerIPv4;
    private boolean IsOnline = false;
    private ServerState ServerStatus;

    public ServerData(String ID,
    String MacAddress,
    String IP) {
        this.ServerID = ID;
        this.ServerMacAddress = MacAddress;
        this.ServerIPv4 = IP;
    }

    public void StartPcOnLan() {
        // Magic packet
    }

}
