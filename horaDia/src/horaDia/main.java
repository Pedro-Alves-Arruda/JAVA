package horaDia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dataHoraAtual = new Date();
		String hora1 = new SimpleDateFormat("HH").format(dataHoraAtual);
		String hora2 = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
		
		
		if (Integer.parseInt(hora1) < 12) {
			System.out.println("Bom dia!!! agora são " + hora2 + " horas.");
		}else if(Integer.parseInt(hora1) < 18) {
			System.out.println("Boa tarde!!! agora são " + hora2 + " horas");
		}else if(Integer.parseInt(hora1) <= 24){
			System.out.println("Boa noite!!! agora são " + hora2 + " horas");
		}else if(Integer.parseInt(hora1) <= 5) {
			System.out.println("Boa Madrugada!!! agora são " + hora2 + " horas");
		}
	}

}
