/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.modelo;

import br.uninove.controle.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto Silva
 * 
 */
public class OrdemServicoDao {
    
    private PreparedStatement pstm;
    private ResultSet rs;
    
    private final String select=
            "SELECT * FROM ORDEM_SERVICO "
            + "WHERE OS_CODIGO = ? "
            + "AND OS_STATUS = 'PENDENTE' ";
    
    private final String insert=
            "INSERT INTO ORDEM_SERVICO("
            + "OS_SOLICITANTE,"
            + "OS_SETOR,"
            + "OS_CONTATO,"
            + "OS_EQUIPAMENTO,"
            + "OS_SERIAL,"
            + "OS_MODELO,"
            + "OS_DESCRICAO,"
            + "OS_OBSERVACAO,"
            + "OS_DATA_HORA,"
            + "OS_STATUS)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";
    
    private final String update=
            "UPDATE ORDEM_SERVICO SET "
            + "OS_CONTATO = ?,"
            + "OS_EQUIPAMENTO = ?,"
            + "OS_SERIAL = ?,"
            + "OS_MODELO = ?,"
            + "OS_DESCRICAO = ?,"
            + "OS_OBSERVACAO = ? "
            + "WHERE OS_CODIGO = ? ";
    
    public OrdemServicoBean select(String os_codigo)throws Exception{
        
        OrdemServicoBean bean=null;
        Connection con=ConexaoBD.conectar();
        try {
            pstm=con.prepareStatement(select);
            pstm.setString(1, os_codigo);
            rs=pstm.executeQuery();
            
            if(rs.next()){
                bean=new OrdemServicoBean();
                bean.setOs_codigo(rs.getInt("OS_CODIGO"));
                bean.setOs_contato(rs.getString("OS_CONTATO"));
                bean.setOs_data_hora(rs.getTimestamp("OS_DATA_HORA"));
                bean.setOs_dt_hr_visita(rs.getTimestamp("OS_DT_HR_VISITA"));
                bean.setOs_descricao(rs.getString("OS_DESCRICAO"));
                bean.setOs_modelo(rs.getString("OS_MODELO"));
                bean.setOs_equipamento(rs.getString("OS_EQUIPAMENTO"));
                bean.setOs_observacao(rs.getString("OS_OBSERVACAO"));
                bean.setOs_serial(rs.getString("OS_SERIAL"));
                bean.setOs_setor(rs.getString("OS_SETOR"));
                bean.setOs_solicitante(rs.getString("OS_SOLICITANTE"));
                bean.setOs_status(rs.getString("OS_STATUS"));
            }
        } finally {
            ConexaoBD.desconectar(con, pstm, rs);
        }
        
        return bean;
    }
    
    public int insert(OrdemServicoBean osb)throws Exception{
        
        int result=-1;
        Connection con=ConexaoBD.conectar();
        
        try{
            pstm=con.prepareStatement(insert);
            pstm.setString(1,osb.getOs_solicitante());
            pstm.setString(2, osb.getOs_setor());
            pstm.setString(3, osb.getOs_contato());
            pstm.setString(4, osb.getOs_equipamento());
            pstm.setString(5, osb.getOs_serial());
            pstm.setString(6, osb.getOs_modelo());
            pstm.setString(7, osb.getOs_descricao());
            pstm.setString(8, osb.getOs_observacao());
            pstm.setTimestamp(9, osb.getOs_data_hora());
            pstm.setString(10,osb.getOs_status());
            
            result=pstm.executeUpdate();
        }finally{
            ConexaoBD.desconectar(con, pstm, rs);
        }
        
        return result;
    }
    
    public int update(OrdemServicoBean osb)throws Exception{
        
        int result=-1;
        Connection con=ConexaoBD.conectar();
        
        try{
            pstm=con.prepareStatement(update);
            pstm.setString(1, osb.getOs_contato());
            pstm.setString(2, osb.getOs_equipamento());
            pstm.setString(3, osb.getOs_serial());
            pstm.setString(4, osb.getOs_modelo());
            pstm.setString(5, osb.getOs_descricao());
            pstm.setString(6, osb.getOs_observacao());
            pstm.setInt   (7, osb.getOs_codigo());
            
            result=pstm.executeUpdate();
        }finally{
            ConexaoBD.desconectar(con, pstm, rs);
        }
        
        return result;
    }
}
