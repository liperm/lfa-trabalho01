/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package buscapadraoweb;

import buscaweb.CapturaRecursosWeb;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class Main {

    // busca char em vetor e retorna indice
    public static int get_char_ref (char[] vet, char ref ){
        for (int i=0; i<vet.length; i++ ){
            if (vet[i] == ref){
                return i;
            }
        }
        return -1;
    }

    // busca string em vetor e retorna indice
    public static int get_string_ref (String[] vet, String ref ){
        for (int i=0; i<vet.length; i++ ){
            if (vet[i].equals(ref)){
                return i;
            }
        }
        return -1;
    }

    

    //retorna o próximo estado, dado o estado atual e o símbolo lido
    public static int proximo_estado(char[] alfabeto, int[][] matriz,int estado_atual,char simbolo){
        int simbol_indice = get_char_ref(alfabeto, simbolo);
        if (simbol_indice != -1){
            return matriz[estado_atual][simbol_indice];
        }else{
            return -1;
        }
    }

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia e usa objeto que captura código-fonte de páginas Web
        CapturaRecursosWeb crw = new CapturaRecursosWeb();
        crw.getListaRecursos().add("https://superuser.com/questions/1053845/what-are-the-valid-public-ip-address-ranges");
        ArrayList<String> listaCodigos = crw.carregarRecursos();

        String codigoHTML = listaCodigos.get(0);

        //mapa do alfabeto
        char[] alfabeto = new char[11];
        alfabeto[0] = '0';
        alfabeto[1] = '1';
        alfabeto[2] = '2';
        alfabeto[3] = '3';
        alfabeto[4] = '4';
        alfabeto[5] = '5';
        alfabeto[6] = '6';
        alfabeto[7] = '7';
        alfabeto[8] = '8';
        alfabeto[9] = '9';
        alfabeto[10] = '.';


        //mapa de estados
        String[] estados = new String[36];
        estados[0] = "q0";
        estados[1] = "q1";
        estados[2] = "q2";
        estados[3] = "q3";
        estados[4] = "q4";
        estados[5] = "q5";
        estados[6] = "q6";
        estados[7] = "q7";
        estados[8] = "q8";
        estados[9] = "q9";
        estados[10] = "q10";
        estados[11] = "q11";
        estados[12] = "q12";
        estados[13] = "q13";
        estados[14] = "q14";
        estados[15] = "q15";
        estados[16] = "q16";
        estados[17] = "q17";
        estados[18] = "q18";
        estados[19] = "q19";
        estados[20] = "q20";
        estados[21] = "q21";
        estados[22] = "q22";
        estados[23] = "q23";
        estados[24] = "q24";
        estados[25] = "q25";
        estados[26] = "q26";
        estados[27] = "q27";
        estados[28] = "q28";
        estados[29] = "q29";
        estados[30] = "q30";
        estados[31] = "q31";
        estados[32] = "q32";
        estados[33] = "q33";
        estados[34] = "q34";
        estados[35] = "q35";


        String estado_inicial = "q0";

        //estados finais
        String[] estados_finais = new String[8];
        estados_finais[0] = estados[28];
        estados_finais[1] = estados[29];
        estados_finais[2] = estados[30];
        estados_finais[3] = estados[31];
        estados_finais[4] = estados[32];
        estados_finais[5] = estados[33];
        estados_finais[6] = estados[34];
        estados_finais[7] = estados[35];

        //tabela de transição de AFD para reconhecimento números de dois dígitos
        int[][] matriz = new int[36][11];
        //transições de q0
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q9");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q9");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q9");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q9");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q9");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q9");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q9");

        //transições de q1
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transições de q2
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transições de q3
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transiçoes de q4
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q14");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q10");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q15");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q18");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q18");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q18");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q18");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q18");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q18");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q18");

        //transições de q5
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transiçoes q6
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q8");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transiçoes q7
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transiçoes q8
        matriz[get_string_ref(estados, "q8")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q8")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q8")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q8")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q8")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q8")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q8")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transiçoes q9
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q9")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q4");

        //transições de q10
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q11");
        matriz[get_string_ref(estados, "q10")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q13");

        //transições de q11
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q11")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q13");

        //transições de q12
        matriz[get_string_ref(estados, "q12")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q13");

        //transições de q13
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q23");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q19");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q24");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q27");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q27");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q27");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q27");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q27");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q27");
        matriz[get_string_ref(estados, "q13")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q27");

        //transiçoes de q14
        matriz[get_string_ref(estados, "q14")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q13");

        //transições de q15
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q16");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q16");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q16");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q16");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q16");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q17");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q15")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q13");

        //transiçoes q16
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q16")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q13");

        //transiçoes q17
        matriz[get_string_ref(estados, "q17")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q17")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q17")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q17")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q17")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q17")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q17")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q13");

        //transiçoes q18
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q12");
        matriz[get_string_ref(estados, "q18")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q13");

        //transições de q19
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q20");
        matriz[get_string_ref(estados, "q19")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q22");

        //transições de q20
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q20")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q22");

        //transições de q21
        matriz[get_string_ref(estados, "q21")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q22");

        //transições de q22
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q31");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q28");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q32");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q35");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q35");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q35");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q35");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q35");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q35");
        matriz[get_string_ref(estados, "q22")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q35");

        //transiçoes de q23
        matriz[get_string_ref(estados, "q23")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q22");

        //transições de q24
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q25");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q25");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q25");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q25");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q25");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q26");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q24")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q22");

        //transiçoes q25
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q25")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q22");

        //transiçoes q26
        matriz[get_string_ref(estados, "q26")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q26")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q26")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q26")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q26")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q26")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q26")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q22");

        //transiçoes q27
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q21");
        matriz[get_string_ref(estados, "q27")][get_char_ref(alfabeto, '.')] = get_string_ref(estados, "q22");

        //transiçoes q28
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q29");
        matriz[get_string_ref(estados, "q28")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q29");
        
        //transiçoes q29
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q29")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q30");

        //transiçoes q30
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '0')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '1')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '2')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '3')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '4')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '5')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '6')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '7')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '8')] = -1;
        matriz[get_string_ref(estados, "q30")][get_char_ref(alfabeto, '9')] = -1;

        //transiçoes q31
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '0')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '1')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '2')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '3')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '4')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '5')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '6')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '7')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '8')] = -1;
        matriz[get_string_ref(estados, "q31")][get_char_ref(alfabeto, '9')] = -1;

        //transiçoes q32
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q33");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q33");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q33");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q33");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q33");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q34");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q32")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q30");

        //transiçoes q33
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q33")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q30");

        //transiçoes q34
        matriz[get_string_ref(estados, "q34")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q34")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q34")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q34")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q34")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q34")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q30");

        //transiçoes q35
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q30");
        matriz[get_string_ref(estados, "q35")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q30");

        int estado = get_string_ref (estados, estado_inicial);
        int estado_anterior = -1;
        ArrayList<String> palavras_reconhecidas = new ArrayList();


        String palavra = "";
        //varre o código-fonte de um código
        for (int i=0; i<codigoHTML.length(); i++){

            estado_anterior = estado;
            estado = proximo_estado(alfabeto, matriz, estado, codigoHTML.charAt(i));
            //se o não há transição
            if (estado == -1){
                //pega estado inicial
                estado = get_string_ref(estados, estado_inicial);
                // se o estado anterior foi um estado final
                if (get_string_ref(estados_finais, estados[estado_anterior]) != -1){
                    //se a palavra não é vazia adiciona palavra reconhecida
                    if ( ! palavra.equals("")){
                        palavras_reconhecidas.add(palavra);
                    }
                    // se ao analisar este caracter não houve transição
                    // teste-o novamente, considerando que o estado seja inicial
                    i--;
                }
                //zera palavra
                palavra = "";
                
            }else{
                //se houver transição válida, adiciona caracter a palavra
                palavra += codigoHTML.charAt(i);
            }
        }


        //foreach no Java para exibir todas as palavras reconhecidas
        for (String p: palavras_reconhecidas){
            System.out.println (p);
        }


    }



}
