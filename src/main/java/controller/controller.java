package controller;

import Dao.invoicedao;
import Dto.Item;
import Dto.invoice;

public class controller {

	public static void main(String[] args) {
		invoicedao invoicedao = new invoicedao();
		Item item = new Item();
		item.setId(2);
		item.setName("laptop");
		item.setCost(15000);
		item.setQty(2);
		invoice invoice = new invoice();
		invoice.setId(2);
		invoice.setName("santhu");
		invoice.setBillingAddress("KAR JSP");
		invoice.setTax(789.85);
		invoice.setGstnumber("TRS-1568-86547");
		invoice.setItem(item);
		// invoicedao.save(invoice, item);
//		Item item2 = invoicedao.getItem(1);
//		System.out.println("name : " + item2.getName());
//		System.out.println("Cost : " + item2.getCost());
//		invoice invoice2 = item2.getInvoice();
//		System.out.println("address :" + invoice2.getBillingAddress());
//		System.out.println("Gst : " + invoice2.getGstnumber());
		
		//invoicedao.delete(1);
		invoicedao.update(invoice);
	
	}

}
