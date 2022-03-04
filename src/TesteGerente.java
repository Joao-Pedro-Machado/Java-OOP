public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setName("João");
        g1.setCpf("11111111111");
        g1.setSalario(4000.00);
        g1.setSenha(2222);

        System.out.println(g1.getName());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        boolean isValid = g1.autenticate(2222);

        System.out.println(isValid);
    }

}
