package com.dev.sc.idmji;



import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    MaterialSearchView searchView;
    private ListView listaViewHimnos;
    private Adapter adapter;
    ArrayAdapter<Himno> arrayAdapter;
    ArrayList<Himno> listaHimnos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Buscador...");
            myToolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

            searchView = (MaterialSearchView) findViewById(R.id.search_view);
            searchView.closeSearch();
            listaViewHimnos = (ListView) findViewById(R.id.listaHimnos);


        listaHimnos.add(
                new Himno("1", "LA DOXOLOGÍA: A DIOS EL PADRE "
                        , "A Dios, el Padre celestial,\n" +
                        "Al Hijo, nuestro Redentor,\n" +
                        "Y al eternal Consolador,\n" +
                        "Unidos todos alabad. Amén."));
        listaHimnos.add(
                new Himno("2", " EL APOSENTO ALTO ", "1\n" +
                        "En un aposento alto,\n" +
                        "Con unánime fervor,\n" +
                        "Ciento veinte esperaban\n" +
                        "La promesa del Señor.\n" +
                        "CORO:\n" +
                        "III ¡Dios manda tu gran poder! lIl\n" +
                        "A cada corazón.\n" +
                        "2\n" +
                        "Con estruendo de los cielos\n" +
                        "Descendió la gran virtud;\n" +
                        "Todos fueron bautizados\n" +
                        "Con el Santo Espíritu.\n" +
                        "3\n" +
                        "Este gran poder antiguo\n" +
                        "Es del fiel, celeste don;\n" +
                        "Prometido a los creyentes\n" +
                        "De humilde corazón.\n" +
                        "4\n" +
                        "Dios está restituyendo\n" +
                        "Este gran Pentecostés,\n" +
                        "Y el Espíritu sus dones\n" +
                        "Nos reparte otra vez."));

        listaHimnos.add(new Himno("3", " LLUVIAS DE GRACIA ", "1\n" +
                "Dios nos ha dado promesa:\n" +
                "Lluvias de gracia enviaré,\n" +
                "Dones que os den fortaleza;\n" +
                "Gran bendición os daré.\n" +
                "CORO:\n" +
                "Lluvias de gracia,\n" +
                "Lluvias pedimos, Señor,\n" +
                "Mándanos lluvias copiosas,\n" +
                "Lluvias del Consolador.\n" +
                "2\n" +
                "Cristo nos dio la promesa\n" +
                "Del Santo Consolador,\n" +
                "Dándonos paz y pureza,\n" +
                "Para su gloria y honor.\n" +
                "3\n" +
                "iOh Dios, a todo creyente\n" +
                "Muestra tu amor y poder!\n" +
                "Tú eres de gracia la fuente,\n" +
                "Llena de paz nuestro ser.\n" +
                "4\n" +
                "Obra en tus siervos piadosos\n" +
                "Celo, virtud y valor,\n" +
                "Dándonos dones preciosos,\n" +
                "Dones del Consolador."));

        listaHimnos.add(new Himno("4", "JESÚS VENDRÁ OTRA VEZ", "1\n" +
                "Yo espero el día alegre cuando Cristo volverá,\n" +
                "Pues vendrá al mundo pronto y nos arrebatará;\n" +
                "¡Oh, qué gozo este pensamiento a mi alma da:\n" +
                "El que Cristo venga al mundo otra vez!\n" +
                "CORO:\n" +
                "¡Oh! Jesús vendrá al mundo otra vez,\n" +
                "Sí, Jesús vendrá al mundo otra vez;\n" +
                "Le veremos en las nubes con los ángeles de luz,\n" +
                "Cuando Cristo venga al mundo otra vez.\n" +
                "2\n" +
                "La venida de Jesús será el remedio del dolor,\n" +
                "Que aflige siempre a este pobre mundo pecador;\n" +
                "Toda lágrima se enjugará por nuestro Salvador,\n" +
                "Cuando Cristo venga al mundo otra vez.\n" +
                "3\n" +
                "Llegarán los santos a Sión con gozo eternal;\n" +
                "Y en todo el santo monte nada daña ni hace mal,\n" +
                "Pues conocerán a Dios, entonces, todos por igual,\n" +
                "Cuando Cristo venga al mundo otra vez.\n" +
                "4\n" +
                "El pecado, pena y muerte en este mundo cesarán\n" +
                "Mártires y santos con Jesús por siempre reinarán,\n" +
                "Cada alma gozará de paz perfecta, sin afán,\n" +
                "Cuando Cristo venga al mundo otra vez."));

        listaHimnos.add(new Himno("5", "DULCE COMUNIÓN", "1\n" +
                "Dulce comunión la que gozo ya\n" +
                "En los brazos de mi Salvador.\n" +
                "¡Qué gran bendición en su paz me da!\n" +
                "¡Oh!, yo siento en mi su tierno amor.\n" +
                "CORO:\n" +
                "Libre, salvo, del pecado y del temor,\n" +
                "Libre, salvo, en los brazos de mi Salvador.\n" +
                "2\n" +
                "¡Cuán dulce es vivir, cuán dulce es gozar!\n" +
                "En los brazos de mi Salvador,\n" +
                "Allí quiero ir y con Él morar,\n" +
                "Siendo objeto de su tierno amor.\n" +
                "3\n" +
                "No hay que temer, ni que desconfiar\n" +
                "En los brazos de mi Salvador;\n" +
                "Por su gran poder Él me guardará\n" +
                "De los lazos del engañador."));
        listaHimnos.add(new Himno("6", "DESDE QUE SALVO ESTOY", "1\n" +
                "Yo tengo un himno de loor,\n" +
                "Desde que salvo estoy,\n" +
                "Para mi Rey, mi Salvador,\n" +
                "Desde que salvo estoy.\n" +
                "CORO:\n" +
                "ll Desde que salvo estoy ll\n" +
                "Sólo en Él me gloriaré;\n" +
                "Desde que salvo estoy,\n" +
                "En mi Salvador me gloriaré.\n" +
                "2\n" +
                "Yo tengo un Cristo y mi ansiedad\n" +
                "Desde que salvo estoy,\n" +
                "Está en cumplir su voluntad\n" +
                "Desde que salvo estoy.\n" +
                "3\n" +
                "Yo tengo un gozo que Él me dio,\n" +
                "Desde que salvo estoy,\n" +
                "Cuando en su sangre me lavó\n" +
                "Desde que salvo estoy.\n" +
                "4\n" +
                "Tengo un hogar a donde iré,\n" +
                "Desde que salvo estoy,\n" +
                "Y allí seguro viviré\n" +
                "Desde que salvo estoy."));
        listaHimnos.add(new Himno("7", "LIBERTAD", "1\n" +
                "¡Aleluya! que el Señor\n" +
                "Tiene grande salvación,\n" +
                "Libertad, libertad.\n" +
                "Nuestro Dios tiene poder\n" +
                "Para Satanás vencer,\n" +
                "Libertad, libertad.\n" +
                "CORO:\n" +
                "Libertad y redención,\n" +
                "¡Aleluya! Cristo ya\n" +
                "Me amó y me salvó;\n" +
                "Gloria, gloria, iAleluya!\n" +
                "Él es todo, en todo es Él.\n" +
                "2\n" +
                "Yo confío en Jehová.\n" +
                "Él me da la santidad,\n" +
                "Libertad, libertad.\n" +
                "Tengo paz y gozo ya,\n" +
                "Desde que Él me salvó,\n" +
                "Libertad, libertad.\n" +
                "3\n" +
                "Hablaremos siempre aquí,\n" +
                "Ensalzando a nuestro Rey,\n" +
                "Libertad, libertad;\n" +
                "Porque bondadoso y fiel,\n" +
                "Él nos llama hijos de Él,\n" +
                "Libertad, libertad.\n" +
                "4\n" +
                "Cantaremos siempre allí,\n" +
                "Al dejar el mundo aquí,\n" +
                "Libertad, libertad.\n" +
                "Alabando al Señor,\n" +
                "Cantaremos con fervor,\n" +
                "Libertad, libertad."));
        listaHimnos.add(new Himno("8", "TODO A CRISTO YO ME RINDO", "1\n" +
                "Todo a Cristo yo me rindo,\n" +
                "Con el fin de serle fiel;\n" +
                "Para siempre quiero amarle,\n" +
                "Y agradarle sólo a Él.\n" +
                "CORO:\n" +
                "Yo me rindo a Él,\n" +
                "Yo me rindo a Él;\n" +
                "Todo a Cristo yo me entrego,\n" +
                "Quiero serle fiel.\n" +
                "2\n" +
                "Todo a Cristo yo me rindo,\n" +
                "A sus pies postrado estoy;\n" +
                "Los placeres he dejado,\n" +
                "Y le sigo desde hoy.\n" +
                "3\n" +
                "Todo a Cristo yo me rindo,\n" +
                "Sí, de todo corazón;\n" +
                "Yo le entrego alma y cuerpo,\n" +
                "Busco hoy su santa unción.\n" +
                "4\n" +
                "Todo a Cristo he rendido,\n" +
                "Siento el fuego de su amor;\n" +
                "¡Oh, qué gozo hay en mi alma!\n" +
                "¡Gloria, gloria a mi Señor!"));
        listaHimnos.add(new Himno("9", " LA SIEMBRA", "1\n" +
                "Sembraré la simiente preciosa\n" +
                "Del glorioso evangelio de amor;\n" +
                "Sembraré, sembraré mientras viva,\n" +
                "Dejaré el resultado al Señor.\n" +
                "CORO:\n" +
                "Sembraré, sembraré,\n" +
                "Mientras viva, simiente de amor.\n" +
                "Segaré, segaré,\n" +
                "Al hallarme en la casa de Dios.\n" +
                "2\n" +
                "Sembraré en corazones sensibles\n" +
                "La doctrina del Dios de perdón;\n" +
                "Sembraré, sembraré mientras viva,\n" +
                "Dejaré el resultado al Señor.\n" +
                "3\n" +
                "Sembraré en corazones de mármol\n" +
                "La bendita palabra de Dios;\n" +
                "Sembraré, sembraré mientras viva,\n" +
                "Dejaré el resultado al Señor.\n"));
        listaHimnos.add(new Himno("10", "GLORIA SIN FIN", "1\n" +
                "Cuando mis luchas terminen aquí\n" +
                "Y ya seguro en los cielos esté,\n" +
                "Cuando al Señor mire cerca de mí;\n" +
                "iPor las edades mi gloria será!\n" +
                "CORO:\n" +
                "¡Esa será, gloria sin fin,\n" +
                "Gloria sin fin, gloria sin fin!\n" +
                "Cuando por gracia su faz pueda ver,\n" +
                "iEsa mi gloria sin fin ha de ser!\n" +
                "2\n" +
                "Cuando por gracia yo pueda tener\n" +
                "En sus mansiones morada de paz,\n" +
                "Y que allí siempre su faz pueda ver,\n" +
                "iPor las edades mi gloria será!\n" +
                "3\n" +
                "Gozo infinito será contemplar,\n" +
                "Todos los seres que yo tanto amé,\n" +
                "Mas la presencia de Cristo gozar,\n" +
                "iPor las edades mi gloria será!"));
        listaHimnos.add(new Himno("11", "CRISTO QUIERE LIMPIOS\n" +
                "CORAZONES", "1\n" +
                "Cristo busca limpios corazones,\n" +
                "Que le sirvan siempre con fidelidad;\n" +
                "Que a los pecadores insten fervorosos\n" +
                "Que se vuelvan del pecado a la verdad.\n" +
                "CORO:\n" +
                "Id a trabajar allá en los campos del Señor,\n" +
                "Que para la siega se presentan blancos hoy\n" +
                "Oh, fieles siervos de Dios,\n" +
                "A quien debéis todo honor,\n" +
                "Oíd su voz, salid a trabajar.\n" +
                "2\n" +
                "Labios puros Cristo necesita,\n" +
                "Que con gozo anuncien plena salvación;\n" +
                "Lenguas consagradas sólo a su servicio,\n" +
                "Que proclamen al cautivo redención.\n" +
                "3\n" +
                "Cristo busca manos bien dispuestas\n" +
                "Para trabajar con buena voluntad;\n" +
                "Siembras ya maduras piden vuestra ayuda,\n" +
                "Las doradas mieses pronto cosechad.\n" +
                "4\n" +
                "Vidas santas Cristo necesita,\n" +
                "Que a los pecadores muestren su poder;\n" +
                "Libres de ansiedades, en Jesús confiadas\n" +
                "Y que pueda de ellas siempre disponer."));
        listaHimnos.add(new Himno("12", "CARIÑOSO SALVADOR", "1\n" +
                "Cariñoso Salvador,\n" +
                "Huyo de la tempestad\n" +
                "A tu seno protector,\n" +
                "Fiándome de tu bondad,\n" +
                "Sálvame, Señor Jesús,\n" +
                "De las olas del turbión;\n" +
                "Hasta el puerto de salud\n" +
                "Guía mi pobre embarcación.\n" +
                "2\n" +
                "Otro asilo ninguno hay,\n" +
                "Indefenso acudo a ti;\n" +
                "Mi necesidad me trae,\n" +
                "Porque mi peligro vi.\n" +
                "Solamente en ti, Señor,\n" +
                "Puedo hallar consuelo y luz;\n" +
                "Vengo con ferviente amor,\n" +
                "A los pies de mi Jesús.\n" +
                "3\n" +
                "Cristo, encuentro todo en ti,\n" +
                "Y no necesito más.\n" +
                "Caído me pusiste en pie,\n" +
                "Débil, ánimo me das;\n" +
                "Al enfermo das salud,\n" +
                "Das la vista al que no ve;\n" +
                "Con amor y gratitud\n" +
                "Tu bondad ensalzaré."));
        listaHimnos.add(new Himno("13", "ROCA DE LA ETERNIDAD", "1\n" +
                "Roca de la eternidad,\n" +
                "Fuiste abierta para mí,\n" +
                "Sé mi escondedero fiel,\n" +
                "Sólo encuentro paz en ti,\n" +
                "Rico, limpio manantial,\n" +
                "En el cual lavado fui.\n" +
                "2\n" +
                "Aunque fuese siempre fiel,\n" +
                "Aunque llore sin cesar,\n" +
                "Del pecado no podré\n" +
                "Justificación lograr;\n" +
                "Sólo en ti teniendo fe\n" +
                "Deuda tal podré pagar.\n" +
                "3\n" +
                "Mientras tenga que vivir\n" +
                "Mi último suspiro al dar,\n" +
                "Cuando vaya a responder\n" +
                "En tu augusto tribunal,\n" +
                "Sé mi escondedero fiel,\n" +
                "Roca de la eternidad."));
        listaHimnos.add(new Himno("14", "FIRMES Y ADELANTE", "1\n" +
                "Firmes y adelante huestes de la fe,\n" +
                "Sin temor alguno que Jesús nos ve.\n" +
                "Jefe soberano, Cristo al frente va.\n" +
                "Y la regia enseña tremolando está.\n" +
                "CORO:\n" +
                "Firmes y adelante huestes de la fe,\n" +
                "Sin temor alguno que Jesús nos ve.\n" +
                "2\n" +
                "Al sagrado nombre de nuestro Adalid,\n" +
                "Tiembla el enemigo, y huye de la lid.\n" +
                "Nuestra es la victoria, dad a Dios loor,\n" +
                "Y óigalo el averno lleno de pavor.\n" +
                "3\n" +
                "Muévese potente la Iglesia de Dios,\n" +
                "De los ya gloriosos marchamos en pos;\n" +
                "Somos sólo un cuerpo, y uno es el Señor,\n" +
                "Una la esperanza, y uno nuestro amor.\n" +
                "4\n" +
                "Tronos y coronas pueden perecer;\n" +
                "De Jesús la Iglesia fiel habrá de ser;\n" +
                "Nada en contra suya prevalecerá,\n" +
                "Porque la promesa nunca faltará."));
        listaHimnos.add(new Himno("15", "GRATO ES DECIR LA\n" +
                "HISTORIA", "1\n" +
                "Grato es decir la historia\n" +
                "Del celestial favor;\n" +
                "De Cristo y de su gloria,\n" +
                "De Cristo y de su amor;\n" +
                "Me agrada referirla,\n" +
                "Pues sé que es la verdad,\n" +
                "Y nada satisface\n" +
                "Cual ella, mi ansiedad.\n" +
                "CORO:\n" +
                "¡Cuán bella es esa historia!\n" +
                "Mi tema allá en la gloria\n" +
                "Será la antigua historia\n" +
                "De Cristo y de su amor.\n" +
                "2\n" +
                "Grato es decir la historia\n" +
                "Que brilla cual fanal,\n" +
                "Y en glorias y portentos\n" +
                "No reconoce igual;\n" +
                "Me agrada referirla,\n" +
                "Pues me hace mucho bien,\n" +
                "Por eso a ti deseo\n" +
                "Decírtela también.\n" +
                "3\n" +
                "Grato es decir la historia\n" +
                "Que antigua, sin vejez,\n" +
                "Parece al repetirla\n" +
                "Más dulce cada vez;\n" +
                "Me agrada referirla,\n" +
                "Pues hay quien nunca oyó\n" +
                "Que para hacerle salvo\n" +
                "El buen Jesús murió."));
        listaHimnos.add(new Himno("16", "¿OYES CÓMO EL\n" +
                "EVANGELIO?", "1\n" +
                "¿Oyes cómo el evangelio,\n" +
                "Al cansado ofrece paz?\n" +
                "Pues segura, oh alma mía,\n" +
                "La promesa a ti se da;\n" +
                "Bien alguno en mí no veo,\n" +
                "Corrupción tan sólo hay;\n" +
                "Yo cansado y afligido\n" +
                "Busco alivio con afán.\n" +
                "2\n" +
                "En el arca la paloma\n" +
                "Encontró do reposar;\n" +
                "Para mi alma atribulada\n" +
                "El Señor arca será;\n" +
                "Combatido vengo, y crece\n" +
                "El diluvio sin cesar,\n" +
                "Ábreme, Jesús, y en vano\n" +
                "Rugirá la tempestad.\n" +
                "3\n" +
                "Amparada ya en tu seno,\n" +
                "Puede el alma respirar;\n" +
                "El reposo que prometes\n" +
                "Siempre da segura paz.\n" +
                "¡Oh!, cuán dulce en mis oídos\n" +
                "Fue tu acento celestial:\n" +
                "«Ven a mí, ven que el descanso\n" +
                "Sólo en mí podrás hallar.»"));
        listaHimnos.add(new Himno("17", "CUANDO ALLÁ SE PASE\n" +
                "LISTA", "1\n" +
                "Cuando la trompeta suene\n" +
                "En aquel día final,\n" +
                "Y que el alba eterna rompa en claridad;\n" +
                "Cuando las naciones salvas\n" +
                "A su patria lleguen ya,\n" +
                "Y que sea pasada lista, allí he de estar.\n" +
                "CORO:\n" +
                "Cuando allá se pase lista,\n" +
                "Cuando allá se pase lista,\n" +
                "Cuando allá se pase lista:\n" +
                "A mi nombre yo feliz responderé.\n" +
                "2\n" +
                "En aquel día sin nieblas,\n" +
                "En que muerte ya no habrá,\n" +
                "Y su gloria el Salvador impartirá;\n" +
                "Cuando los llamados entren\n" +
                "A su celestial hogar.\n" +
                "Y que sea pasada lista, allí he de estar.\n" +
                "3\n" +
                "Trabajemos por el Maestro,\n" +
                "Desde el alba al vislumbrar;\n" +
                "Siempre hablemos de su amor y fiel bondad,\n" +
                "Cuando todo aquí fenezca\n" +
                "Y nuestra obra cese ya,\n" +
                "Y que sea pasada lista, allí he de estar."));
        listaHimnos.add(new Himno("18", "ANDANDO EN LA LUZ", "1\n" +
                "Vagaba yo en oscuridad\n" +
                "Hasta que vi a Jesús,\n" +
                "Mas por su amor y su verdad\n" +
                "Me amaneció la luz.\n" +
                "CORO:\n" +
                "Gozo y luz hay en mi alma hoy,\n" +
                "Gozo y luz hay, ya que salvo soy;\n" +
                "He sentido el gozo de su amor en mí.\n" +
                "2\n" +
                "Las nubes y la tempestad\n" +
                "No encubren a Jesús,\n" +
                "Y en medio de la oscuridad\n" +
                "Me gozo en su luz.\n" +
                "3\n" +
                "Andando en la luz de Dios\n" +
                "Encuentro plena paz;\n" +
                "Voy adelante sin temor\n" +
                "Dejando el mundo atrás.\n" +
                "4\n" +
                "Veréle pronto tal cual es\n" +
                "Raudal de pura luz;\n" +
                "Y eternamente gozaré\n" +
                "A causa de su cruz.\n" +
                "Desde que a Jesús vi, y a su lado fui,"));
        listaHimnos.add(new Himno("19", "¡OH, CUÁN DULCE!", "1\n" +
                "¡Oh, cuán dulce es fiar en Cristo,\n" +
                "Y entregarse todo a Él;\n" +
                "Esperar en sus promesas,\n" +
                "Y en sus sendas serle fiel!\n" +
                "CORO:\n" +
                "Jesucristo, Jesucristo,\n" +
                "Ya tu amor probaste en mí;\n" +
                "Jesucristo, Jesucristo,\n" +
                "Siempre quiero fiar en ti.\n" +
                "2\n" +
                "Es muy dulce fiar en Cristo\n" +
                "Y cumplir su voluntad;\n" +
                "No dudando su palabra,\n" +
                "Que es la luz y la verdad.\n" +
                "3\n" +
                "Siempre es grato fiar en Cristo\n" +
                "Cuando busca el corazón,\n" +
                "Los tesoros celestiales\n" +
                "De la paz y del perdón.\n" +
                "4\n" +
                "Siempre en ti confiar yo quiero\n" +
                "Mi precioso Salvador;\n" +
                "En la vida y en la muerte\n" +
                "Protección me dé tu amor."));
        listaHimnos.add(new Himno("20", " ALLÍ NO HABRÁ\n" +
                "TRIBULACIÓN", "1\n" +
                "En la mansión do Cristo está,\n" +
                "Allí no habrá tribulación;\n" +
                "Ningún pesar, ningún dolor,\n" +
                "Que me quebrante el corazón.\n" +
                "CORO:\n" +
                "Allí no habrá tribulación;\n" +
                "Ningún pesar, ningún dolor,\n" +
                "Y cuando esté morando allá,\n" +
                "Diré que no hay tribulación.\n" +
                "2\n" +
                "Será muy triste estarme aquí,\n" +
                "Muy lejos, sí, del Salvador;\n" +
                "Pues moran ya con Él allí,\n" +
                "Los redimidos por su amor.\n" +
                "3\n" +
                "Perfecto amor encontraré,\n" +
                "En la mansión del Salvador;\n" +
                "Perfecta paz allí tendré,\n" +
                "Mejor que la que gozo hoy.\n" +
                "4\n" +
                "Entonces, sí, yo gozaré\n" +
                "De toda la felicidad,\n" +
                "Y ya con Cristo reinaré\n" +
                "Por toda la eternidad."));
        listaHimnos.add(new Himno("21", " ¡PAZ! ¡PAZ!\n" +
                "¡CUÁN DULCE PAZ!", "1\n" +
                "En el seno de mi alma una dulce quietud\n" +
                "Se difunde embargando mi ser;\n" +
                "Una calma infinita que sólo podrán\n" +
                "Los amados de Dios comprender.\n" +
                "CORO:\n" +
                "¡Paz! ¡Paz! ¡Cuán dulce paz!\n" +
                "Es aquella que el Padre me da;\n" +
                "Yo le ruego que inunde por siempre mi ser,\n" +
                "En sus ondas de amor celestial.\n" +
                "2\n" +
                "¡Qué tesoro yo tengo en la paz que me dio!\n" +
                "Y en el fondo del alma ha de estar;\n" +
                "Tan segura que nadie quitarla podrá,\n" +
                "Mientras miro los años pasar.\n" +
                "3\n" +
                "Esta paz inefable consuelo me da,\n" +
                "Descansando tan sólo en Jesús;\n" +
                "Y ningunos peligros mi vida tendrá,\n" +
                "Si me siento inundado en su luz.\n" +
                "4\n" +
                "Sin cesar yo medito en aquella ciudad,\n" +
                "Do al Autor de la paz he de ver,\n" +
                "Y en que el himno más dulce que allí he de cantar,\n" +
                "Al estar con Jesús ha de ser.\n" +
                "5\n" +
                "Alma triste que en rudo conflicto te ves,\n" +
                "Sola y débil tu senda al seguir;\n" +
                "Haz de Cristo el amigo que fiel siempre es,\n" +
                "Y su paz tú podrás recibir."));
        listaHimnos.add(new Himno("22", "MÁS DE JESÚS", "1\n" +
                "Más de Jesús deseo saber,\n" +
                "Más de su gracia y poder;\n" +
                "Más de su salvación gozar;\n" +
                "Más de su dulce amor gustar.\n" +
                "CORO:\n" +
                "Más quiero amarle,\n" +
                "Más quiero honrarle;\n" +
                "Más de su salvación gozar,\n" +
                "Más de su dulce amor gustar.\n" +
                "2\n" +
                "Más quiero a Jesús seguir,\n" +
                "Más de su santa ley cumplir\n" +
                "Más de su voluntad saber,\n" +
                "Más de su Espíritu tener.\n" +
                "3\n" +
                "Más de Jesús, más oración,\n" +
                "Más cerca estar en comunión;\n" +
                "Más su palabra meditar,\n" +
                "Más sus promesas alcanzar.\n" +
                "4\n" +
                "Más de Jesús allá veré,\n" +
                "Más semejante a Él seré;\n" +
                "Más de su gloria he de gozar\n" +
                "Más su gran nombre alabar."));
        listaHimnos.add(new Himno("23", "ACEPTA EL PERDÓN DE\n" +
                "JESÚS", "1\n" +
                "Si tú cansado ya estás de pecar,\n" +
                "Acepta el perdón de Jesús,\n" +
                "Si vida nueva quisieres hallar,\n" +
                "Acepta el perdón de Jesús.\n" +
                "CORO:\n" +
                "No más pecar, ven a Él,\n" +
                "Su amor te muestra en la cruz;\n" +
                "Es tiempo no seas infiel,\n" +
                "Acepta el perdón de Jesús.\n" +
                "2\n" +
                "Si vida pura tú quieres tener,\n" +
                "Acepta el perdón de Jesús,\n" +
                "Él es la fuente que limpia tu ser,\n" +
                "Acepta el perdón de Jesús.\n" +
                "3\n" +
                "Si tú no puedes tus luchas calmar,\n" +
                "Acepta el perdón de Jesús.\n" +
                "Si tus anhelos no puedes colmar,\n" +
                "Acepta el perdón de Jesús.\n" +
                "4\n" +
                "Si con los santos te quieres unir,\n" +
                "Acepta el perdón de Jesús.\n" +
                "Y si a los cielos aspiras a ir,\n" +
                "Acepta el perdón de Jesús."));
        listaHimnos.add(new Himno("24", "HAY PODER EN JESÚS", "1\n" +
                "¿Quieres ser salvo de toda maldad?\n" +
                "Tan sólo hay poder en mi Jesús;\n" +
                "¿Quieres vivir y gozar santidad?\n" +
                "Tan sólo hay poder en Jesús.\n" +
                "CORO:\n" +
                "Hay poder, poder, sin igual poder,\n" +
                "En Jesús, quien murió;\n" +
                "Hay poder, poder, sin igual poder,\n" +
                "En la sangre que Él vertió.\n" +
                "2\n" +
                "¿Quieres ser libre de orgullo y pasión?\n" +
                "Tan sólo hay poder en mi Jesús;\n" +
                "¿Quieres vencer toda cruel tentación?\n" +
                "Tan sólo hay poder en Jesús.\n" +
                "3\n" +
                "¿Quieres servir a tu Rey y Señor?\n" +
                "Tan sólo hay poder en mi Jesús;\n" +
                "Ven, y ser salvo podrás en su amor,\n" +
                "Tan sólo hay poder en Jesús.\n"));
        listaHimnos.add(new Himno("25", "CRISTO ES MI DULCE\n" +
                "SALVADOR", "1\n" +
                "Cristo es mi dulce Salvador,\n" +
                "Mi bien, mi paz, mi luz,\n" +
                "Mostróme su infinito amor,\n" +
                "Muriendo en dura cruz.\n" +
                "Cuando estoy triste encuentro en Él,\n" +
                "Consolador, y amigo fiel,\n" +
                "Consolador, amigo fiel, es Jesús.\n" +
                "2\n" +
                "Cristo es mi dulce Salvador,\n" +
                "Su sangre me compró;\n" +
                "Con sus heridas y dolor,\n" +
                "Perfecta paz me dio.\n" +
                "Dicha inmortal allá tendré;\n" +
                "Con Cristo siempre reinaré,\n" +
                "Dicha inmortal allá tendré con Jesús.\n" +
                "3\n" +
                "Cristo es mi dulce Salvador,\n" +
                "Mi eterno Redentor,\n" +
                "¡Oh!, nunca yo podré pagar\n" +
                "La deuda de su amor;\n" +
                "Le seguiré, pues, en la luz,\n" +
                "No temeré llevar su cruz,\n" +
                "No temeré llevar la cruz de Jesús.\n" +
                "4\n" +
                "Cristo es mi dulce Salvador,\n" +
                "Por Él salvado soy;\n" +
                "La Roca de la eternidad,\n" +
                "En quien seguro estoy;\n" +
                "Gloria inmortal allá tendré,\n" +
                "Con Cristo siempre reinaré,\n" +
                "Gloria inmortal allá tendré con Jesús."));
        listaHimnos.add(new Himno("26", " ¡LOORES A DIOS!", "1\n" +
                "¡Oh!, jamás nos cansaremos de la gran canción,\n" +
                "¡Loores a Dios, aleluya!\n" +
                "¡Por la fe la cantaremos con el corazón!,\n" +
                "¡Loores a Dios, aleluya!\n" +
                "CORO:\n" +
                "A los hijos del Señor pertenece el cantar,\n" +
                "Pues vendrá el Salvador y nos arrebatará;\n" +
                "Del palacio celestial gozaremos más allá.\n" +
                "¡Loores a Dios, aleluya!\n" +
                "2\n" +
                "¡Oh! la indecible gloria del divino amor,\n" +
                "¡Loores a Dios, aleluya!\n" +
                "¡Que en sus alas lleva el alma donde el Salvador!,\n" +
                "¡Loores a Dios, aleluya!\n" +
                "3\n" +
                "¡Qué vistosos son los ángeles morando en luz!,\n" +
                "¡Loores a Dios, aleluya!\n" +
                "¡Más lucientes los creyentes al venir Jesús!,\n" +
                "¡Loores a Dios, aleluya!\n" +
                "4\n" +
                "¡CORO:nados en la gloria con el Salvador!,\n" +
                "¡Loores a Dios, aleluya!\n" +
                "¡Cantaremos alabanzas del divino amor!,\n" +
                "¡Loores a Dios, aleluya!\n"));


        adapter = new ItemAdapter(this, listaHimnos);
        listaViewHimnos.setAdapter((ListAdapter) adapter);


        listaViewHimnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Himno h = (Himno) parent.getItemAtPosition(i);
                Intent detalleAvtivity = new Intent(getApplicationContext(), DetalleActivity.class);
                detalleAvtivity.putExtra("objeto", (Serializable) h);
                startActivity(detalleAvtivity);
            }
        });


        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {
                adapter = new ItemAdapter(MainActivity.this, listaHimnos);
                listaViewHimnos.setAdapter((ListAdapter) adapter);

            }
        });



        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
               if(newText!=null && !newText.isEmpty()){
                  ArrayList<Himno> lstFound= new ArrayList<>();
                   for (Himno item:listaHimnos){
                       if (item.getId().contains(newText)||item.getNombreHimno().toLowerCase().contains(newText))
                           lstFound.add(item);
                   }
                   adapter = new ItemAdapter(MainActivity.this, lstFound);
                   listaViewHimnos.setAdapter((ListAdapter) adapter);
               }
               else {
                   adapter = new ItemAdapter(MainActivity.this, listaHimnos);
                   listaViewHimnos.setAdapter((ListAdapter) adapter);
               }
               return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);

        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;


    }
}

