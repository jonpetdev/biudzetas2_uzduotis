
import java.time.LocalDateTime;

public class PajamuIrasas {

    private String info;
    private float suma;
    private LocalDateTime data;
    private boolean bankas;
    private PajamuKategorija pajamuKategorija;
    static int countas;
    private int counter;

    PajamuIrasas(float suma,LocalDateTime data, String info, boolean bankas, PajamuKategorija pajamuKategorija, int counter){
        this.suma=suma;
        this.data=data;
        this.info=info;
        this.bankas=bankas;
        this.pajamuKategorija=pajamuKategorija;
        this.counter=counter;

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isBankas() {
        return bankas;
    }

    public void setBankas(boolean bankas) {
        this.bankas = bankas;
    }

    public PajamuKategorija getPajamuKategorija() {
        return pajamuKategorija;
    }

    public void setPajamuKategorija(PajamuKategorija pajamuKategorija) {
        this.pajamuKategorija = pajamuKategorija;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
