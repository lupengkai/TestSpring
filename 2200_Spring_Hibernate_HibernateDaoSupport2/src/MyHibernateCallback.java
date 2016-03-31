import org.hibernate.Session;

/**
 * Created by tage on 3/31/16.
 */
public interface MyHibernateCallback {
    public void doInHibernate(Session session);
}
