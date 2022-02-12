import java.util.Map;

public class exo8 {
    /* Dans la class exo7, on ne récupère pas les doublons de distances.
       Exemple:

      {nuoczgm=[80]}
      {nuoc=[80]}

      On se rend compte que la chaîne "nuoc" est déjà dans la chaîne "nuoczgm", ces deux chaînes se répètent
      chacune deux fois dans notre String, quand on va calculer les diviseurs de chaque distance, on ne récupère
      pas deux fois les mêmes distances pour les calculer.

      IN:

      String s = "kqowefvjpujuunukglmekjinmwuxfqmkjbgwrlfnfghudwuumbsvlpsncmuekqc" +
                "teswreekoyssiwctuaxyotapxplwpntcgojbgfqhtdwxizaygffnsxcs" +
                "eynctsspntujnytggwzgrwuunejuuqeapymekqhuiduxfpguytsmtffshnuocz" +
                "gmruweytrgkmeedctvrecfbdjqcuswvbpnlgoylskmtefvjjtwwmfmwpnmemtmhrspxf" +
                "sskffstnuoczgmdoeoyeekcpjrgpmurskhfrseiuevgoycwxizaygosaanydoeoyjlwunham" +
                "ebfelxyvlwnojnsiofrwucceswkvidgmucgocruwgnmaaffvnsiudekqhceucpfcmpvsudgav" +
                "emnymamvlfmaoyfntqcuafvfjnxklneiwcwodcculwriftwgmuswovmatnybuhtcocwfytnmgyt" +
                "qmkbbnlgfbtwojftwgntejkneedcldhwtvbuvgfbijg";

        s = exo2.f(s);

        exo7.f(exo6.f(s), s);

        OUT:

        {esw=[280]}
        {uoc=[80]}
        {nuo=[80]}
        {ekq=[95, 220]}
        {cgo=[260]}
        {wxiza=[190]}
        {juu=[135]}
        {eoy=[45]}
        {goy=[75]}
        {doeoy=[45]}
        {nuoczg=[80]}
        {ekqh=[220]}
        {ruw=[175]}
        {usw=[235]}
        {izay=[190]}
        {fvj=[220]}
        {wgn=[125]}
        {xizayg=[190]}
        {uxf=[135]}
        {qcu=[205]}
        {edc=[300]}
        {ocz=[80]}
        {uocz=[80]}
        {xiz=[190]}
        {wxi=[190]}
        {jbg=[65]}
        {ayg=[190]}
        {ftwg=[45]}
        {eedc=[300]}
        {ffs=[80]}
        {oczg=[80]}
        {zay=[190]}
        {czgm=[80]}
        {wpn=[145]}
        {pnt=[35]}
        {efvj=[220]}
        {doe=[45]}
        {nuocz=[80]}
        {kqh=[220]}
        {eed=[300]}
        {nsi=[35]}
        {twg=[45]}
        {uoczgm=[80]}
        {oczgm=[80]}
        {eek=[200]}
        {zayg=[190]}
        {qmk=[440]}
        {gmu=[90]}
        {uun=[130]}
        {iza=[190]}
        {rwu=[200]}
        {czg=[80]}
        {mek=[135]}
        {uoczg=[80]}
        {wuu=[95]}
        {wxizayg=[190]}
        {wxizay=[190]}
        {oeo=[45]}
        {doeo=[45]}
        {izayg=[190]}
        {xiza=[190]}
        {zgm=[80]}
        {gfb=[30]}
        {wxiz=[190]}
        {nlg=[260]}
        {ftw=[45]}
        {nuoc=[80]}
        {xizay=[190]}
        {oeoy=[45]}
        {efv=[220]}
        {iwc=[350]}
        {nuoczgm=[80]}
        65 divisible par [1, 5, 13]
        130 divisible par [1, 2, 5, 10, 13, 26]
        35 divisible par [1, 5, 7]
        260 divisible par [1, 2, 4, 5, 10, 13, 20, 26, 52, 65]
        135 divisible par [1, 3, 5, 9, 15, 27, 45]
        200 divisible par [1, 2, 4, 5, 8, 10, 20, 25, 40, 50]
        75 divisible par [1, 3, 5, 15, 25]
        235 divisible par [1, 5, 47]
        300 divisible par [1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 25, 30, 50, 60, 75, 100]
        45 divisible par [1, 3, 5, 9, 15]
        205 divisible par [1, 5, 41]
        175 divisible par [1, 5, 7, 25, 35]
        80 divisible par [1, 2, 4, 5, 8, 10, 16, 20]
        145 divisible par [1, 5, 29]
        280 divisible par [1, 2, 4, 5, 7, 8, 10, 14, 20, 28, 35, 40, 56, 70]
        440 divisible par [1, 2, 4, 5, 8, 10, 11, 20, 22, 40, 44, 55, 88, 110]
        90 divisible par [1, 2, 3, 5, 6, 9, 10, 15, 18, 30]
        220 divisible par [1, 2, 4, 5, 10, 11, 20, 22, 44, 55]
        125 divisible par [1, 5, 25]
        190 divisible par [1, 2, 5, 10, 19, 38]
        30 divisible par [1, 2, 3, 5, 6, 10]
        350 divisible par [1, 2, 5, 7, 10, 14, 25, 35, 50, 70]
        95 divisible par [1, 5, 19]
        longueur clef trouvée: [5]

        Process finished with exit code 0

        On voit bien que la première liste de toutes les distances va être beaucoup plus longue avec plein de doublons,
        puis on va récupérer chaque distance une fois pour trouver les diviseurs.
        On finit par trouver le diviseur commun qui est la longueur de la clef.

     */
}
