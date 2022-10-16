package HRS; // may vary

import java.util.*;
import java.io.*;

public class HRS_Main
{

    String cust_name, add, phone_no;
    double base_amt, gst;
    int base_dur, adults, children,total_cust, mattress;
    char laundry, brkfst, lunch, dinner, wifi, swimming, gym, spa, r_type, x;
    boolean flag;

    public HRS()
    {
        cust_name_name=null;
        add=null;
        phone_no=null;
        base_amt=50.0d;
        gst=0.0d;
        base_dur=1;
        adults=0;
        children=0;
        total_cust=0;
        mattress=1;
        laundry=' ';
        brkfst=' ';
        lunch=' ';
        dinner=' ';
        wifi=' ';
        swimming=' ';
        gym=' ';
        spa=' ';
        r_type=' ';
        x=' ';
        flag=true;
    }

    public void inp() throws IOException
    {
        System.out.println("**********Welcome to Mad NoMad**********"); // Any Hotel Name

        Date date = new Date();
        System.out.println("**********"+date.toString()+"**********");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book to book a room and exit for exit :");
        x=sc.nextLine().charAt(0);

        for(;x!='book'&&x!='exit';)
        {
            System.out.println("Wrong input.\nEnter book to book a room and exit for exit :");
            x=sc.nextLine().charAt(0);
        }

        if(x=='Exit'||x=='exit')
            System.exit(0);

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        for(;;)
        {
            System.out.println("Enter Number Of Adults :");
            adults=sc.nextInt();
            for(;adults<1;)
            {
                System.out.println("Wrong input.\nEnter Number Of Adults :");
                adults=sc.nextInt();
            }

            System.out.println("Enter Number Of Children :");
            children=sc.nextInt();
            for(;children<0;)
            {
                System.out.println("Wrong input.\nEnter Number Of Children :");
                children=sc.nextInt();
            }

            total_cust=adults+children;

            if(total_cust!=1)
                break;
            else
                System.out.println("Wrong input.\nTotal number of customers cannot be 0.");
        }

        System.out.println("Enter Number Of Mattresses (if required) @USD 100 per mattress per day :");
        mattress=sc.nextInt();
        for(;mattress<0;)
        {
            System.out.println("Wrong input.\nEnter Number Of Mattresses (if required) :");
            mattress=sc.nextInt();
        }

        for(;;)
        {
            System.out.println("Enter your Name :");
            c_name=br.readLine();
            for(int i=0;i<c_name.length();i++)
            {
                if(i==0)
                    if(Character.isWhitespace(c_name.charAt(i)))
                    {
                        flag=false;
                        break;
                    }
                if(!(Character.isLetter(c_name.charAt(i))||Character.isWhitespace(c_name.charAt(i))))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
               break;
            else
            {
                System.out.println("Wrong input.");
                flag=true;
            }
        }

        System.out.println("Enter Address :");
        add=br.readLine();

        for(;;)
        {
            System.out.println("Enter your Phone Number :");
            phone_no=br.readLine();
            for(int i=0;i<phone_no.length();i++)
                if(!(Character.isDigit(phone_no.charAt(i))))
                {
                    flag=false;
                    break;
                }
            if(flag)
               break;
            else
            {
                System.out.println("Wrong input.");
                flag=true;
            }
        }

        for(;;)
        {
            System.out.println("Enter Booking Duration (in days) :");
            b_dur=sc.nextInt();
            if(b_dur<1)
                System.out.println("Wrong input.");
            else
                break;
        }

        System.out.println("Enter 1 for Standard room (@USD 50/day), 2 for Upgrade (@USD 70/day) or 3 for Super Upgrade (@USD 90/day) :");
        r_type=sc.next().charAt(0);
        for(;r_type!='1'&&r_type!='2'&&r_type!='3';)
        {
            System.out.println("Wrong input.\nEnter 1 for Standard room (@USD 50/day), 2 for Upgrade  (@USD 70/day) or 3 for Super Upgrade  (@USD 90/day) :");
            r_type=sc.next().charAt(0);
        }

        System.out.println("Enter Yes to avail laundry service (@USD 2/day) and N/n if not :");
        laundry=sc.next().charAt(0);
        for(;laundry!='Yes'&&laundry!='No'&&laundry!='yes'&&laundry!='no';)
        {
            System.out.println("Wrong input\nEnter Yes to avail laundry service (@USD 2/day) and No if not :");
            laundry=sc.next().charAt(0);
        }      

        System.out.println("Enter Yes if interested in having breakfast (@USD 5/day) and No if not :");
        brkfst=sc.next().charAt(0);
        for(;brkfst!='Yes'&&brkfst!='No'&&brkfst!='yes'&&brkfst!='no';)
        {
            System.out.println("Wrong input\nEnter Yes if interested in having breakfast (@USD 5/day) and No if not :");
            brkfst=sc.next().charAt(0);
        }

        System.out.println("Enter Yes if interested in having lunch (@USD 5/day) and No if not :");
        lunch=sc.next().charAt(0);
        for(;lunch!='Yes'&&lunch!='No'&&lunch!='yes'&&lunch!='no';)
        {
            System.out.println("Wrong input\nEnter Yes if interested in having lunch (@USD 5/day) and No if not :");
            lunch=sc.next().charAt(0);
        }

        System.out.println("Enter Yes if interested in having dinner (@USD 5/day) and No if not :");
        dinner=sc.next().charAt(0);
        for(;dinner!='Yes'&&dinner!='No'&&dinner!='yes'&&dinner!='no';)
        {
            System.out.println("Wrong input\nEnter Yes if interested in having dinner (@USD 5/day) and No if not :");
            dinner=sc.next().charAt(0);
        }

        System.out.println("Enter Yes for wifi (@USD 2/day) and No to not :");
        wifi=sc.next().charAt(0);
        for(;wifi!='Yes'&&wifi!='No'&&wifi!='yes'&&wifi!='no';)
        {
            System.out.println("Wrong input\nEnter Yes for wifi (@USD 2/day) and No to not :");
            wifi=sc.next().charAt(0);
        }           

        System.out.println("Enter Yes to access swimming pool area (@USD 2.5/day) and No to not :");
        swimming=sc.next().charAt(0);
        for(;swimming!='Yes'&&swimming!='No'&&swimming!='yes'&&swimming!='no';)
        {
            System.out.println("Wrong input\nEnter Yes to access swimming pool area (@USD 2.5/day) and N/n to not :");
            swimming=sc.next().charAt(0);
        }

        System.out.println("Enter Yes to get gym facility (@USD 250/day) and No to not :");
        gym=sc.next().charAt(0);
        for(;gym!='Yes'&&gym!='No'&&gym!='yes'&&gym!='no';)
        {
            System.out.println("Wrong input\nEnter Yes to get gym facility (@USD 2.5/day) and No to not :");
            gym=sc.next().charAt(0);
        }            

        System.out.println("Enter Yes to get spa facility (@USD 3/day) and No to not :");
        spa=sc.next().charAt(0);
        for(;spa!='Yes'&&spa!='No'&&spa!='yes'&&spa!='no';)
        {
            System.out.println("Wrong input\nEnter Yes to get spa facility (@USD 3/day) and No to not :");
            spa=sc.next().charAt(0);
        }
    }

    public double calculate()
    {
        System.out.println("Customer Name - "+cust_name);
        if(r_type=='1')
            base_amt=base_dur*50;
        else if(r_type=='2')
            base_amt=base_dur*70;
        else
            base_amt=base_dur*90;

        System.out.println("Room rental- USD "+base_amt);
        base_amt+=(1*base_dur*mattress);

        System.out.println("Mattress charges- USD "+((1.0)*b_dur*mattress));

        if(laundry=='Yes'||laundry=='yes')
        {
            base_amt+=(2*base_dur);
            System.out.println("Laundry charges- USD "+((2.0)*b_dur));
        }
        else
            System.out.println("Laundry charges- USD 0.0");

        if(brkfst=='Yes'||brkfst=='yes')
        {
            base_amt+=(5*base_dur);
            System.out.println("Breakfast charges- USD "+((5.0)*base_dur));
        }
        else
            System.out.println("Breakfast charges- USD 0.0");

        if(lunch=='Yes'||lunch=='yes')
        {
            base_amt+=(5*base_dur);
            System.out.println("Lunch charges- USD "+((5.0)*base_dur));
        }
        else
            System.out.println("Lunch charges- USD 0.0");

        if(dinner=='Yes'||dinner=='yes')
        {
            base_amt+=(5*base_dur);
            System.out.println("Dinner charges- USD "+((5.0)*base_dur));
        }
        else
            System.out.println("Dinner charges- USD 0.0");

        if(wifi=='Yes'||wifi=='yes')
        {
            base_amt+=(2*base_dur);
            System.out.println("Wifi charges- USD "+((2.0)*base_dur));
        }
        else
            System.out.println("Wifi charges- USD 0.0");

        if(swimming=='Yes'||swimming=='yes')
        {
            base_amt+=(2.5*base_dur);
            System.out.println("Swimming charges- USD "+((2.5)*base_dur));
        }
        else
            System.out.println("Swimming charges- USD 0.0");

        if(gym=='Yes'||gym=='yes')
        {
            base_amt+=(2.5*base_dur);
            System.out.println("Gym charges- USD "+((2.5)*base_dur));
        }
        else
             System.out.println("Gym charges- USD 0.0");

        if(spa=='Yes'||spa=='yes')
        {
            base_amt+=(3*base_dur);
            System.out.println("Spa charges- USD "+((3.0)*base_dur));
        }
        else
             System.out.println("Spa charges- USD 0.0");

        System.out.println("Bill (excluding GST) - USD "+base_amt);
        gst=((base_amt*18)/100);
        System.out.println("GST(18%)- USD "+gst);
        base_amt=base_amt+gst;

        return base_amt;
    }

    public static void main()
    {
        hrs obj=new hrs();

        try
            obj.inp();
        catch(IOException e)
            e.printStackTrace();

        System.out.println("Amount payable (inclusive of GST) is Rs "+obj.calculate());

        System.out.println("**********Thank you for your stay.**********\n**********We hope to see you again!**********\n**********If there is anything we can do to make your next stay better please let us know**********");
    }

}