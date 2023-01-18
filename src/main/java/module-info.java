module com.example.tres_en_raya {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tres_en_raya to javafx.fxml;
    exports com.example.tres_en_raya;
    exports com.example.tres_en_raya.Controladores;
    opens com.example.tres_en_raya.Controladores to javafx.fxml;
}