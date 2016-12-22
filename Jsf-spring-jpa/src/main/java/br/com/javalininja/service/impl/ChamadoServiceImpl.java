package br.com.javalininja.service.impl;

import br.com.javalininja.jsfsprintjpa.dao.DaoGenerico;
import javax.annotation.Resource;

 
import br.com.javalininja.jsfsprintjpa.model.entities.Chamado;
 
import br.com.javalininja.jsfsprintjpa.model.service.ChamadoService;

public class ChamadoServiceImpl implements ChamadoService {

	@Resource
    private DaoGenerico<Chamado, Integer> chamadoDao;
	
	public DaoGenerico<Chamado, Integer> getChamadoDao() {
		return chamadoDao;
	}

	public void setChamadoDao(DaoGenerico<Chamado, Integer> chamadoDao) {
		this.chamadoDao = chamadoDao;
	}

	@Override
	public Chamado salvar(Chamado chamado) {
		return getChamadoDao().salvar(chamado);
	}

}
