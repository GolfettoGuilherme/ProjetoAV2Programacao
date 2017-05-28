package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelos.Aluno;

public class AlunoDao {
     /*
        
    */
    private String servidor = "localhost:3306";
    private String banco = "av2";
    private String usuario = "root";
    private String senha = "";
    
    private Connection conn;
    
    public AlunoDao(){
        conectar();
    }
    
    public void conectar(){
     String url =  "jdbc:mysql://"+servidor+"/"+banco;
     
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            this.conn = DriverManager.getConnection(url,usuario,senha);
                     
        } catch (Exception ex) {
           ex.printStackTrace();
        }
             
    }
    
    public boolean inserirAluno(Aluno a){       
        boolean retorno;
        try{
            String sql = "INSERT INTO tbAlunos(nome,"
                    + "cpf, "
                    + "endereco, "
                    + "telefone, "
                    + "curso) VALUES"
                    + "(?,?,?,?,?);";
            PreparedStatement insert = this.conn.prepareStatement(sql);
            insert.setString(1, a.getNome());
            insert.setString(2, a.getCpf());
            insert.setString(3, a.getEndereco());
            insert.setString(4, a.getTelefone());
            insert.setString(5, a.getCurso());
            
            insert.executeUpdate();
            insert.close();
            retorno = true;
        } catch (SQLException ex){
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;

    }
    
    public boolean alterarAluno(Aluno a){
        boolean retorno;
        try{
            String sql = "UPDATE tbAlunos SET"
                    + "nome = ?, "
                    + "cpf = ? ,"
                    + "endereco = ? ,"
                    + "telefone = ?,"
                    + "curso = ?"
                    + "WHERE ra = ?";
            PreparedStatement update = (PreparedStatement) conn.prepareStatement(sql);
            update.setString(1, a.getNome());
            update.setString(2, a.getCpf());
            update.setString(3, a.getEndereco());
            update.setString(4, a.getTelefone());
            update.setString(5, a.getCurso());
            update.setInt(6, a.getRa());
            
            update.executeUpdate();
            update.close();
            retorno = true;
        } catch(SQLException ex){
            ex.printStackTrace();
            retorno = false;
        } 
        return retorno;
    }
    
    public List<Aluno> buscarAlunos(){
        List<Aluno> alunos = new ArrayList<>();
        try{
            String sql = "SELECT * FROM tbAlunos";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Aluno a = new Aluno();
                a.setRa(rs.getInt("ra"));
                a.setNome(rs.getString("nome"));
                a.setCpf(rs.getString("cpf"));
                a.setEndereco(rs.getString("endereco"));
                a.setTelefone(rs.getString("endereco"));
                a.setCurso(rs.getString("curso"));
                alunos.add(a);
            }
            if(conn != null)
                conn.close();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return alunos;
    }
}
