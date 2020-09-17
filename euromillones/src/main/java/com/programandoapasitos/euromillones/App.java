package com.programandoapasitos.euromillones;

import com.programandoapasitos.euromillones.dao.History;
import com.programandoapasitos.euromillones.dao.Raffle;
import com.programandoapasitos.euromillones.utils.CSVHandler;
import com.programandoapasitos.euromillones.utils.EuromillonHandler;
import com.programandoapasitos.euromillones.utils.Request;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Generando sorteo..." );
        EuromillonHandler euro = new EuromillonHandler();
        Request request = new Request();
        CSVHandler csvHandler = new CSVHandler();
        Scanner in = new Scanner(System.in);

        try {
            request.downloadCSV();
            History history = csvHandler.generateEuromillonesHistory();
            Raffle raffle = euro.generateRaffle(history);
            raffle.generateRaffle();
            System.out.println("Sorteo generado correctamente");
        }
        catch (IOException e)
        {
            System.out.println("Sucedió un problema:\b");
            e.printStackTrace();
        }
        System.out.println("Pulse cualquier tecla para salir: ");
        in.nextLine();

    }
}
