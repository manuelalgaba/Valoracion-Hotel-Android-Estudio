package com.miempresa.valoracionhotel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txtMedia;
    private RatingBar rtPersonal, rtInstalaciones, rtServicios, rtLimpieza, rtConfort, rtCalidad_Precio, rtUbicacion;
    private Button btnNuevaValoracion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia a los elementos de la interfaz
        txtMedia = findViewById(R.id.txtMedia);
        rtPersonal = findViewById(R.id.rtPersonal);
        rtInstalaciones = findViewById(R.id.rtInstalaciones);
        rtServicios = findViewById(R.id.rtServicios);
        rtLimpieza = findViewById(R.id.rtLimpieza);
        rtConfort = findViewById(R.id.rtConfort);
        rtCalidad_Precio = findViewById(R.id.rtCalidad_Precio);
        rtUbicacion = findViewById(R.id.rtUbicacion);
        btnNuevaValoracion = findViewById(R.id.btnNuevaValoracion);

        // listener ratingBar
        rtPersonal.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            calcularYmostrarmedia();
        });
        rtInstalaciones.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            calcularYmostrarmedia();
        });
        rtServicios.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            calcularYmostrarmedia();
        });
        rtLimpieza.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            calcularYmostrarmedia();
            });
        rtConfort.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            calcularYmostrarmedia();
        });
        rtCalidad_Precio.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            calcularYmostrarmedia();
        });
        rtUbicacion.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            calcularYmostrarmedia();
        });

        calcularYmostrarmedia();


        // Manejar el evento del botón
        btnNuevaValoracion.setOnClickListener(v -> {
            rtPersonal.setRating(0);
            rtInstalaciones.setRating(0);
            rtServicios.setRating(0);
            rtLimpieza.setRating(0);
            rtConfort.setRating(0);
            rtCalidad_Precio.setRating(0);
            rtUbicacion.setRating(0);
            calcularYmostrarmedia();
        });

    }

    private void calcularYmostrarmedia() {
        // Calcular la media de las puntuaciones
        float media = (rtPersonal.getRating() + rtInstalaciones.getRating() + rtServicios.getRating() +
                rtLimpieza.getRating() + rtConfort.getRating() + rtCalidad_Precio.getRating() +
                rtUbicacion.getRating()) / 7;

        // Mostrar la media en el TextView
        txtMedia.setText("Media: " + media);
    }
}