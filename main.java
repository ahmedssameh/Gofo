public class main {
    public static void main(String args[]){
        gofo Gofo=new gofo();
        Ewallet kamal=new Ewallet(123,"456",1000);
        Ewallet mariam=new Ewallet(888,"777",2000);
        Ewallet ahmed=new Ewallet(444,"666",3000);
        Gofo.AddEwallet(kamal);
        kamal.AddEwallet(kamal);
        Gofo.AddEwallet(ahmed);
        kamal.AddEwallet(ahmed);
        Gofo.AddEwallet(mariam);
        kamal.AddEwallet(mariam);
        Playground play1=new Playground("cairo","23/1",6,20,11);
        Playground play2=new Playground("cairo","1/4",7,50,14);
        Playground play3=new Playground("alex","18/6",8,25,13);
        Playground play4=new Playground("alex","22/6",6,27,15);
        System.out.println(play1.toString());
        Gofo.AddPlayground(play1);
        System.out.println(play2.toString());
        Gofo.AddPlayground(play2);
        System.out.println(play3.toString());
        Gofo.AddPlayground(play3);
        System.out.println(play4.toString());
        Gofo.AddPlayground(play4);

        Gofo.searchPlayground("cairo","1/4");
        Gofo.searchPlayground("alex","18/6");
        Gofo.searchPlayground("cairo","23/1");

    }
}
