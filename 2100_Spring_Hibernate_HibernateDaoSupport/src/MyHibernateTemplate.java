import org.hibernate.Session;

/**
 * Created by tage on 3/31/16.
 */
public class MyHibernateTemplate {

    public void executeWithNativeSession(MyHibernateCallback myHibernateCallback) {
        Session s = null;
        try {
            s = getSession();
            s.beginTransaction();
            myHibernateCallback.doInHibernate(s);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
        } finally {
            if (null != s) {
                s.close();
                s = null;
            }
        }
    }


    public Session getSession() {
        return null;
    }


    public void save(Object object) {
        new MyHibernateTemplate().executeWithNativeSession(new MyHibernateCallback() {
            @Override
            public void doInHibernate(Session session) {
                session.save(object);
            }
        });
    }

}
