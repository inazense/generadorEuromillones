package com.programandoapasitos.euromillones.utils;

import com.programandoapasitos.euromillones.dao.History;
import com.programandoapasitos.euromillones.dao.Raffle;
import com.programandoapasitos.euromillones.dao.Ticket;

import java.util.*;

public class EuromillonHandler {

    private HashMap<Integer, Integer> numbersQty;
    private HashMap<Integer, Integer> starsQty;

    public EuromillonHandler()
    {
        this.numbersQty = new HashMap<Integer, Integer>();
        this.starsQty = new HashMap<Integer, Integer>();
        this.initMaps();
    }

    public Raffle generateRaffle(History history)
    {
        Raffle raffle = new Raffle();

        for (Ticket t : history.getTicketList())
        {
            for (int i = 0; i < t.getNumbers().length; i++)
            {
                this.increment(this.numbersQty, t.getNumbers()[i]);
            }

            for (int i = 0; i < t.getStars().length; i++)
            {
                this.increment(this.starsQty, t.getStars()[i]);
            }
        }

        int numbers[] = this.sortMap(this.numbersQty, 50);
        int stars[] = this.sortMap(this.starsQty, 12);

        this.getBestAndWorstThings(raffle, numbers, stars);
        return raffle;
    }

    private void getBestAndWorstThings(Raffle raffle, int[] numbers, int[] stars)
    {
        int bestNumbers[] = new int[5];
        int bestStars[] = new int[2];
        int worstNumbers[] = new int[5];
        int worstStars[] = new int[2];

        bestNumbers[0] = numbers[49];
        bestNumbers[1] = numbers[48];
        bestNumbers[2] = numbers[47];
        bestNumbers[3] = numbers[46];
        bestNumbers[4] = numbers[45];

        worstNumbers[0] = numbers[0];
        worstNumbers[1] = numbers[1];
        worstNumbers[2] = numbers[2];
        worstNumbers[3] = numbers[3];
        worstNumbers[4] = numbers[4];

        bestStars[0] = stars[11];
        bestStars[1] = stars[10];

        worstStars[0] = stars[0];
        worstStars[1] = stars[1];

        raffle.setBestNumbers(bestNumbers);
        raffle.setBestStars(bestStars);
        raffle.setWorstNumbers(worstNumbers);
        raffle.setWorstStars(worstStars);
    }

    private void initMaps()
    {
        for (int i = 1; i <= 50; i++)
        {
            this.numbersQty.put(i, 0);
            if (i <= 5)
            {
                this.starsQty.put(i, 0);
            }
        }
    }

    private void increment(HashMap<Integer, Integer> map, Integer key)
    {
        map.merge(key, 1, Integer::sum);
    }

    private int[] sortMap(HashMap<Integer, Integer> map, int length)
    {
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list)
        {
            temp.put(aa.getKey(), aa.getValue());
        }

        int array[] = new int[length];
        int key = 0;
        Iterator iterator = temp.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
            array[key] = Integer.parseInt(me2.getKey().toString());
            key++;
        }

        return array;
    }
}
