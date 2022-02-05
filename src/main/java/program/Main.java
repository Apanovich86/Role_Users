package program;

//import entities.Author;
import entities.Role;
import entities.User;
import org.hibernate.Session;
import utils.DbContextRoleUsers;


public class Main {
    public static void main(String[] args) {
        Session context = DbContextRoleUsers.getSessionFactory().openSession();
        System.out.println("Hello");
        Role role = new Role();
        //role.setName("admin");
        role.setName("user");
        //role.setName("manager");
        User user = new User();
        user.setEmail("garik");
        user.setPassword("Qwerty1-");
        //context.save(role);
        context.save(user);

//        Query query = context.createQuery("FROM Role");
//        List<Role> roles = query.list();
//        for (Role role : roles)
//            System.out.println(role);
          context.close();

//       Author peter = new Author();
//        peter.setFullname("Petro Mogilev");
//        Author ivan = new Author();
//        ivan.setFullname("Ivan Pidkabluchnuk");
//
//        Book garik = new Book();
//        garik.setName("Harry Potter");
//        garik.setAuthor(peter);
//
//        Book rusalka = new Book();
//        rusalka.setName("Rusalka na progultsi");
//        rusalka.setAuthor(ivan);
//
//        Book slavik = new Book();
//        slavik.setName("Pohodu Slavika");
//        slavik.setAuthor(ivan);

//        SessionFactory sessionFactory = null;
//        Session session = null;
//        Transaction tx = null;
//        try {
//            sessionFactory = DbContextRoleUsers.getSessionFactory();
//            session = sessionFactory.openSession();
//            System.out.println("Session open");
//            tx=session.beginTransaction();
//
//            Author author = session.get(Author.class, 2);
//            author.setFullname("Vasya Shmorgunov");
            //session.delete(author);
//            Book book = session.get(Book.class, 1);
//            session.delete(book);
//            session.save(peter);
//            session.save(ivan);
//            session.save(garik);
//            session.save(rusalka);
//            session.save(slavik);

//            tx.commit();
//        } catch (Exception ex) {
//            System.out.println("Exception "+ex.getMessage());
//            ex.printStackTrace();
//        } finally {
//            if (!sessionFactory.isClosed()) {
//                System.out.println("Closing SessionFactory");
//                sessionFactory.close();
//            }
//        }
    }
}
