public class Gerente extends Funcionario {
    private int senha;

    public boolean autenticate(int senha) {
        return this.senha == senha;
    }

    public double getBonification() {
        return this.getSalario();
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
