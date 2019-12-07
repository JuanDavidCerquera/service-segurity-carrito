package com.example.segurityshoppingcart.Segurity.IRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Segurity.DTO.IUserDto;
import com.example.segurityshoppingcart.Segurity.DTO.IUserModuleDto;
import com.example.segurityshoppingcart.Segurity.DTO.IUserViewDto;
import com.example.segurityshoppingcart.Segurity.Entity.User;

@Repository
public interface IUserRepository extends IBaseRepository<User,Long>{
   
	
	@Query(value ="SELECT \r\n"
			+ "u.id,\r\n"
			+ "u.deleted_at,\r\n"
			+ "u.state\r\n"
			+ "FROM user as u\r\n"
			+ "WHERE \r\n"
			+ "username = :username AND\r\n"
			+ "password = :password \r\n"
			+ ";", nativeQuery = true)
	Optional<IUserDto> getUserByLogin(@Param("username") String username, @Param("password") String password);
	
	@Query(value ="SELECT DISTINCT\r\n"
			+ "    v.name AS viewName,\r\n"
			+ "     v.route AS route, \r\n"
			+ "    m.name AS moduleName\r\n"
			+ "FROM \r\n"
			+ "    user AS u\r\n"
			+ "    INNER JOIN userrole AS ur ON ur.user_id = u.id\r\n"
			+ "    INNER JOIN role AS r ON r.id = ur.role_id\r\n"
			+ "    INNER JOIN roleview AS rv ON rv.role_id = r.id\r\n"
			+ "    INNER JOIN view AS v ON v.id = rv.view_id\r\n"
			+ "    INNER JOIN module AS m ON m.id = v.module_id\r\n"
			+ "WHERE \r\n"
			+ "    u.id = 1;", nativeQuery = true)
	List<IUserViewDto> getUserView(@Param("user_id") Long userId);
	
	@Query(value ="SELECT DISTINCT\r\n"
			+ "m.name AS moduleName\r\n"
			+ "FROM \r\n"
			+ "    user AS u\r\n"
			+ "    INNER JOIN userrole AS ur ON ur.user_id = u.id\r\n"
			+ "    INNER JOIN role AS r ON r.id = ur.role_id\r\n"
			+ "    INNER JOIN roleview AS rv ON rv.role_id = r.id\r\n"
			+ "    INNER JOIN view AS v ON v.id = rv.view_id\r\n"
			+ "    INNER JOIN module AS m ON m.id = v.module_id\r\n"
			+ "WHERE \r\n"
			+ "    u.id = 1;", nativeQuery = true)
	List<IUserModuleDto> getUserModule(@Param("user_id") Long userId);
	
}
