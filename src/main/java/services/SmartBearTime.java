package services;

import interfaces.SmartTimerInterface;

import java.util.Objects;

/**
 * @author Rasaq Sulaimon
 * @date 04/08/2022 20:54
 */
public class SmartBearTime implements SmartTimerInterface {

    private static final String[] tensNames = {
            "",
            "ten",
            "twenty"
    };

    private static final String[] hrNames = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    @Override
    public String convertEntry(String time) {
        if ((Objects.isNull(time) || time.isEmpty()) || (time.length() < 4 || time.length() > 5) || !time.contains(":")){
            //throw new IllegalArgumentException("Invalid entry");
            return "Invalid entry. Please try again (hh:mm): ";
        }

        String hrVal = time.substring(0, time.indexOf(":"));
        String minVal = time.substring(time.indexOf(":")+1);

        int hrRe = Integer.parseInt(hrVal);
        int min = Integer.parseInt(minVal);

        if ((hrRe < 0 || min < 0) || hrRe > 12 || min > 59){
            //throw new IllegalArgumentException("Invalid time entry range");
            return "Invalid entry. Please try again (hh:mm): ";
        }

        return numberToWord(hrRe, min);
    }

    @Override
    public String numberToWord(int hr, int min) {
        if (hr == 0 && min == 0) return "Midnight";
        else if(hr == 0){
            if(min < 30){
                if (min == 15){
                    return "quarter past midnight";
                }
                if (min >= 20 ){
                    return tensNames[min / 10]+" "+hrNames[min % 10]+ " past midnight";
                }
                return tensNames[min]+ " past midnight";

            }else{
                min = 60 - min;
                if (min == 15){
                    return "quarter to "+hrNames[hr+1];
                }
                if (min >= 20 ){
                    if (min == 30){
                        return "half past midnight";
                    }
                    return tensNames[min / 10]+" "+hrNames[min % 10]+ " to "+hrNames[hr+1];
                }
                return tensNames[min]+ " to "+hrNames[hr+1];
            }

        }
        else if (min == 0){
            if (hr == 12){
                return "Noon";
            }
            return hrNames[hr]+ " o'clock";
        }
        else if (min == 30) {
            return "half past "+hrNames[hr] ;
        }
        else if (min < 30){
            if (min == 15){
                return "quarter past "+hrNames[hr];
            }
            if (min >= 20){
                return tensNames[min / 10]+" "+hrNames[min % 10]+ " past "+hrNames[hr];
            }
            return hrNames[min]+ " past "+hrNames[hr];
        }
        else{
            min = 60 - min;
            if (min == 15){
                return  "quarter to "+hrNames[hr+1];
            }
            if (min >= 20){

                return tensNames[min / 10]+" "+hrNames[min % 10]+ " to "+hrNames[hr+1];
            }

            return hrNames[min]+ " to "+hrNames[hr+1];
        }

    }


}
