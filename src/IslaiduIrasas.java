import java.time.LocalDateTime;

public class IslaiduIrasas {

    private String info;
    private float suma;
    private LocalDateTime data;
    private boolean bankas;
    private IslaiduKategorija islaiduKategorija;
    static int countas;
    int counter;

    IslaiduIrasas(float suma,LocalDateTime data, String info, boolean bankas, IslaiduKategorija islaiduKategorija, int counter){
        this.suma=suma;
        this.data=data;
        this.info=info;
        this.bankas=bankas;
        this.islaiduKategorija=islaiduKategorija;
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

    public IslaiduKategorija getIslaiduKategorija() {
        return islaiduKategorija;
    }

    public void setIslaiduKategorija(IslaiduKategorija islaiduKategorija) {
        this.islaiduKategorija = islaiduKategorija;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
