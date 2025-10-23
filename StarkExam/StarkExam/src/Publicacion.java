public class Publicacion {
        private String Codigo;
        private String Titulo;
        private int AnioPublicacion;

        Publicacion (String Codigo, String Titulo, int AnioPublicacion) {
            this.Codigo = Codigo;
            this.Titulo = Titulo;
        }

        public String AgregarCodigo() {
            return Codigo;
        }

        public void ReglasCodigo(String Codigo) {
            if (Codigo != null);
            this.Codigo = Codigo;
        } {
            System.out.println("Codigo Invalido");
        }

        public String AgregarTitulo() {
            return Titulo;
        }

        public void ReglasTitulo(String Titulo) {
            if (Titulo != null);
            this.Titulo = Titulo;
        } {
            System.out.println("Titulo Invalido");
        }

        public int AgregarAnioPublicacion() {
            return AnioPublicacion;
        }

        public void ReglasAnioPublicacion(int AnioPublicacion) {
            if (AnioPublicacion > 0 );
            this.AnioPublicacion = AnioPublicacion;
        } {
            System.out.println("Titulo Invalido");
        }

        void start; {
            System.out.println("Codigo: " + Codigo, "Titulo: " + Titulo, "Anio de Publicacion:" + AnioPublicacion);
        }
    }

