package com.eurlanda.sqoop.source;

import com.cloudera.sqoop.Sqoop;

/**
 * Created by zhudebin on 16/4/20.
 */
public class SqoopTester {

    public static void main(String[] args) {
        String cmd = "import --connect jdbc:mysql://192.168.137.17:3306/test?characterEncoding=UTF-8 --username root --password 111111 --fields-terminated-by '\\t' --target-dir '/testDir/test6' --table a_aa  -m 3 --split-by abc --as-sequencefile --append";
        Sqoop.main(cmd.split("\\s+"));
    }

}
