/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author ASUS
 */
public class Car {
    int kecmax;
    int percepatan;
    int kecaktual;
    boolean started;
    int gigi;
    
    public Car(){
    }
    public Car (int kecmax, int percepatan, int kecaktual){
        this.kecmax = kecmax;
        this.percepatan = percepatan;
        this.kecaktual = kecaktual;
        this.started = false;
        this.gigi = 0;
    }
    //setter
    //procedure
    public void setKecmax(int kecmax) {
        this.kecmax = kecmax;
    }

    public void setPercepatan(int percepatan) {
        this.percepatan = percepatan;
    }

    public void setKecaktual(int kecaktual) {
        this.kecaktual = kecaktual;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
    //getter
    //function
    public int getKecmax() {
        return kecmax;
    }

    public int getPercepatan() {
        return percepatan;
    }

    public int getKecaktual() {
        return kecaktual;
    }

    public boolean isStarted() {
        return started;
    }
    public void Start(){
        if (!started){
            this.setKecaktual(0);
            System.out.println(" Mobil Menyala ");
        }
    }
    public void stop(){
        this.setKecaktual(0);
        this.started = true;
        System.out.println();
        System.out.println("Kecepatan car " + this.getKecaktual());
        System.out.println("Mobil sudah berhenti");
        System.out.println();
    }
    public void rem(){
        this.setKecaktual(this.getKecaktual()-15);
    }
    public void gantiGigi(int gigi){
        switch(gigi){
            case 0:
                this.setPercepatan(0);
                break;
            case 1:
                this.setPercepatan(15);
                break;
            case 2:
                this.setPercepatan(30);
                break;
            case 3:
                this.setPercepatan(45);
                break;
            case 4:
                this.setPercepatan(80);
                break;
            case 5:
                this.setPercepatan(100);
        }
    }
    public void gas(){
        if(this.getKecaktual()+this.getPercepatan()< this.getKecmax()){
            this.setKecaktual(this.getKecaktual()+this.getPercepatan());
        }else this.setKecaktual(this.getKecmax());
    }
}
