package com.example.dmv2.dealmedanv2final.view.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by Adlin on 24/05/2017.
 */

public class ParentActivity extends AppCompatActivity {

    /*
    * TO-DO
    * move one Activity to another Activity inside the Application
    */
    public static void doChangeActivity (Context context, Class destination) {
        Intent _intent = new Intent(context, destination);
        _intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(_intent);
    }

    public static String getIDRCurrency(double value){
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        return String.format("%s", kursIndonesia.format(value));
    }

    /**
     * Puts ellipses in input strings that are longer than than maxCharacters. Shorter strings or
     * null is returned unchanged.
     * @param input the input string that may be subjected to shortening
     * @param maxCharacters the maximum characters that are acceptable for the unshortended string. Must be at least 3, otherwise a string with ellipses is too long already.
     * @param charactersAfterEllipsis the number of characters that should appear after the ellipsis (0 or larger)
     * @return the truncated string with trailing ellipses
     */
    public static String doEllipsize(String input, int maxCharacters, int charactersAfterEllipsis) {
        if(maxCharacters < 3) {
            throw new IllegalArgumentException("maxCharacters must be at least 3 because the ellipsis already take up 3 characters");
        }
        if(maxCharacters - 3 < charactersAfterEllipsis) {
            throw new IllegalArgumentException("charactersAfterEllipsis must be less than maxCharacters");
        }
        if (input == null || input.length() < maxCharacters) {
            return input;
        }
        return input.substring(0, maxCharacters - 3 - charactersAfterEllipsis)
                + "..."
                + input.substring(input.length() - charactersAfterEllipsis);
    }


}
