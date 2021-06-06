

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    final static String fileName = "buyHistory.txt";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<BuyHistory> history = new ArrayList<>();
        boolean isStop = false;

        while(!isStop){
            System.out.println("PRESS [1] TO LIST GOODS" +
                             "\nPRESS [2] TO BUY GOODS" +
                             "\nPRESS [3] TO LIST BUY HISTORY" +
                             "\nPRESS [0] TO EXIT");

            char choice = in.next().charAt(0);

            if(choice == '1'){

                ArrayList itemsList = getGoodItemList();
                for (int i = 0; i < itemsList.size(); i++) {
                    System.out.println((i + 1) + ") " + itemsList.get(i));
                }

            }else if(choice == '2'){

                ArrayList itemsList = getGoodItemList();
                for (int i = 0; i < itemsList.size(); i++) {
                    System.out.println((i + 1) + ") " + itemsList.get(i));
                }

                System.out.print("\tENTER AN INDEX OF GOOD, WHICH YOU WANT TO BUY: ");
                int index = in.nextInt();
                GoodItem item = (GoodItem) itemsList.get(index - 1);

                BuyHistory buyItem = new BuyHistory(item.getName(), item.getPrice());
                history = getBuyHistory();
                history.add(buyItem);
                saveBuyHistory(history);

            }else if(choice == '3'){

                ArrayList buyList = getBuyHistory();
                for (int i = 0; i < buyList.size(); i++) {
                    System.out.println((i + 1) + ") " + buyList.get(i));
                }

            }else if(choice == '0'){
                isStop = true;
            }else
                System.out.println("ERROR! ENTER THE RIGHT ONE, PLEASE!");
        }
    }

    static ArrayList<GoodItem> getGoodItemList(){

        ArrayList<GoodItem> items = new ArrayList<>();

        try{
            BufferedReader fr = new BufferedReader(new FileReader("goodItems.txt"));

            String line = "";
            while((line = fr.readLine()) != null){

                int price = Integer.parseInt(fr.readLine());

                items.add(new GoodItem(line, price));
            }

            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        return items;
    }

    static void saveBuyHistory(ArrayList<BuyHistory> buyHistory){

        try{
            BufferedWriter fr = new BufferedWriter(new FileWriter(fileName));

            for (BuyHistory history: buyHistory) {
                fr.write(history.getGoodName() + "\n");
                fr.write(history.getGoodPrice() + "\n");
            }

            fr.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static ArrayList<BuyHistory> getBuyHistory(){
        ArrayList<BuyHistory> buyHistories = new ArrayList<>();

        try {
            BufferedReader fr = new BufferedReader(new FileReader(fileName));

            String line = "";
            while ((line = fr.readLine()) != null){

                int price = Integer.parseInt(fr.readLine());

                buyHistories.add(new BuyHistory(line, price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return buyHistories;
    }
}
