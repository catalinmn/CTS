package cts.nan.catalin.g1078.pattern.singleton;

import java.util.ArrayList;
import java.util.List;


public class Robot implements IRobotSoftware{

	private int id;
	private List<String> listaCereri;
	private static Robot instanta =  null;
	
	private Robot(int id) {
		super();
		this.id = id;
		this.listaCereri = new ArrayList<String>();
	}

	@Override
	public void trimiteCerere(String denumire) {
		System.out.println("Cererea " + denumire + " este trimisa pentru procesare");
		listaCereri.add(denumire);
	}

	@Override
	public String getInformatii(String categorie) {
		if (categorie.equals("/numarCereri")) {
			if(!listaCereri.isEmpty()) {
				return "Se proceseaza "+ this.listaCereri.size()+"cereri";
			}
			return "Nu exista informatii dispoibile";
		}
		else
			return "Categoria nu este inca disponibila";
	}

	@Override
	public void prelucrareCerere(String tip) {
		if(listaCereri.size() > 0) {
			System.out.println("Este in curs de procesare cererea " + tip);
			int index = listaCereri.indexOf(tip);
			listaCereri.remove(index);
		}
		else
			System.out.println("Nu exista cereri");
	}

	@Override
	public int getIdRobot() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	public static synchronized Robot getInstanta(int id){
		
		if(instanta == null) {
			instanta =  new Robot(id);
		}
		
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	

}
