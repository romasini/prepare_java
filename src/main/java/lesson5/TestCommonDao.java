package lesson5;

import java.util.List;

public class TestCommonDao {
    public static void main(String[] args) {
        CommonDao<Film, Long> commonDao = new CommonDao<>(Film.class);
        commonDao.openCurrentSession();
        Film res = commonDao.findById(1l);
        System.out.println(res);
        commonDao.closeCurrentSession();

        Film newFilm = new Film();
        newFilm.setName("Rabbits");
        newFilm.setDuration(100);

        commonDao.openCurrentSession();
        commonDao.persist(newFilm);
        commonDao.closeCurrentSession();

        commonDao.openCurrentSession();
        List<Film> filmList = commonDao.findAll();
        commonDao.closeCurrentSession();
        System.out.println(filmList);
    }
}
