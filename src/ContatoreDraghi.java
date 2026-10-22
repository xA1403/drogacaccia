public class ContatoreDraghi implements Runnable {
    private final int count;
    private String name;

    public ContatoreDraghi(String nome, int count){
        setName(nome + "");
        this.count = count;
    }

    @Override
     public void run(){
        for(int i = 0; i < count; i++){
            System.out.println(this.getName() + "sto volando" + (i+1));
        }
     }

     private void setName(String s){ this.name=s; }
     private String getName(){ return name;}
}
