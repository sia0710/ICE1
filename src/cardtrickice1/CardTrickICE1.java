/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Sia Sia, student Id - 991664745
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(2);//use a method to generate random *13
            c1.setSuits("hearts");//random method suit 
        }
        //step 2:take input 
        
      /* Scanner in = new Scanner(System.in);
        System.out.println("Please select a card: ");
        String selectSuitCard = in.next();
        System.out.println("Choose a value between 1 to 13: ");
        int chooseNumCard = in.nextInt();*/
        
        //step 3: match with array 
        
        Card cardChoosen = new Card();
        
        /*cardSelected.setSuits(selectSuitCard);
        cardSelected.setValue(selectNumCard); */
        
        cardChoosen.setValue(5);
        cardChoosen.setSuits("Spades");
        
        boolean foundCard = false;
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == cardChoosen.getValue() && magicHand1.getSuits().equalsIgnoreCase(cardChoosen.getSuits())) {
                foundCard = true;
               break;
            }
                      
         }
             
         if(foundCard)
                System.out.println("Congratulations, card selected");
            else
                System.out.println("Sorry, card not selected");
    }
        
    }
    
    }
    

