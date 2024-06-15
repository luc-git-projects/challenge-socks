/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.luciano.challenge.socks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author luciano
 */
public class ChallengeSocks {

    public static void main(String[] args) {
        
        Integer[] arraySocks = {1, 5, 7, 3, 1, 1, 5, 7, 7, 9, 1, 4, 11, 8};
        List<Integer> allSocks = Arrays.asList(arraySocks);
        int numberOfPairs = sockMerchant(12, allSocks);
        System.out.println("Total of pairs of sockets = " + numberOfPairs);
    }
    
    public static int sockMerchant(int n, List<Integer> ar){
        
 
        if(isListEmpyty(ar)){
            return 0;
        }

        if(isAmmountOfElementsNotValid(n)){
            return 0;
        }
         
        List<Integer> socks = extractSocks(n, ar);
        
        int numberOfPairs = totalNumberOfPairs(socks);
        
        return numberOfPairs;
    }
    
    private static boolean isListEmpyty(List<Integer> socks){
        
        if((socks == null) || (socks.isEmpty())){
            return true;
        }
        
        return false;
    }
    
    private static boolean isAmmountOfElementsNotValid(int ammountOfElements){
        if(ammountOfElements <= 0){
            return true;
        }
        return false;
    }
    
    private static List<Integer> extractSocks(int numberofSockToBeExtract, List<Integer> socks){
       
        List<Integer> socksExtracted = new ArrayList<>();
        
        for(int i = 0; i < numberofSockToBeExtract; i++){
            Integer sock = socks.get(i);
            socksExtracted.add(sock);
        }
        
        return socksExtracted;
    }
    
    private static int totalNumberOfPairs(List<Integer> socks){
        
         int numberOfPairs = 0;
         
         for(int i = 0; i < socks.size(); i++){
            Integer sock = socks.get(i);
            
            for(int j = i + 1; j < socks.size(); j++){
             
                Integer nextSock = socks.get(j);
                
                if(sock.equals(nextSock)){
                    numberOfPairs++;
                    socks.remove(j);
                    break;
                }
            }
        }
        return numberOfPairs;
    }
}
