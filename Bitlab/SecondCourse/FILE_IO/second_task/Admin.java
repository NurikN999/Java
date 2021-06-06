

import java.util.*;
import java.io.*;

public class Admin {

    final static String fileName = "goodItems.txt";
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<GoodItem> items = new ArrayList<>();
        boolean isStop = false;

        while(!isStop){
            System.out.println("PRESS [1] TO ADD GOOD" +
                    "\nPRESS [2] TO LIST GOODS" +
                    "\nPRESS [3] TO DELETE GOOD" +
                    "\nPRESS [0] TO EXIT");
            String choice = in.next();

            if(choice.charAt(0) == '1'){
                System.out.print("\tENTER NAME: ");
                String name = in.next();
                System.out.print("\tENTER PRICE: ");
                int price = in.nextInt();

                GoodItem item = new GoodItem(name, price);

                items = getGoodItemList();
                items.add(item);
                saveGoodItemsList(items);
            }else if(choice.charAt(0) == '2'){

                ArrayList itemsList = getGoodItemList();
                for (int i = 0; i < itemsList.size(); i++) {
                    System.out.println((i + 1) + ") " + itemsList.get(i));
                }

            }else if(choice.charAt(0) == '3'){

                ArrayList itemsList = getGoodItemList();
                for (int i = 0; i < itemsList.size(); i++) {
                    System.out.println((i + 1) + ") " + itemsList.get(i));
                }

                System.out.println("Which one item you want to remove?: ");
                int index = in.nextInt();

                itemsList.remove(index - 1);
                saveGoodItemsList(itemsList);
            }else if(choice.charAt(0) == '0'){
                isStop = true;
            }else{
                System.out.println("Error! Input a right one, please!");
            }
        }

    }

    static ArrayList<GoodItem> getGoodItemList(){

        ArrayList<GoodItem> items = new ArrayList<>();

        try{
            BufferedReader fr = new BufferedReader(new FileReader(fileName));

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

    static void saveGoodItemsList(ArrayList<GoodItem> items){

        try{
            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName));
            for (GoodItem item: items) {
                fw.write(item.getName() + "\n");
                fw.write(item.getPrice() + "\n");
            }

            fw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
