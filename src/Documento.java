import java.text.SimpleDateFormat;
import java.util.Date;

public class Documento {
        private String titulo;
        private String dataEmissao;
        private int pagina;
        private SimpleDateFormat formatoTempo = new SimpleDateFormat("HH:mm:ss a");
      
        public Documento(String titulo) {
          this.titulo = titulo;
          this.dataEmissao = formatoTempo.format(new Date());
          this.pagina = pagina++;
        }
      
        public String getTitulo() {
          return titulo;
        }

        public String getDataEmissao() {
            return dataEmissao;
        }

        public int getPagina() {
            return pagina;
        }

        @Override
        public String toString() {
            return 
            "---------------------------------------"+
            "\nTítulo: " + getTitulo() +
            "\nData de emissão: " + getDataEmissao();
            
        }

        
        
      }

