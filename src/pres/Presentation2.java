package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String [] args) throws Exception{
        Scanner scanner= new Scanner(new File("config.txt"));

        String doClassname= scanner.next();
        Class cdao=Class.forName(doClassname);
        IDao dao=(IDao) cdao.newInstance();

        String metierClassName=scanner.next();
        Class cmetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cmetier.newInstance();

        Method meth=cmetier.getMethod("setDao", IDao.class);
        meth.invoke(metier,dao);
        System.out.println(metier.calcul());



    }
}
