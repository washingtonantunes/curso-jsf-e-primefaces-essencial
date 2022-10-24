package br.com.washingtonsa.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.washingtonsa.erp.model.Empresa;
import br.com.washingtonsa.erp.model.TipoEmpresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa = new Empresa();;
	
	public void salvar() {
        System.out.println("Razão social: " + empresa.getRazaoSocial()
                + " - Nome fantasia: " + empresa.getNomeFantasia()
                + " - Tipo: " + empresa.getTipo());
    }
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}
}
