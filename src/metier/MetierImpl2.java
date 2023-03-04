package metier;

import dao.IDao;

@Component
public class MetierImpl2 implements IMetier {
    @Autowired
    private IDao dao;

    @Override
    public double calcul(){
        double t=dao.getData();
        double res=t*66;
        return res;
    }

    public void setDao(IDao dao){
        this.dao=dao;
    }


}
