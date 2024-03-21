package model;

public class LocadoraVeiculos {

    private String nome, cpf, telefone, cartaoDeCredito;
    private int diaria,idade,acessorio, local, veiculo;


    public LocadoraVeiculos(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(int veiculo) {
        this.veiculo = veiculo;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    public void setCartaoDeCredito(String cartaoDeCredito) {
        this.cartaoDeCredito = cartaoDeCredito;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public int getDiaria() {
        return diaria;
    }

    public void setDiaria(int diaria) {
        this.diaria = diaria;
    }

    public int getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(int acessorio) {
        this.acessorio = acessorio;
    }

    public String selecionarVeiculo(){
        if(this.veiculo == 1){
            return "Renault Kwid";
        } else if(this.veiculo == 2){
            return "Fiat Mobi";
        } else if(this.veiculo == 3) {
            return "Hyundai HB20";
        } else if(this.veiculo == 4) {
            return "Fiat Grand Siena";
        } else {
            return "Carro Indisponível";
        }
    }

    public String selecionarLocal(){
        if(local == 1){
            return "Canoas";
        } else if(local == 2){
            return "Porto Alegre";
        } else if(local == 3){
            return "Novo Hamburgo";
        } else if(local == 4){
            return "Gramado";
        } else {
            return "Local Indisponível";
        }
    }

    public double selecionarDiaria(){
        return this.diaria * 189.34;
    }

    public double verificarIdade(){
        if (this.idade >= 18 && this.idade <= 23){
            return (selecionarDiaria() * 0.15) + (35 / diaria);
        } else if(this.idade <= 24){
            return (selecionarDiaria() * 0.12) + (29 / diaria);
        } else {
            return 0;
        }
    }

    public double calcularAcessorios(){
        if(this.acessorio == 1){
            return 0;
        } else if(this.acessorio >= 2 && this.acessorio <= 4){
            return 25;
        } else {
            return 0;
        }
    }

    public String acessorioSelecionado(){
        if(this.acessorio == 1){
            return "Sem acessório";
        } else if(this.acessorio >= 2){
            return "Cadeira de bebê";
        }else if(this.acessorio >= 3){
            return "Assento com elevação";
        }else if(this.acessorio >= 4){
            return "Proteção a pneus e vidros";
        } else {
            return "Sem acessório";
        }
    }

    public double calculoValorAcessorio(){
        return (selecionarDiaria() + calcularAcessorios()) + verificarIdade();
    }

    @Override
    public String toString() {
        return "Nome: "+nome+
                "\nIdade: "+idade+
                "\nCpf: "+cpf+
                "\nTelefone: "+telefone+
                "\nVeículo: "+selecionarVeiculo()+
                "\nLocal de Retirada: "+selecionarLocal()+
                "\nNúmero de Diárias: "+diaria+
                "\nAcessório selecionado: "+acessorioSelecionado()+
                "\nValor total das Diárias: "+calculoValorAcessorio()+
                "\nCartão De Crédito: "+cartaoDeCredito;
    }






}
