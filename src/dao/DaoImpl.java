package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("DB version");
        double data=66;
        return data;
    }
}
