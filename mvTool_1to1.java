package HdfsTools;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class mvTool_1to1 {
    public static void main(String[] args) throws IOException {
        FileSystem fs = FileSystem.get(new Configuration());
        File duiying = new File(args[0]);
        FileInputStream fis = new FileInputStream(duiying);
        InputStreamReader inputStreamReader = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        //this is a test change

        ////test2

        ///test3_wel124
        ///test4_wel124

        String test3="";

        String filePath;
        while ((filePath = bufferedReader.readLine()) != null) {
            String org_path = filePath.split(" ")[0];
            String tar_path = filePath.split(" ")[1];
//            String filename = new Path(filePath.split(" ")[0]).getName();
            try {
                System.out.println("mv " + new Path(org_path) + " to " + new Path(tar_path));
//                fs.rename(new Path(org_path), new Path(tar_path));
                System.out.println(filePath + " successful move");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        bufferedReader.close();
        inputStreamReader.close();
        fis.close();
    }
}
