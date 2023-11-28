package cadastro;

import java.util.Collection;

import javax.swing.JOptionPane;

import cadastro.dao.ClienteMapDAO;
import cadastro.dao.IClienteDao;
import cadastro.domain.Cliente;

public class App {
    private static IClienteDao iClienteDAO;
    public static void main(String args[]){
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,"1 - Cadastro\n2 - Consultar\n3 - Excluir\n4 - Alterar\n5 - Mostrar Todos\n6-Sair","Cadastro",JOptionPane.INFORMATION_MESSAGE);
        
        while(!isOpcaValida(opcao)){
            if("".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,"Opção invalida escolha\n1 - Cadastro\n2 - Consultar\n3 - Excluir\n4 - Alterar\n5 - Mostrar todos\n6 - Sair","Cadastro",JOptionPane.INFORMATION_MESSAGE);
        }

        while(isOpcaValida(opcao)){
            
            if(isOpcaoSair(opcao)){
                sair();
            } else if (isCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,"Digite os dados do cliente,exempleo: Nome,CPF, Telefone,Endereço,Numero,Cidade,Estado","Dados Cliente",JOptionPane.INFORMATION_MESSAGE);
                cadastro(dados);
            } else if(isConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null,"Digite CPF para consulta","Dados Cliente",JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if(isExcluir(opcao)){
                String dados = JOptionPane.showInputDialog(null,"Digite CPF para excluir","Dados Cliente",JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if(isAlterar(opcao)){
                String dados = JOptionPane.showInputDialog(null,"Digite os dados do cliente,exempleo: Nome,CPF, Telefone,Endereço,Numero,Cidade,Estado","Dados Cliente",JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            } else if(isMostrarTodos(opcao)){
                mostraTodos();
            }

            opcao = JOptionPane.showInputDialog(null,"1 - Cadastro\n2 - Consultar\n3 - Excluir\n4 - Alterar\n5 - Mostrar todos\n6 - Sair","Cadastro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void mostraTodos() {
        Collection<Cliente> a = iClienteDAO.buscarTodos();
        if(a.size() > 0){
            JOptionPane.showMessageDialog(null,"Todos os clientes: " + a, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Nem um usuario cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isMostrarTodos(String opcao) {
        if("5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void alterar(String dados) {
        String[] dadoSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadoSeparados[0], dadoSeparados[1], dadoSeparados[2], dadoSeparados[3], dadoSeparados[4], dadoSeparados[5], dadoSeparados[6]);
        Boolean isCadastrado = iClienteDAO.alterar(cliente);
        if(isCadastrado){
            JOptionPane.showMessageDialog(null,"Usuario alterado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Usuario não encontrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private static boolean isAlterar(String opcao) {
        if("4".equals(opcao)){
            return true;
        }
        return false;
    }


    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.valueOf(dados));
        JOptionPane.showMessageDialog(null,"Usuario excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isExcluir(String opcao) {
        if("3".equals(opcao)){
            return true;
        }
        return false;
    }


    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.valueOf(dados));
        if(cliente != null){
            JOptionPane.showMessageDialog(null,"Dados do cliente: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Cliente não encontrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }


    private static boolean isConsultar(String opcao) {
        if("2".equals(opcao)){
            return true;
        }
        return false;
    }


    private static void cadastro(String dados) {
        String[] dadoSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadoSeparados[0], dadoSeparados[1], dadoSeparados[2], dadoSeparados[3], dadoSeparados[4], dadoSeparados[5], dadoSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if(isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Cliente já cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private static boolean isCadastro(String opcao) {
        if("1".equals(opcao)){
            return true;
        } 
        return false;
    }


    private static boolean isOpcaoSair(String opcao) {
        if("6".equals(opcao)){
            return true;
        }
        return false;
    }


    private static boolean isOpcaValida(String opcao) {
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Obrigado por usar a aplicação", "TCHAU", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
