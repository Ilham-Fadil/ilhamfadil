package ma.gov.tp8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.gov.tp8.controllers.ClientController;
import ma.gov.tp8.controllers.FactureController;
import ma.gov.tp8.models.Client;
import ma.gov.tp8.models.Facture;


public class MonApp {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		ClientController ctrl = (ClientController)context.getBean("ctrl");
//		  Client clt = new Client("ilham");
//	    //    ctrl.save(clt);
//	    //    ctrl.update();
//		  //ctrl.findById();
//		  ctrl.remove();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		FactureController ctrl = (FactureController)context.getBean("ctrl");
		Facture fac = new Facture(new Date("07/07/2000"));
		//ctrl.save(fac);
		Facture f = new Facture(1, new Date("01/01/2010"), 1000.00);
		//ctrl.update(f);
		//ctrl.remove(2L);
		List<Facture> facs = ctrl.findAll();
		for (Facture facture : facs) {
			System.out.println(facture.getId());
		}
	} 
}
