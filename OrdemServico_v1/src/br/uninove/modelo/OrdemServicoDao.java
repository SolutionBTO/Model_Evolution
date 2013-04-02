/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.modelo;

import br.uninove.controle.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Roberto Silva
 */
public class OrdemServicoDao {
    
    private PreparedStatement pstm;
    private ResultSet rs;
   
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
    
}
