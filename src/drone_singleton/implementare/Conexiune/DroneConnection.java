package drone_singleton.implementare.Conexiune;

import java.util.Objects;

public class DroneConnection implements IDroneConnection {

    private static final DroneConnection instance = new DroneConnection();
    private String utilizatorConectat;

    private DroneConnection() {
    }

    public static DroneConnection getInstance(){
        return instance;
    }

    @Override
    public void connect(String userName) {
        if(this.utilizatorConectat!=null){
            throw new RuntimeException("Utilizator deja conectat");
        } else this.utilizatorConectat=userName;
    }

    @Override
    public void disconnect(String userName) {
        if(this.utilizatorConectat==null){
            throw new RuntimeException("Utilizator deja deconectat");
        } else this.utilizatorConectat=null;
    }

    @Override
    public boolean isConnected(String userName) {
        if(Objects.equals(this.utilizatorConectat, userName)){
            return true;
        }
        return false;
    }

    @Override
    public void viewConnections() {
        System.out.println(utilizatorConectat);
    }
}
