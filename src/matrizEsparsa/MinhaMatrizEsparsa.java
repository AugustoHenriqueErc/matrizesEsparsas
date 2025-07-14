package matrizEsparsa;

public class MinhaMatrizEsparsa implements MatrizEsparsa {
    public int vLength; //Horizontal size
    public int hLength; //Vertical size
    public MinhaMatrizEsparsa() {
        this.vLength = 0;
        this.hLength = 0;
    }
    public int getVLength(){
        return vLength;
    }
    public int gethLength(){
        return hLength;
    }
    public insert(int i; int j; double v){
        if(hLength == 0) {

            hLength++;
        }
    }
    @Override
    public void print() {

    }
    public void multiply(MinhaMatrizEsparsa A, MinhaMatrizEsparsa B){

    }
    public void read(){

    }


}
