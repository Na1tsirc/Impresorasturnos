public class Ordenadores extends Thread {

    Impresora impresoras;
    public Ordenadores(Impresora impresora){this.impresoras=impresora;}

    @Override
    public void run(){impresoras.entrada(this);}
}
