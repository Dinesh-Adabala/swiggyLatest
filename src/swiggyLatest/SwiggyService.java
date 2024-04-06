package swiggyLatest;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SwiggyService {


    public ResturentList  getResturentList(){
        Restaurent koiRestaurent = new Restaurent();
        koiRestaurent.restaurentName="KOI MANDI";
        koiRestaurent.phoneName="9000308335";
        koiRestaurent.rating="5.0";
        Address koiMandiAddress = new Address(123,"Gandhi center","Karimnagar",533239);
        Dishes chickenFrypiceMandi = new Dishes("Chicken frypice Mandi",650);
        Dishes muttonFrypiceMandi = new Dishes("Mutton frypice Mandi",850);
        Dishes ChickenJucieMandi = new Dishes("Chicken jucie Mandi",1200);
        Dishes muttonJucieMandi = new Dishes("Mutton jucie Mandi",1500);
        List<Dishes> koiDishesList= new ArrayList<>();
        koiDishesList.add(chickenFrypiceMandi);
        koiDishesList.add(muttonFrypiceMandi);
        koiDishesList.add(ChickenJucieMandi);
        koiDishesList.add(muttonJucieMandi);
        koiRestaurent.address=koiMandiAddress;
        koiRestaurent.dishesList=koiDishesList;



        Restaurent mefileRestaurent = new Restaurent();
        mefileRestaurent.restaurentName="MEFIL MANDI";
        mefileRestaurent.phoneName="9000308335";
        mefileRestaurent.rating="4.5";
        Address mefileiAddress = new Address(123,"Gandhi center","Hyd",588853);
        Dishes chickenFrypiceBiriyan = new Dishes("Chicken frypice Biriyan",250);
        Dishes muttonFrypiceBiriyan = new Dishes("Mutton frypice Biriyan",350);
        Dishes chickenStater = new Dishes("Chicken stater",399);
        Dishes muttonStater = new Dishes("Mutton stater",499);
        List<Dishes> mefileDishesList= new ArrayList<>();
        mefileDishesList.add(chickenFrypiceBiriyan);
        mefileDishesList.add(muttonFrypiceBiriyan);
        mefileDishesList.add(chickenStater);
        mefileDishesList.add(muttonStater);
        mefileRestaurent.address=mefileiAddress;
        mefileRestaurent.dishesList=mefileDishesList;



        Restaurent vishnuSreeRestaurent = new Restaurent();
        vishnuSreeRestaurent.restaurentName="VISHNU SREE MANDI";
        vishnuSreeRestaurent.phoneName="9000308335";
        vishnuSreeRestaurent.rating="4.5";
        Address vishnuSreeAddress = new Address(123,"Gandhi center","Hyd",588853);
        Dishes chickenBiriyan = new Dishes("Chicken frypice Biriyan",350);
        Dishes muttonBiriyan = new Dishes("Mutton frypice Biriyan",500);
        Dishes chillyChickent = new Dishes("Chicken stater",299);
        Dishes muttonKeema = new Dishes("Mutton stater",599);
        List<Dishes> vishnuSreeDishesList= new ArrayList<>();
        vishnuSreeDishesList.add(chickenBiriyan);
        vishnuSreeDishesList.add(muttonBiriyan);
        vishnuSreeDishesList.add(chillyChickent);
        vishnuSreeDishesList.add(muttonKeema);
        vishnuSreeRestaurent.address=vishnuSreeAddress;
        vishnuSreeRestaurent.dishesList=vishnuSreeDishesList;


        List<Restaurent> restaurentList = new ArrayList<>();
        restaurentList.add(koiRestaurent);
        restaurentList.add(mefileRestaurent);
        restaurentList.add(vishnuSreeRestaurent);


        ResturentList restaurentListC = new ResturentList();
        restaurentListC.restaurentList=restaurentList;

        return restaurentListC;
    }

}
