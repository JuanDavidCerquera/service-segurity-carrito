package com.example.segurityshoppingcart.Segurity.DTO;

import java.time.LocalDateTime;

import com.example.segurityshoppingcart.Base.DTO.IGenericDto;

public interface IUserDto extends IGenericDto{

	LocalDateTime getDeletedAt();
}
