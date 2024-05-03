package com.example.segurityshoppingcart.Segurity.IRepository;


import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Segurity.DTO.UserDto;
import com.example.segurityshoppingcart.Segurity.Entity.User;

@Repository
public interface IUserRepository extends IBaseRepository<User,Long>{
    

    @Query(value="SELECT \n" + //
                "u.id AS user_id,\n" + //
                "r.name AS role,\n" + //
                "v.name AS view,\n" + //
                "v.route AS route,\n" + //
                "m.name AS module\n" + //
                "FROM User AS u\n" + //
                "INNER JOIN userrole AS ur ON ur.user_id = u.id\n" + //
                "INNER JOIN role AS r ON r.id = ur.role_id\n" + //
                "INNER JOIN roleview AS rv ON rv.role_id = r.id\n" + //
                "INNER JOIN view AS v ON v.id = rv.view_id\n" + //
                "INNER JOIN module AS m ON m.id = v.module_id;", nativeQuery = true)
    Optional<UserDto> getUserInformation();

}
