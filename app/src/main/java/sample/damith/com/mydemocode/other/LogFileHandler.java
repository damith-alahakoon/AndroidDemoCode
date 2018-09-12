package sample.damith.com.mydemocode.other;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogFileHandler {
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    String day = s.format(new Date());


    public void appendLog(String topic,String text,Boolean isEnd)
    {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateTime = s.format(new Date());

        File logFile = new File("sdcard/data/log-"+day+".log");
        if (!logFile.exists())
        {
            try
            {
                logFile.createNewFile();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        try
        {

            //BufferedWriter for performance, true to set append to file flag
            BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));
            buf.newLine();
            buf.append(dateTime +" | "+fixedLengthString(topic,30)+"| "+ text);
            if(isEnd){
                buf.append("\n\n================================END===============================\n\n");
            }
            buf.close();

        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static String fixedLengthString(String string, int length) {
        return String.format("%1$-"+length+ "s", string);
    }

}
