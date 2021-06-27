public class NotSus {
    private static String[] amorgosTwek = new String[10];
    private static ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls").inheritIO();

    public static void main(String[] arg) throws Exception{
        delete();
        initiateSussyTwerk();
        while(true) {
            //int i = 0;
            for (String s : amorgosTwek) {
                delete();
                //processBuilder.start().waitFor();
                System.out.print(s);
                Thread.sleep(50);
            }
        }
    }


    public static void delete() throws Exception{
        if (System.getProperty("os.name").contains("Windows"))
            processBuilder.start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

        //System.out.print("\f");
        //System.out.flush();
        //for(int i =0;i<2400;i++) System.out.print("\b");
    }


    public static void initiateSussyTwerk() {

        amorgosTwek[0] =
                "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                               .:-`                                                                 \n" +
                "                              -syys:`                                                               \n" +
                "                             `syyyyy+`                                                              \n" +
                "                             /yyyyyyyo.```.--------.```                                             \n" +
                "                            `syyyyyyyyo----------:s:--.`         ```..---.`                         \n" +
                "                            .yyyyyyyyy/------....:yo----`..-:/++oossyyyyyo`                         \n" +
                "                            -hyyyyyyhyo-..-------:+/::--+syyyyyyyyyyyyyyy+`                         \n" +
                "                            -hyyyyyyyyo:---------/:---:-:yyyysyyhhyyyyyys.                          \n" +
                "                            .yyyyyyyyy/:--:::----//:-:---+ssssyyyyyyyyyy/`                          \n" +
                "                            `syyyyyyyyo:-::::--:-//:-:---/sssyyssyyyyyyo```                         \n" +
                "                            `/yyyyyyyyy/://:----:::--.:--/+:-ssssyyyyys-``                          \n" +
                "                             `syyyyyyyy/://:````.+sys/::-:-`/sssyyyyyy:``                           \n" +
                "                            ` :hyyyyyyy+/sys`````./o+:.-:-:/ssssyyyyy+``                            \n" +
                "                             ``syyyyyyys:/+:```````.```::--ssssyyyyyo.`                             \n" +
                "                          `````/yyyyyyyy+```.`````````.-.+-:ossyyyys.``                             \n" +
                "                       ` ```` `-yyyyyyyys:````--::/``.-.+so::+syyys-````                            \n" +
                "                       `      .:oyyyyyyyy+-.``::::.`-.-ossss/-:+ss:`                                \n" +
                "                     ````   ``:-/yyyyyyyyy/::.`...-:-.ssssssso+:::--.```                            \n" +
                "                      ``  ```---:yyyyyyyyys:-:--.-:::/ooosssyyyy/--------.```                       \n" +
                "                         ```.----syyyyyyyyys:---.:s+++:/+sysyyy+`````..-::::-.`                     \n" +
                "                        `  `-----/yyyyyyyyyys+---/so/:-/hdhsyys.``   `````.-:::`                    \n" +
                "                          `-------syyyyyyyyyy/::--:/oo+//ydhyy:` `       ` ```-:.`                  \n" +
                "                         `--------:yyyyyyyyys:://-/:-:ossssooo:..```           ``                   \n" +
                "                         `:--------oyyyyyyyyys+/+o//o/-:+ssss+//-....```                            \n" +
                "                        `:---------:syyyyyyysssssssoohy++oyssysss+.``.-`                            \n" +
                "                       `------------+yyyyyysssssssssyyyyssssssyhdys:..``                            \n" +
                "                      `.-------------syyyyysssssssssssssssssssssysyo```                             \n" +
                "                      `:-------------:ssssssssssssssssssssssssssssso`                               \n" +
                "                     `----------------/sssssssssssssyhhysssssssssss/`                               \n" +
                "                     .-----------------+sssssssssssshddysssssssyyy+.`                               \n" +
                "                    `:------------------ossssssssssssyysssssssshd+````                              \n" +
                "                  ``.--------------------sssssssssssssssssssssss/` `                                \n" +
                "                   `:------------::------ossssssssssssssssssssso``                                  \n" +
                "                   .-------------::------oyssssssssyyyyssssssss/`                                   \n" +
                "                  `:-------------::------/yyyyssssyhddyssssssss-`                                   \n" +
                "                  `:-------------::------:dddddhhyyyyysssssssy+``                                   \n" +
                "                  ---------------::------yddddddddo/osssssssso.``                                   \n" +
                "                 `::-------------:.----/syyhhddddd+-:+sssssss:``                                    \n" +
                "                 `//-------------:.//osssssssyyyho:/:+sssssy/`                                      \n" +
                "                 .//-----------/+osssssssssssssssssosssssso+`                                       \n" +
                "                 .::-------:/ossssssssssssssssssssssssssso/.  `                                     \n" +
                "                 --:----:+osssssssssssssssyysssssssssssss+--.`                                      \n" +
                "                 -`:--/osssssssssssssssssyyssssssssssssss:----.`                                    \n" +
                "                 -`:/sssssssssssssssssssssssssssssssssss+-------.`                                  \n" +
                "                 -:oyyyyyhhyyyyyssssssyssssssssssssssssso..-------``                                \n" +
                "                .+yyyhhhhdddddddhyyssssssssssssssssssssso:..------:-.``                             \n" +
                "              `:syhhhhhhdddddddddddhhysssssssssssssssssss::.`------:::-.```                         \n" +
                "              -hhhhhhhhhddddddddddddddhyysssssssssssssssy/-:.`.------::::-.```                      \n" +
                "              -hhhhhhhhddddddddddddddddddyysssssssssssssss---.``.-------::::--....```               \n" +
                "              `+yhhhhhhddddddddddddddddddddhyssssssssssssy/---.```.---------:------```              \n" +
                "               `/yhhhhhddddddddddddddddddddddhyysssssssssho:----````.-----------.```                \n" +
                "                `-ohhhhddddddddddddddddddddddddhyysssssssys.-----.`````.------.```                  \n" +
                "                  `:oyhdddddddddddddddddddddddddddhyyssssyy:`------.``````..-.``                    \n" +
                "                   ``-+yddddddddddddddddddddddddddddhyysyyy+-.-------````````` `                    \n" +
                "                      `.yddddddddddddddddddddddddddddddhyyy+--..------.```                          \n" +
                "                        :dddddddddddddddddddddddddddddddddy+---.`..```````                          \n" +
                "                        `oddddddddddddddddddddddddddddddddh:..```  `                                \n" +
                "                        `.ydddddddddddddddyddddddddddddddds``     ``                                \n" +
                "                         `:ddddddddddddddd/sddddddddddddddy`     ``                                 \n" +
                "                        ` `odddddddddddddd+.ydddddddddddddh.     `                                  \n" +
                "                           `oyyyyyyyyyyhddy/odddddddddyohddo//////////`     `                       \n" +
                "                            -dddddddddddddy``/ddddddddddddd: ` ``                                   \n" +
                "          `                   +ddddddddddddh` `+dddddddddddd+`  ``                                  \n" +
                "                               `ydddddddddddh. ``oddddddddddds` ``                                  \n" +
                "                                -hddddddddddd- ```yddddddddddy`                                     \n" +
                "                                 `/ddddddddddd:`` `.hdddddddddd.                                    \n" +
                "                                  `sdddddddddd+`` ``:dddddddddd-                                    \n";

        amorgosTwek[1] = "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                               .:-`                                                                 \n" +
                "                              -syys:`                                                               \n" +
                "                             `syyyyy+`                                                              \n" +
                "                             /yyyyyyyo.```.--------.```                                             \n" +
                "                            `syyyyyyyyo----------:s:--.`         ```..---.`                         \n" +
                "                            .yyyyyyyyy/------....:yo----`..-:/++oossyyyyyo`                         \n" +
                "                            -hyyyyyyhyo-..-------:+/::--+syyyyyyyyyyyyyyy+`                         \n" +
                "                            -hyyyyyyyyo:---------/:---:-:yyyysyyhhyyyyyys.                          \n" +
                "                            .yyyyyyyyy/:--:::----//:-:---+ssssyyyyyyyyyy/`                          \n" +
                "                            `syyyyyyyyo:-::::--:-//:-:---/sssyyssyyyyyyo```                         \n" +
                "                            `/yyyyyyyyy/://:----:::--.:--/+:-ssssyyyyys-``                          \n" +
                "                             `syyyyyyyy/://:````.+sys/::-:-`/sssyyyyyy:``                           \n" +
                "                            ` :hyyyyyyy+/sys`````./o+:.-:-:/ssssyyyyy+``                            \n" +
                "                             ``syyyyyyys:/+:```````.```::--ssssyyyyyo.`                             \n" +
                "                          `````/yyyyyyyy+```.`````````.-.+-:ossyyyys.``                             \n" +
                "                       ` ```` `-yyyyyyyys:````--::/``.-.+so::+syyys-````                            \n" +
                "                       `      .:oyyyyyyyy+-.``::::.`-.-ossss/-:+ss:`                                \n" +
                "                     ````   ``:-/yyyyyyyyy/::.`...-:-.ssssssso+:::--.```                            \n" +
                "                      ``  ```---:yyyyyyyyys:-:--.-:::/ooosssyyyy/--------.```                       \n" +
                "                         ```.----syyyyyyyyys:---.:s+++:/+sysyyy+`````..-::::-.`                     \n" +
                "                        `  `-----/yyyyyyyyyys+---/so/:-/hdhsyys.``   `````.-:::`                    \n" +
                "                          `-------syyyyyyyyyy/::--:/oo+//ydhyy:` `       ` ```-:.`                  \n" +
                "                         `--------:yyyyyyyyys:://-/:-:ossssooo:..```           ``                   \n" +
                "                         `:--------oyyyyyyyyys+/+o//o/-:+ssss+//-....```                            \n" +
                "                        `:---------:syyyyyyysssssssoohy++oyssysss+.``.-`                            \n" +
                "                       `------------+yyyyyysssssssssyyyyssssssyhdys:..``                            \n" +
                "                      `.-------------syyyyysssssssssssssssssssssysyo```                             \n" +
                "                      `:-------------:ssssssssssssssssssssssssssssso`                               \n" +
                "                     `----------------/sssssssssssssyhhysssssssssss/`                               \n" +
                "                     .-----------------+sssssssssssshddysssssssyyy+.`                               \n" +
                "                    `:------------------ossssssssssssyysssssssshd+````                              \n" +
                "                  ``.--------------------sssssssssssssssssssssss/` `                                \n" +
                "                   `:------------::------ossssssssssssssssssssso``                                  \n" +
                "                   .-------------::------oyssssssssyyyyssssssss/`                                   \n" +
                "                  `:-------------::------/yyyyssssyhddyssssssss-`                                   \n" +
                "                  `:-------------::------:dddddhhyyyyysssssssy+``                                   \n" +
                "                  ---------------::------yddddddddo/osssssssso.``                                   \n" +
                "                 `::-------------:.----/syyhhddddd+-:+sssssss:``                                    \n" +
                "                 `//-------------:.//osssssssyyyho:/:+sssssy/`                                      \n" +
                "                 .//-----------/+osssssssssssssssssosssssso+`                                       \n" +
                "                 .::-------:/ossssssssssssssssssssssssssso/.  `                                     \n" +
                "                 --:----:+osssssssssssssssyysssssssssssss+--.`                                      \n" +
                "                 -`:--/osssssssssssssssssyyssssssssssssss:----.`                                    \n" +
                "                 -`:/sssssssssssssssssssssssssssssssssss+-------.`                                  \n" +
                "                 -:oyyyyyhhyyyyyssssssyssssssssssssssssso..-------``                                \n" +
                "                .+yyyhhhhdddddddhyyssssssssssssssssssssso:..------:-.``                             \n" +
                "              `:syhhhhhhdddddddddddhhysssssssssssssssssss::.`------:::-.```                         \n" +
                "              -hhhhhhhhhddddddddddddddhyysssssssssssssssy/-:.`.------::::-.```                      \n" +
                "              -hhhhhhhhddddddddddddddddddyysssssssssssssss---.``.-------::::--....```               \n" +
                "              `+yhhhhhhddddddddddddddddddddhyssssssssssssy/---.```.---------:------```              \n" +
                "               `/yhhhhhddddddddddddddddddddddhyysssssssssho:----````.-----------.```                \n" +
                "                `-ohhhhddddddddddddddddddddddddhyysssssssys.-----.`````.------.```                  \n" +
                "                  `:oyhdddddddddddddddddddddddddddhyyssssyy:`------.``````..-.``                    \n" +
                "                   ``-+yddddddddddddddddddddddddddddhyysyyy+-.-------````````` `                    \n" +
                "                      `.yddddddddddddddddddddddddddddddhyyy+--..------.```                          \n" +
                "                        :dddddddddddddddddddddddddddddddddy+---.`..```````                          \n" +
                "                        `oddddddddddddddddddddddddddddddddh:..```  `                                \n" +
                "                        `.ydddddddddddddddyddddddddddddddds``     ``                                \n" +
                "                         `:ddddddddddddddd/sddddddddddddddy`     ``                                 \n" +
                "                       `  -hdddddddddddddy:+yddddddddddddd/``````                                   \n" +
                "                          `.+yhdddddddyhydy-:yhdddddddyyyyy-     ``                                 \n" +
                "                            -----``  `       .-:+++++++++++.``                                      \n" +
                "                            ./++yhddddddddo:`````:+yhhhhddddddy:-                                   \n" +
                "                            ```/dddddddhhhhy.```    `/yhdddddddddd/                                 \n" +
                "                                :dddddddddys:`       /yhddddddddds````                              \n" +
                "                                  ooohdddddds///.``   :///syddddddooo:`:                            \n" +
                "                            `` `. :+sdddddddy.        ``-dmmmmmmmmddo                               \n";

        amorgosTwek[2] = "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                                ```                                                                 \n" +
                "                              `    ``                                                               \n" +
                "                                    ``                                                              \n" +
                "                                      ````` `   `` `` `                                             \n" +
                "                            `          `              `          `   `  `                           \n" +
                "                            ` `--`                     ``  `              `                         \n" +
                "                            `.syyo-`                          ``.--.` `   `                         \n" +
                "                            `oyyyyy+``      ``````       ``.:+osyyys-    `                          \n" +
                "                            :yyyyyyyo.  ``..------..```.-/syyyyyyyyy:    `                          \n" +
                "                           `oyyyyyyyyo-.--------:o:---+syyyyyyyyyyyy-   ```                         \n" +
                "                           .syyyyyyyys/-----...-/yo---:oyysyyyhyyyys`  ```                          \n" +
                "                           -yyyyyyyyys:...------:+/::--:ssyyyyyyyyy/` ```                           \n" +
                "                           :yyyyyyyyss:---------//---:--/syssyyyyyy-` ``                            \n" +
                "                           :yyyyyyyy:::--:::----//-------+sssyyyyyo` ``                             \n" +
                "                          `.yyyyyyyy--:-:::::---//:-::---osssyyyyy:````                             \n" +
                "                       ` ```syyyyyys-::://:.-.-::-:-.:--/sssyyyyys``````                            \n" +
                "                       `   `+yyyyyys:/:/++:````./sys/::-oyssyyyyy/``                                \n" +
                "                     ````   -yyyyyys:/:/yy+````../oo:.:-+sssyyyys```` `                             \n" +
                "                      ``  ```+yyyyyy:+-.//-```````.```/-/yssyyyy+``      `` `                       \n" +
                "                         `` `.yyyyyy///`````.````````.//:ssyyyyy-`  ```     ```                     \n" +
                "                        `    `/yyyyyo:+:`````.--::```:+o-oyyyyy+``   `` ```    `                    \n" +
                "                              .yyyyyy//+:-``./:::-`.:oss:/yyyys. `       `  ``````                  \n" +
                "                              `oyyyyys-//+:-..-..-:/+oos+-oyys-`````           `                    \n" +
                "                         `   `-:yyyyyyo-::/....--.://///+--sy:`````````                             \n" +
                "                        `    .--oyyyyyy/-::-``.+-`//+:/yy+--/.`   ```` `                            \n" +
                "                       `   ``---/yyyyyyy/-/:``:so..-:.-dhs/--:.````````  ````                       \n" +
                "                      ``   `:----syyyyyyh/:/:-:ss:.-.``ydhy/-----.``````.---`                       \n" +
                "                      `   `------syyyyyydh+-:::+so-````+hhds:---:::::-:---.                         \n" +
                "                         `:------+yyyyyyddd+-:-///+-```./:/+.::----------.`                         \n" +
                "                     ` `.--------/yyyyyydhdds--/ss+/:--`-///:`.-.`....``                            \n" +
                "                    ` `.----------yyyyyyh//oo/---+ssso-./sssy+.`..````                              \n" +
                "                  ````.-----------oyyyyyy+:::/+/--/sssooyyyssss-`..`                                \n" +
                "                   ``.------------:yyyyyyssoosyyssssssssyddyssss-.`                                 \n" +
                "                   `---------------/yyysssssssyddhssssssyyyssosy/                                   \n" +
                "                  `-----------------+ysssssssssyyysssssssssssosy/                                   \n" +
                "                 `-------------------ossssssssssssssssssssssssos.                                   \n" +
                "                `:-------------------:syssssssyyyyssssssssyhyso:`                                   \n" +
                "               `-:--------------------:ysssssshddyssssssssydhyo`                                    \n" +
                "               -/---------------::-----+ssssssyyyssssssssssyys+`                                    \n" +
                "              .:----------------/-------ssssssssssssssssssssss:                                     \n" +
                "             `::----------------/-------/yysssyyssssssssssyyyo`                                     \n" +
                "            `::----------------::-------oddhyyhdyssssssssshdy:`                                     \n" +
                "            ./:----------------:------:oddddsosyysssssssssyy/``                                     \n" +
                "           `:/:-----------------`:--/osshdddo::ossssssssss++`` ``                                   \n" +
                "           .:::----------------.`-:osssssyho+//ossssssssy+//`     ``                                \n" +
                "           -:.:-------:://++/::--+ssssssssysysssssssssssss++`       `                               \n" +
                "          `:-.:------oyyhhhhhyysssssssssssssssssssssssssssss.`        `````                         \n" +
                "          `/.`:-----+hhhhhhhhhhhhysssssssssssssssssssssssssy:```          `  `                      \n" +
                "          `/.`:-----+hhhhhhhhhhdddyssssssssssssssssssssssssss````             ` ``  `               \n" +
                "          `:. :-----+hhhhhhhhhdddddysssssssssssssssssssssssss-``````          ```  ```              \n" +
                "           -. .-----:yhhhhhhhdddddddhysssssssssssssssssssssyy/```````          ``` `                \n" +
                "           .- `:-----ohhhhhhdddddddddysssssssssssssssssssssyyo.`````````       ```                  \n" +
                "           `:` ------:yhhhhhddddddddddyyssssssssssssssssssssss:.```````````` ```                    \n" +
                "            -- `:-----+hhhhddddddddddddhyssssssssssssssssssssy/--..``````````` `                    \n" +
                "            `:``-------ohhhdddddddddddddhyssssssssssssssssossso------...```````                     \n" +
                "            `-:``-------ohdddddddddddddddhysssssssssssssssossso.-------------.`                     \n" +
                "             .:-`.-...---sdddddddddddddddddhyssssssssssssssssss.``.-----...```                      \n" +
                "             `---```````.:yddddddddddddddddhhyysssssssssssyssss:` ```.-.```                         \n" +
                "              ``.`       `yddddddddddddddddhhddhyyssssssssssssso-``                                 \n" +
                "                        ``hddddddddddddddddhhdddddhhyyyysyyyysss/.                                  \n" +
                "                         `yddddddddddddddddhdddddddddddddddhhyyys``                                 \n" +
                "                         `odddddddddddddddhhddddddddddddddddhhhhy.                                  \n" +
                "                          :dddddddddddddddhddddddddddddddddhhys+.                                  `\n" +
                "                          `ydddddddddddddyodddddddddddddddhs+-``                                    \n" +
                "                           :dddddddddddddooddddddddddddddo.``                                       \n" +
                "                           `sddddddddddddsddddddddddddddo`  `                                       \n" +
                "                            .hdddddddddddddddddddddddddy`                                           \n";

        amorgosTwek[3] = "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                                ```                                                                 \n" +
                "                              `    ``                                                               \n" +
                "                                    ``                                                              \n" +
                "                                      ````` `   `` `` `                                             \n" +
                "                            `          `              `          `   `  `                           \n" +
                "                            `                          ``  `              `                         \n" +
                "                            ``     `                            `  `  `   `                         \n" +
                "                            `       ``      `    `         ```.-:-` `    `                          \n" +
                "                            `        `  ```       ```   ```.:osyys.      `                          \n" +
                "                                      ````...--...``    `.+syyyyyy- `   ```                         \n" +
                "                                    ```.----------:+-``-+syyyyyyyy. `  ```                          \n" +
                "                     `````````` ` ``-+:---......--ss:-/syyyyyyyyyo` ` ```                           \n" +
                "                    -osssssoo++/////+y+-----------++:--/syyyyyyyy/``` ``                            \n" +
                "                    /yyyyyyyyyyyyyyy+//-----------:--:--/yyyyyyyy.`` ``                             \n" +
                "                    -yyyyyyyyyyyyyy+:------------::------syyyyyyo``````                             \n" +
                "                    `syyyyyyyysssss--:/:-:--::-:/:/-----:yyyyyyy/```````                            \n" +
                "                    `:yyyyyyys::::/-/+/--/--//-:+.:-----oyyyyyyy. ``                                \n" +
                "                     `oyyyyyys:``.--//:/:/:-:::/+//--:-/yyyyyyys````` `                             \n" +
                "                     `-yyyyyyss-`---/-:oo+-```.+syy:-:-syyyyyyy+```      `` `                       \n" +
                "                      `+yyyyyyys::-:/-:oss.````./os:-:+yyyyyyyy:``  ```     ```                     \n" +
                "                       .syyyyyyys:-:.-`---````````-:-/syyyyyyys.``   `` ```    `                    \n" +
                "                        :yyyyyyys---`..```````````--:syyyyyyyyo` `       `  ``````                  \n" +
                "                        `/yyyyyy+--:``-.```.--:::`--:yyyyyyyyy+`````           `                    \n" +
                "                         `oyyyyy/-:s/.`...`-::::..:-:yyyyyyyyy:.```````                             \n" +
                "                        ` .oyyyy:--yss/```..``..-.:--syyyyyyyo--` ```` `                            \n" +
                "                       `   .syyy:--syyy:-```::-.-.:--+yyyyyyy/-:```````                             \n" +
                "                      ``   `-syy:--/yyy/o/:-:../-`:--:syyyyyy----``````                             \n" +
                "                      `   ```-sy+---+yys+://+.:s/`-:--/yyyyyy:--:`                                  \n" +
                "                         ` ```-sy:---odddy---`/s-./o---+yyyhy/--:`                                  \n" +
                "                     ` ``     `.ss---/ydd+...-oo``sdo---+yyyy+--:.```                               \n" +
                "                    ` `       ``.so---+sy.``:sso``hdd+---+yyy+---.````                              \n" +
                "                  ````       ``.-:ss:--/+:./ssso.-+ss++:--:sy+---. `                                \n" +
                "                   ``      ``.---/sys/--+s+sssysoss+/oyoo/--+/:--.                                  \n" +
                "                   ``     `.----/ssssyo//ssssssyyysssssssoo/---:-.                                  \n" +
                "                  ``  ```.-----:ssssyhhyssssssyddysssssssssy/--:/.                                  \n" +
                "                     ``--------+yssssyyssssssssyysssssssssss:---/.                                  \n" +
                "                 ````----------ossssssssssssssssssssssssssy/--:::.                                  \n" +
                "                 ``.--:--------/sssssssssssssssyyssssssssso-----:`                                  \n" +
                "               ``----:-------.--/sssyhysssssssyhdyssssssso------:                                   \n" +
                "              `.---.--------..:--:oyhhhssssssssyyysssssss:-------                                   \n" +
                "             `-:-``--------``-----:oyysssssssssssssssssso------:.                                   \n" +
                "           `.--.``--------``-------:sssyyssssssssysssssy/------:`                                   \n" +
                "          `.:-```-------:``.-----:.:/sydhssssssshdyssyhh:-------`                                   \n" +
                "          .:-```--------```:-----:.:-/yyysssssssyhyssddd/------.`                                   \n" +
                "         `:-```--------.``--------.:-:hs++ssssssss//sddds/-----`  ``                                \n" +
                "        `:-```---------` `:------..:-+ds//ssssssss:/oyhyyso:---     `                               \n" +
                "        .-```---------.` .:-----:.-+ssysssssssssyysossysssss/:`       `````                         \n" +
                "       `-` `.---------`  -------/+sssssssssssyyyyyssssyssssss+``          `  `                      \n" +
                "      `--  `:---------   -----/ossssssssssssyyyyssssssssssssss/``             ` ``  `               \n" +
                "      `:` `.--------:.` `:-:+ssssssssssssssssssssssssssssssssss/````          ```  ```              \n" +
                "     `-:` `:--------:`  `:+sssssssssssssssssssssssssssssssssssss/````          ``` `                \n" +
                "     .:-  `:---------` `:syyyyyyyyhyyssssssssssssssssssssssssssss-``````       ```                  \n" +
                "     -:.  .-........-`.+yyyhhhhhhddddhyysssssssssssssssssssssssss+`````````` ```                    \n" +
                "    `-:`   ``` ``````.shhhhhhhhhhddddddhyysssssssssssssossssssssss-``````````` `                    \n" +
                "     `.             `.shhhhhhhhhdddddddddhyysssssssssssosssssssssy+```````                          \n" +
                "                    ``.shhhhhhhhddddddddddddyysssssssssosssssssssss.`                               \n" +
                "                       .ohhhhhhdddddddddddddddyysssssso+ssssssssssy:                                \n" +
                "                        `+hhhhhdddddddddddddddddyyssssoossyssssssss/`                               \n" +
                "                         `:yhhddddddddddddddddddddhyys+sssssssssssso`                               \n" +
                "                        ` `.+hddddddddddddddddddddddhhoyysssssssssss`                               \n" +
                "                            `oddddddddddddddddddddddddddhhyyyyssssss.                               \n" +
                "                            `yddddddddddddddddddddddddddddddddhhssso`                               \n" +
                "                           `-ddddddddddddddddddddddddddddddddddy.```                               `\n" +
                "                            /dddddddddddddddddddddddddddddddddy.                                    \n" +
                "                           `oddddddddddddddddddddddddddddddddo.                                     \n" +
                "                           `sddddddddddddddddddddddddddddddh:`                                      \n" +
                "                           `hddddddddddddddddddddddddddddds.                                        \n";

        amorgosTwek[4] = "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                                ```                                                                 \n" +
                "                              `    ``                                                               \n" +
                "                                    ``                      `--`                                    \n" +
                "                                      ````` `   `` `` `   `/syys-                                   \n" +
                "                            `          `              `  `oyyyyyo`   `  `                           \n" +
                "                            `            ``....---...````oyyyyyyy.        `                         \n" +
                "                            ``     `   `.-------//------+yhyyyyyy. `  `   `                         \n" +
                "                            `    `````.---------ss:-----:syyyyyyy.  `    `                          \n" +
                "                       ```.--::/++ooso:--....---/+.-----:yyyyyyyy.`      `                          \n" +
                "                    `:+osssyyyyyyyyyho----------::---:--oyyyyyyys`  `   ```                         \n" +
                "                    -yyyyyyyyyyyyssys/---------::------:yyyyyyyyo`` `  ```                          \n" +
                "                    .syyyyyyyyyyssss/:---/----:/-----:-oyyyyyyyy/ ` ` ```                           \n" +
                "                    `-yyyyyyyyys::+///-:::--::-/--:::--syyyyyyyy-```` ``                            \n" +
                "                     `:yyyyyysss::::/+:/::-...--:/+//-/yyyyyyyyy-``` ``                             \n" +
                "                      `/yyyyyyso/:--::-:/+/````./sys:-+yyyyyyyyo:``````                             \n" +
                "                       `/yyyys+//+:```-:+ss.`````:+---syyyyyyyy+--``````                            \n" +
                "                        `+yy+:+osys:``.-.:-.````.:---/yyyyyyyyy/:-.`                                \n" +
                "                         .o/-+yyysss/``-```.```.:---:+yyyyyyyyo--:-`` `                             \n" +
                "                        `.--/yyyyyssy+.`-````-:/--::/yyyyyyyyy/--::.     `` `                       \n" +
                "                        .---+yyyyyyssyo/-...`./:-://yyyyyyyyys:---::```     ```                     \n" +
                "                       `:----/yyyyyysssyso///::--o+syyyyyyyyyo-----/-`` ```    `                    \n" +
                "                       `:---.`:syyyyyyss++++/+--/ooyyyyyyyyyy/------/`   `  ``````                  \n" +
                "                       `:----``-syyyyy+/oo:://--+syyyyyyyyyys-------/-         `                    \n" +
                "                        ----:.` .oyyhsydy/..-:--+hyyyyyyyyyyo--------/`                             \n" +
                "                        `::-/:.` `+hhddy.`..//--+yyyyyyyyyyy:--------/.`                            \n" +
                "                       ` ./-:/:-.`.oooo.`./os+:-/oyyyyyyyyyy:--------:-                             \n" +
                "                      ``  ./--:::::://-:ossys+:-/+yyyyyyyyys:---------:`                            \n" +
                "                      `   `.:--:+sossssssssyyyo-:yyyyyyyyyy+-:--------:`                            \n" +
                "                         ` ```-ssyhhyssysssydds:-oyyyyyyyyy/-:--------:`                            \n" +
                "                     ` ``   .+yssyyysssssssyhhys-:ysyyyyyys--:---------.                            \n" +
                "                    ` `    `osssssssssssssssssssssssssssss+:::---------.                            \n" +
                "                  ````     .ssssssssssssssssssssssssssssss:-------------                            \n" +
                "                   ``      `ossssssssssssssssysssssssssys:--------------                            \n" +
                "                   ``     ```oyhyssssssssyhhysssssssssss:---------------                            \n" +
                "                  ``  ```  ` `/hhysssssssyhhysyssssssss:----------------                            \n" +
                "                      ``      `:ssssssssssssssyssssssy/-----------------                            \n" +
                "                 ````          `:sssssssssssssssssssso-----------------.                            \n" +
                "                  ``        ```.:oysssssssssyysyyssyy/------------:---:`                            \n" +
                "                ``      ```..--:::syyssssssydhsyyyhddo------------/---:`                            \n" +
                "              ``      ``..---::---:hhysssssyyyssyddddh/----------::---:                             \n" +
                "             `  `````.-----::------:ssssssssss+/yddddhyso+:------:----.                             \n" +
                "               ```.-----.-:---------/sssssssy/::ohdhyyssssso:----:---:`                             \n" +
                "              ``-----...-------------/ysssssy/::/oyyssssssssso/:.:----`                             \n" +
                "            ``.---.``.-----------.----sssssssssssyssssssssssssso/----.                              \n" +
                "           ``---.``.----------.`------osssssssssssyyssssssssssssso:-:`                              \n" +
                "           `-:-```----------.``-------oyssssssssyyyysssssssssssssss+-`                              \n" +
                "          `--.```----------``.--------:yyssssssyyysssssssssssssssssso.`````                         \n" +
                "          `..``.----------``.:------.`-yyssssssssssyssssssssssssssssss-`  `  `                      \n" +
                "           ` `.----------` .---------/sssssssssssssssssssssssssssssssss:`     ` ``  `               \n" +
                "      `    ` ``..-------```-------++sssssssssssssssyssssssssssssssssssys-     ```  ```              \n" +
                "             ````.----:```-----:/oysssssssssssssssssysssssssssssssssssss+`     ``` `                \n" +
                "               ```...-.``.---:+ssssssssssssssssssssssssssssssssssssssssss.     ```                  \n" +
                "                 ````````---+ssssssssssssssssssssssssssssssssssssssssssss:`` ```                    \n" +
                "                ``  `` ```.+yyyyyyyssssssssssssssssssossssssssssssssssssy/```` `                    \n" +
                "                    ``  ``+hhhhhhhhhyysssssssssssssssossssssssssyyyhyyyyy+`                         \n" +
                "                    ``` ``ohhhhhhhddddhyyssssssssssssosssssyyyhhddddhhhhh+`                         \n" +
                "                         `-shhhhhddddddddhhyyyyssssssoyyyyhddddddddhhhhhy-                          \n" +
                "                        ```.shhhddddddddddddddhhhhhhhhdddddddddddddhhhhs-`                          \n" +
                "                          ` `+hdddddddddddddddddddddddddddddddddddhhys/`                            \n" +
                "                        `  ` `/ddddddddddddddddddddddddddddddddddys+-`                              \n" +
                "                            ``ydddddddddddddddddddddddddddddddh+:.``                                \n" +
                "                            `/dddddddddddddddddddddddddddddddh:`                                    \n" +
                "                           `.hddddddddddddddddddddddddddddddy-`                                    `\n" +
                "                           `+dddddddddddddddddddddddddddddds.`                                      \n" +
                "                           -ddddddddddddddhdddddddddddddddo`                                        \n" +
                "                          `sddddddddddddd+ydddddddddddddd+` `                                       \n" +
                "                          :ddddddddddddd/:dddddddddddddd/`                                            ";

        amorgosTwek[5] = "                        `                                                                           \n" +
                "                                                            .--`                                    \n" +
                "                                ```                       .+yyyo`                                   \n" +
                "                              `    ``                   `-syyyyy-                                   \n" +
                "                                    ``          ``````  .syyyyyy/                                   \n" +
                "                                      ``````..----------+yyyyyyyo                                   \n" +
                "                            ````..--::////:--------o/----syyyyyyo`   `  `                           \n" +
                "                         ./+osssyyyyyyyyy+:---....-so----syyyyyys`        `                         \n" +
                "                         +yyyyyyyyyyyyyyo--.-------/:--::syyyyyys` `  `   `                         \n" +
                "                         -yyyyyyyyyyssyy:----------:----/yyyyyyys`  `    `                          \n" +
                "                         `/yyyyyyssysos/---------:-/----/yyyyyyys``      `                          \n" +
                "                        ```oyyyyyysyo:::---/:--:::-/:-:-/yyyyyyys.  `   ```                         \n" +
                "                           -syyyyyso/-:+:/:/:--/--:::::-/yyyyyyys-. `  ```                          \n" +
                "                           `:yyyso:---//::://:--.-:+o/--+yyyyyyys:-`` ```                           \n" +
                "                     `   ```.++/--:/+++---/os/````./+---oyyyyyyyo::-` ``                            \n" +
                "                      ```.-----:+syssss-`-:+s+````.:---:syyyyyyyo-::-``                             \n" +
                "                     `.--------syyyyssss-.....```.:---:/yyyyyyyy+--::-`                             \n" +
                "                   `.--:---.```:yyyysssys--`````.:-----oyyyyyyyy/---::.`                            \n" +
                "                  `.:--:--``  ``/yyyysssso:-.``.:---:-+yyyyyyyyy:----::`                            \n" +
                "                  .:.`---``    ``+yyyyssssso:-----+sooyyyyyyyyyy------:-`                           \n" +
                "                 `:. .--`      ``.oyyysssysss+---oddysyyyyyyyyys------:/.`` `                       \n" +
                "                 .-``--:`         .syyyyssyso---sddhsyyhyyyyyyy+-------:-`  ```                     \n" +
                "                `:` `:-:`   ``    `-yyyyyhyo/--/yysyyyyyyyyyyys---------/``    `                    \n" +
                "                `-` `:-:`   ```    `/yyyssso--:/::/yhyyyyyyyyy/---------:-` ``````                  \n" +
                "                ``  `-.:`    ```  `./ss+oss:--/::/oyhyyyyyyyys-----------/`    `                    \n" +
                "                     ``.`    ```.:+yysyyyss::-sssssyyyyyyyyyy+-----------:.                         \n" +
                "                        `   `./osshhyssssss+::yyssssyyyyyyyyy:-------------                         \n" +
                "                       `    `+ssssssssssssss:/yyssssyyyyyyyy+-------------:`                        \n" +
                "                      ``    .sssssssssssssss++yysssssyyyyyyo--------------:`                        \n" +
                "                      `   ``.sssssssssssssssssssssssssyyyyo:---------------.                        \n" +
                "                         ` ``ossssssssssssssssyssssssssyyo:-----------------                        \n" +
                "                     ` ``    .ossssssssssssysyyssssssssso------------------:                        \n" +
                "                    ` `       `/yhyssssssyhhyyssssssssso-------------------:                        \n" +
                "                  ````         `/yyssssssyyhyyyssssssss:-------------------:                        \n" +
                "                   ``      `    -yssssssssssssyyssssss/-------------:------:`                       \n" +
                "                   ``     ``   `.ossssssssssssyyssssyo--------------/------:`                       \n" +
                "                  ``  ```  ` ` ``:sssssssssyyysyyssyh+--------------/------:                        \n" +
                "                      ``      ````/ssssssssydhssyyhdddo------------::------:                        \n" +
                "                 ````          `` `/ssssssssyyssyddddddyo/---------:--------                        \n" +
                "                  ``        `` `  ``+yssssssss+/sdddddyssss+:-----::------:.                        \n" +
                "                ``      `````     `.:sysssssy+::oydhyyssssssso/----:------:`                        \n" +
                "              ``      ````     ``.::::ssssssy+:/+oyyysssssssssss+:--------:                         \n" +
                "             `  ``````        `.::::--+ysssssssssssyysssssssssssss+:-------                         \n" +
                "               ````        ``.-:::-----sssssssssssyyssssssssssssssss+----:`                         \n" +
                "              ```   `` ```.------------:sssssssssyysssssssssssssssssss/---`                         \n" +
                "             `    ``````.------------.``+sssssssyyssssssssssssssssssssso/-                          \n" +
                "           ``   ````..--------------```./ssssssyysssssssssssssssssssssssyo-`                        \n" +
                "           ` ```..----------------.```.-+ssssssyssssssssssssssssssssssssssyo:`                      \n" +
                "             `.-----------------.````-:+ssssssssssssssssssssssssssssyyyyyyhhho`                     \n" +
                "            ```...-------------`````-:ossssssssssssysssssssssssssyyhhddhhhhhh+`                     \n" +
                "           ` ``  `.-:-------.`````.-/ssssssssssssssssosssssssssyhhdddddhhhhho.` ``  `               \n" +
                "           ` ``` ```..---.``````.-:+sssssssssssssssssossssssyyhdddddddhhhhy+` ```  ```              \n" +
                "             ````  ```````````.---osssssssssssssssssssossyyhddddddddddhhhs-`   ``` `                \n" +
                "               ````    ``` `.---:ossssssssssssssssssssoshhddddddddddddhy/.`    ```                  \n" +
                "                 ``` ````  `...:sssssssssssssssssssyyhhddddddddddddddho-` `` ```                    \n" +
                "                ``  `` ```` ``.syyyyyyyyyyyyyyyyyhhdddddddddddddddddy:``  ```` `                    \n" +
                "                    ``  ``   `-hhhhddddddddddddddddddddddddddddddddy.`                              \n" +
                "                    ``` ``    `:shddddddddddddddddddddddddddddddddd/`                               \n" +
                "                       `     `+dddddddddddddddddddddddddddddddds`                                \n" +
                "                     ``      .ydddddddddddddddddddddddddddddddh-`                                \n" +
                "                       ` `  `odddddddddddddddddddddddddddddddd/``                                \n" +
                "                     `  ` ``:dddddddddddddddddddddddddddddddds`                                  \n" +
                "                         ``.hddddddddddddddy/yddddddddddddddy.  `                                \n" +
                "                         ``odddddddddddddd+`-ddddddddddddddh-                                    \n" +
                "                     `````/dddddddddddddy-``+dddddddddddddh-`                                   `\n" +
                "                       `:ssssdddddddddo:::/sssshddddddddh/::::-`                                    \n" +
                "                       -hdddddddddddh:` ``:ddddddddddddh-                                           \n" +
                "                      -hddddddddddds.`````sdddddddddddh.`                                           \n" +
                "                     -hdddddddddddo```` `.hddddddddddy.                                        `::::\n";

        amorgosTwek[6] = "                        `                                                                           \n" +
                "                                                             `..`                                   \n" +
                "                                ```                        `+yyyo`                                  \n" +
                "                              `    ``                     -syyyyy/                                  \n" +
                "                                    ``          ``````   -syyyyyyo`                                 \n" +
                "                              `       ``````..---------.-oyyyyyyys`                                 \n" +
                "                         `/++ooooooooo++++:--------o/----:syyyyyys`  `  `                           \n" +
                "                         -yyyyyyyyyyyyyyy+:---....-so----:yyyyyyys`       `                         \n" +
                "                         `syyyyyyyyyyyyyo--.-------/:--:-/yyyyyyys``  `   `                         \n" +
                "                         `/yyyyyyyyyssyy:----------:----:oyyyyyyys` `    `                          \n" +
                "                         `.syyyyyssysos+:---------/:-----oyyyyyyys`      `                          \n" +
                "                        ```/yyyyyysy+.:::--:/--:-:/.---:-oyyyyyyyo` `   ```                         \n" +
                "                           .syyyyysss:://:::::-:--/--::/-syyyyyyyo` `  ```                          \n" +
                "                           `:yyyyyssy+//:::::-``.-:+ooo/-syyyyyyyo.`` ```                           \n" +
                "                     `   ````/yyyyys+:/.--/os/````.:oss:-syyyyyyy+-`` ``                            \n" +
                "                      ` ```  `oyyso//os-`-:+s+``````-//-/yyyyyyyy+:-```                             \n" +
                "                          ````-+//+sssss-.....``````.---+yyyyyyyy:::-``                             \n" +
                "                       ` `.-----+syysssys--``````..:--:/syyyyyyys--::-``                            \n" +
                "                      `.--::---./yyyysssso:-.```:-:--//yyyyyyyyy+---::.`                            \n" +
                "                    `.--.----````+yyyyssssso:-.-::-/soyyyyyyyyyy:----::.                            \n" +
                "                    .:..--.``  ``.oyyysssyssss/:--oyysyyyyyyyyys------::``` `                       \n" +
                "                   .:----.`       .syyyyssyyo+:-:shhyyyhyyyyyyy+------::-`  ```                     \n" +
                "                  `::---`   ``    `-yyyyyhyo:--:sssyyyyyyyyyyys--------::.`    `                    \n" +
                "                  `-:::`    ```    `/yyyo+/:---//:/yhyyyyyyyyy/---------::. ``````                  \n" +
                "                  `--:.``    ```  `./ss++s+---////+yhyyyyyyyys-----------::`   `                    \n" +
                "                  ````  `    ```.:+yysyyys::::sosssyyyyyyyyyy+------------:-`                       \n" +
                "                        `   ``/osshhysssso-o:ossssssyyyyyyyyy:-------------/`                       \n" +
                "                       `    `+sssssssssss+/o+yysssssyyyyyyyy+--------------::`                      \n" +
                "                      ``    .sssssssssssssoosssssssssyyyyyyo----------------/.                      \n" +
                "                      `   ``.sssssssssssssssssysssssssyyyy+------------------/`                     \n" +
                "                         ` ``ossssssssssssssssyssssssssyyo-------------------/.                     \n" +
                "                     ` ``    .ossssssssssssysyyssssssssyo---------------------:`                    \n" +
                "                    ` `       `/yhyssssssyhhyyssssssssso----------------------:`                    \n" +
                "                  ````         `/yyssssssyyhyyyssssssss:-----------------------.                    \n" +
                "                   ``      `    :yssssssssssssyyssssss/-------------------------                    \n" +
                "                   ``     ``   `.sssssssssssssyysssyyo-------------------------:                    \n" +
                "                  ``  ```  ` ` ``ssssssssssyyysyysyyy:-------------::----------:                    \n" +
                "                      ``      ```+yyyssssssydhssyyhdd+-------------::----------:                    \n" +
                "                 ````          ``-yhysssssssyyysyddddd+------------::-----------                    \n" +
                "                  ``        `` ` `:sssssssssss+/sdddddys+:----------:----------.                    \n" +
                "                ``      `````     `:ssssssssy+::oydhyysssso/------:.:---------:`                    \n" +
                "              ``      ````     `` `./sssssssy+:/+oyyysssssssso/:---.----------:`                    \n" +
                "             `  ``````        ``  ``:ssssssssssssssyysssssssssssso::-----------                     \n" +
                "               ````        ```    `./yssssssssssssyysssssssssssssssso+:------:`                     \n" +
                "              ```   `` `````    `.-:/sssyssssssssyysssssssssssssssssssss+:----`                     \n" +
                "             `    ```` ``   ```.-::--+ssssssssssyysssssssssssssssssssssssso::`                      \n" +
                "           ``   ``````    ``..:::-----sssssssssyyssssssssssssssssssssssyyyyyo`                      \n" +
                "           ` `````     ```.-:::------/sssssssssysssssssssssssssssssyyyyhhhhhhs.                     \n" +
                "             `   `````.----:--------:sssssssssssssssssssssssssssyyhddhhhhhhhhh:                     \n" +
                "            ``````------------------/ysssssssssssssyssssssssssyhdddddhhhhhhhhs.                     \n" +
                "           ` ``  `..-------------.`.sssssssssssssssssosssssyyhdddddddhhhhhhho.` ``  `               \n" +
                "           `  ```````..-/:-----.```.ssssssssssssssssssossyyhddddddddddhhhhhy:` ```  ```             \n" +
                "              ````  ````.---..``  `/sssssssssssssssssssshhhdddddddddddhhhy+.`   ``` `               \n" +
                "                ``    ``````` ```.-oooooooooooossssysyyhhhhhhhhhhhhhhhdyso/:::::::::-`      ``      \n" +
                "                  ````````````````.ssssssssssssssyyyhhhdddddddddddddddhs-` ``  ``       \n" +
                "                 ``  `` ```` `````:ssssssssssysyyhddddddddddddddddddhy+-...````         \n" +
                "                   ` ``   `......-sssssysyyyhhdddddddddddddddddhhhhhs``           \n" +
                "                     ```  `     `.ssyyyyhhdddddddddddddddddddddddddh:`            \n" +
                "                        `  `    `+yhhdddddddddddddddddddddddddddddh/`             \n" +
                "                       ``      `:hddddddddddddddddddddddddddddddy--`              \n" +
                "                        ````  ``/dddddddddddddddyddddddddddddddh:``               \n" +
                "                       ` ````` `sdddddddddddddd++ddddddddddddddo`                 \n" +
                "                          ```  `hddddddddddddds`/dddddddddddddh.  `               \n" +
                "                           ``  .dddddddddddddy.`/ddddddddddddd:                   \n" +
                "                          `` ``-ddddddddddddh-``/dddddddddddds`                   \n" +
                "                          `   `:dddddddddddd/```/dddddddddddh.                    \n" +
                "                               /dddddddddddo````+ddddddddddd/`                    \n" +
                "                               +ddddddddddh.` ``oddddddddddy`                     \n" +
                "                               +dddddddddd/`` ``sdddddddddd:  ::::::::::::::::::::";

        amorgosTwek[7] = "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                                ```                        ``                                       \n" +
                "                              `    ``                     `                                         \n" +
                "                                    ``                   `                                          \n" +
                "                                      ````` `           `                                           \n" +
                "                                       `                     ``.--.` `  `                           \n" +
                "                         `   -/++/:.`                     ``./syyys.      `                         \n" +
                "                         ` ``syyyyyyo/.`` ` `..-----..````-+syyyyyy.  `   `                         \n" +
                "                         ```-yyyyyyyyyso/...----------/+-+yyyyyyyyy.`    `                          \n" +
                "                         ```/yyyyyyyyyyyyy/--.......-:yo-:oyyyyyyyy.     `                          \n" +
                "                        ````+yyyyyyyyssssy:-----------o::--oyyyyyyy.`   ```                         \n" +
                "                           `oyyyyyyysoss//:-----------:-::-+yyyyyys.`  ```                          \n" +
                "                           `+yyyyyyy/`::------------::-----ossyyyys`` ```                           \n" +
                "                     `   ```+yyyyyyyo`:---//::--/-://+----:sssyyyyo`` ``                            \n" +
                "                      ` ``` /yyyyyyys::--::+/:-:/-:///--:-/yssyyyy+````                             \n" +
                "                          ``-yyyyyyyyo::::://:----:///:-::/yssyyyy:` ``                             \n" +
                "                       ` ```.yyyyyyyys::/:/os/.```-+syy:::/ysyyyyy.` ```                            \n" +
                "                       `    `oyyyyyyys-/:::os/`````./oo---+ssyyyys``` `                             \n" +
                "                     ` ``    /yyyyyyy/--.-`..``.````````:-ossyyyy/`    `                            \n" +
                "                      ``     -yyyyyy+-/.`-`````````````.:-sssyyyy.      ``` `                       \n" +
                "                     `       `syyyy+-:s:``-````--..::``--/sssyyys-`         ```                     \n" +
                "                    ````    ``+yyy+--oys:``....-......::-ossyyyy/:.      ``    `                    \n" +
                "                    ..``    ``:yy+--oysss:```.:.``.--:/-/yysyyyo---`        ``````                  \n" +
                "                    `--.````.-:s+-:syyyyy/--.-.-::---/-:syyyyyy:----`          `                    \n" +
                "                ```.```.----..-:-/syyyyyyo:-::``//`.:-:ssyyyyy+------``                             \n" +
                "                `.:::-.````.---:oyyyyyyyddo.-.`:so-:--/osyyyys--------.`                            \n" +
                "                  `-::/:--------yyyyyyyhddo..../so:--:oosyyyy:---------.`                           \n" +
                "                    `.-----..```syyyyyyddd+```-//-----ddyhyy+-----------:.`                         \n" +
                "                      ```````  `oyyyyy+sdh+-::++:-:..:ddydho---------------``                       \n" +
                "                         ` ``  `oyyyyy+/++/--:::+o..`:+soyy:----------------.`                      \n" +
                "                     ` ``    ` `syyyyso:::///+ssssoosso++s/-------------------.`                    \n" +
                "                    ` `       `.syyysso++syyssssssssyyyysy+--------------------.`                   \n" +
                "                  ````         :yyssssssyddysssssssyhdhssss+---------------------.                  \n" +
                "                   ``      `  `+yssssssssyyyssssssssyyysssss:---------------------.`                \n" +
                "                   ``     ``  `oyssssssssssssssssssssssyssss+-----------------------`               \n" +
                "                  ``  ```  ` ``ossssssssssyyssssysyssssyyssy+-----------------------:`              \n" +
                "                      ``      `sssssssssshdhsssssssyyyssysyo----------:---------/-----`             \n" +
                "                 ````         `ssssssssssyyysssssssyhhssyo:------------/--------/:-----`            \n" +
                "                  ``        ```sssssssssssssssssssssyys+:--------------/---------/------`           \n" +
                "                ``      ````` `osssssssyssssssssssssyo:----------------::--------::----:`           \n" +
                "              ``      ````    `+yssssshdhssssssyhysyy/------------------:--------------:`           \n" +
                "             `  ``````        `/ssssssyyyssssssyhyyys--------------------:--------.:---:`           \n" +
                "               ````        ``` :yyyysssssssssssso++dy------------------:.:-------:`:----`           \n" +
                "              ```   `` `````   .ydddo///ssssssss///ydo:----------------:.:-------:`:----            \n" +
                "             `    ```` ``   `` `sdddh:/-ossssssssoosyyss+//:------------`:--------`:--:`            \n" +
                "           ``   ``````    ```` `odddo//+ysssssssyssssssssssssoo+/::-----`:------------.             \n" +
                "           ` `````     ````    `+yyyssssssssssssssssssssssyssssssssso++:-:-------:---.`             \n" +
                "             `   ``  ````      `+yssssssssssssssssssssssssssssssssssyyyyyso:-----:--.`              \n" +
                "            ```````            `+ssssssyssssssssssssssssssssssssssyhhhhhhhhy/------.`               \n" +
                "           ` ``  ``            `osssssssssssssssssssssssssssssyyhhhhhhhhhhhhy..---.``               \n" +
                "           ` ``` `````        ``osssssssssssssssssssssssssssyyhdddhhhhhhhhhhy.`--` ```              \n" +
                "             ````  ```     `````ossssssssssssssssssssssssyyhddddddhhhhhhhhhhs``-`` `                \n" +
                "               ````    ``` ``  `sssssssssssssssssssssssyyhdddddddddhhhhhhhhh/` ```                  \n" +
                "                 ``` ````  ``` .sssssssssssssssssssssyyddddddddddddhhhhhhhh+````                    \n" +
                "                ``  `` ```` ```.sssssssssssssssssssyyhddddddddddddddhhhhhho``` `                    \n" +
                "                    ``  ``   ``.ssssssssssssysssssyhddddddddddddddddhhhhy/`                         \n" +
                "                    ``` ``     -ssssssssssssssssyhhdddddddddddddddddhhhs-`                          \n" +
                "                          `    -ssssssssssssssyhddddddddddddddddddddhy+.                            \n" +
                "                        ``     .ssssssssssssyhddddddddddddddddddddddy:`                             \n" +
                "                          ` `  `osssssssssyyhddddddddddddddddddddddh.`                              \n" +
                "                        `  ` ```:sysssyyyhddddddddddddddddddddddddd+`                               \n" +
                "                            ``  `/hhhhhdddddddddddddddddddddddddddd-                                \n" +
                "                            ``  ``sddddddddddddddddddddddddddddddds`                                \n" +
                "                           ``  `` .ydddddddddddddddddddddddddddddd:                                `\n" +
                "                            `  `  `-hdddddddddddddddddddddddddddds`                                 \n" +
                "                                    :dddddddddddddddddddddddddddd.                                  \n" +
                "                                    `/dddddddddddddddddddddddddd+                                   \n" +
                "                                     `oddddddddddddddddddddddddy`                                   \n";

        amorgosTwek[8] = "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                                ```                        ``                                       \n" +
                "                              `    ``                     `                                         \n" +
                "                                    ``                   `                                          \n" +
                "                                      ````` `           `                                           \n" +
                "                                       `                       `     `  `                           \n" +
                "                         `   ``````                       `` `            `                         \n" +
                "                         ` ````://-`  ` ` ````````` ` ``` ``          `   `                         \n" +
                "                         `````/yyyyo-```..----------.`` ``          `    `                          \n" +
                "                         ````.yyyyyyy/.-----------o----``                `                          \n" +
                "                        `````+yyyyyyy+-----------+y/----.`          `   ```                         \n" +
                "                            `syyyyyyys/--...-----/o/:----.` ```..---:://++:                         \n" +
                "                            .yyyyyyh+so----------:/--::--::/+osssyyyyyyyyyy`                        \n" +
                "                     `   ```-yyyyyyh+::---:------::------/yyyyyyyyyyyyyyyyo                         \n" +
                "                      ` ``` -yyyyyyh+-/-:-/----:--:----:-/yyyyysyyyyyyyyys-                         \n" +
                "                          ``-yyyyyyy+-+:::/::--:/::--.-/::sysssyyyyyyyyyy/`                         \n" +
                "                       ` ```.yyyyyyyo-:////:.`.`./os+:.-+-oyssoysyyyyyyy+`                          \n" +
                "                       `    `syyyyyyy:-//ss+````.:oso:.-:::/-.-syyyyyyyo.                           \n" +
                "                     ` ``   `oyyyyyyyo-/:oo/```.``-..``:-/--`:syyyyyyys.`                           \n" +
                "                      ``     :yyyyyyyy:-:..```````````.///:/ossyyyyyys-```` `                       \n" +
                "                     `       .syyyyyyyo-:.```...-:.```:////:ysyyyyyyy:`     ```                     \n" +
                "                     ```    ``+yyyyyyyy/-:.``:////.`-://+oo-syyyyyyy/`   ``    `                    \n" +
                "                    ````    ``-yyyyyyyyo-:/:-....`.:///oysy:+yyyyyy+`       ``````                  \n" +
                "                     `  `    `-syyyyyyyy/-/+-...-/-//+oossy::yyyyy+``          `                    \n" +
                "                 ``      ``  `:/yyyyyyyyo-:/:```.+:++////+s/:yyyy+````                              \n" +
                "                        `   `.:-syyyyyyyy--//```.ss/::-/yyy/-syyo`    ``                            \n" +
                "                   `        `---+yyyyyyyy:-+y:.``/s/`.-.odh/-syo.       `                           \n" +
                "                            `:---syyyyyyy:-/do```.ss:.``.sh::ys/.         `                         \n" +
                "                      `   ``.----+yyyyyys--/hy-``.sss-```-+-/h/::.``      ```                       \n" +
                "                         ` `-----:yyyyyy/--//::``-ssss:`.::-/+---:-`                                \n" +
                "                     ` ``  `:----:yyyyyo-::o+ossoosyssssso:sss+---::.`        `                     \n" +
                "                    ` `    `:-----syyys-:soyssssyyyssyyys/ossyyo------`                             \n" +
                "                  ````     .:-----syys:+yysssssshdhysyysssyyhyyys------.`                           \n" +
                "                   ``      .------+yyossyyssssssyyysssssyssyhyssss:------.`                         \n" +
                "                   ``     `.------:ysssssssssssssssssssysssssssysy/--------`                        \n" +
                "                  ``  ```  .-------ssssssssssssysssssssysssssssysy+----------`                      \n" +
                "                      ``   .:------osssssssssshdhysssssssssssssyyy:------------``                   \n" +
                "                 ````      `:------+ssssssssssyhysssssssssyyyssss//:-------------```                \n" +
                "                  ``       `:------/yssssssssssssssssssssshdhyso:--::--------:----.``               \n" +
                "                ``      ````-------:ysssssssssssssssssssssyyso:------:-------::-----.`              \n" +
                "              ``      ````  `:-----:yssssssyhdhssssyysssssss/---------::-------:------`             \n" +
                "             `  ``````      `------/yssssssyhhyssssssssyyyo:------------:-------:------.`           \n" +
                "               ````        ```:----/yyyyyssossssssssssshds-----------------------:.------`          \n" +
                "              ```   `` `````  .----sddddd+::ossssssssssys:-------------------------.------`         \n" +
                "             `    ```` ``   ```---odddddh/::+yssssssssys:--:--------------:.--------.------         \n" +
                "           ``   ``````    ```` `:+hhhhhds+++sssssssssss/----/---------------`--------`:---:`        \n" +
                "           ` `````     ````    .oysyyyyysysssssssssssy+------:--------------..-------..-----`       \n" +
                "             `   ``  ````     .osssssssssssssssssssyyyo------:.--------------`--------`:---:`       \n" +
                "            ```````          .ossssssssssssssssssssssyys+:----..-------------``-..```.`.-..-.       \n" +
                "           ` ``  ``         `+ssssssssssssssssssssssssssssso+/:.--.-----...````````   ```````       \n" +
                "            `  ```````````  ``-+yssssssssssssssssssssssssssssossso+o+/:-.```          ```           \n" +
                "                 ````  ```    -sssssssssssssssssssssssssssssssssssssssso/-.`        `` `            \n" +
                "                   ```    ````osssssssssssssssssssssssssssssssssssyyyyyyhhs.       ```              \n" +
                "                    ````` ```:yssssssssssssssssssssssssssssssyyyhyhhhhhhhhh.     ```                \n" +
                "                   ``   `` ``osssssssssssssssssssssssssssyyyhdddhhhhhhhhhh+`   ``                   \n" +
                "                        ``  .sssssssssssssssssssssssssyyydddddddhhhhhhhhh+`                         \n" +
                "                        ``` .ssssssssssssssssssssssyyhdddddddddddhhhhhhy/`                          \n" +
                "                           `.ssssssssssssssysssssyyhdddddddddddddhhhhy+.`                           \n" +
                "                            `+ssssssssssssssssyyhdddddddddddddddddhys-`  `                          \n" +
                "                             -ssssssssssssssyyhddddddddddddddddddds-``                              \n" +
                "                             `/sssssssssssyhdddddddddddddddddddddd/`                                \n" +
                "                              `+ssssssssyhddddddddddddddddddddddddo```                              \n" +
                "                               .ossssyyhddddddddddddddddddddddddddo`` `                             \n" +
                "                               `.+ysyhddddddddddddddddddddddddddddo``                               \n" +
                "                               ` `+ydddddddddddddddddddddddddddddds``                               \n" +
                "                                  `/dddddddddddddddddddddddddddddds``                               \n" +
                "                                   `:hdddddddddddddddddddddddddddds``                               \n" +
                "                                     -ydddddddddddddddddddddddddddy-::::::::::::::::::::::::::::::::\n";

        amorgosTwek[9] = "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                                ```                        ``                                       \n" +
                "                              `    ``                     `                                         \n" +
                "                              `-:.` ``                   `                                          \n" +
                "                             `oyyy+.  ````` `           `                                           \n" +
                "                             /yyyyys:` ` `.........`           `     `  `                           \n" +
                "                         `  .syyyyyyy/`.-------------.`   `` `            `                         \n" +
                "                         ` `/yyyyyyyys:----------++----.` ``          `   `                         \n" +
                "                         ```+yyyyyyyy:------...--oy:----.`         ````...-.`                       \n" +
                "                         ```oyyyyyyyyy/.-.------:/+:::---.``..-://++oosssyys.                       \n" +
                "                        ````oyyyyyyyyy/---------/::--:---+sssyyyyyyyyyyyyyys`                       \n" +
                "                           `+yyyyyyyyo:--:::----/.-:-----/yyyyyyyyyhyyyyyyy:                        \n" +
                "                            :yyyyyyyys/-::::--:-:------:-:syysssyyyyyyyyyyo`                        \n" +
                "                     `   ```.syyyyyyyys-//:..`.---::-.-/:/sssssyysyyyyyyyy-                         \n" +
                "                      ` ``` `:yyyyyyyys:///.````:oyyo:.-/:so+/:osssyyyyyy/`                         \n" +
                "                          ````syyyyyyyy/+sy/`````-o+:.`:-::.``-sssyyyyyyo`                          \n" +
                "                       ` `````:yyyyyyyyo://.``````````.:-:-:.:ssssyyyyys.                           \n" +
                "                       `    ` `syyyyyyys:.`.``````````-.``--+sssssyyyys-`                           \n" +
                "                     ` ``     `/yyyyyyyy/--``.-::/-``..``-++:+sssyyyys-`                            \n" +
                "                      ``      `:yyyyyyyys:--`-:::-`.-``.+ssyo:/syyyys-` ``` `                       \n" +
                "                     `       ``:syyyyyyyyy:-:....--:`.+sssssss/:+yyo-`      ```                     \n" +
                "                     ```    ``--oyyyyyyyyyo/-:-../-/:+++osssyyyo::o-`    ``    `                    \n" +
                "                    ````    `.--/yyyyyyyyyys+-:-`++++::/+sssyyyhs:--.`      ``````                  \n" +
                "                     `  `   `:---syyyyyyyyyyy+---/s:.---shsyyyyy+.----`        `                    \n" +
                "                 ``      ```-----/yyyyyyyyyho::-:-oo:--``+hhyyy+```----`                            \n" +
                "                        `  `:-----+yyyyyyyyy+:/--:/sss+-``:hhho-.```::-:`                           \n" +
                "                   `      `--------oyyyyyyyyys+/--oyyyss+:.-++/.`...-:---`                          \n" +
                "                          `:-------:yyyyyyysssss:-ohdyyyysoosoo+:```/:`::``                         \n" +
                "                      `   ----------+yyyyyyssssy+-yhhyyssyssssyhh+../.`-:````                       \n" +
                "                         `:----------oyyyysssssss:yyssssssssssyyyys:`  -:`                          \n" +
                "                     ` ```:-----------syssssssssyosssssssssssssssss+```:.     `                     \n" +
                "                    ` `  .------------:ssssssssssssyyhysssssssssssss```.`                           \n" +
                "                  ````   :-------------/yssssssssssyhdhsssssssssssso`  ``                           \n" +
                "                   ``   `:--------------sssssssssssssssssssssssyyys-    ```                         \n" +
                "                   ``   `:--------------/ssssssssssssssysssssssyho.`      ``                        \n" +
                "                  ``  ``.:------:-------osssssssssyhyysyssssssy+.``                                 \n" +
                "                      ``.-------+-------sssssssssshddyssssssss+--`             ``                   \n" +
                "                 ````   .-------/-------/hhhyyyysssyysssssssyo-----.``          ````                \n" +
                "                  ``    .------::-------odddddddhssysssssssss------:-.```         ```               \n" +
                "                ``      .------:-:-----+hdddddddd//+sssssssy/-.-----::--.``         `               \n" +
                "              ``      ``.------:.---/+ssyyyyhhddy:::osssssso---.-----::----.`        ``             \n" +
                "             `  ``````  .--------:ossssssssssyyy+/:+sssssso:----..------------.`       `            \n" +
                "               ````     .-----:+sssssssssssssssssssssssyo/-------.`.------..-----.`                 \n" +
                "              ```   `` `.:--:+ssssssssssssyssssssssssssy/----------``------.``-----.``              \n" +
                "             `    ```` ``:-+ssssssssssssssssssssssssssso------------``.------.``.----.``            \n" +
                "           ``   ``````  `/osssssssssssssssssssssssssss/--------------```.------```.----`            \n" +
                "           ` `````     `:sssssssssssssssssssssssssssys:---------------````------```.----`           \n" +
                "             `   ``  ``:sssssssssssssssssssssssssssssso/---------------````------```.-.-.`          \n" +
                "----------------------/ssssssssssoooooooooooooo++++ooooo+:..............`  `-...-.``````````   `.:::\n" +
                "                     ssssssssssssssssssssssssssssssssss+:-----------.``````````     ``  `  ``` .ssss\n" +
                "                     ssssssssssssssssssssssssssssssssssss+:-..```````     `             ``` ```ossss\n" +
                "                     ssssssssssssssssssssssssssssssyyyyyyyyo.   ````        ``          ```` `/yssss\n" +
                "                     ssssssssssssssssssssyyyyyyhhhhdhhhhhhhh/      `       ```             ``.ssssss\n" +
                "                     ssssyyyyyyyyyhhhhhhhddddddddddddhhhhhhh:            ```                `/ysssss\n" +
                "                     hhhhddddddddddddddddddddddddddddhhhhhhs``     `   ``                 ` `+syyyhh\n" +
                "                     dddddddddddddddddddddddddddddddddhhhhy-`    `                           :yhhhdd\n" +
                "                     dddddddddddddddddddddddddddddddddhhyo.`    ``                           `+yhhhd\n" +
                "                     dddddddddddddddddddddddddddddddddds:``    ``                             `-oyhd\n" +
                "                     dddddddddddddddddddddddddddddddddh.     ``  `                              `.-+\n" +
                "                     :hdddddddddddddddddddddddddddddddd:   ```                                      \n" +
                "                     `/ddddddddddddddddddddddddddddddddo` `                                         \n" +
                "                      `/dddddddddddddddddddddddddddddddh``````                                      \n" +
                "                       `/hdddddddddddddddddddddddddddddd-` `` `                                     \n" +
                "                       ``:hdddddddddddddddyddddddddddddd/` ``                                       \n" +
                "                       ` `:hddddddddddddddoodddddddddddds````                                       \n" +
                "                           .ydddddddddddddh-+dddddddddddh.```                                       \n" +
                "                            `odddddddddddddo`oddddddddddd-```                                       \n" +
                "                             `+ddddddddddddd-`sdddddddddd+``                    ::::::::::::::::::::\n                        `                                                                           \n" +
                "                                                                                                    \n" +
                "                                ```                        ``                                       \n" +
                "                              `    ``                     `                                         \n" +
                "                              `-:.` ``                   `                                          \n" +
                "                             `oyyy+.  ````` `           `                                           \n" +
                "                             /yyyyys:` ` `.........`           `     `  `                           \n" +
                "                         `  .syyyyyyy/`.-------------.`   `` `            `                         \n" +
                "                         ` `/yyyyyyyys:----------++----.` ``          `   `                         \n" +
                "                         ```+yyyyyyyy:------...--oy:----.`         ````...-.`                       \n" +
                "                         ```oyyyyyyyyy/.-.------:/+:::---.``..-://++oosssyys.                       \n" +
                "                        ````oyyyyyyyyy/---------/::--:---+sssyyyyyyyyyyyyyys`                       \n" +
                "                           `+yyyyyyyyo:--:::----/.-:-----/yyyyyyyyyhyyyyyyy:                        \n" +
                "                            :yyyyyyyys/-::::--:-:------:-:syysssyyyyyyyyyyo`                        \n" +
                "                     `   ```.syyyyyyyys-//:..`.---::-.-/:/sssssyysyyyyyyyy-                         \n" +
                "                      ` ``` `:yyyyyyyys:///.````:oyyo:.-/:so+/:osssyyyyyy/`                         \n" +
                "                          ````syyyyyyyy/+sy/`````-o+:.`:-::.``-sssyyyyyyo`                          \n" +
                "                       ` `````:yyyyyyyyo://.``````````.:-:-:.:ssssyyyyys.                           \n" +
                "                       `    ` `syyyyyyys:.`.``````````-.``--+sssssyyyys-`                           \n" +
                "                     ` ``     `/yyyyyyyy/--``.-::/-``..``-++:+sssyyyys-`                            \n" +
                "                      ``      `:yyyyyyyys:--`-:::-`.-``.+ssyo:/syyyys-` ``` `                       \n" +
                "                     `       ``:syyyyyyyyy:-:....--:`.+sssssss/:+yyo-`      ```                     \n" +
                "                     ```    ``--oyyyyyyyyyo/-:-../-/:+++osssyyyo::o-`    ``    `                    \n" +
                "                    ````    `.--/yyyyyyyyyys+-:-`++++::/+sssyyyhs:--.`      ``````                  \n" +
                "                     `  `   `:---syyyyyyyyyyy+---/s:.---shsyyyyy+.----`        `                    \n" +
                "                 ``      ```-----/yyyyyyyyyho::-:-oo:--``+hhyyy+```----`                            \n" +
                "                        `  `:-----+yyyyyyyyy+:/--:/sss+-``:hhho-.```::-:`                           \n" +
                "                   `      `--------oyyyyyyyyys+/--oyyyss+:.-++/.`...-:---`                          \n" +
                "                          `:-------:yyyyyyysssss:-ohdyyyysoosoo+:```/:`::``                         \n" +
                "                      `   ----------+yyyyyyssssy+-yhhyyssyssssyhh+../.`-:````                       \n" +
                "                         `:----------oyyyysssssss:yyssssssssssyyyys:`  -:`                          \n" +
                "                     ` ```:-----------syssssssssyosssssssssssssssss+```:.     `                     \n" +
                "                    ` `  .------------:ssssssssssssyyhysssssssssssss```.`                           \n" +
                "                  ````   :-------------/yssssssssssyhdhsssssssssssso`  ``                           \n" +
                "                   ``   `:--------------sssssssssssssssssssssssyyys-    ```                         \n" +
                "                   ``   `:--------------/ssssssssssssssysssssssyho.`      ``                        \n" +
                "                  ``  ``.:------:-------osssssssssyhyysyssssssy+.``                                 \n" +
                "                      ``.-------+-------sssssssssshddyssssssss+--`             ``                   \n" +
                "                 ````   .-------/-------/hhhyyyysssyysssssssyo-----.``          ````                \n" +
                "                  ``    .------::-------odddddddhssysssssssss------:-.```         ```               \n" +
                "                ``      .------:-:-----+hdddddddd//+sssssssy/-.-----::--.``         `               \n" +
                "              ``      ``.------:.---/+ssyyyyhhddy:::osssssso---.-----::----.`        ``             \n" +
                "             `  ``````  .--------:ossssssssssyyy+/:+sssssso:----..------------.`       `            \n" +
                "               ````     .-----:+sssssssssssssssssssssssyo/-------.`.------..-----.`                 \n" +
                "              ```   `` `.:--:+ssssssssssssyssssssssssssy/----------``------.``-----.``              \n" +
                "             `    ```` ``:-+ssssssssssssssssssssssssssso------------``.------.``.----.``            \n" +
                "           ``   ``````  `/osssssssssssssssssssssssssss/--------------```.------```.----`            \n" +
                "           ` `````     `:sssssssssssssssssssssssssssys:---------------````------```.----`           \n" +
                "             `   ``  ``:sssssssssssssssssssssssssssssso/---------------````------```.-.-.`          \n" +
                "----------------------/ssssssssssoooooooooooooo++++ooooo+:..............`  `-...-.``````````   `.:::\n" +
                "                     ssssssssssssssssssssssssssssssssss+:-----------.```````````    ``  `  ``` .ssss\n" +
                "                     ssssssssssssssssssssssssssssssssssss+:-..```````     `    `        ``` ```ossss\n" +
                "                     ssssssssssssssssssssssssssssssyyyyyyyyo.   ````        `` `        ```` `/yssss\n" +
                "                     ssssssssssssssssssssyyyyyyhhhhdhhhhhhhh/      `       ```             ``.ssssss\n" +
                "                     ssssyyyyyyyyyhhhhhhhddddddddddddhhhhhhh:            ```                `/ysssss\n" +
                "                     hhhhddddddddddddddddddddddddddddhhhhhhs``     `   ``                 ` `+syyyhh\n" +
                "                     dddddddddddddddddddddddddddddddddhhhhy-`    `                           :yhhhdd\n" +
                "                     dddddddddddddddddddddddddddddddddhhyo.`    ``                           `+yhhhd\n" +
                "                     dddddddddddddddddddddddddddddddddds:``    ``                             `-oyhd\n" +
                "                     dddddddddddddddddddddddddddddddddh.     ``  `                              `.-+\n" +
                "                     :hdddddddddddddddddddddddddddddddd:   ```                                      \n" +
                "                     `/ddddddddddddddddddddddddddddddddo` `                                         \n" +
                "                      `/dddddddddddddddddddddddddddddddh``````                                      \n" +
                "                       `/hdddddddddddddddddddddddddddddd-` `` `                                     \n" +
                "                       ``:hdddddddddddddddyddddddddddddd/` ``                                       \n" +
                "                       ` `:hddddddddddddddoodddddddddddds````                                       \n" +
                "                           .ydddddddddddddh-+dddddddddddh.```                                       \n" +
                "                            `odddddddddddddo`oddddddddddd-```                                       \n" +
                "                             `+ddddddddddddd-`sdddddddddd+``                    ::::::::::::::::::::\n";

    }
}
