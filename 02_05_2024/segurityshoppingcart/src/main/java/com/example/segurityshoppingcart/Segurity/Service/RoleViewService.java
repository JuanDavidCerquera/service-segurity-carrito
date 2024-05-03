package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.RoleView;
import com.example.segurityshoppingcart.Segurity.IRepository.IRoleViewRepository;
import com.example.segurityshoppingcart.Segurity.IService.IRoleViewService;

@Service
public class RoleViewService extends ABaseService<RoleView> implements IRoleViewService{

    @Override
    protected IBaseRepository<RoleView, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IRoleViewRepository repository;

    
}
