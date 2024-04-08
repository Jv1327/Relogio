/**
 *
 * @author Joao Victor
 */
public class app {

    public static class relogio {
    private int horas;
    private int minutos;

    public int gethora() {
        return this.horas;
    }
    public int getminutos() {
        return this.minutos;
    }

    public void setHora(int horas, int minutos) {
        this.minutos = minutos;
        while(this.minutos>=60) {
            this.horas++;
            this.minutos-=60;
        }
        this.horas = horas;
    }

    public void IncrementaMinutos() {
        this.minutos ++;
        if(this.minutos >= 60) {
            this.horas++;
            this.minutos = 0;
        }
    }
    public String mostraHora() {
        return Integer.toString(this.horas) + ":" + Integer.toString(this.minutos);
    }
}
    public static void main(String[] args) {
        relogio clock = new relogio();

        clock.setHora(10, 150);
        System.out.println(clock.mostraHora());
    }
}