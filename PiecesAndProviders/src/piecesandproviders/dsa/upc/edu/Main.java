package piecesandproviders.dsa.upc.edu;
import piecesandproviders.dsa.upc.edu.MySQLAccess;
public class Main {

    public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }
}
