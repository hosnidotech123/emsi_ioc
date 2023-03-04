package dao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("WS version");
        double data=66;
        return data;
    }
}
