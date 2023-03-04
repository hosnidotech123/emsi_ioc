package dao;

@Component
public class DaoImpl3 implements IDao {
    @Override
    public double getData(){
        System.out.println("version DB");
        double data=66;
        return data;
    }


}
