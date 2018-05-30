package interviewquestions;

import java.util.ArrayList;

 class StockBuySell {
	
	int buy, sell;
	}
	 
	class buySell 
	{
	    // This function finds the buy sell schedule for maximum profit
	    void stockBuySell(int price[], int n) 
	    {
	        // Prices must be given for at least two days
	        if (n == 1)
	            return;
	        int number=0 ;
	         int finalnum=0; 
	        int count = 0;
	 
	        // solution array
	        ArrayList<StockBuySell> sol = new ArrayList<StockBuySell>();
	 
	        // Traverse through given price array
	        int i = 0;
	        while (i < n - 1) 
	        {
	            // Find Local Minima. Note that the limit is (n-2) as we are
	            // comparing present element to the next element. 
	            while ((i < n - 1) && (price[i + 1] <= price[i]))
	                i++;
	 
	            // If we reached the end, break as no further solution possible
	            if (i == n - 1)
	                break;
	 
	            StockBuySell e = new StockBuySell();
	            e.buy = i++;
	            // Store the index of minima
	             
	 
	            // Find Local Maxima.  Note that the limit is (n-1) as we are
	            // comparing to previous element
	            while ((i < n) && (price[i] >= price[i - 1]))
	                i++;
	 
	            // Store the index of maxima
	            e.sell = i-1;
	            
	            sol.add(e);
	             
	            // Increment number of buy/sell
	            count++;
	        }
	 
	        // print solution
	        if (count == 0)
	            System.out.println("There is no day when buying the stock "
	                                                  + "will make profit");
	        else
	            for (int j = 0; j < count; j++) {
	            
	                number=price[sol.get(j).sell]-price[sol.get(j).buy] ;
	                
	                System.out.println(number);
	                
	                
	                finalnum+=number;

	            }
	        
	        
	        
	        System.out.println(finalnum);
	        return;
	    }
	 
	    public static void main(String args[]) 
	    {
	        buySell stock = new buySell();
	         
	        // stock prices on consecutive days
	        int price[] = {130, 110, 100,115,90, 100, 75, 85, 65, 70, 85};
	        int n = price.length;
	 
	        // fucntion call
	        stock.stockBuySell(price, n);
	    }
	
	

}
