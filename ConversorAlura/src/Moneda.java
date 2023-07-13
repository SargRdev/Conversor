public class Moneda {
	

	public String getDolaresQuetzalez(double valor) {
		double total = valor / 0.13;
		String mensaje = "Tienes Q " + (Math.round(total*100.0)/100.0) + " Quetzales";
		return mensaje;
	}

	public String getQuetzalesDolares(double valor) {
		double total = valor / 7.61;
		String mensaje = "Tienes $ " + (Math.round(total*100.0)/100.0)+ " Dolares";
		return mensaje; 
	}

	public String getEurosQuetzales(double valor) {
		double total = valor / 0.12;
		String mensaje = "Tienes Q " + (Math.round(total*100.0)/100.0) + " Quetzales";
		return mensaje;
	}
	
	
	public String getQuetzalesEuros(double valor) {
		double total = valor / 8.64;
		String mensaje = "Tienes €" + (Math.round(total*100.0)/100.0) + " Euros";
		return mensaje;
	}
	

	public String getLibraQuetzales(double valor) {
		double total = valor / 10.15;
		String mensaje = "Tienes Q " + (Math.round(total*100.0)/100.0) + " Quetzales";
		return mensaje;
	}
	
	
	public String getQuetzalesLibra(double valor) {
		double total = valor / 0.099;
		String mensaje = "Tienes ₤" + (Math.round(total*100.0)/100.0) + " Libras";
		return mensaje;
	}
	
	public String getYenQuetzales(double valor) {
		double total = valor / 0.056;
		String mensaje = "Tienes Q " + (Math.round(total*100.0)/100.0) + " Quetzales";
		return mensaje;
	}
	
	
	public String getQuetzalesYen(double valor) {
		double total = valor / 17.82;
		String mensaje = "Tienes ¥" + (Math.round(total*100.0)/100.0) + " Yenes";
		return mensaje;
	}
	
	public String getWonQuetzales(double valor) {
		double total = valor / 0.056;
		String mensaje = "Tienes Q " + (Math.round(total*100.0)/100.0) + " Quetzales";
		return mensaje;
	}
	
	
	public String getQuetzalesWon(double valor) {
		double total = valor / 0.099;
		String mensaje = "Tienes ₩" + (Math.round(total*100.0)/100.0) + " Wones";
		return mensaje;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Moneda moneda = new Moneda();

System.out.println(moneda.getDolaresQuetzalez(100));
System.out.println(moneda.getQuetzalesDolares(100));
	}

	/*
	 * public void ConvertirPesosArgentinoEuros(double valor) { double monedaEuro =
	 * valor / 137.20; monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
	 * JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros"); }
	 * public void ConvertirPesosArgentinoLibra(double valor) { double monedaLibra =
	 * valor / 161.52; monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
	 * JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra +
	 * " Libras Esterlinas"); } public void ConvertirPesosArgentinoYen(double valor)
	 * { double monedaYen = valor / 1; monedaYen = (double)Math.round(monedaYen *
	 * 100d) /100 ; JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen +
	 * " Yen Japonés"); } public void ConvertirPesosArgentinoWon(double valor) {
	 * double monedaWon = valor / 0.1; monedaWon = (double)Math.round(monedaWon *
	 * 100d) /100 ; JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon +
	 * " Won sub-coreano"); }
	 * 
	 * public void ConvertirDolaresPesosArgentino(double valor) { double monedaDolar
	 * = 137.68 * valor; monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
	 * JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar +
	 * " en pesos"); } public void ConvertirEurosPesosArgentino(double valor) {
	 * double monedaEuro = valor * 137.20; monedaEuro =
	 * (double)Math.round(monedaEuro * 100d) /100 ;
	 * JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro +
	 * " en pesos"); } public void ConvertirLibraPesosArgentino(double valor) {
	 * double monedaLibra = valor * 161.52; monedaLibra =
	 * (double)Math.round(monedaLibra * 100d) /100 ;
	 * JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra
	 * + " en pesos"); } public void ConvertirYenPesosArgentino(double valor) {
	 * double monedaYen = valor * 1; monedaYen = (double)Math.round(monedaYen *
	 * 100d) /100 ; JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " +
	 * monedaYen + " en pesos"); } public void ConvertirWonPesosArgentino(double
	 * valor) { double monedaWon = valor * 0.1; monedaWon =
	 * (double)Math.round(monedaWon * 100d) /100 ;
	 * JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon +
	 * " en pesos"); }
	 */
}
