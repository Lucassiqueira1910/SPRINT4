package br.com.fiap.model;


    public class StatusLinha {

        private int codigo;
        private String situacao;

        public StatusLinha() {
            super();
        }

        public StatusLinha(int codigo, String situacao) {
            super();
            this.codigo = codigo;
            this.situacao = situacao;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getSituacao() {
            return situacao;
        }

        public void setSituacao(String situacao) {
            this.situacao = situacao;
        }
    }

