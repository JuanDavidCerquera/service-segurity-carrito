package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.RoleView;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IRoleViewRepository;
import com.example.segurityshoppingcart.IService.Segurity.IRoleViewService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class RoleViewService extends ABaseService<RoleView> implements IRoleViewService{

    @Override
    protected IBaseRepository<RoleView, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IRoleViewRepository repository;

    
}
