package kz.narxoz.springapp.repository;

import kz.narxoz.springapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    //1
    List<User> findByEmailEndsWith(String email);

    //2
    List<User> findTop2ByNameStartsWith(String name);

    //3
    List<User> findBySurnameContaining(String surname);

    //4
    @Query(value= "select *from users order by id asc;", nativeQuery = true)
    List<User> orderByIdAsc();

    //5
    @Query(value= "select *from users order by id desc limit(2)", nativeQuery = true)
    List<User> showlastUsers();

    //6
    @Query(value= "select *from users order by name desc", nativeQuery = true)
    List<User> sortByName();

    //7
    List <User> findByEmailNotContaining(String email);

    // 8
    @Query(value= "select *from users where name=surname",nativeQuery = true)
    List<User>EqualNameSurname();

    //9
    @Query(value= "select * from users where email like '%narxoz.kz%' or email like '%gmail.com%' or email like '%yandex.ru%' ",
            nativeQuery = true)
    List<User> emailLike();

    //10
    @Query(value="select distinct on (name) * from users ", nativeQuery = true)
    List<User> findDistinctByName(String name);


    User findByUsername(String username);
}
