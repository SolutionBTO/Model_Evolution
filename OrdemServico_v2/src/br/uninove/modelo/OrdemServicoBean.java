/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.modelo;

import java.sql.Timestamp;

/**
 *
 * @author Roberto Silva
 */
public class OrdemServicoBean {
    
    private int    os_codigo;
    private String os_solicitante;
    private String os_setor;
    private String os_contato;
    private String os_equipamento;
    private String os_serial;
    private String os_modelo;
    private String os_descricao;
    private String os_observacao;
    private Timestamp   os_data_hora;
    private Timestamp   os_dt_hr_visita;
    private String os_status;
    /**
     * @return the os_codigo
     */
    public int getOs_codigo() {
        return os_codigo;
    }

    /**
     * @param os_codigo the os_codigo to set
     */
    public void setOs_codigo(int os_codigo) {
        this.os_codigo = os_codigo;
    }

    /**
     * @return the os_solicitante
     */
    public String getOs_solicitante() {
        return os_solicitante;
    }

    /**
     * @param os_solicitante the os_solicitante to set
     */
    public void setOs_solicitante(String os_solicitante) {
        this.os_solicitante = os_solicitante;
    }

    /**
     * @return the os_setor
     */
    public String getOs_setor() {
        return os_setor;
    }

    /**
     * @param os_setor the os_setor to set
     */
    public void setOs_setor(String os_setor) {
        this.os_setor = os_setor;
    }

    /**
     * @return the os_contato
     */
    public String getOs_contato() {
        return os_contato;
    }

    /**
     * @param os_contato the os_contato to set
     */
    public void setOs_contato(String os_contato) {
        this.os_contato = os_contato;
    }

    /**
     * @return the os_equipamanto
     */
    public String getOs_equipamento() {
        return os_equipamento;
    }

    /**
     * @param os_equipamanto the os_equipamanto to set
     */
    public void setOs_equipamento(String os_equipamento) {
        this.os_equipamento = os_equipamento;
    }

    /**
     * @return the os_serial
     */
    public String getOs_serial() {
        return os_serial;
    }

    /**
     * @param os_serial the os_serial to set
     */
    public void setOs_serial(String os_serial) {
        this.os_serial = os_serial;
    }

    /**
     * @return the os_modelo
     */
    public String getOs_modelo() {
        return os_modelo;
    }

    /**
     * @param os_modelo the os_modelo to set
     */
    public void setOs_modelo(String os_modelo) {
        this.os_modelo = os_modelo;
    }

    /**
     * @return the os_descricao
     */
    public String getOs_descricao() {
        return os_descricao;
    }

    /**
     * @param os_descricao the os_descricao to set
     */
    public void setOs_descricao(String os_descricao) {
        this.os_descricao = os_descricao;
    }

    /**
     * @return the os_observacao
     */
    public String getOs_observacao() {
        return os_observacao;
    }

    /**
     * @param os_observacao the os_observacao to set
     */
    public void setOs_observacao(String os_observacao) {
        this.os_observacao = os_observacao;
    }

    /**
     * @return the os_date
     */
    public Timestamp getOs_data_hora() {
        return os_data_hora;
    }

    /**
     * @param os_date the os_date to set
     */
    public void setOs_data_hora(Timestamp os_data_hora) {
        this.os_data_hora = os_data_hora;
    }

    /**
     * @return the os_dt_hr_visita
     */
    public Timestamp getOs_dt_hr_visita() {
        return os_dt_hr_visita;
    }

    /**
     * @param os_dt_hr_visita the os_dt_hr_visita to set
     */
    public void setOs_dt_hr_visita(Timestamp os_dt_hr_visita) {
        this.os_dt_hr_visita = os_dt_hr_visita;
    }

    /**
     * @return the os_status
     */
    public String getOs_status() {
        return os_status;
    }

    /**
     * @param os_status the os_status to set
     */
    public void setOs_status(String os_status) {
        this.os_status = os_status;
    }
}
