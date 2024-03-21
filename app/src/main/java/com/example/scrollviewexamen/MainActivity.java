package com.example.scrollviewexamen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar OnClickListener para cada ImageButton
        configureImageButtonOnClick(R.id.ags, "Aguascalientes", "1", "5,618 km²", "1,425,200 hab.");
        configureImageButtonOnClick(R.id.bc, "Baja California", "2", "71,576 km²", "3,769,020 hab.");
        configureImageButtonOnClick(R.id.bcs, "Baja California Sur", "3", "73,909 km²", "798,447 hab.");
        configureImageButtonOnClick(R.id.cam, "Campeche", "4", "57,507 km²", "928,363 hab.");
        configureImageButtonOnClick(R.id.chia, "Chiapas", "5", "73,311 km²", "5,543,828 hab.");
        configureImageButtonOnClick(R.id.chih, "Chihuahua", "6", "247,087 km²", "3,741,869 hab.");
        configureImageButtonOnClick(R.id.coah, "Coahuila", "7", "151,563 km²", "3,218,708 hab.");
        configureImageButtonOnClick(R.id.col, "Colima", "8", "5,191 km²", "380,575 hab.");
        configureImageButtonOnClick(R.id.cdmx, "Ciudad de México", "9", "1,495 km²", "9,209,944 hab.");
        configureImageButtonOnClick(R.id.dur, "Durango", "10", "123,451 km²", "1,832,650 hab.");
        configureImageButtonOnClick(R.id.gto, "Guanajuato", "11", "30,608 km²", "5,853,677 hab.");
        configureImageButtonOnClick(R.id.gro, "Guerrero", "12", "63,621 km²", "3,533,251 hab.");
        configureImageButtonOnClick(R.id.hgo, "Hidalgo", "13", "20,813 km²", "3,086,673 hab.");
        configureImageButtonOnClick(R.id.jal, "Jalisco", "14", "78,599 km²", "8,348,151 hab.");
        configureImageButtonOnClick(R.id.emex, "México", "15", "22,357 km²", "16,992,418 hab.");
        configureImageButtonOnClick(R.id.mich, "Michoacán", "16", "58,599 km²", "4,748,846 hab.");
        configureImageButtonOnClick(R.id.nay, "Nayarit", "17", "27,621 km²", "1,235,456 hab.");
        configureImageButtonOnClick(R.id.nl, "Nuevo León", "18", "64,924 km²", "5,784,442 hab.");
        configureImageButtonOnClick(R.id.oax, "Oaxaca", "19", "93,793 km²", "4,132,148 hab.");
        configureImageButtonOnClick(R.id.pue, "Puebla", "20", "34,306 km²", "6,583,278 hab.");
        configureImageButtonOnClick(R.id.qro, "Querétaro", "21", "11,687 km²", "2,368,467 hab.");
        configureImageButtonOnClick(R.id.qroo, "Quintana Roo", "22", "50,212 km²", "1,857,985 hab.");
        configureImageButtonOnClick(R.id.slp, "San Luis Potosí", "23", "62,849 km²", "2,822,255 hab.");
        configureImageButtonOnClick(R.id.sin, "Sinaloa", "24", "58,328 km²", "2,966,321 hab.");
        configureImageButtonOnClick(R.id.son, "Sonora", "25", "179,503 km²", "3,146,807 hab.");
        configureImageButtonOnClick(R.id.tab, "Tabasco", "26", "24,738 km²", "2,581,102 hab.");
        configureImageButtonOnClick(R.id.tam, "Tamaulipas", "27", "80,175 km²", "3,527,735 hab.");
        configureImageButtonOnClick(R.id.tlax, "Tlaxcala", "28", "4,016 km²", "1,342,977 hab.");
        configureImageButtonOnClick(R.id.ver, "Veracruz", "29", "71,820 km²", "8,062,579 hab.");
        configureImageButtonOnClick(R.id.yuc, "Yucatán", "30", "39,612 km²", "2,320,898 hab.");
        configureImageButtonOnClick(R.id.zac, "Zacatecas", "31", "75,040 km²", "1,622,138 hab.");

    }

    // Método para configurar el OnClickListener de los ImageButtons
    private void configureImageButtonOnClick(int buttonId, final String nombre, final String numeroEstado, final String extension, final String poblacion) {
        ImageButton imageButton = findViewById(buttonId);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDatosMunicipio(nombre, numeroEstado, extension, poblacion);
            }
        });
    }

    // Método para mostrar los datos del municipio en un AlertDialog
    private void mostrarDatosMunicipio(String nombre, String numeroEstado, String extension, String poblacion) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Estado #" + numeroEstado + ": " + nombre)
                .setMessage("Extensión: " + extension + "\n" +
                        "Población: " + poblacion)
                .setPositiveButton("Aceptar", null)
                .show();
    }
}
