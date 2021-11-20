import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // Sprawdzam create :
//        User userToCreate = new User("18email@gmail.com", "18username", "18password");
//        userDao.create(userToCreate);

//        Sprawdzam metode sparwdzania czy element o zadanym id należy do tablicy w bazie
//        System.out.println("czy istnieje w bazie danych : " + userDao.checkingId(2));
//        System.out.println("czy istnieje w bazie danych : " + userDao.checkingId(3));
//        System.out.println("czy istnieje w bazie danych : " + userDao.checkingId(20));
//
//        System.out.println(userDao.checkingId(15));
//        System.out.println(userDao.checkingId(-2));

        // Sprawdzam read:
        userDao.read(11).print();

        // Sprawdzam czy nieistniejący w bazie obiekt będzie null:
//        User userToNull = userDao.read(20);
//        System.out.println("Sprawdzam nieistniejący w bazie obiekt. Obiekt to : " + userDao.read(20));
//        System.out.println("Czy obiekt to null : " +  (userToNull == null));

//        // Sprawdzam update:
//        User userToUpdate = new User(14, "154updatedemail", "updatedusername 14", "updatedpassword14");
//        userDao.update(userToUpdate);
////        userToUpdate.print();
//        User userNotExisting = new User(20, "14updatedemail", "updatedusername 14", "updatedpassword14");
//        userDao.update(userNotExisting);
//        userNotExisting.print();

        //Sprawdzam metodę equals :
//        User barbra = new User("15Barbaziolka@yahoo.com", "15Barbra Ziolka", "14Hasło");
//        User barbra2 = new User("15Barbaziolka@yahoo.com", "15Barbra Ziolka", "14Hasło");
//        System.out.println(barbra.equals(barbra2));

        // Sprawdzam delete :
//        userDao.delete(18);
//        System.out.print("Sprawdzam czy skasowany obiekt jest teraz null : ");
//        System.out.println((userDao.read(18)==null));

        // sprawdzenie czy tworzona jest tablica
        System.out.println("sprawdzenie czy tworzona jest tablica");
        User[] users = userDao.findAll();
        System.out.println(Arrays.toString(users));

//         porównanie jednego elementu tablicy z bazą danych
        System.out.println("Porównanie obiektu z tablicy z obiektem pobranym z bazy : " + users[3].equals(userDao.read(6)));


    }

}
