package com.example.segurityshoppingcart.Segurity.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.DTO.IUserDto;
import com.example.segurityshoppingcart.Segurity.DTO.IUserModuleDto;
import com.example.segurityshoppingcart.Segurity.DTO.IUserViewDto;
import com.example.segurityshoppingcart.Segurity.DTO.SaveUserPersonDto;
import com.example.segurityshoppingcart.Segurity.Entity.Person;
import com.example.segurityshoppingcart.Segurity.Entity.Role;
import com.example.segurityshoppingcart.Segurity.Entity.User;
import com.example.segurityshoppingcart.Segurity.Entity.UserRole;
import com.example.segurityshoppingcart.Segurity.IRepository.IUserRepository;
import com.example.segurityshoppingcart.Segurity.IService.IPersonService;
import com.example.segurityshoppingcart.Segurity.IService.IRoleService;
import com.example.segurityshoppingcart.Segurity.IService.IUserRoleService;
import com.example.segurityshoppingcart.Segurity.IService.IUserService;


@Service
public class UserService extends ABaseService<User> implements IUserService{
  
	@Override
protected IBaseRepository<User, Long> getRepository() {
return repository;
}
    @Override
    protected Class<User> getEntityClass() {
    	return User.class;
    }

@Autowired
public IUserRepository repository;

@Autowired
private IPersonService personService;

@Autowired
private IUserRoleService userroleService;

@Autowired
private IRoleService roleService;



@Override
public Optional<IUserDto> getUserByLogin(String username, String password) throws Exception {
	Optional<IUserDto> oplog = repository.getUserByLogin(username, password);
    if (oplog.isEmpty()) {
        throw new Exception("Registro no encontrado");
    } else if (oplog.get().getDeletedAt() != null) {
        throw new Exception("Registro inhabilitado");
    }
	return oplog;
}

@Override
public User saveUserPerson(SaveUserPersonDto userPerson) throws Exception {
	try {
		
       
        if (userPerson.getUsername() == null || userPerson.getUsername().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío");
        }
        if (userPerson.getPassword() == null || userPerson.getPassword().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía");
        }
        
  
        
    	User entityUser = new User();
    	
        try {
	Person person = personService.save(userPerson.getPerson());
	entityUser.setPerson(person);
        }catch(Exception e){
        	throw new Exception("Error al guardar la persona");
        }

	
	entityUser.setUsername(userPerson.getUsername());
	entityUser.setPassword(userPerson.getPassword());
	
	entityUser.setState(true);
	entityUser.setCreatedAt(LocalDateTime.now());
	entityUser.setCreatedBy((long)1);
	
	User user = repository.save(entityUser);
	

	UserRole entityuserrole = new UserRole();
	Optional<Role> roleid =roleService.findById((long) 1);
	Role rol = roleid.get();
	
	entityuserrole.setRole(rol);
	entityuserrole.setUser(user);
	entityuserrole.setState(true);
	userroleService.save(entityuserrole);
    return user;
} catch (IllegalArgumentException e) {
    // Captura y manejo de excepciones de validación de datos
    throw new Exception("Error de validación: " + e.getMessage());
} catch (Exception e) {
    // Captura y manejo de otras excepciones
    throw new Exception("Error al guardar el usuario: " + e.getMessage());
}


}

@Override
public List<IUserViewDto> getUserView(Long userId) throws Exception {
	return repository.getUserView(userId);
}

@Override
public List<IUserModuleDto> getUserModule(Long userId) throws Exception {
	return repository.getUserModule(userId);
}


}