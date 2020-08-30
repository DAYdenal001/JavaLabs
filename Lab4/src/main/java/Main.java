import models.AssistantEntity;
import models.StafferEntity;
import org.hibernate.Session;
import utils.HibernateUtil;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws Exception {
        CsvAdapter csv = new CsvAdapter();
        ArrayList<String[]> result = csv.Reader();
        Map<String, ArrayList<Object>> allData = DataParser.Parse(result);

        for (Object test : allData.get("Assistant")) {
            ((AssistantEntity) test).PrintInfo();
        }

        for (Object test : allData.get("Staffer")) {
            ((StafferEntity) test).PrintInfo();
        }

        Session session = HibernateUtil.getSessionFactory().openSession();

        for (Object test : allData.get("Assistant")) {
            session.clear();
            session.beginTransaction();
            session.save(test);
            session.getTransaction().commit();
        }

        for (Object test : allData.get("Staffer")) {
            session.clear();
            session.beginTransaction();
            session.save(test);
            session.getTransaction().commit();
        }

        System.out.println("Запрос на выборку HQL");
        session.clear();
        Query query = session.createQuery("SELECT A,B FROM AssistantEntity as A, StafferEntity as B WHERE A.salary < 30000");
        List employees = ((org.hibernate.query.Query) query).list();
        System.out.println(employees);
//        for (Object test : employees) {
//            ((AssistantEntity)test).PrintInfo();
//        }
        session.close();


    }
}
