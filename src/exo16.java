import java.util.ArrayList;

public class exo16 {

    /* In: "BILKO PFFGM LTWOE WJCFD SHKWO NKSEO VUSGR LWHGW FNVKW GGGFN RFHYJ VSGRF RIEKD CCGBH RYSXV KDIJA HCFFG YEFSG ZWG",
            "attaque",
    *  Out: [bpskyvb, isrozlb, lrvpplc, kvwfpmi, owmfqsh, pmmgwrp, fmnmvzs, fntldck, gtstgua, msawyks, ladoocf, tdvegpy, wvlwtib,
            oldjmlz, edqcpjo, wqjfnyd, jjmdcng, cmksrqs, fkzhuck, dzokguj, sorwytg, hrdoxqo, kdvnuya, wvukckk, oursour, nrzeybq,
             kzlofao, slvveyc, evcucmn, ocbsqxh, vbzgbrs, uznrvcd, snylgnc, gyswrms, rsdhqcb, ldogglj, wonwptr, hndfxbg, gdmnfqs,
              wmuvucc, fuckgmc, ncrwqmc, vrdgqmb, kdngqlj, wnngptn, gnnfxxb, gnmnbld, gmurpnu, fuyfref, nymhipr, rmoytbo, fofjfyc,
               hfqvcmn, yqcsqxb, jczgbln, vznrpxe, snyfboa, gymrskg, rmyioqz, fypeujy, rplkniy, ilrdmic, erkcmmx, kkjcqhd, djjglnn,
                cjnbrxu, cnihbeo, gioriyt, boyycdr, hyfshbg, rfzxfqz, yzevuje, secknof, xcrdspw, vrkitgd, kkpjkny, dpqarib, iqhhmlb,
                 jhocplc, aojfpmu, hjmfqea, cmmgikb, fmnyolo, fnfepyc, gflfcmv, ylmsqfs, emzgjcc]

       On pourrait trouver la clef en clair en récupérant la longueur de la clef probable pour le texte puis trouver une répétition
       dans notre liste de pseudo clef.
    */
    public static ArrayList<String> f(String s, String word) {
        char[] c = s.toCharArray();
        ArrayList<String> clef = new ArrayList<>();

        for (int i=0; i < c.length && i+word.length() <= c.length; i++) {
            String temp = "";
            clef.add(exo15.f(s, word, i));
        }

        return clef;
    }
}
