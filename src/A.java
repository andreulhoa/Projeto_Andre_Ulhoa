public class A {
    private int A1;
    private float A2;
    public void setA1(int A1){
        this.A1 = A1;
    }

    public void setA2(float A2){
        this.A2 = A2;
    }

    public int getA1(){
        return this.A1;
    }

    public float getA2(){
        return this.A2;
    }

    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }
    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    };
    public int getSoma(int n1, int n2) {
        int resultado = n1+n2;
        return resultado;
    }
}
