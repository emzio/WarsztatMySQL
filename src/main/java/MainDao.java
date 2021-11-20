import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // Sprawdzam create :
//        User userToCreate = new User("12email@gmail.com", "12username", "12password");
//        userDao.create(userToCreate);

//        Sprawdzam metode sparwdzania czy element o zadanym id należy do tablicy w bazie
//        System.out.println(userDao.checkingId(3));
//        System.out.println(userDao.checkingId(16));
//
//        System.out.println(userDao.checkingId(15));
//        System.out.println(userDao.checkingId(-2));

        // Sprawdzam read:
        userDao.read(11).print();

//        // Sprawdzam update:
//        User userToUpdate = new User(14, "14updatedemail", "updatedusername 14", "updatedpassword14");
//        userDao.update(userToUpdate);
//        userToUpdate.print();
//        User userNotExisting = new User(20, "14updatedemail", "updatedusername 14", "updatedpassword14");
//        userDao.update(userNotExisting);
//        userNotExisting.print();

        //Sprawdzam metodę equals :
//        User barbra = new User("15Barbaziolka@yahoo.com", "15Barbra Ziolka", "14Hasło");
//        User barbra2 = new User("15Barbaziolka@yahoo.com", "15Barbra Ziolka", "14Hasło");
//        System.out.println(barbra.equals(barbra2));
//        userDao.create(barbra);

        // Sprawdzam czy nieistniejący w tabeli obiekt będzie null:
//        User userToNull = userDao.read(20);
//        System.out.println("Obiekt to : " + userDao.read(20));
//        System.out.println("Czy obiekt to null : " +  (userToNull == null));

        // Sprawdzam delete :
//        userDao.delete(13);
//        userDao.read(3);

        // sprawdzenie czy tworzona jest tablica
        User[] users = userDao.findAll();
        System.out.println(Arrays.toString(users));

//         porównanie jednego elementu tablicy z bazą danych
        System.out.println("Porównanie obiektu z tablicy z obiektem pobranym z bazy : " + users[3].equals(userDao.read(6)));


    }

}
