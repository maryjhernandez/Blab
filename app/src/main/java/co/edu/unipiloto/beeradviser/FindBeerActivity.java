package co.edu.unipiloto.beeradviser;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


public class FindBeerActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClick(View view){
        TextView list = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.Color);
        String prodType = String.valueOf(color.getSelectedItemId());

        if(prodType.equals("0")){
            String temp = "1. Construcción de Teatros y Salas de Concierto" +
                    "\n2. EStudio de cine y tv" +
                    "\n3. Festivales de musica y arte" +
                    "\n4. Cento de danzas y expresion artistica" +
                    "\n5. Galerias de arte contemporaneo";
            list.setText(temp);

        }

        if(prodType.equals("1")){
            String temp = "1. Construcción de Sistemas de Riego" +
                    "\n2. Desarrollo de Granjas y Plantaciones" +
                    "\n3. Programas de Capacitación Agrícola" +
                    "\n4. Proyectos de Agroforestería";
            list.setText(temp);
        }
        if(prodType.equals("2")){
            String temp = "1. Construcción de Plantas de Energía Solar y Eólica" +
                    "\n2. Desarrollo de Centrales Hidroeléctricas" +
                    "\n3. Implementación de Redes de Distribución Eléctrica" +
                    "\n4. Energía Geotérmica";
            list.setText(temp);

        }

        if(prodType.equals("3")){
            String temp = "1. Construcción de Presas y Embalses" +
                    "\n2. Plantas de Tratamiento de Agua Potable" +
                    "\n3. Sistemas de Drenaje y Control de Inundaciones" +
                    "\n4. Proyectos de Desalinización" +
                    "\n5. Programas de Conservación de Aguas Subterráneas";
            list.setText(temp);

        }

        if(prodType.equals("4")){
            String temp = "1. Centros de Atención para Personas Mayores y con Discapacidad " +
                    "\n2. Programas de Inclusión Social" +
                    "\n3. Iniciativas de Educación y Empoderamiento de Género" +
                    "\n4. Lucha contra la Pobreza" +
                    "\n5. Centros de Juventud y Recreación";
            list.setText(temp);

        }

        if(prodType.equals("5")){
            String temp = "1.  Implementación de Redes de Internet de Alta Velocidad" +
                    "\n2. Desarrollo de Plataformas de Gobierno Electrónico" +
                    "\n3. Centros de Innovación Tecnológica" +
                    "\n4. Digitalización de Servicios Públicos" +
                    "\n5. Alfabetización Digital" +
                    "\n6. nfraestructura para Tecnología 5G";
            list.setText(temp);

        }

        if(prodType.equals("6")){
            String temp = "1. Laboratorios de Investigación Científica" +
                    "\n2. Centros de Desarrollo Tecnológico" +
                    "\n3. Proyectos de Investigación Médica" +
                    "\n4. Programas de Desarrollo de Inteligencia Artificial" +
                    "\n5. Desarrollo de Nuevos Materiales y Tecnologías";
            list.setText(temp);

        }

    }


}