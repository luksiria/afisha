import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void addFilm() {
        Manager manager = new Manager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewFilm() {
        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");

        String[] expected = {"Film1", "Film2"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllFilm() {
        Manager manager = new Manager();

        manager.add("Film1");
        manager.findAll();

        String[] expected = {"Film1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilms() {
        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");

        String[] expected = {"Film12", "Film11", "Film10",};
        String[] actual = manager.findLast(3);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFiveFilms() {
        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");

        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8"};
        String[] actual = manager.findLast(5);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilm() {
        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");

        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFourFilms() {
        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");


        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilms1() {
        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");


        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast(5);
        Assertions.assertArrayEquals(expected, actual);
    }
}
