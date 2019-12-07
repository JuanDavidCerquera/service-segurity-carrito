package com.example.segurityshoppingcart.Segurity.IService;

import java.util.List;
import java.util.Optional;


import com.example.segurityshoppingcart.Base.IService.IBaseService;
import com.example.segurityshoppingcart.Segurity.DTO.IUserDto;
import com.example.segurityshoppingcart.Segurity.DTO.IUserModuleDto;
import com.example.segurityshoppingcart.Segurity.DTO.IUserViewDto;
import com.example.segurityshoppingcart.Segurity.DTO.SaveUserPersonDto;
import com.example.segurityshoppingcart.Segurity.Entity.User;

public interface IUserService extends IBaseService<User>{
    
	public Optional<IUserDto> getUserByLogin(String username, String password) throws Exception;

	User saveUserPerson(SaveUserPersonDto userPerson) throws Exception;
	List<IUserViewDto> getUserView(Long userId)throws Exception;
	List<IUserModuleDto> getUserModule(Long userId)throws Exception;
}
