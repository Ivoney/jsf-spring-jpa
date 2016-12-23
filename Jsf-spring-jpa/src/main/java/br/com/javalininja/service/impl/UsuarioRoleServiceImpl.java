package br.com.javalininja.service.impl;

import br.com.javalininja.jsfsprintjpa.dao.DaoGenerico;
import javax.annotation.Resource;

import br.com.javalininja.jsfsprintjpa.model.entities.UsuarioRole;
import br.com.javalininja.jsfsprintjpa.model.service.UsuarioRoleService;

public class UsuarioRoleServiceImpl implements UsuarioRoleService {

    @Resource
    private DaoGenerico<UsuarioRole, Integer> usuarioRoleDao;

    public DaoGenerico<UsuarioRole, Integer> getUsuarioRoleDao() {
        return usuarioRoleDao;
    }

    public void setUsuarioRoleDao(DaoGenerico<UsuarioRole, Integer> usuarioRoleDao) {
        this.usuarioRoleDao = usuarioRoleDao;
    }

    @Override
    public UsuarioRole salvar(UsuarioRole usuarioRole) {
        return getUsuarioRoleDao().salvar(usuarioRole);
    }

}
