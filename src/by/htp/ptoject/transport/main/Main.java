package by.htp.ptoject.transport.main;

import by.htp.ptoject.transport.entity.ListOfTransport;
import by.htp.ptoject.transport.entity.Transport;
import by.htp.ptoject.transport.entity.kindOfTransport.AirTransport;
import by.htp.ptoject.transport.entity.kindOfTransport.SurfaceTransport;
import by.htp.ptoject.transport.entity.kindOfTransport.WaterTransport;
import by.htp.ptoject.transport.entity.trasports.ElectroBus;
import by.htp.ptoject.transport.entity.trasports.ElectroCar;
import by.htp.ptoject.transport.entity.trasports.Helicopter;
import by.htp.ptoject.transport.entity.trasports.Motorcycle;
import by.htp.ptoject.transport.entity.trasports.Plain;
import by.htp.ptoject.transport.entity.trasports.Ship;
import by.htp.ptoject.transport.entity.trasports.Subway;
import by.htp.ptoject.transport.entity.trasports.TrainOnMonorail;
import by.htp.ptoject.transport.entity.trasports.Yacht;

public class Main  {
	/* транспортные средства будущего
	вести учет транспрота вывести на экран 
	сортировка по скорости премещения 
	количесвто транспорта не менее 10 */
	public static void main(String[] args) {
	Transport car=new ElectroCar("Porche",256.7,4,"red","passenger",4,"electro");
	Transport bus=new ElectroBus("Neopllan",180.78,55,"green","passenger",12,"City");
	Transport bike=new Motorcycle("HarleyDavidson",255.8,2,"black","passenger",2,true);
	Transport train=new TrainOnMonorail("BVG",500.12,355,"white","passenger",88,654);
	Transport subway=new Subway("MogilevMash",200.10,200,"blue","passenger",122,25);
	Transport helicopter=new Helicopter("Apachi",678,10,"brown",1578,4);
	Transport plain=new Plain("BelAvia",1245.15,300,"blue",5245,2);
	Transport ship=new Ship("Kenno",124.15,18,"white",2,"small");
	Transport yacht=new Yacht("BMW",75.77,7,"yellow",1,3);
	
	Transport.showCount();
	AirTransport.showCountAirTransport();
	WaterTransport.showCountWaterTransport();
	SurfaceTransport.showCountSurfaceTransport();
	
	ListOfTransport list=new ListOfTransport(9);
	list.addList(yacht);
	list.addList(ship);
	list.addList(plain);
	list.addList(helicopter);
	list.addList(bus);
	list.addList(car);
	list.addList(bike);
	list.addList(subway);
	list.addList(train);
	
	list.showList();
	
	}

	}
