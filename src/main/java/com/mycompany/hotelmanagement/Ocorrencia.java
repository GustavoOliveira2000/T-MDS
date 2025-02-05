public class Ocorrencia {
    private int id;
    private String descricao;
    private Date dataOcorrencia;
    private final Hospede hospede;
    
    
        public Ocorrencia(int id, String descricao, Date dataOcorrencia, Hospede hospede){
            this.id = id;
            this.descricao = descricao;
            this.dataOcorrencia = dataOcorrencia;
            this.hospede = hospede;
        public  String getDetalhes(){
        return "ID da Ocorrência: " + id + "\n" +
               "Descrição da Ocorrência: " + descricao + "\n" +
               "Data da Ocorrência: " + dataOcorrencia + "\n" +
               "Hóspede: " + hospede.getNome();
    }        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Hospede getHospede() {
        return hospede;
    }
}   

