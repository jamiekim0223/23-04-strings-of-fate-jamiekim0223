import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringySpellsTest {
    private static String[] list1;
    private static String[] list2;
    private static String[] mids;
    private static String[] alOms;
    private static double[] aves;
    private static int[] rems;
    private static String[] flips;
    private static String[] left;

    @BeforeAll
    static void setUp() {
        list1 = new String[]{"dog","aplus","catgiraffe","ap","pluscat","#","aplusdog#13337#","code", "wow","catsand","7"};
        list2 = new String[]{"cats","pigs","apluscompsci", "aplus","dogsaplus","#","pigaplusprogram","code1234","plus","aplusdogsaplus","77777"};
        rems = new int[]{1,2,3,1,4,0,9,2,1,0,0};
        left = new String[]{"dg","apus","catiraffe","a","plusat","","aplusdog#3337#","coe","ww","atsand",""};
        alOms = new String[]{"ds","as","ci","as","ps","##","am","c4","ws","cs","77"};
        mids = new String[]{"o","l","r","p","s","#","g","d","o","s","7"};
        aves = new double[]{3.5,4.5,11,3.5,8,1,15,6,3.5,10.5,3};
        flips = new String[]{"cog","pplus","aatgiraffe","ap","dluscat","#","pplusdog#13337#","code","pow","aatsand","7"};
    }

    private static Stream<Arguments> providedStrings_allMids(){
        return Stream.of(
                Arguments.of(list1[0],list2[0],mids[0]),
                Arguments.of(list1[1],list2[1],mids[1]),
                Arguments.of(list1[2],list2[2],mids[2]),
                Arguments.of(list1[3],list2[3],mids[3]),
                Arguments.of(list1[4],list2[4],mids[4]),
                Arguments.of(list1[6],list2[6],mids[6]),
                Arguments.of(list1[7],list2[7],mids[7]),
                Arguments.of(list1[8],list2[8],mids[8]),
                Arguments.of(list1[9],list2[9],mids[9])
        );
    }

    @DisplayName("Middle Letters")
    @ParameterizedTest
    @MethodSource("providedStrings_allMids")
    void findMids(String a, String b, String m){
        String ans = StringySpells.middleFinder(a);
        assertEquals(m,ans);
    }

    private static Stream<Arguments> providedStrings_allSubs(){
        return Stream.of(
                Arguments.of(list1[0],rems[0],left[0]),
                Arguments.of(list1[1],rems[1],left[1]),
                Arguments.of(list1[2],rems[2],left[2]),
                Arguments.of(list1[3],rems[3],left[3]),
                Arguments.of(list1[4],rems[4],left[4]),
                Arguments.of(list1[6],rems[6],left[6]),
                Arguments.of(list1[7],rems[7],left[7]),
                Arguments.of(list1[8],rems[8],left[8]),
                Arguments.of(list1[9],rems[9],left[9])
        );
    }

    @DisplayName("Remove a Letter")
    @ParameterizedTest
    @MethodSource("providedStrings_allSubs")
    void findSubs(String a, int b, String m){
        String ans = StringySpells.subtractive(a,b);
        assertEquals(m,ans);
    }

    private static Stream<Arguments> providedStrings_allAlOms(){
        return Stream.of(
                Arguments.of(list1[0],list2[0],alOms[0]),
                Arguments.of(list1[1],list2[1],alOms[1]),
                Arguments.of(list1[2],list2[2],alOms[2]),
                Arguments.of(list1[3],list2[3],alOms[3]),
                Arguments.of(list1[4],list2[4],alOms[4]),
                Arguments.of(list1[5],list2[5],alOms[5]),
                Arguments.of(list1[6],list2[6],alOms[6]),
                Arguments.of(list1[7],list2[7],alOms[7]),
                Arguments.of(list1[8],list2[8],alOms[8]),
                Arguments.of(list1[9],list2[9],alOms[9]),
                Arguments.of(list1[10],list2[10],alOms[10])
                );
    }

    @DisplayName("Start and End Letters")
    @ParameterizedTest
    @MethodSource("providedStrings_allAlOms")
    void findAlOms(String a, String b, String m){
        String ans = StringySpells.alphaOmega(a,b);
        assertEquals(m,ans);
    }

    private static Stream<Arguments> providedStrings_allFlips(){
        return Stream.of(
                Arguments.of(list1[0],list2[0],flips[0]),
                Arguments.of(list1[1],list2[1],flips[1]),
                Arguments.of(list1[2],list2[2],flips[2]),
                Arguments.of(list1[3],list2[3],flips[3]),
                Arguments.of(list1[4],list2[4],flips[4]),
                Arguments.of(list1[5],list2[5],flips[5]),
                Arguments.of(list1[6],list2[6],flips[6]),
                Arguments.of(list1[7],list2[7],flips[7]),
                Arguments.of(list1[8],list2[8],flips[8]),
                Arguments.of(list1[9],list2[9],flips[9]),
                Arguments.of(list1[10],list2[10],flips[10])
        );
    }

    @DisplayName("Flip the letter")
    @ParameterizedTest
    @MethodSource("providedStrings_allFlips")
    void findFlips(String a, String b, String m){
        String ans = StringySpells.flipper(a,b);
        assertEquals(m,ans);
    }

    private static Stream<Arguments> providedStrings_allAves(){
        return Stream.of(
                Arguments.of(list1[0],list2[0],aves[0]),
                Arguments.of(list1[1],list2[1],aves[1]),
                Arguments.of(list1[2],list2[2],aves[2]),
                Arguments.of(list1[3],list2[3],aves[3]),
                Arguments.of(list1[4],list2[4],aves[4]),
                Arguments.of(list1[5],list2[5],aves[5]),
                Arguments.of(list1[6],list2[6],aves[6]),
                Arguments.of(list1[7],list2[7],aves[7]),
                Arguments.of(list1[8],list2[8],aves[8]),
                Arguments.of(list1[9],list2[9],aves[9]),
                Arguments.of(list1[10],list2[10],aves[10])
        );
    }

    @DisplayName("Average of Lengths")
    @ParameterizedTest
    @MethodSource("providedStrings_allAves")
    void findAves(String a, String b, double m){
        double ans = StringySpells.aveLen(a,b);
        assertEquals(m,ans,0.1);
    }




}
