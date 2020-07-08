import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Akaringula {
    private final int playerPopulation;
    private final int loops;

    public Akaringula(int playerPopulation, int loops){

        this.playerPopulation = playerPopulation;
        this.loops=loops;


    }

    public void Play() throws InterruptedException {


        for (int i = 0; i < playerPopulation; i++) {
             players.add(i);
        }


        int player = 0;

        int i = 0;
        while(i<loops){
            int patner = player + 2;

            if(patner>=playerPopulation){
                patner -= playerPopulation;
            }


            TimeUnit.MILLISECONDS.sleep(1700);
            System.out.println("Slappers : { "+player+" , "+patner+" } - AKARINGULA!!!");



            player++;
            if(player==playerPopulation){
                player-=playerPopulation;
                i++;
            }

        }

    }

}
