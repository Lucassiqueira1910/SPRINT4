package br.com.fiap.beans;

public class Trem {
        private int id;
        private String codigo;
        private String status;
        private Linha linha;
        private Estacao ultimaEstacao;

        public Trem() {
            super();
        }

    public Trem(int id, String codigo, String status) {
        this.id = id;
        this.codigo = codigo;
        this.status = status;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Linha getLinha() {
            return linha;
        }

        public void setLinha(Linha linha) {
            this.linha = linha;
        }

        public Estacao getUltimaEstacao() {
            return ultimaEstacao;
        }

        public void setUltimaEstacao(Estacao ultimaEstacao) {
            this.ultimaEstacao = ultimaEstacao;
        }

        @Override
        public String toString() {
            return "\n\nTrem{" +
                    "\nid do trem =" + id +
                    "\ncodigo do trem ='" + codigo + '\'' +
                    "\nstatus do trem ='" + status + '\'' +
                    "\nlinha do trem =" + linha +
                    "\nultima estação do trem =" + ultimaEstacao +
                    '}';
        }


}
