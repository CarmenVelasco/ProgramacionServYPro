package webscrapper_clases;

import java.io.IOException;

public class main {
	
	public static void main(String[] args) throws IOException {
	   ParserEngine parser = new ParserEngine();
	   String url = "https://www.bolsamadrid.es/esp/aspx/Mercados/Precios.aspx?indice=ESI100000000&punto=indice";
	   parser.listAllLinks(url);
	}

}
