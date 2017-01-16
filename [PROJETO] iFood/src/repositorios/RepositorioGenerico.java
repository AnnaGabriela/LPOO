package repositorios;

import entidades.Cliente;
import entidades.ItemCardapio;
import entidades.Pedido;
import entidades.Restaurante;
import entidades.Status;
import excecoes.IdException;
import excecoes.SenhaException;
import interfaces.RepGenInterface;
import java.util.ArrayList;

public class RepositorioGenerico<T> implements RepGenInterface<T> {

    private ArrayList<T> g;
    long qtd;
    long proximoID;

    public RepositorioGenerico() {
        this.proximoID = 1;
        this.qtd = 0;
        this.g = new ArrayList<T>();
    }

    public void adicionar(T generico) {
        if (generico.getClass() == Cliente.class) {
            Cliente c = (Cliente) generico;

            try {
                c.validar();
                c.setId(proximoID);
                g.add(generico);
                qtd++;
                this.proximoID++;
                System.out.println("Cliente adicionado");
            } catch (IdException | SenhaException msg) {
                System.out.println(msg.getMessage());
            }
        } else if (generico.getClass() == Restaurante.class) {
            Restaurante r = (Restaurante) generico;

            try {
                r.validar();
                r.setId(proximoID);
                g.add(generico);
                qtd++;
                this.proximoID++;
                System.out.println("Restaurante adicionado");
            } catch (IdException | SenhaException msg) {
                System.out.println(msg.getMessage());
            }
        } else if (generico.getClass() == Pedido.class) {
            Pedido p = (Pedido) generico;
            p.setIdPedido(proximoID);
            g.add(generico);
            qtd++;
            this.proximoID++;
            System.out.println("Pedido adicionado");
        } else {
            g.add(generico);
        }
    }

    public void adicionarPrato(int id, ItemCardapio item) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Restaurante.class) {

                Restaurante r = (Restaurante) Cabilla;
                if (r.getId() == id) {
                    r.adicionarPrato(item);
                }

            }
        }
    }

    public void removerPrato(int id, int idPrato) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Restaurante.class) {

                Restaurante r = (Restaurante) Cabilla;
                if (r.getId() == id) {
                    r.removerPrato(id);
                }
            }
        }
    }

    public void adicionarFixo(T generico) throws IdException, SenhaException {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                c.validar();
                g.add(generico);
                qtd++;
                System.out.println("Cliente adicionado");
            } else if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                r.validar();
                g.add(generico);
                qtd++;
                System.out.println("Restaurante adicionado");
            } else if (Cabilla.getClass() == Pedido.class) {
                Pedido p = (Pedido) Cabilla;
                g.add(generico);
                qtd++;
                System.out.println("Pedido adicionado");
            }
        }
    }

    public String remover(long id) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                if (c.getId() == id) {
                    g.remove(c);
                    qtd--;
                }
            } else if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                if (r.getId() == id) {
                    g.remove(r);
                    qtd--;
                }
            } else if (Cabilla.getClass() == Pedido.class) {
                Pedido p = (Pedido) Cabilla;
                g.remove(p);
                qtd--;
            } else {
                g.remove(Cabilla);
            }
        }
        return "";
    }

    public String toString() {
        String retorno = "";
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                if (c != null) {
                    retorno += c.getId() + " - " + c.getNome() + "\n";
                }
            } else if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                if (r != null) {
                    retorno += r.getId() + " - " + r.getNome() + "\n";
                }
            }
        }
        return retorno;
    }

    public void alterarSenha(long id, String novaSenha) throws IdException, SenhaException {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                c.validar();
                if (c.getId() == id) {
                    c.setSenha(novaSenha);
                    System.out.println("Senha alterada");
                }
            } else if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                r.validar();
                if (r.getId() == id) {
                    r.setSenha(novaSenha);
                    System.out.println("Senha alterada");
                }
            }
        }
    }
public void alterarNome(long id, String novoNome) throws IdException, SenhaException {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                c.validar();
                if (c.getId() == id) {
                    c.setNome(novoNome);
                    System.out.println("Nome alterado");
                }
            } else if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                r.validar();
                if (r.getId() == id) {
                    r.setNome(novoNome);
                    System.out.println("Nome alterado");
                }
            }

        }

    }

    public String listarCardapio(long id) {
        String s = "";
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;

                if (r.getId() == id) {
                    for (int j = 0; j < g.size(); j++) {
                        if (r.getCardapio() != null) {
                            s += r.cardapio[j].id + " - " + r.cardapio[j].nome + " - R$" + r.cardapio[j].preco + "\n";
                        }

                    }
                }

            }
        }
        return s;
    }

    public void logout(String login, String senha) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                r.setLogin(null);
                r.setSenha(null);
            }
        }
    }

    public long buscarPeloLogin(String login, long idRest) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                if (c.getLogin().equals(login)) {
                    return c.id;
                }
                return 0;
            } else if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                if (r.getLogin().equals(login)) {
                    return r.id;
                }
                return 0;
            }
        }
        return 1;
    }

    public long buscar(long idRest) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            Restaurante r = (Restaurante) Cabilla;
            if (r.getId() == idRest) {
                return r.id;
            }
        }
        return 0;
    }

    public boolean contains() {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                if (c.getId() == c.getId()) {
                    return true;
                }
            } else if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                if (r.getId() == r.getId()) {
                    return true;
                }
            } else if (Cabilla.getClass() == Pedido.class) {
                Pedido p = (Pedido) Cabilla;
                if (p.getIdPedido() == p.getIdPedido()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificar(String login, String senha) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                if (c.getLogin().equals(login) && c.getSenha().equals(senha)) {
                    return true;
                }
            }
            if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                if (r.getLogin().equals(login) && r.getSenha().equals(senha)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void verificarStatus(Status statusPedido) {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Pedido.class) {
                if (statusPedido == Status.Enviado) {
                    System.out.println("Enviado");
                } else {
                    System.out.println("Pedido Pendente");
                }
            }
        }
    }

    public void listar() {
        for (int i = 0; i < g.size(); i++) {
            T Cabilla = g.get(i);

            if (Cabilla.getClass() == Cliente.class) {
                Cliente c = (Cliente) Cabilla;
                System.out.println("Restaurantes: ");
                System.out.println(c.id + " - " + c.nome);
            }
            if (Cabilla.getClass() == Restaurante.class) {
                Restaurante r = (Restaurante) Cabilla;
                System.out.println("Restaurantes: ");
                System.out.println(r.id + " - " + r.nome);
            }
        }
    }

    public ArrayList<T> getCopia() {
        return (ArrayList<T>) g.clone();
    }

    public ArrayList<T> getG() {
        return g;
    }

    public void setG(ArrayList<T> g) {
        this.g = g;
    }

    public long getQtd() {
        return qtd;
    }

    public void setQtd(long qtd) {
        this.qtd = qtd;
    }


    public long getProximoID() {
        return proximoID;
    }

    public void setProximoID(long proximoID) {
        this.proximoID = proximoID;
    }

}