/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.util.Scanner;
 

/**
 *
 * @author ABCD
 */
public class UserClass {
    String uname;
    String phonenumber;
    String address;
    Date dob;
    String balance;
    String cardnumber;
    String pin;
    
    public UserClass (String uname, String phonenumber, String address, Date dob, String balance, String cardnumber, String pin) {
        this.uname = uname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.dob = dob;
        this.balance = balance;
        this.cardnumber = cardnumber;
        this.pin = pin;
        
    }
}
