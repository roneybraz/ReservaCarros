package reserva.carros.sistema;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import reserva.carros.modelo.Marca_Carro;
import reserva.carros.modelo.NomeLojas;
import reserva.carros.modelo.ReservaCarros;
import reserva.carros.modelo.Tipo_Carro;


public class APPReservaCarros {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Tipo de Cliente ");
		System.out.println("1- Normal ");
		System.out.println("2- Premium ");
	
		int tipocarro=entrada.nextInt();
		
		ReservaCarros reservaCarros = new ReservaCarros();
		
		switch(tipocarro)
		{
			case 1:
				
				reservaCarros.setTipodeCliente("NORMAL");
				break;
			case 2:
			
				reservaCarros.setTipodeCliente("PREMIUM");
				break;
		
				
			default:
				System.out.println("Invalido");
				break;
			
		}
		
		
		System.out.println("Quantidade Pessoas: ");
		int quantidadepessoa=entrada.nextInt();	
		reservaCarros.setQuantidadePessoas(quantidadepessoa);
			
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
		Scanner scan=new Scanner(System.in);
		System.out.println("Data da reserva");
		System.out.println("Exemplo: 07-02-2019");
		System.out.println("Data Inicio: ");		
		String dataInicio=scan.nextLine();
		System.out.println("Data Final: ");		
		String dataFinal=scan.nextLine();
		
		
		try {
			
			Date dateInicio= sdf1.parse(dataInicio);			
			sdf1=new SimpleDateFormat("EEE, d MMM yyyy");
			reservaCarros.setDataInicio(sdf1.format(dateInicio).toString());
	
			
			
			Date dateFinal= sdf2.parse(dataFinal);			
			sdf2=new SimpleDateFormat("EEE, d MMM yyyy");
			reservaCarros.setDataInicio(sdf2.format(dateFinal).toString());	
	
			
			//String aux = sdf.format(dateFinal);
			
			//String[] aux2=aux.split(",");
			//System.out.println("Semana:"+ aux2[0]);
		
			
			
		} catch (Exception e) {
			System.out.println("Erro");
		}
		
		
		if(reservaCarros.getQuantidadePessoas()<=2)
		{
			System.out.println(Marca_Carro.Ferrari);
			System.out.println(NomeLojas.NorthCar);
		}
		else if(reservaCarros.getQuantidadePessoas()>=2 && reservaCarros.getQuantidadePessoas()<=5)
		{
			System.out.println(Marca_Carro.Nissan_Micra);
			System.out.println(NomeLojas.SouthCar);
		}
		else if(reservaCarros.getQuantidadePessoas()>=5 && reservaCarros.getQuantidadePessoas()<=7) 
		{
			System.out.println(Marca_Carro.Navigator);
			System.out.println(NomeLojas.WestCar);
		}
		
		
		
	


		
	
	

		

	}


}
