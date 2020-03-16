package com.widgetpublica;

import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.fluig.sdk.api.component.activation.ActivationEvent;
import com.fluig.sdk.api.component.activation.ActivationListener;
import com.fluig.customappkey.Keyring;

@Singleton(mappedName = "activator/widget_publica", name = "activator/widget_publica")
public class ActivationClass implements ActivationListener {

	public static final String APP_KEY = "9876-5432-1987-6543";
	
	/**
	 * @return nome do arquivo que será gerado e feito o deploy na central de
	 *         componentes
	 * @throws Exception
	 */
	public String getArtifactFileName() throws Exception {
		return "widget-publica.war";
	}

	/**
	 * Evento chamado no momento da instalação (deploy) do artefato dentro da
	 * Central de Componentes.
	 * 
	 * @param event
	 * @throws Exception
	 */
	public void install(ActivationEvent event) throws Exception {

	}

	/**
	 * Evento chamado no momento da ativação do artefato dentro da Central de
	 * Componentes.
	 * 
	 * @param event
	 * @throws Exception
	 */
	public void enable(ActivationEvent event) throws Exception {
		 Keyring.provision(APP_KEY);
	}

	/**
	 * Evento chamado no momento da desativação do artefato dentro da Central de
	 * Componentes.
	 * 
	 * @param event
	 * @throws Exception
	 */
	public void disable(ActivationEvent event) throws Exception {

	}

}