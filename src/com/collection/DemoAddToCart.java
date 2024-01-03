package com.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoAddToCart {

	public static void main(String[] args) {
		//define map that contains the following object(key--mapped to the itemDescription object)
		Map<Integer,ItemDescription> itemDesc=new HashMap<>();
		//add element in the above map
		itemDesc.put(1,new ItemDescription("apple",35.9f));
		itemDesc.put(2,new ItemDescription("banna",21.5f));
		
		
		Map<Integer,Integer>cart=new HashMap<>();
		//Add the Item cart
		cart.put(1,10);
		cart.put(2,20);
		
		ChkOut chk=new ChkOut();
		int total=chk.pay(itemDesc,cart);
		System.out.println("tot cost "+total);
	
	}
		//getting the total payment cart
	}
	class ChkOut{
		//method
		public int pay(Map<Integer,ItemDescription>itemDesc,Map<Integer,Integer>cart) {
			int totCost=0;
			//get all entries in the cart---entrySet()
			for(Map.Entry<Integer,Integer>crt:cart.entrySet()) {
				ItemDescription item=itemDesc.get(crt.getKey());//retr object
				totCost+=item.unitcost*crt.getValue();
				
			}
			return totCost;
		}
	}


class ItemDescription{
	//prop
	//description of item
	private String itemName;
    float unitcost;
	//con setter getter toString
	public ItemDescription() {
		// TODO Auto-generated constructor stub
	}
	public ItemDescription(String itemName, float unitcost) {
		super();
		this.itemName = itemName;
		this.unitcost = unitcost;
	}
	
}