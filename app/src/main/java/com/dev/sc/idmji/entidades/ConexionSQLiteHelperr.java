package com.dev.sc.idmji.entidades;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.dev.sc.idmji.utilidades.utilidades;


public class ConexionSQLiteHelperr  extends SQLiteOpenHelper {


    public ConexionSQLiteHelperr(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(utilidades.CREAR_TABLA_HIMNO);

       db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('1', 'LA DOXOLOGÍA: A DIOS EL PADRE', 'A Dios, el Padre celestial Al Hijo, nuestro Redentor Y al eternal Consolador,', 'Unidos todos alabad', ' Amén')");

    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('2', 'EL APOSENTO ALTO', '1\n" +
            "En un aposento alto,\n" +
            "Con unánime fervor,\n" +
            "Ciento veinte esperaban\n" +
            "La promesa del Señor.\n', 'CORO:\n" +
            "III ¡Dios manda tu gran poder! lIl\n" +
            "A cada corazón.', '2\n" +
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
            "Nos reparte otra vez.\n')");

    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('3', 'LLUVIAS DE GRACIA', '1\n" +
            "Dios nos ha dado promesa:\n" +
            "Lluvias de gracia enviaré,\n" +
            "Dones que os den fortaleza;\n" +
            "Gran bendición os daré.', 'CORO:\n" +
            "Lluvias de gracia,\n" +
            "Lluvias pedimos, Señor,\n" +
            "Mándanos lluvias copiosas,\n" +
            "Lluvias del Consolador.', '2\n" +
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
            "Dones del Consolador.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('4', 'JESÚS VENDRÁ OTRA VEZ', '1\n" +
            "Yo espero el día alegre cuando Cristo volverá,\n" +
            "Pues vendrá al mundo pronto y nos arrebatará;\n" +
            "¡Oh, qué gozo este pensamiento a mi alma da:\n" +
            "El que Cristo venga al mundo otra vez!', 'CORO:\n" +
            "¡Oh! Jesús vendrá al mundo otra vez,\n" +
            "Sí, Jesús vendrá al mundo otra vez;\n" +
            "Le veremos en las nubes con los ángeles de luz,\n" +
            "Cuando Cristo venga al mundo otra vez.', '2\n" +
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
            "Cuando Cristo venga al mundo otra vez.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('5', 'DULCE COMUNIÓN', '1\n" +
            "Dulce comunión la que gozo ya\n" +
            "En los brazos de mi Salvador.\n" +
            "¡Qué gran bendición en su paz me da!\n" +
            "¡Oh!, yo siento en mi su tierno amor.', 'CORO:\n" +
            "Libre, salvo, del pecado y del temor,\n" +
            "Libre, salvo, en los brazos de mi Salvador.', '2\n" +
            "¡Cuán dulce es vivir, cuán dulce es gozar!\n" +
            "En los brazos de mi Salvador,\n" +
            "Allí quiero ir y con Él morar,\n" +
            "Siendo objeto de su tierno amor.\n" +
            "3\n" +
            "No hay que temer, ni que desconfiar\n" +
            "En los brazos de mi Salvador;\n" +
            "Por su gran poder Él me guardará\n" +
            "De los lazos del engañador.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('6', 'DESDE QUE SALVO ESTOY', '1\n" +
            "Yo tengo un himno de loor,\n" +
            "Desde que salvo estoy,\n" +
            "Para mi Rey, mi Salvador,\n" +
            "Desde que salvo estoy.', 'CORO:\n" +
            "ll Desde que salvo estoy ll\n" +
            "Sólo en Él me gloriaré;\n" +
            "Desde que salvo estoy,\n" +
            "En mi Salvador me gloriaré.', '2\n" +
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
            "Desde que salvo estoy.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('7', 'LIBERTAD', '1\n" +
            "¡Aleluya! que el Señor\n" +
            "Tiene grande salvación,\n" +
            "Libertad, libertad.\n" +
            "Nuestro Dios tiene poder\n" +
            "Para Satanás vencer,\n" +
            "Libertad, libertad.', 'CORO:\n" +
            "Libertad y redención,\n" +
            "¡Aleluya! Cristo ya\n" +
            "Me amó y me salvó;\n" +
            "Gloria, gloria, iAleluya!\n" +
            "Él es todo, en todo es Él.', '2\n" +
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
            "Libertad, libertad.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('8', 'TODO A CRISTO YO ME RINDO', '1\n" +
            "Todo a Cristo yo me rindo,\n" +
            "Con el fin de serle fiel;\n" +
            "Para siempre quiero amarle,\n" +
            "Y agradarle sólo a Él.', 'CORO:\n" +
            "Yo me rindo a Él,\n" +
            "Yo me rindo a Él;\n" +
            "Todo a Cristo yo me entrego,\n" +
            "Quiero serle fiel.', '2\n" +
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
            "¡Gloria, gloria a mi Señor!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('9', 'LA SIEMBRA', '1\n" +
            "Sembraré la simiente preciosa\n" +
            "Del glorioso evangelio de amor;\n" +
            "Sembraré, sembraré mientras viva,\n" +
            "Dejaré el resultado al Señor.', 'CORO:\n" +
            "Sembraré, sembraré,\n" +
            "Mientras viva, simiente de amor.\n" +
            "Segaré, segaré,\n" +
            "Al hallarme en la casa de Dios.', '2\n" +
            "Sembraré en corazones sensibles\n" +
            "La doctrina del Dios de perdón;\n" +
            "Sembraré, sembraré mientras viva,\n" +
            "Dejaré el resultado al Señor.\n" +
            "3\n" +
            "Sembraré en corazones de mármol\n" +
            "La bendita palabra de Dios;\n" +
            "Sembraré, sembraré mientras viva,\n" +
            "Dejaré el resultado al Señor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('10', 'GLORIA SIN FIN', '1\n" +
            "Cuando mis luchas terminen aquí\n" +
            "Y ya seguro en los cielos esté,\n" +
            "Cuando al Señor mire cerca de mí;\n" +
            "iPor las edades mi gloria será!', 'CORO:\n" +
            "¡Esa será, gloria sin fin,\n" +
            "Gloria sin fin, gloria sin fin!\n" +
            "Cuando por gracia su faz pueda ver,\n" +
            "iEsa mi gloria sin fin ha de ser!', '2\n" +
            "Cuando por gracia yo pueda tener\n" +
            "En sus mansiones morada de paz,\n" +
            "Y que allí siempre su faz pueda ver,\n" +
            "iPor las edades mi gloria será!\n" +
            "3\n" +
            "Gozo infinito será contemplar,\n" +
            "Todos los seres que yo tanto amé,\n" +
            "Mas la presencia de Cristo gozar,\n" +
            "iPor las edades mi gloria será!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('11', ' CRISTO QUIERE LIMPIOS CORAZONES', '1\n" +
            "Cristo busca limpios corazones,\n" +
            "Que le sirvan siempre con fidelidad;\n" +
            "Que a los pecadores insten fervorosos\n" +
            "Que se vuelvan del pecado a la verdad.', 'CORO:\n" +
            "Id a trabajar allá en los campos del Señor,\n" +
            "Que para la siega se presentan blancos hoy\n" +
            "Oh, fieles siervos de Dios,\n" +
            "A quien debéis todo honor,\n" +
            "Oíd su voz, salid a trabajar.', '2\n" +
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
            "Y que pueda de ellas siempre disponer.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('12', 'CARIÑOSO SALVADOR', '1\n" +
            "Cariñoso Salvador,\n" +
            "Huyo de la tempestad\n" +
            "A tu seno protector,\n" +
            "Fiándome de tu bondad,\n" +
            "Sálvame, Señor Jesús,\n" +
            "De las olas del turbión;\n" +
            "Hasta el puerto de salud\n" +
            "Guía mi pobre embarcación.', ' ', '2\n" +
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
            "Tu bondad ensalzaré.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('13', 'ROCA DE LA ETERNIDAD', '1\n" +
            "Roca de la eternidad,\n" +
            "Fuiste abierta para mí,\n" +
            "Sé mi escondedero fiel,\n" +
            "Sólo encuentro paz en ti,\n" +
            "Rico, limpio manantial,\n" +
            "En el cual lavado fui.', '', '2\n" +
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
            "Roca de la eternidad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('14', 'FIRMES Y ADELANTE', '1\n" +
            "Firmes y adelante huestes de la fe,\n" +
            "Sin temor alguno que Jesús nos ve.\n" +
            "Jefe soberano, Cristo al frente va.\n" +
            "Y la regia enseña tremolando está.', 'CORO:\n" +
            "Firmes y adelante huestes de la fe,\n" +
            "Sin temor alguno que Jesús nos ve.', '2\n" +
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
            "Porque la promesa nunca faltará.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('15', 'GRATO ES DECIR LA\n" +
            "HISTORIA', '1\n" +
            "Grato es decir la historia\n" +
            "Del celestial favor;\n" +
            "De Cristo y de su gloria,\n" +
            "De Cristo y de su amor;\n" +
            "Me agrada referirla,\n" +
            "Pues sé que es la verdad,\n" +
            "Y nada satisface\n" +
            "Cual ella, mi ansiedad.', 'CORO:\n" +
            "¡Cuán bella es esa historia!\n" +
            "Mi tema allá en la gloria\n" +
            "Será la antigua historia\n" +
            "De Cristo y de su amor.', '2\n" +
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
            "El buen Jesús murió.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('16', '¿OYES CÓMO EL EVANGELIO?', '1\n" +
            "¿Oyes cómo el evangelio,\n" +
            "Al cansado ofrece paz?\n" +
            "Pues segura, oh alma mía,\n" +
            "La promesa a ti se da;\n" +
            "Bien alguno en mí no veo,\n" +
            "Corrupción tan sólo hay;\n" +
            "Yo cansado y afligido\n" +
            "Busco alivio con afán.', ' ', '2\n" +
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
            "Sólo en mí podrás hallar.»')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('17', 'CUANDO ALLÁ SE PASE LISTA', '1\n" +
            "Cuando la trompeta suene\n" +
            "En aquel día final,\n" +
            "Y que el alba eterna rompa en claridad;\n" +
            "Cuando las naciones salvas\n" +
            "A su patria lleguen ya,\n" +
            "Y que sea pasada lista, allí he de estar.', 'CORO:\n" +
            "Cuando allá se pase lista,\n" +
            "Cuando allá se pase lista,\n" +
            "Cuando allá se pase lista:\n" +
            "A mi nombre yo feliz responderé.', '2\n" +
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
            "Y que sea pasada lista, allí he de estar')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('18', 'ANDANDO EN LA LUZ', '1\n" +
            "Vagaba yo en oscuridad\n" +
            "Hasta que vi a Jesús,\n" +
            "Mas por su amor y su verdad\n" +
            "Me amaneció la luz.', 'CORO:\n" +
            "Gozo y luz hay en mi alma hoy,\n" +
            "Gozo y luz hay, ya que salvo soy;\n" +
            "He sentido el gozo de su amor en mí.', '2\n" +
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
            "Desde que a Jesús vi, y a su lado fui,')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('19', '¡OH, CUÁN DULCE!', '1\n" +
            "¡Oh, cuán dulce es fiar en Cristo,\n" +
            "Y entregarse todo a Él;\n" +
            "Esperar en sus promesas,\n" +
            "Y en sus sendas serle fiel!', 'CORO:\n" +
            "Jesucristo, Jesucristo,\n" +
            "Ya tu amor probaste en mí;\n" +
            "Jesucristo, Jesucristo,\n" +
            "Siempre quiero fiar en ti.', '2\n" +
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
            "Protección me dé tu amor.\n" +
            "\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('20', 'ALLÍ NO HABRÁ TRIBULACIÓN', '1\n" +
            "En la mansión do Cristo está,\n" +
            "Allí no habrá tribulación;\n" +
            "Ningún pesar, ningún dolor,\n" +
            "Que me quebrante el corazón.', 'CORO:\n" +
            "Allí no habrá tribulación;\n" +
            "Ningún pesar, ningún dolor,\n" +
            "Y cuando esté morando allá,\n" +
            "Diré que no hay tribulación.', '2\n" +
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
            "Por toda la eternidad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('21', '¡PAZ! ¡PAZ! ¡CUÁN DULCE PAZ!', '1\n" +
            "En el seno de mi alma una dulce quietud\n" +
            "Se difunde embargando mi ser;\n" +
            "Una calma infinita que sólo podrán\n" +
            "Los amados de Dios comprender.', 'CORO:\n" +
            "¡Paz! ¡Paz! ¡Cuán dulce paz!\n" +
            "Es aquella que el Padre me da;\n" +
            "Yo le ruego que inunde por siempre mi ser,\n" +
            "En sus ondas de amor celestial.', '2\n" +
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
            "Y su paz tú podrás recibir.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('22', 'MÁS DE JESÚS', '1\n" +
            "Más de Jesús deseo saber,\n" +
            "Más de su gracia y poder;\n" +
            "Más de su salvación gozar;\n" +
            "Más de su dulce amor gustar.', 'CORO:\n" +
            "Más quiero amarle,\n" +
            "Más quiero honrarle;\n" +
            "Más de su salvación gozar,\n" +
            "Más de su dulce amor gustar.', '2\n" +
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
            "Más su gran nombre alabar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('23', 'ACEPTA EL PERDÓN DE JESÚS', '1\n" +
            "Si tú cansado ya estás de pecar,\n" +
            "Acepta el perdón de Jesús,\n" +
            "Si vida nueva quisieres hallar,\n" +
            "Acepta el perdón de Jesús.', 'CORO:\n" +
            "No más pecar, ven a Él,\n" +
            "Su amor te muestra en la cruz;\n" +
            "Es tiempo no seas infiel,\n" +
            "Acepta el perdón de Jesús.', '2\n" +
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
            "Acepta el perdón de Jesús.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('24', 'HAY PODER EN JESÚS', '1\n" +
            "¿Quieres ser salvo de toda maldad?\n" +
            "Tan sólo hay poder en mi Jesús;\n" +
            "¿Quieres vivir y gozar santidad?\n" +
            "Tan sólo hay poder en Jesús.', 'CORO:\n" +
            "Hay poder, poder, sin igual poder,\n" +
            "En Jesús, quien murió;\n" +
            "Hay poder, poder, sin igual poder,\n" +
            "En la sangre que Él vertió.', '2\n" +
            "¿Quieres ser libre de orgullo y pasión?\n" +
            "Tan sólo hay poder en mi Jesús;\n" +
            "¿Quieres vencer toda cruel tentación?\n" +
            "Tan sólo hay poder en Jesús.\n" +
            "3\n" +
            "¿Quieres servir a tu Rey y Señor?\n" +
            "Tan sólo hay poder en mi Jesús;\n" +
            "Ven, y ser salvo podrás en su amor,\n" +
            "Tan sólo hay poder en Jesús.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('25', 'CRISTO ES MI DULCE SALVADOR', '1\n" +
            "Cristo es mi dulce Salvador,\n" +
            "Mi bien, mi paz, mi luz,\n" +
            "Mostróme su infinito amor,\n" +
            "Muriendo en dura cruz.\n" +
            "Cuando estoy triste encuentro en Él,\n" +
            "Consolador, y amigo fiel,\n" +
            "Consolador, amigo fiel, es Jesús.', ' ', '2\n" +
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
            "Gloria inmortal allá tendré con Jesús.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('26', '¡LOORES A DIOS!', '1\n" +
            "¡Oh!, jamás nos cansaremos de la gran canción,\n" +
            "¡Loores a Dios, aleluya!\n" +
            "¡Por la fe la cantaremos con el corazón!,\n" +
            "¡Loores a Dios, aleluya!', 'CORO:\n" +
            "A los hijos del Señor pertenece el cantar,\n" +
            "Pues vendrá el Salvador y nos arrebatará;\n" +
            "Del palacio celestial gozaremos más allá.\n" +
            "¡Loores a Dios, aleluya!', '2\n" +
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
            "¡Loores a Dios, aleluya!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('27', 'GRANDE GOZO HAY EN MI ALMA', '1\n" +
            "Grande gozo hay en mi alma hoy,\n" +
            "Pues Jesús conmigo está;\n" +
            "Y su paz, que ya gozando estoy\n" +
            "Por siempre durará.', 'CORO:\n" +
            "Grande gozo, ¡cuán hermoso!\n" +
            "Paso todo el tiempo bien feliz;\n" +
            "Porque veo de Cristo la sonriente faz\n" +
            "Grande gozo siento en mí.', '2\n" +
            "Hay un canto en mi alma hoy;\n" +
            "Melodías a mi Rey:\n" +
            "En su amor feliz y libre soy,\n" +
            "Y salvo por la fe.\n" +
            "3\n" +
            "Paz divina hay en mi alma hoy,\n" +
            "Porque Cristo me salvó;\n" +
            "Las cadenas rotas ya están,\n" +
            "Jesús me libertó.\n" +
            "4\n" +
            "Gratitud hay en mi alma hoy,\n" +
            "Y alabanzas a Jesús;\n" +
            "Por su gracia a la gloria voy,\n" +
            "Gozándome en la luz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('28', 'TENDRÁS QUE RENACER', '1\n" +
            "Un hombre de noche llegóse a Jesús,\n" +
            "Buscando la senda de vida y de luz,\n" +
            "Y Cristo le dijo: “Si a Dios quieres ver,\n" +
            "Tendrás que renacer”.', 'CORO:\n" +
            "II “Tendrás que renacer”, II\n" +
            "De cierto, de cierto te digo a ti:\n" +
            "“Tendrás que renacer”.', '2\n" +
            "Si acaso a los cielos tú quieres entrar,\n" +
            "Y allí con los santos poder descansar.\n" +
            "Si quieres la vida eternal obtener,\n" +
            "“Tendrás que renacer”.\n" +
            "3\n" +
            "Amigo, no debes jamás desechar\n" +
            "Palabras que Cristo dignóse hablar.\n" +
            "Si tu alma no quieres llegar a perder\n" +
            "“Tendrás que renacer”.\n" +
            "4\n" +
            "Hermanos se han ido con Cristo a morar,\n" +
            "A quienes un día querrás encontrar,\n" +
            "Pues esta proclama hoy debes creer:\n" +
            "“Tendrás que renacer”.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('29', 'CANTARÉ LA MARAVILLA', '1\n" +
            "Cantaré la maravilla\n" +
            "Que Jesús murió por mí;\n" +
            "Cómo allá en el Calvario\n" +
            "Dio su sangre carmesí.', 'CORO:\n" +
            "Cantaré la bella historia\n" +
            "De Jesús mi Salvador,\n" +
            "Y con santos en la gloria\n" +
            "A Jesús daré loor.', '2\n" +
            "Cristo vino a rescatarme,\n" +
            "Vil, perdido me encontró;\n" +
            "Con su mano fiel y tierna\n" +
            "Al redil Él me llevó.\n" +
            "3\n" +
            "Mis heridas y dolores\n" +
            "El Señor Jesús sanó;\n" +
            "Del pecado y los temores\n" +
            "Su poder me libertó.\n" +
            "4\n" +
            "En el río de la muerte\n" +
            "El Señor me guardará:\n" +
            "Es su amor tan fiel y fuerte\n" +
            "Que jamás me dejará.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('30', 'ENTERA CONSAGRACIÓN', '1\n" +
            "Que mi vida entera esté\n" +
            "Consagrada a ti, Señor;\n" +
            "Que a mis manos pueda guiar\n" +
            "El impulso de tu amor.', 'CORO:\n" +
            "Lávame en tu sangre, Salvador,\n" +
            "Límpiame de toda mi maldad;\n" +
            "Traigo a ti mi vida, para ser Señor,\n" +
            "¡Tuya por la eternidad!', '2\n" +
            "Que mis pies tan sólo en pos\n" +
            "De lo santo puedan ir,\n" +
            "Y que a ti, Señor, mi voz\n" +
            "Se complazca en bendecir.\n" +
            "3\n" +
            "Que mi tiempo todo esté\n" +
            "Consagrado a tu loor,\n" +
            "Que mis labios al hablar\n" +
            "Hablen sólo de tu amor.\n" +
            "4\n" +
            "Toma, ¡oh Dios!, mi voluntad,\n" +
            "Y hazla tuya, nada más;\n" +
            "Toma, sí, mi corazón\n" +
            "Por tu trono lo tendrás.\n" +
            "5\n" +
            "Toma tú mi amor, que hoy\n" +
            "A tus pies vengo a poner;\n" +
            "¡Toma todo lo que soy,\n" +
            "Todo tuyo quiero ser!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('31', 'SANTA BIBLIA', '1\n" +
            "¡Santa Biblia! para mí,\n" +
            "Eres un tesoro aquí;\n" +
            "Tú contienes con verdad\n" +
            "La divina voluntad;\n" +
            "Tú me dices lo que soy,\n" +
            "De quién vine y a quién voy.', ' ', '2\n" +
            "Tú reprendes mi dudar;\n" +
            "Tú me exhortas sin cesar;\n" +
            "Eres faro que a mi pie,\n" +
            "Va guiando por la fe,\n" +
            "A las fuentes del amor\n" +
            "Del bendito Salvador.\n" +
            "3\n" +
            "Eres infalible voz\n" +
            "Del Espíritu de Dios,\n" +
            "Que vigor al alma da\n" +
            "Cuando en aflicción está;\n" +
            "Tú me enseñas a triunfar,\n" +
            "De la muerte y el pecar.\n" +
            "4\n" +
            "Por tu santa letra sé\n" +
            "Que con Cristo reinaré\n" +
            "Yo que tan indigno soy,\n" +
            "Por tu luz al cielo voy;\n" +
            "¡Santa Biblia para mí,\n" +
            "Eres un tesoro aquí!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('32', 'EN LOS NEGOCIOS DEL REY', '1\n" +
            "Soy peregrino aquí, mi hogar lejano está,\n" +
            "En la mansión de luz, eterna paz y amor.\n" +
            "Embajador yo soy del reino celestial\n" +
            "En los negocios de mi Rey.', 'CORO:\n" +
            "Este mensaje fiel oíd,\n" +
            "Que dijo ya celeste voz:\n" +
            "“Reconciliaos ya” dice el Señor y Rey,\n" +
            "¡Reconciliaos hoy con Dios!', '2\n" +
            "Que del pecado vil arrepentidos ya,\n" +
            "Han de reinar con Él los que obedientes son.\n" +
            "Es el mensaje fiel que debo proclamar,\n" +
            "En los negocios de mi Rey.\n" +
            "3\n" +
            "Mi hogar más bello es que el Valle de Sarón,\n" +
            "Eterno gozo y paz reinan por siempre en Él,\n" +
            "Y allí Jesús dará eterna habitación;\n" +
            "Es el mensaje de mi Rey.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('33', 'A JESUCRISTO VEN SIN TARDAR', '1\n" +
            "A Jesucristo ven sin tardar,\n" +
            "Que entre nosotros hoy Él está,\n" +
            "Y te convida con dulce afán,\n" +
            "Tierno diciendo: “Ven”', 'CORO:\n" +
            "¡Oh!, cuán grata nuestra reunión,\n" +
            "Cuando allá, Señor, en tu mansión\n" +
            "Contigo estemos en comunión,\n" +
            "Gozando eterno bien.', '2\n" +
            "Piensa que Él sólo puede colmar\n" +
            "Tu triste pecho de gozo y paz;\n" +
            "Y porque anhela tu bienestar,\n" +
            "Vuelve a decirte: “Ven”.\n" +
            "3\n" +
            "Su voz escucha sin vacilar,\n" +
            "Y grato acepta lo que hoy te da,\n" +
            "Tal vez mañana no habrá lugar\n" +
            "No te detengas, ven.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('34', 'YA TODO DEJÉ', '1\n" +
            "Tan triste y tan lejos de Dios me sentí\n" +
            "Y sin el perdón de Jesús,\n" +
            "Mas cuando su voz amorosa oí\n" +
            "Que dijo: “Oh, ven a la luz.”', 'CORO:\n" +
            "Ya todo dejé para andar en la luz\n" +
            "No moro en tinieblas ya más;\n" +
            "Ya todo dejé por seguir a Jesús,\n" +
            "Y vivo en la luz de su faz.', '2\n" +
            "¡Qué amigo tan dulce es el tierno Jesús\n" +
            "Tan lleno de paz y de amor,\n" +
            "De todo este mundo es la fúlgida luz\n" +
            "El nombre del buen Salvador.\n" +
            "3\n" +
            "De mi alma el anhelo por siempre será\n" +
            "Más cerca vivir de la cruz,\n" +
            "Do santo poder y pureza me da,\n" +
            "La sangre de Cristo Jesús.\n" +
            "4\n" +
            "¡Oh!, ven a Jesús, infeliz pecador,\n" +
            "No vagues a ciegas ya más;\n" +
            "Sí, ven a Jesús, nuestro gran Salvador,\n" +
            "Pues en Él salvación hallarás.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('35', '¿ERES LIMPIO EN LA SANGRE?', '1\n" +
            "¿Has hallado en Cristo plena salvación,\n" +
            "Por la sangre que Cristo vertió?\n" +
            "Toda mancha lava de tu corazón;\n" +
            "¿Eres limpio en la sangre eficaz?', 'CORO:\n" +
            "¿Eres limpio en la sangre,\n" +
            "En la sangre de Cristo Jesús?\n" +
            "¿Es tu corazón más blanco que la nieve?\n" +
            "¿Eres limpio en la sangre eficaz?', '2\n" +
            "¿Vives siempre al lado de tu Salvador\n" +
            "Por la sangre que Él derramó?\n" +
            "¿Del pecado eres siempre vencedor?\n" +
            "¿Eres limpio en la sangre eficaz?\n" +
            "3\n" +
            "¿Tendrás ropa blanca al venir Jesús?\n" +
            "¿Eres limpio en la fuente de amor?\n" +
            "¿Estás listo para la mansión de luz?\n" +
            "¿Eres limpio en la sangre eficaz?\n" +
            "4\n" +
            "Cristo ofrece hoy pureza y poder,\n" +
            "¡Oh, acude a la cruz del Señor!\n" +
            "Él la fuente es que limpiará tu ser,\n" +
            "¡Oh, acude a su sangre eficaz!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('36', 'MÁS BLANCO QUE LA NIEVE', '1\n" +
            "Yo quiero ser limpio, oh mi buen Jesús,\n" +
            "Deseo por siempre andar en tu luz;\n" +
            "Tan sólo en tu sangre limpieza tendré,\n" +
            "Lavado y más blanco que nieve seré.', 'CORO:\n" +
            "Más blanco, sí, que la nieve seré;\n" +
            "Lavado en la sangre y limpio por fe.', '2\n" +
            "Que en mi alma no puede lo impuro quedar,\n" +
            "Tu sangre mis manchas las puede quitar;\n" +
            "Pecados e ídolos desecharé,\n" +
            "Lavado y más blanco que nieve seré.\n" +
            "3\n" +
            "Tú, Cristo, me ayudas a sacrificar,\n" +
            "Humilde llevando mi todo a tu altar;\n" +
            "Te entrego mi vida y así por la fe,\n" +
            "Lavado y más blanco que nieve seré.\n" +
            "4\n" +
            "Por esta pureza doy gracias a ti\n" +
            "Que santificado por tu gracia fui;\n" +
            "Tu sangre limpiándome vi por la fe,\n" +
            "Lavado y más blanco que nieve quedé.\n" +
            "CORO:\n" +
            "Más blanco, sí, que la nieve quedé;\n" +
            "Lavado en tu sangre, soy limpio por fe.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('37', 'DONDEQUIERA CON JESÚS', '1\n" +
            "A cualquiera parte sin temor iré\n" +
            "Si Jesús dirige mi inseguro pie;\n" +
            "Sin su compañía todo es pavor,\n" +
            "Mas si Él me guía no tendré temor.', 'CORO:\n" +
            "Con Jesús, por doquier, sin temor iré;\n" +
            "Si Jesús me guía nada temeré.', '2\n" +
            "Con Jesús por guía donde quiera voy;\n" +
            "Caminando en pos de Él seguro estoy,\n" +
            "Y aunque padre y madre me puedan faltar,\n" +
            "Jesucristo nunca me abandonará.\n" +
            "3\n" +
            "Dondequiera con Jesús, en tierra y mar,\n" +
            "Quiero ser su fiel testigo sin cesar;\n" +
            "Y si por desierto mi camino va,\n" +
            "Un seguro albergue mi Jesús será.\n" +
            "4\n" +
            "Dondequiera paso yo la noche atroz,\n" +
            "Porque siempre oigo su benigna voz,\n" +
            "Él de día y noche a mi lado está,\n" +
            "Y en plena gloria me despertará.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('38', 'EN LA VIÑA DEL SEÑOR', '1\n" +
            "Yo quiero trabajar por el Señor,\n" +
            "Confiando en su palabra y en su amor,\n" +
            "Quiero yo cantar y orar,\n" +
            "Y ocupado siempre estar\n" +
            "En la viña del Señor.', 'CORO:\n" +
            "Trabajar y orar\n" +
            "En la viña, en la viña del Señor;\n" +
            "Sí, mi anhelo es orar,\n" +
            "Y ocupado siempre estar,\n" +
            "En la viña del Señor.', '2\n" +
            "Yo quiero cada día trabajar,\n" +
            "Y esclavos del pecado libertar,\n" +
            "Conducirlos a Jesús,\n" +
            "Nuestro guía, nuestra luz,\n" +
            "En la viña del Señor.\n" +
            "3\n" +
            "Yo quiero ser obrero de valor,\n" +
            "Confiando en el poder del Salvador,\n" +
            "El que quiera trabajar,\n" +
            "Hallará también lugar,\n" +
            "En la viña del Señor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('39', 'TE LOAMOS, iOH DIOS!', '1\n" +
            "Te loamos, oh Dios,\n" +
            "Con unánime voz,\n" +
            "Que en Cristo tu hijo\n" +
            "Nos diste perdón.', 'CORO:\n" +
            "¡Aleluya! Te alabamos,\n" +
            "¡Cuán grande es tu amor!\n" +
            "¡Aleluya! Te adoramos,\n" +
            "Bendito Señor.', '2\n" +
            "Te loamos, Jesús,\n" +
            "Quien tu trono de luz\n" +
            "Has dejado por darnos\n" +
            "Salud en la cruz.\n" +
            "3\n" +
            "Te damos loor,\n" +
            "Santo Consolador,\n" +
            "Que nos llenas de gozo\n" +
            "Y santo valor.\n" +
            "4\n" +
            "Unidos load\n" +
            "A la gran trinidad,\n" +
            "Que es la fuente de gracia,\n" +
            "Virtud y verdad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('40', 'CRISTO LA ROCA', '1\n" +
            "En las olas inmensas de embravecido mar,\n" +
            "Que asaltan de mi alma la pobre embarcación,\n" +
            "De rodillas a Cristo clamé y el huracán\n" +
            "Desecho fue al instante a la voz de Dios.', 'CORO:\n" +
            "Es Cristo la Roca, el ancla de mi fe;\n" +
            "Los males, lamentos y ayes de temor,\n" +
            "Terminan por siempre, con mi supremo Rey;\n" +
            "Es Jesucristo mi refugio.', '2\n" +
            "Me guarda de peligros, de pruebas, de dolor;\n" +
            "Él manda que los vientos no agiten tempestad,\n" +
            "Los mares se detienen, la ola reposó,\n" +
            "Y en Cristo fijo el ancla, confiando más.\n" +
            "3\n" +
            "Mi dulce Salvador, sí, mi hermoso amigo y Dios,\n" +
            "Que libra de tristezas y aleja amarga hiel:\n" +
            "Por fe yo iré al cielo, mansión del ser de amor,\n" +
            "La fuente inagotable de dicha y bien.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('41', 'EN LA CRUZ', '1\n" +
            "Me hirió el pecado, fui a Jesús,\n" +
            "Mostréle mi dolor;\n" +
            "Perdido, errante, vi su luz,\n" +
            "Bendíjome en su amor.', 'CORO:\n" +
            "En la cruz, en la cruz,\n" +
            "Do primero vi la luz,\n" +
            "Y las manchas de mi alma yo lavé;\n" +
            "Fue allí por fe do vi a Jesús,\n" +
            "Y siempre feliz con Él seré.', '2\n" +
            "Sobre una cruz, mi buen Señor,\n" +
            "Su sangre derramó,\n" +
            "Por este pobre pecador\n" +
            "A quien así salvó.\n" +
            "3\n" +
            "Venció la muerte con poder,\n" +
            "Y al cielo se exaltó;\n" +
            "Confiar en Él es mi placer,\n" +
            "Morir no temo yo.\n" +
            "4\n" +
            "Aunque Él se fue solo no estoy\n" +
            "Mandó al Consolador,\n" +
            "Divino Espíritu, que hoy\n" +
            "Me da perfecto amor.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('42', 'QUE HAGA EN TI SU VOLUNTAD', '1\n" +
            "¿Vivirás por Cristo, fiel a Él al fin serás?\n" +
            "¿En la vía de paz, en pos de Él andarás?\n" +
            "¿De la cruz al pie tus cuitas todas dejarás?\n" +
            "Que haga en ti su voluntad.', 'CORO:\n" +
            "Su gran poder, sus dones te dará,\n" +
            "El gozo, y paz a tu alma volverá;\n" +
            "Del corazón las manchas limpiará,\n" +
            "Que haga en ti su santa voluntad.', '2\n" +
            "¿Quieres ir en pos de Cristo y llevar la cruz?\n" +
            "¿Quieres conocer la paz que da Jesús?\n" +
            "¿Quieres que te guié con la verdadera luz?\n" +
            "Que haga en ti su voluntad.\n" +
            "3\n" +
            "¿Quieres en el cielo tus amigos encontrar?\n" +
            "Debes preparar tu vida sin tardar.\n" +
            "¿Quieres a Él sólo hoy tu vida consagrar?\n" +
            "Que haga en ti su voluntad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('43', 'EL MUNDO PERDIDO', '1\n" +
            "El mundo perdido en pecado se vio:\n" +
            "¡Jesús es la luz del mundo!\n" +
            "Mas en las tinieblas la gloria brilló,\n" +
            "¡Jesús es la luz del mundo!', 'CORO: :\n" +
            "¡Ven a la luz, no quieras perder\n" +
            "Gozo perfecto al amanecer!\n" +
            "Yo ciego fui, mas ya puedo ver,\n" +
            "¡Jesús es la luz del mundo!', '2\n" +
            "En día la noche se cambia con Él,\n" +
            "¡Jesús es la luz del mundo!\n" +
            "Irás en la luz si a su ley eres fiel,\n" +
            "¡Jesús es la luz del mundo!\n" +
            "3\n" +
            "¡Oh ciegos y presos del lóbrego error!,\n" +
            "¡Jesús es la luz del mundo!\n" +
            "Él manda lavaros y ver su fulgor,\n" +
            "¡Jesús es la luz del mundo!\n" +
            "4\n" +
            "Ni soles ni lunas el cielo tendrá,\n" +
            "¡Jesús es la luz del mundo!\n" +
            "La luz de su rostro lo iluminará,\n" +
            "¡Jesús es la luz del mundo!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('44', 'iOH, YO QUIERO ANDAR CON CRISTO!', '1\n" +
            "¡Oh!, yo quiero andar con Cristo\n" +
            "Quiero oír su tierna voz,\n" +
            "Meditar en su palabra,\n" +
            "Siempre andar de Él en pos,\n" +
            "Consagrar a Él mi vida,\n" +
            "Cumplir fiel su voluntad,\n" +
            "Y algún día con mi Cristo\n" +
            "Gozaré la claridad.', 'CORO:\n" +
            "¡Oh, sí, yo quiero andar con Cristo!\n" +
            "¡Oh, sí yo quiero vivir con Cristo!\n" +
            "¡Oh, sí, yo quiero morir con Cristo!\n" +
            "Quiero serle un testigo fiel.', '2\n" +
            "¡Oh!, yo quiero andar con Cristo,\n" +
            "Él vivió en santidad,\n" +
            "En la Biblia yo lo leo\n" +
            "Y yo sé que es la verdad.\n" +
            "Cristo era santo en todo,\n" +
            "El Cordero de la cruz;\n" +
            "Y yo anhelo ser cristiano,\n" +
            "Seguidor de mi Jesús.\n" +
            "3\n" +
            "¡Oh!, yo quiero andar con Cristo\n" +
            "De mi senda Él es la luz,\n" +
            "Dejaré el perverso mundo\n" +
            "Y cargar aquí mi cruz.\n" +
            "Este mundo nada ofrece,\n" +
            "Cristo ofrece salvación;\n" +
            "Y es mi única esperanza\n" +
            "Gozar vida eterna en Sión.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('45', 'GLORIA AL CORDERO', '1\n" +
            "Cristo mío, me salvaste,\n" +
            "Tuyo soy, tuyo seré;\n" +
            "Por tu sangre derramada\n" +
            "Vida eterna gozaré.', 'CORO:\n" +
            "¡Gloria, gloria al Cordero!\n" +
            "¡Gloria, gloria a Jesús!\n" +
            "Ya soy limpio por su sangre,\n" +
            "¡Gloria, gloria a Jesús!', '2\n" +
            "Mucho tiempo solo anduve,\n" +
            "Lejos de tu dulce amor,\n" +
            "Mas ahora por tu gracia\n" +
            "Tengo paz en ti, Señor.\n" +
            "3\n" +
            "En la fuente de la vida,\n" +
            "Fui limpiado por la fe;\n" +
            "Consagrado a tu servicio,\n" +
            "Para ti ya viviré.\n" +
            "4\n" +
            "¡Gloria a Cristo, el Cordero!\n" +
            "Que murió en una cruz;\n" +
            "¡Gloria a Él!, me guarda siempre\n" +
            "En su gozo, paz y luz.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('46', 'PUEDO ENTONCES CONOCERLE', '1\n" +
            "Cuando aquí de mi vida mis afanes cesen ya\n" +
            "Y se anuncie bella aurora celestial,\n" +
            "En las playas del cielo mi llegada esperará,\n" +
            "Mi Señor con bienvenida paternal.', 'CORO:\n" +
            "Puedo entonces conocerle,\n" +
            "Y seguro en su seno estaré\n" +
            "Cara a cara espero verle,\n" +
            "Y con Él redimido viviré.', '2\n" +
            "¡Oh!, que gozo tendré yo cuando pueda ver su faz\n" +
            "Y en eterna vida esté con mi Señor;\n" +
            "De su lado ya nunca me podrán quitar jamás\n" +
            "Los halagos de mi fiero tentador.\n" +
            "3\n" +
            "He de ver a los seres que en la tierra yo perdí,\n" +
            "Cuando en brazos de la muerte los dejé:\n" +
            "Y aunque de ellos, entonces, con dolor me despedí,\n" +
            "¡Junto al trono de Jesús, los hallaré!\n" +
            "4\n" +
            "Al entrar por las puertas de la célica ciudad,\n" +
            "Me uniré con los que ya triunfantes van,\n" +
            "Y del himno que alabe de mi Dios la majestad,\n" +
            "Los acentos por los siglos sonarán.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('47', ' ¡TE QUIERO MI SEÑOR!', '1\n" +
            "Te quiero, mi Señor, habita en mí,\n" +
            "Y vencedor seré por fe en ti.', 'CORO:\n" +
            "Te quiero, sí, te quiero, siempre te anhelo;\n" +
            "Bendíceme ahora, acudo a ti.', '2\n" +
            "Te quiero, oh Jesús, mi Salvador;\n" +
            "Oh, hazme, en verdad, tu servidor.\n" +
            "3\n" +
            "Tu voluntad, Señor, enséñame,\n" +
            "Y de tu gran amor, ¡oh!, cólmame.\n" +
            "4\n" +
            "Oh, mi gran bienhechor, en tentación,\n" +
            "Concédeme valor y protección.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('48', 'NADA HAY QUE ME PUEDA APARTAR', '1\n" +
            "Nada hay que me pueda apartar\n" +
            "De Cristo y de su amor,\n" +
            "Pues Él de veras sabe amar\n" +
            "Al pobre pecador.', 'CORO:\n" +
            "¡Yo te amo, oh mi Salvador!,\n" +
            "Más que a lo terrenal;\n" +
            "Me das consuelo, paz y amor,\n" +
            "Y el reino celestial.', '2\n" +
            "Saber que Cristo es mi sostén\n" +
            "Me alegra el corazón,\n" +
            "Pues Él es mi supremo bien,\n" +
            "Me da la salvación.\n" +
            "3\n" +
            "Señor, si cerca estás de mí,\n" +
            "Se ahuyenta el temor;\n" +
            "Perdón completo encuentra en ti\n" +
            "El pobre pecador.\n" +
            "4\n" +
            "Jesús, mi amable y buen Pastor,\n" +
            "De Dios supremo Don;\n" +
            "Aparta mi alma de dolor;\n" +
            "Me da consolación.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('49', 'CON CRISTO YO IRÉ', '1\n" +
            "Ya sea en el valle do el peligro esté\n" +
            "O que en la luz gloriosa de paz habite yo\n" +
            "A mi Jesús diré: “tu voluntad haré”;\n" +
            "Si Cristo me guía, doquiera yo iré.', 'CORO:\n" +
            "Si Cristo conmigo va, yo iré,\n" +
            "Yo no temeré, con gozo iré,\n" +
            "Conmigo va; es grato servir a Jesús,\n" +
            "Llevar la cruz.\n" +
            "Si Cristo conmigo va, yo iré.', '2\n" +
            "Si al desierto quiere Jesús que vaya yo,\n" +
            "Llevando buenas nuevas de santa salvación;\n" +
            "Si allí, en dura lid, mi campo señaló,\n" +
            "A Cristo yo sigo sin más dilación.\n" +
            "3\n" +
            "Aunque mi parte sea mi dura cruz llevar,\n" +
            "Diré a mis hermanos también su gran poder;\n" +
            "Contento quedaré, mi luz haré brillar,\n" +
            "¡Testigo de Cristo, doquiera yo iré!\n" +
            "4\n" +
            "La voluntad de Cristo yo quiero obedecer,\n" +
            "Pues en la Santa Biblia encuentro mi saber\n" +
            "Y con su gran poder al mundo venceré,\n" +
            "Si Él va conmigo, doquiera yo iré.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('50', 'DIOS OS GUARDE', '1\n" +
            "Dios os guarde en su santo amor,\n" +
            "Hasta el día en que lleguemos,\n" +
            "A la patria do estaremos,\n" +
            "Para siempre con el Salvador.', 'CORO:\n" +
            "Al venir Jesús nos veremos\n" +
            "A los pies de nuestro Salvador;\n" +
            "Reunidos todos seremos\n" +
            "Un redil con nuestro buen Pastor.', '2\n" +
            "Dios os guarde en su santo amor,\n" +
            "En la senda peligrosa,\n" +
            "De esta vida tormentosa,\n" +
            "Os conserve en paz y sin temor.\n" +
            "3\n" +
            "Dios os guarde en su santo amor;\n" +
            "Os conduzca su bandera,\n" +
            "Y os esfuerce en gran manera,\n" +
            "Con su Espíritu Consolador.\n" +
            "4\n" +
            "Dios os guarde en su santo amor;\n" +
            "Con su gracia Él os sostenga,\n" +
            "Hasta que el Maestro venga\n" +
            "A fundar su reino en esplendor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('51', 'VOLUNTARIOS DE JESÚS', '1\n" +
            "Jesús está buscando voluntarios hoy,\n" +
            "Que a la ruda lucha luego puedan ir;\n" +
            "¿Quién está dispuesto a escuchar su voz,\n" +
            "Siendo voluntario listo a combatir?', 'CORO:\n" +
            "De Cristo voluntario, tú puedes ser,\n" +
            "Otros ya se alistan, hazlo tú;\n" +
            "Cristo es nuestro Jefe, no hay por qué temer;\n" +
            "¿Quieres ser un voluntario de Jesús?', '2\n" +
            "Nos cercan las tinieblas densas del error;\n" +
            "Vamos sobre abismos hondos de maldad,\n" +
            "Y para destruirlas llama el Salvador\n" +
            "Muchos voluntarios que amen la verdad.\n" +
            "3\n" +
            "La lucha es contra el vicio, la pereza, el mal,\n" +
            "Contra la ignorancia de la ley de Dios.\n" +
            "Es una campaña que no tiene igual,\n" +
            "¿Quieres ir a ella de Jesús en pos?\n" +
            "4\n" +
            "El triunfo significa que domine el bien,\n" +
            "Que los hombres que se amen y que la verdad\n" +
            "Reine en las conciencias, siendo su sostén;\n" +
            "Y ha de ser, si ayudas, una realidad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('52', 'A SOLAS CON JESÚS', '1\n" +
            "A solas al huerto yo voy,\n" +
            "Cuando duerme aún la floresta;\n" +
            "Y en quietud y paz con Jesús estoy\n" +
            "Oyendo absorto allí su voz', 'CORO:\n" +
            "Él conmigo está, puedo oír su voz,\n" +
            "Y que suyo, dice seré.\n" +
            "Y el encanto que hallo en Él allí,\n" +
            "Con nadie tener podré.', '2\n" +
            "Tan dulce es la voz del Señor,\n" +
            "Que las aves guardan silencio,\n" +
            "Y tan solo se oye esa voz de amor,\n" +
            "Que inmensa paz al alma da.\n" +
            "3\n" +
            "Con Él encantado yo estoy,\n" +
            "Aunque en torno lleguen las sombras;\n" +
            "Mas me ordena a ir que a escuchar yo voy\n" +
            "Su voz doquier la pena esté.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('53', '¡SALUD!¡SALUD!', '1\n" +
            "Vengo a tus pies, Jesús, con llanto y dolor;\n" +
            "Misericordia ten de mí, un pobre pecador;\n" +
            "Sálvame, y te daré mi vida en loor;\n" +
            "¡Oh Salvador, tierno Cristo!', 'CORO:\n" +
            "¡Salud! ¡Salud!, cantad a nuestro Dios.\n" +
            "La paz nos da, clamad en alta voz;\n" +
            "Salvación ya tengo y descanso dulce en Él,\n" +
            "Yo soy salvado en Cristo.', '2\n" +
            "Debo pues, mis fuerzas y mi vida toda a ti,\n" +
            "Te las doy con gratitud y alegremente, sí;\n" +
            "Gratitud a ti que vida diste ya por mí,\n" +
            "Mi Salvador, Jesucristo.\n" +
            "3\n" +
            "Voces dad al pecador que anda sin sostén,\n" +
            "Sin la paz, buscándola, decidle: a Cristo ven;\n" +
            "El que me salvó quiere salvarte a ti también,\n" +
            "Cree en la sangre de Cristo.\n" +
            "4\n" +
            "Gloria a nuestro salvador, por su gran salvación;\n" +
            "Gloria tributemos en la sala de oración,\n" +
            "Gloria cantaremos en canción de fuerte son,\n" +
            "Yo soy salvado por Cristo.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('54', 'DE MI TIERNO SALVADOR', '1\n" +
            "De mi tierno Salvador\n" +
            "Cantaré el inmenso amor.\n" +
            "Gloriaréme en el favor de Jesús.\n" +
            "De tinieblas me llamó,\n" +
            "De cadenas me libró,\n" +
            "De la muerte me salvó, mi Jesús.', 'CORO:\n" +
            "¡Mi Jesús! ¡Mi Jesús!\n" +
            "¡Cuán precioso es el nombre de Jesús!\n" +
            "Con su sangre me limpió,\n" +
            "De su gozo me llenó,\n" +
            "De su vida me dotó, mi Jesús', '2\n" +
            "¡Oh, que triste condición\n" +
            "Del impío corazón!\n" +
            "Me salvó de perdición, mi Jesús.\n" +
            "Del pecado, el perdón,\n" +
            "De la ruina, salvación:\n" +
            "Por tristeza, bendición, dio Jesús.\n" +
            "3\n" +
            "En el mundo al vagar,\n" +
            "Solitario sin hogar,\n" +
            "No sabía que dulce paz da Jesús,\n" +
            "Mas las lágrimas de ayer\n" +
            "Han pasado y placer\n" +
            "Ya comienzo a tener, en Jesús.\n" +
            "4\n" +
            "De lo falso, a su verdad,\n" +
            "De lo inmundo, a santidad,\n" +
            "Ya me trajo la bondad de Jesús.\n" +
            "Hechos fuertes en virtud\n" +
            "De su perennal salud;\n" +
            "Himnos dad de gratitud a Jesús')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('55', 'LIBRE ESTOY', '1\n" +
            "Yo vagaba mucho tiempo en el error,\n" +
            "Agobiado en el pecado y el temor;\n" +
            "Cuando vi al Salvador\n" +
            "Y escuché su tierna voz,\n" +
            "Mi Jesús me hizo libre por su amor.', 'CORO:\n" +
            "Libre estoy, libre estoy,\n" +
            "Por la gracia de Jesús libre estoy;\n" +
            "Libre estoy, libre estoy,\n" +
            "¡Aleluya, por la fe, libre estoy!', '2\n" +
            "Yo vagaba mucho tiempo en el error,\n" +
            "Sin pensar en el amor del Salvador;\n" +
            "Yo vagaba más y más,\n" +
            "Lejos de mi Redentor,\n" +
            "¡Mas ahora por su muerte libre estoy!\n" +
            "3\n" +
            "Yo vagaba mucho tiempo en el error,\n" +
            "Mas ahora quiero andar con mi Señor;\n" +
            "Quiero oír su tierna voz,\n" +
            "Y seguirle siempre en pos,\n" +
            "¡Gloria, gloria sea a nuestro buen Pastor!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('56', 'PRECIOSO ES JESÚS', '1\n" +
            "Jesús es precioso, mi buen Salvador,\n" +
            "Por siempre le alabo por su gran amor,\n" +
            "Si débil me encuentro su fuerza me da,\n" +
            "Él es mi precioso Jesús.', 'CORO:\n" +
            "Precioso es Jesús, mi Jesús,\n" +
            "Precioso es Jesús, mi Jesús;\n" +
            "Mi gloria será su rostro al mirar,\n" +
            "Él es mi precioso Jesús.', '2\n" +
            "Y cuando en pecado muy triste me vi,\n" +
            "Llamando a las puertas de mi corazón,\n" +
            "Me dijo: «Tu alma yo quiero salvar»\n" +
            "Él es mi precioso Jesús.\n" +
            "3\n" +
            "Mas ya por su gracia la luz puedo ver,\n" +
            "Quitó mi tristeza, mi llanto enjugó;\n" +
            "Por fe yo contemplo mi eterno hogar,\n" +
            "Él es mi precioso Jesús.\n" +
            "4\n" +
            "Jesús es precioso, mi fiel Redentor,\n" +
            "Me gozo en su luz que en mi senda brilló;\n" +
            "Yo sé que glorioso por mí viene aquí,\n" +
            "Él es mi precioso Jesús.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('57', ' DÍA FELIZ', '1\n" +
            "Feliz momento en que escogí\n" +
            "Servirte, mi Señor y Dios.\n" +
            "Preciso es que mi gozo en ti\n" +
            "Lo muestre hoy con obra y voz.', 'CORO:\n" +
            "¡Soy feliz! ¡Soy feliz!\n" +
            "Y en su favor me gozaré;\n" +
            "En libertad y luz me vi\n" +
            "Cuando triunfó en mí la fe;\n" +
            "Y el raudal carmesí\n" +
            "Salud de mi alma enferma fue.', '2\n" +
            "¡Pasó! Mi gran deber cumplí;\n" +
            "De Cristo soy, y mío es Él;\n" +
            "Me atrajo con placer seguí;\n" +
            "Su voz conoce todo fiel.\n" +
            "3\n" +
            "Reposa débil corazón;\n" +
            "A tus contiendas pon ya fin,\n" +
            "Hallé más noble posesión,\n" +
            "Y parte en superior festín.\n" +
            "4\n" +
            "Solemne voto, ofrenda, flor,\n" +
            "Que al cielo santo consagré;\n" +
            "Hoy sé mi título de honor,\n" +
            "Después testigo de mi fe.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('58', 'JAMÁS SE DICE ADIÓS ALLÁ', '1\n" +
            "Amigos con placer nos vemos\n" +
            "En tiempo tan veloz;\n" +
            "Mas siempre llega el tiempo triste\n" +
            "En que se dice adiós.', 'CORO:\n" +
            "Jamás se dice adiós allá,\n" +
            "Jamás se dice adiós,\n" +
            "En el país de gozo y paz,\n" +
            "Jamás se dice adiós.', '2\n" +
            "¡Cuán dulce es el consuelo dado\n" +
            "Por ellos al partir,\n" +
            "Que al venir Jesús en gloria,\n" +
            "Nos hemos de reunir!\n" +
            "60\n" +
            "3\n" +
            "La voz de triste despedida\n" +
            "Jamás allí se oirá,\n" +
            "Mas la canción de\n" +
            "Paz y gozo por siempre durará.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('59', 'DILO A CRISTO', '1\n" +
            "Cuando estés cansado y abatido,\n" +
            "Dilo a Cristo, dilo a Cristo;\n" +
            "Si te sientes débil, confundido\n" +
            "Dilo a Cristo el Señor.', 'CORO:\n" +
            "Dilo a Cristo, dilo a Cristo,\n" +
            "Él es tu amigo más fiel;\n" +
            "No hay otro amigo como Cristo,\n" +
            "Dilo tan sólo a Él.', '2\n" +
            "Cuando estés de tentación cercado\n" +
            "Mira a Cristo, mira a Cristo;\n" +
            "Cuando rujan huestes de pecado,\n" +
            "Mira a Cristo el Señor.\n" +
            "CORO: Mira a Cristo, etc.\n" +
            "3\n" +
            "Si se apartan otros de la senda,\n" +
            "Sigue a Cristo, sigue a Cristo;\n" +
            "Si acrecienta en torno la contienda\n" +
            "Sigue a Cristo el Señor.\n" +
            "CORO: Sigue a Cristo, etc.\n" +
            "4\n" +
            "Cuando llegue la final jornada,\n" +
            "Fía en Cristo, fía en Cristo;\n" +
            "Te dará en el cielo franca entrada\n" +
            "Fía en Cristo el Señor.\n" +
            "CORO: Fía en Cristo, etc.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('60', 'TUYO SOY JESÚS', '1\n" +
            "Tuyo soy, Jesús, ya escuche la voz,\n" +
            "De tu amor hablándome aquí;\n" +
            "Mas anhelo en alas de fe subir,\n" +
            "Y más cerca estar de ti.', 'CORO:\n" +
            "Aún más cerca, cerca de tu cruz\n" +
            "Llévame ¡Oh Salvador!\n" +
            "Aún más cerca, cerca, cerca de tu cruz,\n" +
            "Llévame, ¡Oh buen Pastor!', '2\n" +
            "A seguirte a ti me consagro hoy,\n" +
            "Constreñido por tu amor,\n" +
            "Y mi espíritu, alma y cuerpo doy\n" +
            "Por servirte, mi Señor.\n" +
            "3\n" +
            "¡Oh cuán pura y santa delicia es\n" +
            "De tu comunión gozar;\n" +
            "Y contigo hablar, y tu dulce voz\n" +
            "Cada día escuchar!\n" +
            "4\n" +
            "De tu grande amor no comprenderé\n" +
            "Cuál es la profundidad,\n" +
            "Hasta que contigo, Jesús, esté\n" +
            "En gloriosa eternidad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('61', 'EL CONSOLADOR HA VENIDO', '1\n" +
            "Doquier el hombre esté, la nueva proclamad,\n" +
            "Doquier haya aflicción, miserias y dolor;\n" +
            "Cristianos, anunciad que el Padre nos envió,\n" +
            "El fiel Consolador.', 'CORO:\n" +
            "El fiel Consolador, el fiel Consolador,\n" +
            "Que Dios nos prometió, al mundo descendió,\n" +
            "Doquier el hombre esté, decid que vino ya,\n" +
            "El fiel Consolador.', '2\n" +
            "La noche ya pasó, y al fin brilló la luz\n" +
            "Que vino a disipar las sombras del terror,\n" +
            "Así del alma fue aurora celestial,\n" +
            "El fiel Consolador.\n" +
            "3\n" +
            "Él es quien da salud, y plena libertad,\n" +
            "A los que encadenó el fiero tentador;\n" +
            "Los rotos hierros hoy dirán que vino ya\n" +
            "El fiel Consolador.\n" +
            "4\n" +
            "¡Oh grande eterno amor!, mi lengua débil es\n" +
            "Para poder hablar del don que recibí,\n" +
            "Al renovar en mí la imagen celestial,\n" +
            "El fiel Consolador.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('62', 'CUANDO DIOS LA SANGRE VE', '1\n" +
            "Mi Redentor murió en la cruz,\n" +
            "Quien le reciba, tendrá la luz;\n" +
            "Por pecadores todo Él pagó,\n" +
            "Ya sus maldades Jesús perdonó.', 'CORO:\n" +
            "Cuando Dios la sangre ve,\n" +
            "Cuando Dios la sangre ve,\n" +
            "En la cual el pecador\n" +
            "Se lavó, le verá con favor.', '2\n" +
            "A los más malos Él salvará.\n" +
            "Como promete, así lo hará.\n" +
            "En Él confía, ¡oh pecador!,\n" +
            "Vida eterna te da el Señor.\n" +
            "3\n" +
            "El juicio viene, allí estarás,\n" +
            "Si le rechazas, triste saldrás,\n" +
            "No te detengas, ven a Jesús,\n" +
            "Quien tus pecados llevó en la cruz.\n" +
            "4\n" +
            "iQué maravilla de gran amor,\n" +
            "Cristo mostró por el pecador!\n" +
            "«El que creyere salvo será».\n" +
            "Goces eternos él disfrutará.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('63', 'A TI Y A MÍ', '1\n" +
            "¡Cuán tiernamente nos está llamando\n" +
            "Cristo a ti y a mí!\n" +
            "Él nos espera con brazos abiertos;\n" +
            "Llama a ti y a mí.', 'CORO:\n" +
            "Venid ... Venid, ...\n" +
            "Si estáis cansados, venid;\n" +
            "¡Cuán tiernamente os está llamando!\n" +
            "!Oh pecadores, venid!', '2\n" +
            "¿Por qué tememos si está abogando\n" +
            "Cristo por ti y por mí?\n" +
            "Sus bendiciones está derramando,\n" +
            "Siempre por ti y por mí.\n" +
            "3\n" +
            "El tiempo vuela, lograrlo conviene,\n" +
            "Cristo te llama a ti;\n" +
            "Vienen las sombras y la muerte viene,\n" +
            "Viene por ti y por mí.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('64', 'PUEDO OÍR TU VOZ LLAMANDO', '1\n" +
            "IIIPuedo oír tu voz llamando,III\n" +
            "Trae tu cruz y ven en pos de mí.', 'CORO:\n" +
            "IIISeguiré do tú me guíes,III\n" +
            "Dondequiera fiel te seguiré', '2\n" +
            "III Yo te seguiré en el huerto,III\n" +
            "Sufriré contigo, mi Jesús.\n" +
            "3\n" +
            "IIISufriré por ti, Maestro,III\n" +
            "Moriré contigo, mi Jesús.\n" +
            "4\n" +
            "IIIMe darás la gracia y gloria,III\n" +
            "Y por siempre tú me guiarás.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('65', 'PUEDO OÍR TU VOZ LLAMANDO', '1\n" +
            "Puedo oír la voz de Cristo,\n" +
            "Tiernamente está llamando,\n" +
            "Puedo oír el llamamiento:\n" +
            "Trae tu cruz y ven en pos de mí.', 'CORO:,\n" +
            "Seguiré do tú me guíes,\n" +
            "Seguiré do tú me guíes,\n" +
            "Salvador, seguirte quiero,\n" +
            "Dondequiera fiel te seguire.\n', '2\n" +
            "Yo te seguiré en el huerto,\n" +
            "Por la vía dolorosa,\n" +
            "Y con mi alma tan gozosa,\n" +
            "Sufriré contigo, mi Jesús.\n" +
            "3\n" +
            "Sufriré por ti, Maestro,\n" +
            "No me faltará tu mano,\n" +
            "Y si tú irás conmigo,\n" +
            "Moriré contigo, mi Jesús.\n" +
            "4\n" +
            "Me darás tu plena gracia,\n" +
            "Yo veré tu eterna gloria,\n" +
            "Contaré la antigua historia,\n" +
            "Y por siempre tú me guiaras.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('66', '¡OH, VEN SIN TARDAR!', '1\n" +
            "¡Oh no rechaces la vedad!\n" +
            "Tus ojos hoy abre a la luz;\n" +
            "Renuncia toda la maldad,\n" +
            "Y ven a Jesús.', 'CORO:\n" +
            "¡Oh, ven sin tardar! ¡Oh,ven sin tardar!\n" +
            "Acepta a Jesús, y salvo serás.', '2\n" +
            "Tus ojos ya tal vez el sol\n" +
            "No más aquí contemplarán.\n" +
            "Hoy es el día de salvación,\n" +
            "¡Oh, ven a Jesús!\n" +
            "3\n" +
            "Jesús te tiene compasión;\n" +
            "¿Con qué su amor le pagarás?\n" +
            "Hoy trae a Él tu corazón,\n" +
            "Y salvo serás.\n" +
            "4\n" +
            "Jesús recibe al pecador\n" +
            "Que quiera a Él su alma unir;\n" +
            "Ya no desprecies más su amor,\n" +
            "¡Oh, ven a Jesús!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('67', '¿SOY YO SOLDADO DE JESÚS?', '1\n" +
            "¿Soy yo soldado de la cruz,\n" +
            "Y siervo del Señor?\n" +
            "No temeré llevar su cruz,\n" +
            "Sufriendo por su amor.', 'CORO:\n" +
            "Después de la batalla nos coronará,\n" +
            "Dios nos coronará, Dios nos coronará;\n" +
            "Después de la batalla nos coronará\n" +
            "En aquella santa Sión.\n" +
            "Más allá, más allá, en aquella santa Sión,\n" +
            "Después de la batalla nos coronará\n" +
            "En aquella santa Sión.', '2\n" +
            "Lucharon otros por la fe,\n" +
            "¿Cobarde habré de ser?\n" +
            "Por mi Señor yo pelearé,\n" +
            "Confiando en su poder.\n" +
            "3\n" +
            "Es menester que sea fiel,\n" +
            "Que nunca vuelva atrás;\n" +
            "Que siga siempre en pos de Él,\n" +
            "Y me guiará en paz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('68', '¡OJALÁ FUERA HOY!', '1\n" +
            "Viene otra vez nuestro Salvador,\n" +
            "¡Oh, que si fuera hoy!\n" +
            "Para reinar con poder y amor,\n" +
            "¡Oh, que si fuera hoy!\n" +
            "Ya por su esposa viene esta vez,\n" +
            "Purificada en su grande amor;\n" +
            "Del mundo por la redondez,\n" +
            "¡Oh, que si fuera hoy!', 'CORO:\n" +
            "¡Gloria!, ¡gloria!, gozo sin fin traerá,\n" +
            "¡Gloria!, ¡gloria! al coronarle Rey;\n" +
            "¡Gloria!, ¡gloria!, la senda preparad;\n" +
            "¡Gloria!, ¡gloria!, Cristo viene otra vez.', '2\n" +
            "Terminará el poder de Satán,\n" +
            "¡Ojalá fuera hoy!\n" +
            "No más tristezas aquí verán,\n" +
            "¡Ojalá fuera hoy!\n" +
            "Todos los muertos en Cristo irán\n" +
            "Arrebatados por su Señor.\n" +
            "¿Cuándo estas glorias aquí vendrán?\n" +
            "¡Ojalá fuera hoy!\n" +
            "3\n" +
            "Fieles y leales nos debe hallar,\n" +
            "Si Él viniera hoy;\n" +
            "Todos velando con gozo y paz,\n" +
            "Si Él viniera hoy.\n" +
            "Multiplicadas señales hay,\n" +
            "En el oriente se ve el albor,\n" +
            "Ya más cercano el tiempo está,\n" +
            "¡Ojalá fuera hoy!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('69', 'CERCA, MÁS CERCA', 'Cerca, más cerca, ¡Oh Dios de ti!\n" +
            "Cerca yo quiero mi vida llevar;\n" +
            "Cerca más cerca ¡Oh Dios de ti!\n" +
            "IICerca a tu gracia que puede salvar.II', ' ', '2\n" +
            "Cerca, más cerca, cual pobre soy,\n" +
            "Nada, Señor, yo te puedo ofrecer.\n" +
            "Sólo mi ser contrito te doy,\n" +
            "IIPueda contigo la paz obtener.II\n" +
            "3\n" +
            "Cerca, más cerca, Señor, de ti,\n" +
            "Quiero ser tuyo dejando el pecar.\n" +
            "Goces y pompas vanas aquí,\n" +
            "IITodo, Señor, pronto quiero dejar.II\n" +
            "4\n" +
            "Cerca, más cerca, mientras el ser\n" +
            "Aliente vida y busque tu paz;\n" +
            "Y cuando al cielo pueda ascender,\n" +
            "IIYa para siempre conmigo estarás.II')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('70', '¡OH, EXCELSA GRACIA DEL AMOR!?', '1\n" +
            "Por fe en Jesús, el Salvador,\n" +
            "Se hace salvo el pecador;\n" +
            "Sin merecer tan rico don,\n" +
            "Recibe plena salvación.', 'CORO:\n" +
            "¡Oh excelsa gracia del amor,\n" +
            "Que Dios perdona al pecador!\n" +
            "Si presto está a confesar\n" +
            "Sus culpas y en Jesús confiar;\n" +
            "No hay otro autor de salvación\n" +
            "Pues Cristo obró la redención', '2\n" +
            "La vida antigua ya pasó,\n" +
            "Y todo nuevo se tornó;\n" +
            "Aquí cual peregrino es,\n" +
            "Hogar con Dios tendrá después\n" +
            "3\n" +
            "Aun cuando él nada tenga aquí,\n" +
            "Su gran herencia tiene, sí,\n" +
            "Arriba en gloria con Jesús.\n" +
            "Quien le ha salvado por su cruz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('71', 'YO ANDO CON CRISTO', '1\n" +
            "Muy triste en pecado y en noche me vi,\n" +
            "Mas ya vivo alegre, a Cristo volví;\n" +
            "Y todos los días yo canto a Jesús,\n" +
            "Yo ando con Cristo y tengo su luz.', 'CORO:\n" +
            "Yo voy con el Rey, ¡Aleluya!\n" +
            "Yo ando con Cristo el Rey;\n" +
            "No vago ya más, al cielo me voy;\n" +
            "Tan sólo de Cristo yo soy.', '2\n" +
            "Por años y años sin Cristo viví,\n" +
            "Y nunca en mi vida feliz yo me vi;\n" +
            "Mas hoy con las aves elevo mi voz,\n" +
            "Y canto feliz, pues del Rey voy en pos.\n" +
            "3\n" +
            "¡Oh alma que estás en el valle sin luz,\n" +
            "Si miras arriba verás a Jesús!\n" +
            "¡Ven alto, más cerca, ven pronto al Señor!\n" +
            "Es Cristo tu luz y tu fiel Salvador.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('72', 'BRILLA EN TU LUGAR', '1\n" +
            "Nunca esperes el momento de una grande acción,\n" +
            "Ni que pueda lejos ir tu luz;\n" +
            "De la vida a los pequeños actos da atención,\n" +
            "Brilla en el sitio donde estés.', 'CORO:\n" +
            "Brilla en el sitio donde estés,\n" +
            "Brilla en el sitio donde estés;\n" +
            "Puedes con tu luz algún perdido rescatar,\n" +
            "Brilla en el sitio donde estés.', '2\n" +
            "Puedes en tu cielo alguna nube disipar,\n" +
            "Haz a un lado tu egoísmo cruel;\n" +
            "Aunque sólo un corazón pudieres consolar,\n" +
            "Brilla en el sitio donde estés.\n" +
            "3\n" +
            "Puede tu talento alguna cosa descubrir\n" +
            "Do tu luz podrá resplandecer;\n" +
            "De tu mano el pan de vida puede aquí venir,\n" +
            "Brilla en el sitio donde estés.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('73', 'LA GLORIOSA APARICIÓN', '1\n" +
            "Día de victoria y gran resplandor,\n" +
            "Cuando Cristo volverá;\n" +
            "¡Qué glorioso encuentro con mi Salvador,\n" +
            "En las nubes se verá!', 'CORO:\n" +
            "En las nubes Él vendrá,\n" +
            "En aquel día final;\n" +
            "Cristo el Salvador muy pronto volverá,\n" +
            "¡Un gran día sin igual!', '2\n" +
            "Día de gran gozo, día sin igual,\n" +
            "Cuando Cristo volverá;\n" +
            "De esta tierra iremos a la celestial,\n" +
            "Cristo allí nos honrará.\n" +
            "3\n" +
            "Oye la trompeta que anunciando está\n" +
            "La venida del Señor;\n" +
            "Ya no más dolores, ni afán allá;\n" +
            "¡Con Jesús triunfó el amor!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('74', 'MÁS CUAL JESÚS', '1\n" +
            "Más cual mi Cristo quiero siempre ser,\n" +
            "Más mansedumbre, y su amor tener;\n" +
            "Celo en servirle, fidelidad mostrar,\n" +
            "Más consagrado, y las nuevas publicar.', 'CORO:\n" +
            "Toma mi ser, lo doy, Señor, a ti,\n" +
            "Mi corazón, imploro limpies, sí;\n" +
            "Toma mi ser, es tuyo en verdad,\n" +
            "Tenme, soy tuyo, por la eternidad.', '2\n" +
            "Más cual mi Cristo es mi oración,\n" +
            "Más fuerza tenga, más resignación;\n" +
            "Más serio siempre, más rendido aquí\n" +
            "Y los perdidos llevarlos sólo a ti.\n" +
            "3\n" +
            "Más cual mi Cristo, en mi devoción,\n" +
            "De su cariño, grande compasión;\n" +
            "Cual Él paciente, humilde y veraz,\n" +
            "Es mi anhelo en el mundo ver tu paz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('75', '¡SANTO! ¡SANTO! ¡SANTO!', '1\n" +
            "¡Santo! ¡Santo! ¡Santo! Señor Omnipotente,\n" +
            "Siempre el labio mío loores te dará;\n" +
            "¡Santo! ¡Santo! ¡Santo! te adoro reverente,\n" +
            "Dios en tres personas, bendita Trinidad.', ' ', '2\n" +
            "¡Santo! ¡Santo! ¡Santo! en numeroso coro\n" +
            "Santos escogidos te adoran con fervor;\n" +
            "De alegría llenos, y sus coronas de oro,\n" +
            "Rinden ante el trono glorioso del Señor.\n" +
            "3\n" +
            "¡Santo! ¡Santo! ¡Santo! la inmensa muchedumbre\n" +
            "De ángeles que cumplen tu santa voluntad;\n" +
            "Ante ti se postra bañada con tu lumbre:\n" +
            "Ante ti que has sido, que eres y serás.\n" +
            "4\n" +
            "¡Santo! ¡Santo! ¡Santo! por más que estés velado,\n" +
            "E imposible sea tu gloria contemplar;\n" +
            "Santo tú eres sólo, y nada hay a tu lado,\n" +
            "En poder perfecto, pureza y caridad.\n" +
            "5\n" +
            "¡Santo! ¡Santo! ¡Santo!, la gloria de tu nombre\n" +
            "Vemos en tus obras, en cielo, tierra y mar;\n" +
            "¡Santo! ¡Santo! ¡Santo! te adorará todo hombre,\n" +
            "Dios en tres personas, bendita Trinidad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('76', 'CUANDO ÉL VINO A MI CORAZÓN', '1\n" +
            "¡Cuán glorioso es el cambio operado en mi ser\n" +
            "Viniendo a mi vida el Señor!\n" +
            "Hay en mi alma una paz que yo ansiaba tener:\n" +
            "La paz que me trajo su amor.', 'CORO:\n" +
            "¡Él vino a mi corazón!\n" +
            "¡Él vino a mi corazón!\n" +
            "Soy feliz con la vida que Cristo me dio,\n" +
            "Cuando Él vino a mi corazón.', '2\n" +
            "Ya no voy por la senda que el mal me trazó,\n" +
            "Do sólo encontré confusión;\n" +
            "Mis errores pasados Jesús los borró,\n" +
            "Cuando Él vino a mi corazón.\n" +
            "3\n" +
            "Ni una sombra de duda oscurece su amor\n" +
            "Amor que me trajo el perdón.\n" +
            "La esperanza que aliento la debo al Señor,\n" +
            "Cuando Él vino a mi corazón.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('77', 'GUÍAME ¡OH! SALVADOR', '1\n" +
            "Guíame ¡Oh Salvador!,\n" +
            "Por la vía de salud;\n" +
            "A tu lado no hay temor.\n" +
            "Sólo hay gozo, paz, quietud.', 'CORO:\n" +
            "¡Cristo! ¡Cristo!\n" +
            "No me dejes, ¡oh Señor!\n" +
            "Siendo tú mi guía fiel,\n" +
            "Seré más que vencedor.', '2\n" +
            "No me dejes, ¡oh Señor!\n" +
            "Mientras en el mundo esté;\n" +
            "Y haz que arribe sin temor\n" +
            "Do feliz por fin seré.\n" +
            "3\n" +
            "Tú de mi alma salvación,\n" +
            "En la ruda tempestad;\n" +
            "Al venir la tentación,\n" +
            "Dame ayuda por piedad.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('78', ' CUANDO ANDEMOS CON DIOS', '1\n" +
            "Cuando andemos con Dios, escuchando su voz,\n" +
            "Nuestra senda florida será;\n" +
            "Si acatamos su ley, Él será nuestro Rey,\n" +
            "Y con Él reinaremos allá.', 'CORO:\n" +
            "O........ be........de.......cer\n" +
            "Cumple a nuestro deber;\n" +
            "Si queréis ser felices,\n" +
            "Debéis obedecer.', '2\n" +
            "Cuando Cristo murió, nuestro llanto enjugó,\n" +
            "Proclamarle debemos doquier;\n" +
            "Gozarás del amor, de tu Rey y Señor,\n" +
            "Si obediente le quieres tú ser.\n" +
            "3\n" +
            "No podremos probar sus delicias sin par,\n" +
            "Si seguimos mundano el placer;\n" +
            "Obtendremos su amor, y el divino favor,\n" +
            "Si sus leyes queremos hacer.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('79', 'MI CULPA ÉL LLEVÓ', '1\n" +
            "Cansado y triste vine al Salvador,\n" +
            "Mi culpa Él llevó, mi culpa Él llevó\n" +
            "Mi eterna dicha hallé en su amor,\n" +
            "Mi culpa Él llevó.', 'CORO:\n" +
            "Mi culpa Él llevó, mi culpa Él llevo,\n" +
            "¡Alegre siempre cantaré!\n" +
            "Al Señor gozoso alabaré,\n" +
            "Porque Él me salvó.', '2\n" +
            "Borrados todos mis pecados son,\n" +
            "Mi culpa Él llevó, mi culpa Él llevó.\n" +
            "A Él feliz elevo mi canción,\n" +
            "Mi culpa Él llevó.\n" +
            "3\n" +
            "Ya vivo libre de condenación,\n" +
            "Mi culpa Él llevó, mi culpa Él llevó.\n" +
            "Su dulce paz tengo en mi corazón,\n" +
            "Mi culpa Él llevó.\n" +
            "4\n" +
            "Si vienes hoy a Cristo, pecador,\n" +
            "Tu culpa llevará, tu culpa llevará.\n" +
            "Perdón tendrás si acudes al Señor,\n" +
            "Tu culpa llevará.\n" +
            "CORO:\n" +
            "Tu culpa llevará, tu culpa llevará,\n" +
            "Y limpiará tu corazón,\n" +
            "Y dirás feliz en tu canción:\n" +
            "“Mi culpa Él llevó”.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('80', 'LA SENDA ES ESTRECHA', '1\n" +
            "Ya no es mi vida cual antes fue,\n" +
            "Borrado el pecado está:\n" +
            "Hoy canto feliz: ¡Aleluya!\n" +
            "Y voy feliz al dulce hogar.', 'CORO:\n" +
            "La senda es muy estrecha mas la sigo,\n" +
            "La sigo, la sigo;\n" +
            "La senda es muy estrecha mas la sigo;\n" +
            "Yo la sigo por las huellas de Jesús.', '2\n" +
            "Mi vida fue cruel desilusión,\n" +
            "Ni amigo constante hallé:\n" +
            "Mas luz y muy grato consuelo\n" +
            "Hallé en mi buen Salvador.\n" +
            "3\n" +
            "Ya no más luto ni cruel pesar,\n" +
            "Cual nubes huyeron ya;\n" +
            "Al cielo yo miro gozoso,\n" +
            "Do hay gloria, gloria sin fin.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('81', 'HUBO QUIÉN POR MIS CULPAS', '1\n" +
            "Hubo quién por mis culpas muriera en la cruz\n" +
            "Aun indigno y vil como soy;\n" +
            "Soy feliz, pues su sangre vertió mi Jesús,\n" +
            "Y con ella mis culpas borró.', 'CORO:\n" +
            "Mis pecados llevó, en la cruz do murió\n" +
            "El sublime, el tierno Jesús,\n" +
            "Los desprecios sufrió, y mi alma salvó,\n" +
            "Él cambió mis tinieblas en luz.', '2\n" +
            "Él es tierno y amante, cual nadie lo fue,\n" +
            "Pues convierte al infiel corazón;\n" +
            "Y por esa paciencia y ternura yo sé\n" +
            "Que soy libre de condenación.\n" +
            "3\n" +
            "Es mi anhelo constante a Cristo seguir;\n" +
            "Mi camino su ejemplo marcó;\n" +
            "Y por darme la vida Él quiso morir.\n" +
            "En su cruz mi pecado clavó.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('82', 'EL NOMBRE DE JESÚS', '1\n" +
            "¡Tan dulce el nombre de Jesús!\n" +
            "Sus bellas notas al cantar;\n" +
            "Que mi alma llena al proclamar\n" +
            "¡El nombre de Jesús!', 'CORO:\n" +
            "Cristo ¡oh, qué dulce es!\n" +
            "Cristo, para siempre es;\n" +
            "Cristo, yo te aclamaré,\n" +
            "Por siempre, ¡oh mi Cristo!', '2\n" +
            "Adoro el nombre de Jesús;\n" +
            "Jamás me faltará su amor.\n" +
            "Y pone aparte mi dolor\n" +
            "¡El nombre de Jesús!\n" +
            "3\n" +
            "Tan puro el nombre de Jesús,\n" +
            "Que mi pesar pudo quitar,\n" +
            "Y grata paz a mi alma dar,\n" +
            "¡El nombre de Jesús!\n" +
            "4\n" +
            "El dulce nombre de Jesús\n" +
            "Por siempre quiero alabar,\n" +
            "Y todos deben ensalzar\n" +
            "¡El nombre de Jesús!\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('83', 'HE CONSAGRADO A MI JESÚS', '1\n" +
            "He consagrado a mi Jesús\n" +
            "Mi vida y mi amor;\n" +
            "Y al cargar aquí mi cruz\n" +
            "Me ayuda el Señor.', 'CORO:\n" +
            "En Jesús tengo paz, dulce paz,\n" +
            "En Jesús tengo paz, dulce paz,\n" +
            "El Espíritu mora en mí,\n" +
            "Y en mi alma hay dulce paz.', '2\n" +
            "En toda lucha tengo luz,\n" +
            "Jesús comigo está;\n" +
            "No temeré llevar la cruz;\n" +
            "Su gracia me dará.\n" +
            "3\n" +
            "Con sufrimientos mi Jesús\n" +
            "Compró mi salvación;\n" +
            "Muriendo allá en una cruz,\n" +
            "Me dio consolación.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('84', 'LAS PISADAS DEL MAESTRO', '1\n" +
            "Quiero seguir las pisadas del Maestro;\n" +
            "Quiero ir en pos de mi Rey y Señor;\n" +
            "Y modelando por Él mi carácter,\n" +
            "Canto con gozo a mi Redentor.', 'CORO:\n" +
            "¡Qué hermoso es seguir las pisadas del Maestro!\n" +
            "Siempre en la luz, cerca de Jesús;\n" +
            "¡Qué hermoso es seguir las pisadas del Maestro!\n" +
            "En su santa luz.', '2\n" +
            "Ando más cerca de Él que me guía,\n" +
            "Cuando el maligno me quiere tentar.\n" +
            "Siempre confiando en Cristo, mi fuerte,\n" +
            "Debo con gozo su nombre ensalzar.\n" +
            "3\n" +
            "Sigo sus pasos de tierno cariño,\n" +
            "Misericordia, amor y lealtad;\n" +
            "Viendo hacia Él por el don de la gracia,\n" +
            "Voy al descanso, gloriosa ciudad.\n" +
            "4\n" +
            "Quiero seguir las pisadas del Maestro;\n" +
            "Siempre hacia arriba con Él quiero andar,\n" +
            "Viendo a mi Rey en gloriosa hermosura\n" +
            "Con Él en gloria podré descansar.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('85', 'UN DÍA CRISTO VOLVERÁ', '1\n" +
            "Un día Cristo volverá,\n" +
            "Promesa fiel ¿faltar?, ¡jamás!\n" +
            "Como se fue así vendrá,\n" +
            "Y su pueblo ha de ver al Rey Jesús', 'CORO:\n" +
            "Muy pronto, sí, Jesús vendrá,\n" +
            "Y alegre le verá su pueblo;\n" +
            "¡Velad! ¡orad!, el Rey vendrá,\n" +
            "Los suyos arrebatará.', '2\n" +
            "Los mensajeros del Señor\n" +
            "Afirman que vendrá Jesús,\n" +
            "Y el buen fiel Consolador\n" +
            "Las promesas ya sacó a plena luz.\n" +
            "3\n" +
            "¡Oh gloria sin comparación\n" +
            "Será mirar a nuestro Rey!\n" +
            "Reciben todos bendición,\n" +
            "Esperando ese día, son tu grey.\n" +
            "4\n" +
            "¡Oh bienvenido Rey Jesús!\n" +
            "Tu Iglesia te espera aquí;\n" +
            "Muy pronto ha de ver tu faz,\n" +
            "Y gozar de tus laureles siempre allí.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('86', 'EN JESÚS MI SEÑOR ENCONTRÉ DULCE PAZ', '1\n" +
            "En Jesús, mi Señor, encontré dulce paz,\n" +
            "En Jesús quien por mí se entregó;\n" +
            "Si acudieres a Él este don tú tendrás,\n" +
            "Ve, que a nadie jamás rechazó.', 'CORO:\n" +
            "¡Sublime don! ¡don sin igual!\n" +
            "Solamente Él podrá conceder;\n" +
            "Es un rayo de luz de su luz celestial,\n" +
            "Que en nosotros Él quiere encender.', '2\n" +
            "En Jesús encontré inefable perdón,\n" +
            "Cuando a Él suplicante acudí;\n" +
            "En amor encendió mi falaz corazón,\n" +
            "Y por Él nueva fe recibí.\n" +
            "3\n" +
            "En Jesús nueva vida tendrás, pecador,\n" +
            "Sin tardanza dirígete a Él:\n" +
            "En tu pecho pondrá nueva fe, nuevo amor\n" +
            "Y después siempre sírvele fiel.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('87', 'DULCE CONSUELO', '1\n" +
            "En Jesucristo, mártir de paz,\n" +
            "En horas negras de tempestad\n" +
            "Hallan las almas dulce solaz,\n" +
            "Grato consuelo, felicidad.', 'CORO:\n" +
            "¡Gloria cantemos al Redentor!\n" +
            "Que por nosotros quiso morir;\n" +
            "La santa gracia del Salvador\n" +
            "Siempre dirija nuestro vivir.', '2\n" +
            "En los peligros, en el dolor,\n" +
            "A cada paso su protección;\n" +
            "Calma le infunde, santo vigor,\n" +
            "Nuevos alientos al corazón.\n" +
            "3\n" +
            "Cuando en la lucha falta la fe\n" +
            "Y el alma siente desfallecer,\n" +
            "Cristo nos dice: “Yo os colmaré\n" +
            "De rica gracia, santo poder.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('88', 'AMA EL PASTOR SUS OVEJAS', '1\n" +
            "¡Ama el Pastor sus ovejas!\n" +
            "Con un amor paternal,\n" +
            "¡Ama el Pastor su rebaño!\n" +
            "Con un amor sin igual;\n" +
            "¡Ama el Pastor a las otras\n" +
            "Que descarriadas están,\n" +
            "Y conmovido las busca\n" +
            "Por dondequiera que van!', 'CORO:\n" +
            "Por el desierto errabundas\n" +
            "Vense sufrir penas mil;\n" +
            "Y al encontrarlas, en hombros,\n" +
            "Llévalas tierno al redil.', '2\n" +
            "¡Ama el Pastor sus corderos,\n" +
            "Ámalos tierno el Pastor!\n" +
            "A los que a veces, perdidos,\n" +
            "Se oyen gemir de dolor.\n" +
            "Ved al Pastor conmovido\n" +
            "Por los collados vagar;\n" +
            "Y los corderos en hombros,\n" +
            "Vedlo llevando al hogar.\n" +
            "3\n" +
            "¡Ama las noventa y nueve,\n" +
            "Que en el aprisco guardó!\n" +
            "¡Ama las que, descarriadas,\n" +
            "Por el desierto dejó!\n" +
            "“¡Oh, mis ovejas perdidas!”\n" +
            "-Clama doliente el Pastor-\n" +
            "“¿Quiénes vendrán en mi ayuda,\n" +
            "Para salvarlas, Señor?”\n" +
            "4\n" +
            "Son delicados tus pastos\n" +
            "Y quietas tus aguas son;\n" +
            "Henos aquí, ¡oh Maestro!,\n" +
            "Danos hoy tu comisión:\n" +
            "Haznos obreros fervientes,\n" +
            "Llénanos de un santo amor,\n" +
            "Por las ovejas perdidas\n" +
            "De tu redil, buen Señor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('89', 'EL MUNDO NO ES MI HOGAR\n', '1\n" +
            "¡La senda ancha dejaré,\n" +
            "Yo quiero por la angosta andar,\n" +
            "Y muchos no sabrán por qué,\n" +
            "Mas voy a mi celeste hogar!', 'CORO:\n" +
            "IINo puede el mundo ser mi hogar,II\n" +
            "En gloria tengo mi mansión;\n" +
            "No puede el mundo ser mi hogar.', '2\n" +
            "Algunos quieren verme ir,\n" +
            "Por el sendero de maldad;\n" +
            "Oír no puedo su llamar.\n" +
            "Pues voy a mi celeste hogar.\n" +
            "3\n" +
            "¡Oh, ven conmigo, pecador,\n" +
            "Y sigue en pos del Salvador!\n" +
            "¿Por qué no quieres tú buscar,\n" +
            "La hermosa tierra más allá?\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('90', 'JESÚS ES MI AMIGO', '1\n" +
            "Jesús es mi amigo, mi buen amigo fiel,\n" +
            "A mi alma es hermoso y sin par;\n" +
            "Mi Salvador y Guía, encuentro sólo en Él\n" +
            "La virtud que trae perfecto bienestar.\n" +
            "Mis penas y mis cuitas las llevo siempre a Él\n" +
            "Porque Él me ha mandado hacerlo así; Aleluya\n" +
            "En todo este mundo no hay otro amigo tal,\n" +
            "Pues Jesús es vida y dicha para mí.', 'CORO:\n" +
            "El lirio de los valles es Cristo, mi Señor,\n" +
            "Me guarda con cariño sin igual; Aleluya.\n" +
            "Es la resplandeciente Estrella de Amor\n" +
            "Que me guía a la patria celestial.', '2\n" +
            "Alivia mis pesares mi buen amigo fiel,\n" +
            "En la tentación su amor es mi solaz,\n" +
            "Los ídolos del alma por Él apartaré\n" +
            "Y las faltas que me priven de la paz;\n" +
            "Aun cuando me dejare amigo terrenal,\n" +
            "Y Satanás tratare de triunfar; Aleluya.\n" +
            "Yo quedaré constante al lado de Jesús,\n" +
            "Y con Él podré victorias alcanzar.\n" +
            "3\n" +
            "Si cumplo sus mandatos, viviendo por la fe,\n" +
            "En mis pruebas todas Él me sostendrá,\n" +
            "Rodeado de sus brazos, yo nada temeré,\n" +
            "Con sus huestes el Señor me guardará;\n" +
            "Entonces a la gloria iré yo a contemplar,\n" +
            "Su rostro, y el cielo heredar; Aleluya\n" +
            "Y allí con los salvados y el CORO: angelical\n" +
            "Cantaré sus alabanzas sin cesar.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('91', '¡GRANDES COSAS CRISTO HA HECHO PARA MÍ!', '1\n" +
            "Hallé un buen amigo,\n" +
            "Mi amado Salvador,\n" +
            "Contaré lo que Él ha hecho para mi.\n" +
            "Hallándome perdido\n" +
            "E indigno pecador,\n" +
            "Me salvó y hoy me guarda para si.\n" +
            "Me salva del pecado,\n" +
            "Me guarda de Satán.\n" +
            "Promete estar conmigo hasta el fin;\n" +
            "¡Aleluya!\n" +
            "Él consuela mi tristeza,\n" +
            "Me quita todo afán.\n" +
            "¡Grandes cosas Cristo ha hecho para mí!', ' ', '2\n" +
            "Jesús jamás me falta,\n" +
            "Jamás me dejará,\n" +
            "Es mi fuerte y poderoso Protector;\n" +
            "Del mundo me separo,\n" +
            "Y de la vanidad,\n" +
            "Para consagrar mi vida al Señor.\n" +
            "Si el mundo me persigue,\n" +
            "Si sufro tentación,\n" +
            "Confiando en Cristo puedo resistir;\n" +
            "¡Aleluya!\n" +
            "La victoria me es segura,\n" +
            "Y elevo mi canción:\n" +
            "¡Grandes cosas Cristo ha hecho para mí!\n" +
            "3\n" +
            "Yo sé que Jesucristo\n" +
            "Muy pronto volverá,\n" +
            "Y entre tanto me prepara un hogar\n" +
            "En la casa de mi Padre.\n" +
            "Mansión de luz y paz,\n" +
            "Do el creyente fiel con Él ha de morar;\n" +
            "Llegándome a la gloria\n" +
            "Ningún pesar tendré,\n" +
            "Contemplaré su rostro siempre allí;\n" +
            "¡Aleluya!\n" +
            "Con los santos redimidos\n" +
            "Gozoso cantaré:\n" +
            "¡Grandes cosas Cristo ha hecho para mí!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('92', 'EL MEJOR AMIGO', '1\n" +
            "¡Es Jesús el mejor amigo!\n" +
            "Cuando triste o tentado estés,\n" +
            "Colmará de bendición\n" +
            "Tu transido corazón;\n" +
            "¡Es Jesús el mejor amigo!', 'CORO:\n" +
            "¡Es Jesús el mejor amigo,\n" +
            "Es Jesús el mejor amigo!\n" +
            "Él tus súplicas oirá\n" +
            "Y tu carga llevará;\n" +
            "¡Es Jesús el mejor amigo!', '2\n" +
            "En Jesús fiel amigo encuentro,\n" +
            "Paz perfecta Él a mi alma da;\n" +
            "Apoyado en Él estoy,\n" +
            "Sin temor mi ser le doy,\n" +
            "¡Es Jesús el mejor amigo!\n" +
            "3\n" +
            "Aunque ande en algún peligro,\n" +
            "O en sombra de la muerte esté,\n" +
            "Ningún mal me alcanzará,\n" +
            "Pues Jesús me amparará,\n" +
            "¡Es Jesús el mejor amigo!\n" +
            "4\n" +
            "Cuando estemos al fin reunidos\n" +
            "Con los redimidos más allá:\n" +
            "Cantaremos con fervor,\n" +
            "En presencia del Señor,\n" +
            "¡Es Jesús el mejor amigo!\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('93', 'LAS PROMESAS DE JESÚS', '1\n" +
            "Todas las promesas del Señor Jesús\n" +
            "Son apoyo poderoso de mi fe;\n" +
            "Mientras luche aquí buscando yo su luz,\n" +
            "Siempre en sus promesas confiaré.', 'CORO:\n" +
            "Grandes, fieles\n" +
            "Las promesas que el Señor Jesús ha dado;\n" +
            "Grandes, fieles,\n" +
            "En ellas para siempre confiaré.', '2\n" +
            "Todas sus promesas para el hombre fiel,\n" +
            "El Señor, en sus bondades cumplirá;\n" +
            "Y confiado sé que para siempre en Él\n" +
            "Paz eterna mi alma gozará.\n" +
            "3\n" +
            "Todas las promesas del Señor serán\n" +
            "Gozo y fuerza en nuestra vida terrenal,\n" +
            "Ellas en la dura lid nos sostendrán,\n" +
            "Y triunfar podremos sobre el mal.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('94', 'EN BUSCA DE OBREROS', '1\n" +
            "Cristo está buscando obreros hoy\n" +
            "Que quieran ir con Él,\n" +
            "¿Quién dirá: “Señor contigo voy,\n" +
            "Yo quiero serte fiel?”', 'CORO:\n" +
            "¡Oh Señor, es mucha la labor,\n" +
            "Y obreros faltan ya;\n" +
            "Danos luz, ardiente fe y valor,\n" +
            "Y obreros siempre habrá!', '2\n" +
            "Cristo quiere mensajeros hoy,\n" +
            "Que anuncien su verdad;\n" +
            "¿Quién dirá: «Señor, yo listo estoy,\n" +
            "Haré tu voluntad?»\n" +
            "3\n" +
            "Hay lugar si quieres trabajar,\n" +
            "De Cristo en la labor;\n" +
            "Puedes de su gloria al mundo hablar,\n" +
            "De su bondad y amor.\n" +
            "4\n" +
            "¿Vives ya salvado por Jesús,\n" +
            "Su amor conoces ya?\n" +
            "¡Habla pues, anuncia que en la luz\n" +
            "De Cristo vives ya!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('95', 'VALOR Y FE', '1\n" +
            "Si en tu senda las nubes\n" +
            "Agolparse ves,\n" +
            "No vaciles por ello,\n" +
            "Ni flaqueen tus pies;\n" +
            "Cada nube que venga\n" +
            "No podrá traer\n" +
            "Más que pruebas que pasan\n" +
            "Si hay valor y fe.', 'CORO:\n" +
            "¡Si hay valor y fe, si hay valor y fe,\n" +
            "En la más oscura noche\n" +
            "Siempre hay luz!\n" +
            "¡Si hay valor y fe, si hay valor y fe;\n" +
            "Gozo y paz traerá la lucha\n" +
            "Si hay valor y fe!', '2\n" +
            "Si es tu vida una carga\n" +
            "De cuidados mil,\n" +
            "Olvidado de todo\n" +
            "Te podrás sentir:\n" +
            "Si tu ayuda acudieres\n" +
            "A llevar doquier,\n" +
            "Esto endulza la vida\n" +
            "Si hay valor y fe.\n" +
            "3\n" +
            "Pon en alto los ojos\n" +
            "Sin dudar jamás,\n" +
            "Que en las lides del mundo\n" +
            "Vencedor saldrás;\n" +
            "Que si hay flores y encantos\n" +
            "Tras invierno cruel,\n" +
            "Trae encantos la vida\n" +
            "Si hay valor y fe.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('96', 'ME LEVANTÓ', '1\n" +
            "Mi Salvador, en su bondad,\n" +
            "Al mundo malo descendió;\n" +
            "Y de hondo abismo de maldad\n" +
            "Él mi alma levantó.', 'CORO:\n" +
            "¡Seguridad me dio Jesús,\n" +
            "Cuando su mano me tendió,\n" +
            "Estando en sombra a plena luz,\n" +
            "En su bondad me levantó!', '2\n" +
            "Su voz constante resistí,\n" +
            "Aunque Él, amante, me llamó;\n" +
            "Mas su palabra recibí,\n" +
            "Y fiel me levantó.\n" +
            "3\n" +
            "Tortura cruel sufrió por mí,\n" +
            "Cuando la cruz Él escaló;\n" +
            "Tan sólo así salvado fui,\n" +
            "Y así me levantó.\n" +
            "4\n" +
            "Que soy feliz, yo bien lo sé,\n" +
            "Con esta vida que Él me dio:\n" +
            "Mas no comprendo aún por qué,\n" +
            "Jesús me levantó.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('97', 'ESTAD POR CRISTO FIRMES', '1\n" +
            "¡Estad por Cristo firmes,\n" +
            "Soldados de la cruz!\n" +
            "Alzad hoy la bandera\n" +
            "En nombre de Jesús.\n" +
            "Es vuestra la victoria,\n" +
            "Con Él por Capitán;\n" +
            "Por Él serán vencidas\n" +
            "Las huestes de Satán.', ' ', '2\n" +
            "¡Estad por Cristo firmes!\n" +
            "Os llama a la lid,\n" +
            "¡Con Él, pues, a la lucha,\n" +
            "Soldados todos, id!\n" +
            "Probad que sois valientes,\n" +
            "Luchando contra el mal;\n" +
            "Es fuerte el enemigo\n" +
            "Mas Cristo es sin igual.\n" +
            "3\n" +
            "¡Estad por Cristo firmes!\n" +
            "Las fuerzas son de Él;\n" +
            "El brazo de los hombres\n" +
            "Es débil y es infiel;\n" +
            "Vestíos la armadura,\n" +
            "Velad en oración;\n" +
            "Deberes y peligros\n" +
            "Demandan gran tesón.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('98', 'LA LUZ DE DIOS', '1\n" +
            "Si al cruel enemigo temes combatir,\n" +
            "Si la duda agobia siempre tu existir;\n" +
            "¡Que la hermosa luz de Dios fulgure en ti!\n" +
            "Y serás feliz así.', 'CORO:\n" +
            "¡Deja penetrar la luz!\n" +
            "¡Deja penetrar la luz!\n" +
            "¡Que la hermosa luz de Dios fulgure en ti!\n" +
            "Y serás feliz así.', '2\n" +
            "Si tu fe en Jesús muy flaca y débil es,\n" +
            "Si Dios no contesta tu ferviente prez;\n" +
            "¡Que la hermosa luz de Dios fulgure en ti!\n" +
            "Y serás feliz así.\n" +
            "3\n" +
            "Si feliz el cielo anhelas alcanzar,\n" +
            "Y del mar y las tinieblas escapar;\n" +
            "¡Que la hermosa luz de Dios fulgure en ti!\n" +
            "Y serás feliz así.\n" +
            "4\n" +
            "Si anduviéremos en luz, divina luz,\n" +
            "Limpios nos hará la sangre de Jesús;\n" +
            "Claridad tendremos en el corazón;\n" +
            "Si vivimos en la luz.\n" +
            "5\n" +
            "Si el Espíritu de Dios, Consolador,\n" +
            "Luz del cielo, trae divino resplandor;\n" +
            "Cuando tenga entrada Él en tu corazón,\n" +
            "Él será tu eterna luz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('99', 'TÚ AMARÁS A CRISTO', '1\n" +
            "Tú que vagas en las tinieblas,\n" +
            "Lejos de Cristo y de su amor;\n" +
            "Ven y ve cuán amante es Cristo,\n" +
            "Ven, contempla a tu Salvador.', 'CORO:\n" +
            "¡Oh cuánto tú amarás a Cristo,\n" +
            "Al mirar la gloria del Señor!\n" +
            "Su corazón fue quebrantado\n" +
            "En la cruz, por ti, por mí.', '2\n" +
            "Ven, acepta perdón completo,\n" +
            "La paz y gozo del Salvador.\n" +
            "Alma triste, Jesús te llama,\n" +
            "Él te espera con grande amor.\n" +
            "3\n" +
            "Este amor tan sublime y tierno,\n" +
            "Y tan profundo en su plenitud,\n" +
            "Brota libre del pecho herido,\n" +
            "De Jesús, quien nos da salud.\n" +
            "4\n" +
            "Y por siglos interminables,\n" +
            "Han de quedar en el corazón\n" +
            "Sus mercedes inescrutables,\n" +
            "Que nos brindan su bendición.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('100', 'SIEMPRE ORAD', '1\n" +
            "“Siempre orad”, muy pronto viene Cristo,\n" +
            "Guarda bien tu corazón;\n" +
            "Retén firme todo lo que tienes,\n" +
            "Tú tendrás tu galardón.', 'CORO:,\n" +
            "“Siempre orad...” nos manda Cristo,\n" +
            "Y velad... en oración;\n" +
            "Pronto vendrá... Él en las nubes,\n" +
            "Nos dará su bendición.', '2\n" +
            "“Siempre orad”, que si hoy viniere Cristo\n" +
            "Él te halle en la lid,\n" +
            "Con la espada suya bien empleada,\n" +
            "Fiel por nuestro Adalid.\n" +
            "3\n" +
            "“Siempre orad”, sí vive aquí velando,\n" +
            "Es mandato del Señor;\n" +
            "Sin demora toma la promesa\n" +
            "Del gran fiel Consolador.\n" +
            "4\n" +
            "“Siempre orad”, constante y con celo,\n" +
            "Ejercítate en la fe;\n" +
            "Ten el ánimo de Jesucristo,\n" +
            "Y sus huellas sigue fiel.')");

    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('101', 'LA FUENTE SANADORA', '1\n" +
            "¡Ved la fuente sanadora,\n" +
            "La que abrió el Salvador!\n" +
            "Cuyas aguas refrescantes\n" +
            "Son de perennal valor.', 'CORO:.\n" +
            "¡Oh preciosa fuente sanadora!\n" +
            "Para todos fluye libre;\n" +
            "¡Oh preciosa fuente sanadora!\n" +
            "¡Gloria a Dios! me sana a mí.', '2\n" +
            "En la fuente que nos sana\n" +
            "He hallado el perdón,\n" +
            "Y lavado toda mancha\n" +
            "De mi pobre corazón.\n" +
            "3\n" +
            "En la fuente que nos sana\n" +
            "Cristo ofrece la salud;\n" +
            "Pues venid, enfermos todos,\n" +
            "Probaréis su gran virtud.\n" +
            "4\n" +
            "Esta fuente que nos sana\n" +
            "Aún hoy día es eficaz;\n" +
            "Ven, sumérgete en ella,\n" +
            "Cree, y sano quedarás.\n')");

    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('102', 'QUIERO VER MI PATRIA', '1\n" +
            "Quiero ver a Jesucristo mi precioso Salvador,\n" +
            "Quiero ver el alto cielo, ver el trono del Señor;\n" +
            "Ver la faz de mi Maestro, quien por mí sufrió la cruz,\n" +
            "Viviré en esa patria de eterno gozo y luz.', 'CORO:\n" +
            "Quiero ver ...... aquella tierra,\n" +
            "Donde rei ....... na eterno amor,\n" +
            "Quiero estar ... en las moradas\n" +
            "De Jesús ........ mi Salvador.', '2\n" +
            "Quiero dar a Jesucristo sin reserva mi amor;\n" +
            "Quiero ser un mensajero conduciendo al pecador\n" +
            "A la cruz de Jesucristo y a la patria celestial,\n" +
            "Do podrá vivir por siempre con el coro angelical.\n" +
            "3\n" +
            "Por la obra redentora de Jesus mi Salvador,\n" +
            "Vivire por las edades do podré gozar su amor,\n" +
            "Por la sangre del Cordero aunque indigno sé que soy,\n" +
            "Con las huestes redimidas loores al Señor yo doy.\n" +
            "\n" +
            "\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('103', 'VIENE OTRA VEZ', '1\n" +
            "Cantan los ángeles con dulce voz,\n" +
            "Canten los hombres con sonora voz;\n" +
            "Cristo vendrá nuestro Rey vencedor,\n" +
            "Cristo vendrá otra vez.', 'CORO:\n" +
            "¡Viene otra vez, viene otra vez,\n" +
            "En gloria viene al mundo otra vez,\n" +
            "Viene otra vez, viene otra vez,\n" +
            "Él viene pronto a reinar!', '2\n" +
            "Ved en la tierra, los aires y el mar\n" +
            "Grandes señales cumpliéndose ya,\n" +
            "Todo indicando que pronto vendr\n" +
            "Nuestro glorioso Señor.\n" +
            "3\n" +
            "Todos los muertos en Cristo saldrán\n" +
            "De sus sepulcros, y alegres irán,\n" +
            "Para encontrar a su Rey subirán;\n" +
            "Cristo vendrá otra vez.\n" +
            "4\n" +
            "Ven en las nubes, ¡oh buen Salvador!\n" +
            "¡Ven a la tierra, te ruego, Señor!\n" +
            "¡Ven que tu Iglesia te espera, Jesús!\n" +
            "Cristo vendrá otra vez.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('104', 'CUANDO TE QUIERO MÁS', '1\n" +
            "Cuando te quiero cerca tú estás,\n" +
            "Mi buen Jesús, no me dejarás;\n" +
            "Con tu potencia me sostendrás,\n" +
            "Cuando te quiero más.', 'CORO:\n" +
            "II Cuando te quiero más,II\n" +
            "Cerca tú estás, mi buen Salvador,\n" +
            "Cuando te quiero más.', '2\n" +
            "Cuando te quiero listo tú estás,\n" +
            "Y abandonarme nunca podrás\n" +
            "Paz por tristeza siempre me das,\n" +
            "Cuando te quiero más.\n" +
            "3\n" +
            "Cuando te quiero no faltarás,\n" +
            "Hora tras hora tú me guiarás;\n" +
            "Tiernos cuidados tú me darás,\n" +
            "Cuando te quiero más.\n" +
            "4\n" +
            "Cuando te quiero allí tú estás,\n" +
            "Con tu presencia me apoyarás;\n" +
            "Brota tu fuente de gran solaz,\n" +
            "Cuando te quiero más.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('105', 'ME BUSCA A MÍ', '1\n" +
            "El Rey de gloria al cielo dejó,\n" +
            "Pobre, humilde al mundo llegó;\n" +
            "Dolor y muerte de cruz Él sufrió,\n" +
            "Me busca a mí, a mí.', 'CORO:\n" +
            "II Me busca a mí, a mí,II\n" +
            "Maravilloso es su gran amor;\n" +
            "Me busca a mí, a mí.', '3\n" +
            "El Rey de gloria, el buen Salvador,\n" +
            "Llama al cansado que sigue el error;\n" +
            "Busca al perdido y con ansias de amor,\n" +
            "Me llama a mí, a mí." +
            "4\n" +
            "El Rey de gloria en gran resplandor,\n" +
            "Al mundo viene con gloria y honor;\n" +
            "Yo volaré de la tierra al Señor:\n" +
            "Viene por mí, por mí." +
            "')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('106', 'LAS BUENAS NUEVAS', '1\n" +
            "Ve, ve oh Sión, tu gran destino cumple:\n" +
            "Que Dios es luz, al mundo proclamad,\n" +
            "Que el Hacedor de las naciones quiere\n" +
            "Que nadie muera en densa oscuridad.', 'CORO:\n" +
            "¡Alegres nuevas al mundo dad!\n" +
            "Nuevas de redención, de amor y libertad', '2\n" +
            "Ve cuántos miles yacen todavía\n" +
            "En las oscuras cárceles del mal;\n" +
            "Ignoran que de Cristo la agonía\n" +
            "Fue para darles vida celestial.\n" +
            "3\n" +
            "Es tu deber que salves de la muerte\n" +
            "Las almas por las cuales Él murió;\n" +
            "Sé fiel, si no tendrás que ser culpable\n" +
            "De que se pierda lo que Dios ganó.\n" +
            "4\n" +
            "Ve, di a toda tribu, pueblo y lengua.\n" +
            "Que el Dios en quien vivimos es amor\n" +
            "Que en la tierra ha muerto porque tenga\n" +
            "Todo mortal la vida en el Señor.\n" +
            "5\n" +
            "Tus hijos manda con el gran mensaje\n" +
            "Con tu dinero impulso a ellos da\n" +
            "En oración sustenta fiel sus almas.\n" +
            "Y cuanto gastes Cristo pagará.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('107', 'FUENTE DE LA VIDA ETERNA', '1\n" +
            "Fuente de la vida eterna\n" +
            "Y de toda bendición;\n" +
            "Ensalzar tu gracia tierna\n" +
            "Debe cada corazón;\n" +
            "Tu piedad inagotable,\n" +
            "Abundante en perdonar;\n" +
            "Único ser adorable,\n" +
            "Gloria a ti debemos dar.', ' ', '2\n" +
            "De los cánticos celestes\n" +
            "Te quisiéramos cantar,\n" +
            "Entonados por las huestes\n" +
            "Que lograste rescatar;\n" +
            "Almas que a buscar viniste,\n" +
            "Porque les tuviste amor;\n" +
            "De ellas te compadeciste\n" +
            "Con tiernísimo favor.\n" +
            "3\n" +
            "Toma nuestros corazones,\n" +
            "Llénalos de tu verdad,\n" +
            "De tu Espíritu los dones,\n" +
            "Y de toda santidad.\n" +
            "Guíanos en obediencia,\n" +
            "Humildad, amor y fe;\n" +
            "Nos ampare tu clemencia;\n" +
            "Salvador, propicio sé.\n" +
            "\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('108', 'BAUTÍCESE CADA UNO', '1\n" +
            "En las aguas de la muerte\n" +
            "Sumergido fue Jesús,\n" +
            "Mas su amor no fue apagado\n" +
            "Por sus penas en la cruz,\n" +
            "Levantóse de la tumba,\n" +
            "Sus cadenas quebrantó,\n" +
            "Y triunfante y victorioso\n" +
            "A los cielos ascendió.', ' ', 'En las aguas del bautismo\n" +
            "Hoy confieso yo mi fe:\n" +
            "Jesucristo me ha salvado\n" +
            "Y en su amor me gozaré.\n" +
            "En las aguas humillantes\n" +
            "A Jesús siguiendo estoy.\n" +
            "Desde ahora para el mundo\n" +
            "Y el pecado muerto soy.\n" +
            "3\n" +
            "Yo que estoy crucificado,\n" +
            "¿Cómo más podré pecar?\n" +
            "Ya que soy resucitado,\n" +
            "Santa vida he de llevar,\n" +
            "Son las aguas del bautismo\n" +
            "Mi señal de salvación,\n" +
            "Y yo quiero consagrarme\n" +
            "Al que obró mi redención.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('109', 'BIENAVENTURADOS LOS DE LIMPIO CORAZÓN', '1\n" +
            "Bienaventurados son los de limpio corazón,\n" +
            "Que no aman el tesoro de aquí.\n" +
            "De tranquilidad y paz gozan cada día más,\n" +
            "Y del cielo el gozo tienen ya en sí', 'CORO:\n" +
            "¡Oh, cantemos aleluya!\n" +
            "Sí, de todo corazón;\n" +
            "Por amor al Salvador, a su nombre dad loor,\n" +
            "Y por siempre cantaremos de su amor.', '2\n" +
            "Grande dicha y favor me concede mi Señor,\n" +
            "Por su sangre derramada en la cruz;\n" +
            "Soy guardado siempre fiel por la fe que tengo en Él,\n" +
            "Y me regocijo andando en la luz.\n" +
            "3\n" +
            "Al Señor obedecer y su Espíritu tener,\n" +
            "Es un verdadero cielo en mi ser;\n" +
            "Y por su inmenso amor hacia el pobre pecador,\n" +
            "Cantaré sus alabanzas más allá.\n" +
            "4\n" +
            "¡Cuán perfecta es mi paz!, no anhelo nada más\n" +
            "En el mundo que su luz y su verdad;\n" +
            "Con mi amado Salvador, poseído de su amor,\n" +
            "Estaré contento por la eternidad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('110', 'CON VOZ BENIGNA', '1\n" +
            "Con voz benigna te llama Jesús,\n" +
            "Invitación de puro amor;\n" +
            "¿Por qué le dejas en vano llamar?\n" +
            "¿Sordo serás, pecador?', 'CORO:\n" +
            "Hoy te convida, hoy te convida,\n" +
            "Voz bendecida,\n" +
            "Benigna convídate hoy.', '2\n" +
            "A los cansados convida Jesús;\n" +
            "Con compasión mira el dolor;\n" +
            "Tráele tu carga, te bendecirá,\n" +
            "Te ayudará, el Señor.\n" +
            "3\n" +
            "Siempre aguardando contempla a Jesús.\n" +
            "¡Tanto esperar!, ¡con tanto amor!\n" +
            "Hasta sus plantas ven, mísero, y trae\n" +
            "Tu tentación, tu dolor.')");

    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('111', 'ÉL CUIDARÁ DE MÍ', '1\n" +
            "¿Cómo podré estar triste,\n" +
            "Cómo entre sombras ir;\n" +
            "Cómo sentirme sólo\n" +
            "Y en el dolor vivir\n" +
            "Si Cristo es mi consuelo,\n" +
            "Mi amigo siempre fiel,\n" +
            "IISi aún las aves tienen,\n" +
            "Seguro asilo en Él?II', 'CORO:\n" +
            "Feliz cantando alegre,\n" +
            "Yo vivo siempre aquí.\n" +
            "Si Él cuida de las aves,\n" +
            "¡Cuidará también de mí!', '2\n" +
            "«Nunca te desalientes»,\n" +
            "Oigo al Señor decir,\n" +
            "Y en su Palabra fiado,\n" +
            "Hago al dolor huir.\n" +
            "A Cristo paso a paso\n" +
            "Yo sigo sin cesar,\n" +
            "II Y todas sus bondades\n" +
            "Me da sin limitar.II\n" +
            "3\n" +
            "Siempre que soy tentado\n" +
            "O que en la sombra estoy,\n" +
            "Más cerca de Él camino\n" +
            "Y protegido voy;\n" +
            "Si en mí la fe desmaya\n" +
            "Y caigo en la ansiedad,\n" +
            "II ¡Tan sólo Él me levanta,\n" +
            "Me da seguridad! II\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('112', ' NO LO HAY', '1\n" +
            "No hay cual Jesús otro fiel amigo,\n" +
            "No lo hay, no lo hay;\n" +
            "Otro que pueda salvar las almas,\n" +
            "No lo hay, no lo hay.', 'CORO:\n" +
            "Conoce todas nuestras luchas,\n" +
            "Y sólo Él nos sostendrá;\n" +
            "No hay cual Jesús otro fiel amigo,\n" +
            "No lo hay, no lo hay.', '2\n" +
            "No hay otro amigo tan santo y digno,\n" +
            "No lo hay, no lo hay;\n" +
            "Pero a la vez es humilde y tierno;\n" +
            "Otro no hay cual Jesús.\n" +
            "3\n" +
            "No hay un instante que nos olvide,\n" +
            "No lo hay, no lo hay;\n" +
            "Ni hay noche oscura que no nos cuide,\n" +
            "No la hay, no la hay.\n" +
            "4\n" +
            "¿Cuándo es infiel el Pastor divino?\n" +
            "Ni una vez, ni una vez;\n" +
            "¿Cuándo rechaza a los pecadores?\n" +
            "Ni una vez, ni una vez.\n" +
            "5\n" +
            "¿Hay otra dádiva como Cristo?\n" +
            "No la hay, no la hay;\n" +
            "Ha prometido Él estar conmigo,\n" +
            "Hasta el fin, hasta el fin')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('113', 'HAY UN MUNDO FELIZ MÁS ALLÁ', '1\n" +
            "Hay un mundo feliz más allá,\n" +
            "Donde moran los santos en luz,\n" +
            "Tributando eterno loor\n" +
            "Al invicto, glorioso Jesús.', 'CORO:\n" +
            "II¡En el mundo feliz\n" +
            "Reinaremos con nuestro Señor!II', '2\n" +
            "Cantaremos con gozo a Jesús,\n" +
            "Al Cordero que nos rescató;\n" +
            "Y con sangre vertida en la cruz\n" +
            "Los pecados del mundo quitó.\n" +
            "3\n" +
            "Para siempre en el mundo feliz\n" +
            "Con los santos daremos loor\n" +
            "Al invicto glorioso Jesús;\n" +
            "A Jesús, nuestro Rey y Señor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('114', 'PECADOR, VEN AL DULCE JESÚS', '1\n" +
            "Pecador, ven al dulce Jesús,\n" +
            "Y feliz para siempre serás:\n" +
            "Si en verdad le quisieres tener,\n" +
            "Al divino Señor hallarás.', 'CORO:\n" +
            "II Ven a Él, ven a Él,\n" +
            "Que te espera tu buen Salvador.II', '2\n" +
            "Si cual hijo que necio pecó\n" +
            "Vas buscando a sus pies compasión,\n" +
            "Tierno Padre en Jesús hallarás,\n" +
            "Y tendrás en sus brazos perdón.\n" +
            "3\n" +
            "Si enfermo te sientes morir,\n" +
            "Él será tu Doctor celestial;\n" +
            "Y hallarás en su sangre también\n" +
            "Medicina que cure tu mal.\n" +
            "4\n" +
            "Ovejuela que huyó del redil,\n" +
            "¡He aquí tu benigno Señor!\n" +
            "Y en los hombros llevada serás\n" +
            "De tan dulce y amante Pastor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('115', 'OH AMOR QUE NO ME DEJARÁS!', '1\n" +
            "¡Oh amor que no me dejarás!\n" +
            "Descansa mi alma siempre en ti;\n" +
            "Es tuya y tú la guardarás,\n" +
            "Y en el océano de tu amor\n" +
            "Más rica al fin será.', ' ', '2\n" +
            "¡Oh luz que en mi sendero vas,\n" +
            "Mi antorcha débil rindo a ti;\n" +
            "Su luz apaga el corazón,\n" +
            "Seguro de encontrar en ti\n" +
            "Más bello resplandor!\n" +
            "3\n" +
            "¡Oh gozo que a buscarme a mí\n" +
            "Viniste con mortal dolor:\n" +
            "Tras la tormenta el arco vi,\n" +
            "Y ya el mañana, yo lo sé,\n" +
            "Sin lágrimas será!\n" +
            "4\n" +
            "¡Oh cruz que miro sin cesar!\n" +
            "Mi orgullo, gloria y vanidad\n" +
            "Al polvo dejo por hallar\n" +
            "La vida que en su sangre dio\n" +
            "Jesús mi Salvador.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('116', 'VOZ DE GRATITUD', '1\n" +
            "La gloria de Cristo el Señor cantaré,\n" +
            "Pues llena mi vida de gozo y de paz;\n" +
            "Callar los favores que de Él alcancé,\n" +
            "Mi labio no puede jamás.', 'CORO:\n" +
            "Es todo bondad para mí,\n" +
            "Con Él nada puedo desear;\n" +
            "Pues todos mis altos deseos aquí\n" +
            "Tan sólo Él los puede llenar.', '2\n" +
            "En horas de angustia conmigo Él está,\n" +
            "Y puedo escuchar su dulcísima voz,\n" +
            "Que me habla, y su paz inefable me da\n" +
            "La paz infinita de Dios.\n" +
            "3\n" +
            "Si a rudos conflictos me mira que voy,\n" +
            "Me deja hasta el fin a mí solo luchar;\n" +
            "Mas pronto si ve que cediendo ya estoy,\n" +
            "Socorro me viene a prestar.\n" +
            "4\n" +
            "También cuando gozo lo miro llegar,\n" +
            "Y entonces mi dicha la aumenta el Señor;\n" +
            "Ya llena mi copa, la veo rebosar,\n" +
            "Con todos sus dones de amor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('117', 'JESÚS ES TODO PARA MÍ', '1\n" +
            "Cristo el Señor es para mí\n" +
            "Consuelo, dicha y paz.\n" +
            "En Él tan sólo encuentro yo\n" +
            "Descanso, amor, solaz.\n" +
            "Si en mis tristezas voy a Él\n" +
            "II Hallo un amigo siempre fiel,II\n" +
            "En Jesús.', ' ', '2\n" +
            "En mis conflictos con el mal\n" +
            "No hay uno cual Jesús\n" +
            "Que pueda darme protección\n" +
            "Sostén, poder y luz.\n" +
            "Yendo conmigo el Salvador\n" +
            "II Ya nada puede el tentador II\n" +
            "Contra mí.\n" +
            "3\n" +
            "Vida de Paz, de gozo y luz\n" +
            "Encuentro en mi Señor.\n" +
            "Herencia eterna que me da\n" +
            "Su incomparable amor.\n" +
            "Nada en el mundo igualará\n" +
            "IIA lo que en Cristo encontraráII\n" +
            "El mortal.\n" +
            "4\n" +
            "Gloria sin fin tributaré\n" +
            "Gozoso a mi Jesús,\n" +
            "Quien vida tal me aseguró\n" +
            "Muriendo en cruenta cruz;\n" +
            "Y por los siglos mi canción\n" +
            "II Ensalzará su salvación,II\n" +
            "Sin igual.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('118', 'CRISTO, EL REY DE LA GLORIA', '1\n" +
            "Ved al Cristo, Rey de gloria,\n" +
            "Es del mundo el vencedor;\n" +
            "De la guerra vuelve invicto,\n" +
            "Todos démosle loor.', 'CORO:\n" +
            "Coronadle, santos todos,\n" +
            "Coronadle, Rey de reyes;\n" +
            "Coronadle, santos todos,\n" +
            "Coronad al Salvador', '2\n" +
            "Exaltado, sí, exaltado,\n" +
            "Ricos triunfos trae Jesús;\n" +
            "Entronadle allá en los cielos,\n" +
            "En la refulgente luz.\n" +
            "3\n" +
            "Si los malos se burlaron\n" +
            "Coronando al Salvador,\n" +
            "Hoy los ángeles y santos\n" +
            "Lo proclaman su Señor.\n" +
            "4\n" +
            "Escuchad sus alabanzas,\n" +
            "Que se elevan hacia Él;\n" +
            "Victorioso reina el Cristo,\n" +
            "¡Adorad a Emmanuel!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('119', ' SANTO ESPÍRITU, DESCIENDE', '1\n" +
            "Santo Espíritu, desciende\n" +
            "A mi pobre corazón;\n" +
            "Llénalo de tu presencia\n" +
            "Y haz en Él tu habitación.', 'CORO:\n" +
            "¡Llena hoy, llena hoy,\n" +
            "Llena hoy mi corazón!\n" +
            "¡Santo Espíritu, desciende\n" +
            "Y haz en mi tu habitación!', '2\n" +
            "De tu gracia puedes darme,\n" +
            "Inundando el corazón;\n" +
            "Ven, que mucho necesito,\n" +
            "Dame hoy tu bendición.\n" +
            "3\n" +
            "Débil soy, oh sí, muy débil,\n" +
            "Y a tus pies postrado estoy,\n" +
            "Esperando que tu gracia\n" +
            "Con poder me llene hoy.\n" +
            "4\n" +
            "Dame paz, consuelo y gozo,\n" +
            "Cúbreme hoy en tu perdón;\n" +
            "Tú confortas y redimes,\n" +
            "Tú das grande salvación.\n" +
            "5\n" +
            "Santo Espíritu, tú eres\n" +
            "Ese prometido don,\n" +
            "Mucho anhelo recibirte,\n" +
            "Dame hoy tu santa unción.\n" +
            "6\n" +
            "Ven, bautízame ahora,\n" +
            "Obediente espero aquí;\n" +
            "Ven a ser mi eterno guía,\n" +
            "Haz tu voluntad en mí.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('120', ' CARA A CARA', '1\n" +
            "En presencia estar de Cristo,\n" +
            "Ver su rostro, ¿Qué será?\n" +
            "Cuando al fin en pleno gozo\n" +
            "Mi alma le contemplará.\n', 'CORO:\n" +
            "¡Cara a cara espero verle,\n" +
            "Más allá del cielo azul:\n" +
            "Cara a cara en plena gloria\n" +
            "He de ver a mi Jesús!\n', '2\n" +
            "Sólo tras oscuro velo\n" +
            "Hoy lo puedo aquí mirar:\n" +
            "Más ya pronto viene el día\n" +
            "Que su gloria ha de mostrar.\n" +
            "3\n" +
            "¡Cuánto gozo habrá con Cristo\n" +
            "Cuando no haya más dolor;\n" +
            "Cuando cesen los peligros\n" +
            "Y ya estemos en su amor!\n" +
            "4\n" +
            "Cara a cara, ¡cuán glorioso\n" +
            "Ha de ser así vivir,\n" +
            "Ver el rostro de quien quiso\n" +
            "Nuestras almas redimir!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('121', ' HAY UN LUGAR DO QUIERO ESTAR', '1\n" +
            "Hay un lugar do quiero estar,\n" +
            "Muy cerca de mi Redentor,\n" +
            "Allí podré yo descansar,\n" +
            "Al fiel amparo de su amor.', 'CORO:\n" +
            "Muy cerca de mi Redentor\n" +
            "Seguro asilo encontraré,\n" +
            "Me guardará del tentador\n" +
            "Y ya de nada temeré.', '2\n" +
            "Quitarme el mundo no podrá\n" +
            "La paz que halló mi corazón;\n" +
            "Jesús amante me dará\n" +
            "La más segura protección.\n" +
            "3\n" +
            "Ni dudas ni temor tendré\n" +
            "Estando cerca de Jesús;\n" +
            "Rodeado siempre me veré\n" +
            "Con los fulgores de su luz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('122', 'LA PALABRA HOY\n" +
            "SEMBRADA', '1\n" +
            "La palabra hoy sembrada\n" +
            "Hazla, Cristo, en mí nacer,\n" +
            "Para darle crecimiento\n" +
            "Sólo tienes tú poder.\n" +
            "IIRicos frutos tú nos puedes conceder.II', ' ', '2\n" +
            "La semilla que tu siervo\n" +
            "Ha sembrado con saber,\n" +
            "No permitas que las aves\n" +
            "Se la vengan a comer.\n" +
            "IIRicos frutos tú nos puedes conceder.II\n" +
            "3\n" +
            "Haz que crezca con tu gracia\n" +
            "Y tu rica bendición;\n" +
            "No la ahoguen las espinas\n" +
            "De congojas y aflicción.\n" +
            "IIRicos frutos tú nos puedes conceder.II\n" +
            "4\n" +
            "Que su efecto muy profundo,\n" +
            "En la mente y corazón,\n" +
            "Llevará consigo al mundo\n" +
            "Que le das la salvación.\n" +
            "IIRicos frutos tú nos puedes conceder.II\n" +
            "5\n" +
            "Sembraremos la palabra,\n" +
            "Con amor y profusión,\n" +
            "Esperando la cosecha\n" +
            "En la célica mansión.\n" +
            "IIRicos frutos tú nos puedes conceder.II\n" +
            "\n" +
            "\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('123', ' MEDITAD', '1\n" +
            "Meditad en que hay un hogar,\n" +
            "En la margen del río de luz,\n" +
            "Donde van para siempre a gozar\n" +
            "Los creyentes en Cristo Jesús.', 'CORO:\n" +
            "Más allá, más allá,\n" +
            "Meditad en que hay un hogar,\n" +
            "Más allá, más allá, más allá,\n" +
            "En la margen del río de luz.', '2\n" +
            "Meditad en que amigos tenéis,\n" +
            "De los cuales marchamos en pos,\n" +
            "Y pensad en que al fin los veréis\n" +
            "En el alto palacio de Dios." +
            "3\n" +
            "En que mora Jesús meditad,\n" +
            "Donde seres que amamos están,\n" +
            "Y a la patria bendita volad,\n" +
            "Sin angustias, temores ni afán" +
            "4\n" +
            "Reunido a los míos seré,\n" +
            "Mi carrera a su fin toca ya;\n" +
            "Y en mi hogar celestial entraré,\n" +
            "Do mi alma reposo tendrá.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('124', 'JESÚS, YO HE PROMETIDO', '1\n" +
            "Jesús, yo he prometido\n" +
            "Servirte con amor;\n" +
            "Concédeme tu gracia,\n" +
            "Mi amigo y Salvador.\n" +
            "No temeré la lucha\n" +
            "Si tú a mi lado estás,\n" +
            "Ni perderé el camino\n" +
            "Si tú guiando vas.', ' ', '2\n" +
            "El mundo está muy cerca\n" +
            "Y abunda en tentación;\n" +
            "Suave es el engaño\n" +
            "Y es necia la pasión;\n" +
            "Ven tú, Jesús, más cerca,\n" +
            "Mostrando tu piedad,\n" +
            "Y escuda al alma mía\n" +
            "De toda iniquidad.\n" +
            "3\n" +
            "Cuando mi mente vague,\n" +
            "Ya incierta, ya veloz,\n" +
            "Concédeme que escuche,\n" +
            "Jesús, tu clara voz.\n" +
            "Anímame si paro,\n" +
            "lnspírame también;\n" +
            "Repréndeme si temo\n" +
            "En todo hacer el bien.\n" +
            "4\n" +
            "Jesús, tú has prometido,\n" +
            "A todo aquel que va\n" +
            "Siguiendo tus pisadas,\n" +
            "Que al cielo llegará;\n" +
            "Sostenme en el camino,\n" +
            "Y al fin, con dulce amor,\n" +
            "Trasládame a tu gloria,\n" +
            "Mi amigo y Salvador.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('125', ' DESPLIEGUE EL CRISTIANO', '1\n" +
            "Despliegue el cristiano su santa bandera\n" +
            "Y muéstrela ufano del mundo a la faz,\n" +
            "¡Soldados valientes!, el triunfo os espera,\n" +
            "Seguid vuestra lucha constante y tenaz.', 'CORO:\n" +
            "Cristo nos guía, es nuestro Jefe,\n" +
            "Y con nosotros siempre estará;\n" +
            "Nada temamos, Él nos alienta,\n" +
            "Y a la victoria llevarnos podrá.', '2\n" +
            "Despliegue el cristiano su santa bandera,\n" +
            "Domine baluartes y almenas a mil;\n" +
            "La Biblia bendita conquiste doquiera,\n" +
            "Y ante ella se incline la turba gentil.\n" +
            "3\n" +
            "Despliegue el cristiano su santa bandera\n" +
            "Y luzca en el frente de audaz torreón,\n" +
            "El monte y la villa, la hermosa pradera,\n" +
            "Contemplen ondeando tan bello pendón.\n" +
            "4\n" +
            "Despliegue el cristiano su santa bandera,\n" +
            "Predique a los pueblos el Libro inmortal;\n" +
            "Presente a los hombres la luz verdadera\n" +
            "Que vierte ese claro, luciente fanal.\n" +
            "5\n" +
            "Despliegue el cristiano su santa bandera,\n" +
            "Y muéstrese bravo batiéndose fiel,\n" +
            "Para Él no habrá fosos, para Él no hay barrera.\n" +
            "Que lucha a su lado el divino Emmanuel.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('126', '¡OH CRISTO MÍO!', '1\n" +
            "¡Oh! Cristo mío, eres tú mi amigo fiel,\n" +
            "Seguro amparo sólo en ti tendré;\n" +
            "En mis aflicciones, buen Jesús, iré a ti\n" +
            "Y consuelo y dicha me darás, ¡oh, sí!', 'CORO:\n" +
            "Cristo, ven más cerca;\n" +
            "Paz perfecta en mi alma pon,\n" +
            "Cerca, sí, más cerca, de mi corazón.', '2\n" +
            "Cuando en la noche vea yo estrellas mil,\n" +
            "Tu voz hermosa pueda mi alma oír;\n" +
            "Haz que yo medite en tu tierno y dulce amor,\n" +
            "Y que yo te alabe lleno de fervor.\n" +
            "3\n" +
            "Cuando ésta vida tenga yo que abandonar,\n" +
            "CORO:na hermosa tú me ceñirás,\n" +
            "Y con dulce canto tu bondad alabaré\n" +
            "Y en mansión de gloria siempre moraré.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('127', 'NO TE DÉ TEMOR HABLAR POR CRISTO', '1\n" +
            "¡No te dé temor hablar por Cristo!\n" +
            "Haz que brille en ti su luz;\n" +
            "Al que te salvó confiesa siempre,\n" +
            "Todo debes a Jesús.', 'CORO:\n" +
            "¡No te dé temor, no te dé temor,\n" +
            "Nunca, nunca, nunca,\n" +
            "Es tu amante Salvador,\n" +
            "Nunca, pues, te dé temor!', '2\n" +
            "¡No te dé temor hacer por Cristo\n" +
            "Cuanto de tu parte está!\n" +
            "Obra con amor, con fe y constancia,\n" +
            "Tus trabajos premiará.\n" +
            "3\n" +
            "¡No te dé temor sufrir por Cristo\n" +
            "Los reproches o el dolor!\n" +
            "Sufre con amor tus pruebas todas,\n" +
            "Cual sufrió tu Salvador.\n" +
            "4\n" +
            "¡No te dé temor vivir por Cristo\n" +
            "Esa vida que te da!\n" +
            "Si tan sólo en Él por siempre fiares,\n" +
            "Él con bien te sacará.\n" +
            "5\n" +
            "¡No te dé temor morir por Cristo!\n" +
            "Vía, verdad y vida es Él;\n" +
            "Él te llevará con su ternura\n" +
            "A su célico vergel.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('128', 'MI ESPÍRITU, ALMA Y CUERPO', '1\n" +
            "Mi espíritu, alma y cuerpo,\n" +
            "Mi ser, mi vida entera,\n" +
            "Cual viva, santa ofrenda,\n" +
            "Entrego a ti, mi Dios.', 'CORO:\n" +
            "Mi todo a Dios consagro,\n" +
            "En Cristo, el vivo altar;\n" +
            "¡Descienda el fuego santo,\n" +
            "Su sello celestial!', '2\n" +
            "Soy tuyo, Jesucristo,\n" +
            "Comprado con tu sangre;\n" +
            "Contigo haz que ande\n" +
            "En plena comunión.\n" +
            "3\n" +
            "Espíritu Divino,\n" +
            "Del Padre la promesa;\n" +
            "Sedienta, mi alma anhela\n" +
            "De ti la santa unción.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('129', '¡TRABAJAD, TRABAJAD!', '1\n" +
            "¡Trabajad! ¡Trabajad! Somos siervos de Dios,\n" +
            "Seguiremos la senda que el Maestro trazó;\n" +
            "Renovando las fuerzas con bienes que da,\n" +
            "El deber que nos toca cumplido será.', 'CORO:\n" +
            "¡Trabajad! ¡Trabajad!\n" +
            "¡Esperad, y velad!\n" +
            "¡Confiad! ¡Siempre orad!\n" +
            "¡Que el Maestro pronto volverá!', '2\n" +
            "¡Trabajad! ¡Trabajad! Hay que dar de comer\n" +
            "Al que pan de la vida quisiere tener;\n" +
            "Hay enfermos que irán a los pies del Señor\n" +
            "Al saber que de balde los sana su amor.\n" +
            "3\n" +
            "¡Trabajad! ¡Trabajad! Fortaleza pedid,\n" +
            "El reinado del mal con valor combatid;\n" +
            "Conducid los cautivos al Libertador\n" +
            "Y decid que de balde redime su amor.\n" +
            "\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('130', 'LAS SANTAS ESCRITURAS', '1\n" +
            "Padre, tu palabra es\n" +
            "Mi delicia y mi solaz;\n" +
            "Guíe siempre aquí mis pies\n" +
            "Y a mi pecho traiga paz.', 'CORO:\n" +
            "Es tu ley Señor,\n" +
            "Faro celestial\n" +
            "Que, en perenne resplandor,\n" +
            "Norte y guía da al mortal.', '2\n" +
            "Sí, obediente oí tu voz;\n" +
            "En tu gracia fuerza hallé\n" +
            "Y con firme pie y veloz\n" +
            "Por tus sendas caminé.\n" +
            "3\n" +
            "Tu verdad es mi sostén,\n" +
            "Contra duda y tentación,\n" +
            "Y destila calma y bien\n" +
            "Cuando asalta la aflicción.\n" +
            "4\n" +
            "Son tus dichos para mí\n" +
            "Prendas fieles de salud;\n" +
            "Dame, pues, que te oiga a ti\n" +
            "Con filial solicitud.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('131', ' ¡GLORIA A TI, JESÚS DIVINO!', '1\n" +
            "¡Gloria a ti, Jesús Divino!\n" +
            "¡Gloria a ti por tus bondades!\n" +
            "¡Gloria eterna a tus piedades!\n" +
            "Querido Salvador.', 'CORO:\n" +
            "¡Gloria, gloria, aleluya!\n" +
            "¡Gloria, gloria, aleluya!\n" +
            "¡Gloria, gloria, aleluya!\n" +
            "A nuestro Salvador.', '2\n" +
            "Tú me amaste con ternura,\n" +
            "Y por mí en la cruz moriste,\n" +
            "Con ternura me quisiste,\n" +
            "Querido Salvador.\n" +
            "3\n" +
            "Tengo fe sólo en tu muerte,\n" +
            "Pues con ella me salvaste;\n" +
            "Vida eterna me compraste,\n" +
            "Querido Salvador.\n" +
            "4\n" +
            "Te veremos en el cielo,\n" +
            "A vivir contigo iremos;\n" +
            "Tu presencia gozaremos,\n" +
            "Querido Salvador.\n" +
            "5\n" +
            "Ten valor, valor cristiano,\n" +
            "Cristo es tu mejor amigo,\n" +
            "Él te llevará consigo;\n" +
            "Jesús es tu Señor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('132', 'CANTA, ¡OH BUEN\n" +
            "CRISTIANO!', '1\n" +
            "¡Canta, oh buen cristiano!\n" +
            "Dulce será cantar,\n" +
            "Hace el camino llano,\n" +
            "Libra el pesar.\n" +
            "Canta en las noches tristes,\n" +
            "Canta en el sol y en luz;\n" +
            "El mal así resistes,\n" +
            "Canta de Jesús.', ' ', '2\n" +
            "¡Canta, oh buen cristiano!\n" +
            "Templa tu corazón;\n" +
            "Alza a tu Soberano\n" +
            "Tu feliz canción.\n" +
            "Siempre está lleno el mundo\n" +
            "De endechas y dolor;\n" +
            "Canta el amor profundo\n" +
            "De tu Salvador.\n" +
            "3\n" +
            "¡Canta, oh buen cristiano!\n" +
            "Dios tu socorro es,\n" +
            "Él sostendrá tu mano\n" +
            "Hasta la vejez.\n" +
            "¿Sabes que al diablo invitas\n" +
            "Cuando medroso estás?\n" +
            "Dios quitará tus cuitas\n" +
            "Si cantando vas.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('133', 'EN JESÚS, MI SALVADOR', '1\n" +
            "Lejos de mi Padre Dios,\n" +
            "Por Jesús fui hallado;\n" +
            "Por su gracia y por su amor.\n" +
            "Sólo fui salvado.', 'CORO:\n" +
            "¡En Jesús, mi Señor,\n" +
            "Sea mi gloria eterna!\n" +
            "El me amó y me salvó,\n" +
            "En su gracia tierna.', '2\n" +
            "En Jesús, mi Salvador,\n" +
            "Pongo mi confianza;\n" +
            "Toda mi necesidad\n" +
            "Suple en abundancia.\n" +
            "3\n" +
            "Cerca de mi buen Pastor\n" +
            "Vivo cada día;\n" +
            "Toda gracia en su Señor\n" +
            "Halla el alma mía.\n" +
            "4\n" +
            "¡Guárdame, Señor Jesús,\n" +
            "Para que no caiga!\n" +
            "Como un sarmiento en la vid,\n" +
            "Vida de ti traiga.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('134', ' ¡OH, BONDAD TAN INFINITA!', '1\n" +
            "¡Oh bondad tan infinita\n" +
            "Hacia el mundo pecador!\n" +
            "Dios en Cristo revelando\n" +
            "Su eternal y santo amor.', 'CORO:\n" +
            "¡Es Jesús para mí\n" +
            "La esperanza de salud;\n" +
            "Sólo en Él hallaré\n" +
            "La divina plenitud!', '2\n" +
            "Como el vasto firmamento,\n" +
            "Como el insondable mar\n" +
            "Es la gracia salvadora\n" +
            "Que Jesús al alma da.\n" +
            "3\n" +
            "Aunque fueren tus pecados\n" +
            "Rojos como el carmesí,\n" +
            "En el río del Calvario\n" +
            "Hay limpieza para ti.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('135', 'PRESENTIMOS DEL MUNDO DICHOSO', '1\n" +
            "Presentimos del mundo dichoso\n" +
            "Los placeres que Dios nos dará;\n" +
            "El país lo creemos hermoso,\n" +
            "Mas hallarnos allí ¿qué será?', 'CORO:\n" +
            "¿Qué será? ¿Qué será?\n" +
            "Mas hallarnos allí ¿qué será?\n" +
            "¿Qué será? ¿Qué será?\n" +
            "Mas hallarnos allí ¿qué será?', '2\n" +
            "Esperamos el gozo, la gloria,\n" +
            "La grandeza sin fin que tendrá\n" +
            "El mortal que ganó la victoria,\n" +
            "Mas hallarnos allí ¿qué será?\n" +
            "3\n" +
            "Anhelamos el día esplendente\n" +
            "Que en el santo país brillará\n" +
            "Por Jesús el Cordero inocente,\n" +
            "Mas hallarnos allí ¿qué será?\n" +
            "4\n" +
            "Bien sabemos que llanto, ni duelo,\n" +
            "Ni pecados, ni males habrá\n" +
            "En la casa de Dios en el cielo,\n" +
            "Mas hallarnos allí ¿qué será?')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('136', 'YO GUIARÉ', '1\n" +
            "Yo guiaré al peregrino extraviado,\n" +
            "Bondadoso hasta el pie de la cruz;\n" +
            "Yo diré al corazón angustiado.\n" +
            "Hallarás tu consuelo en Jesús.', 'CORO:\n" +
            "Yo guiaré, yo guiaré,\n" +
            "Al sediento de vida y de luz;\n" +
            "Yo guiaré, yo guiaré,\n" +
            "Al perdido a los pies de Jesús.', '2\n" +
            "Yo diré al que buscare la calma,\n" +
            "Que se llegue al amante Jesús;\n" +
            "Yo diré con placer a aquella alma.\n" +
            "¡Que te inunden sus ondas de luz!\n" +
            "3\n" +
            "Al que vague buscando una fuente\n" +
            "Do apagar de su sed el ardor;\n" +
            "Lo guiaré con amor diligente\n" +
            "A Jesús, la gran fuente de amor.\n" +
            "4\n" +
            "Al cansado que busque reposo,\n" +
            "Sin hallarlo en su duro penar,\n" +
            "Le diré que reciba al bondadoso:\n" +
            "«Ven a mí, yo te haré descansar.»')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('137', 'BELLAS PALABRAS DE VIDA', '1\n" +
            "¡Oh, cantádmelas otra vez!\n" +
            "Bellas palabras de vida;\n" +
            "Hallo en ellas mi gozo y luz,\n" +
            "Bellas palabras de vida;\n" +
            "Sí, de luz y vida;\n" +
            "Son sostén y guía:\n" +
            "II¡Qué bellas son, qué bellas son!\n" +
            "bellas palabras de vida.II', ' ', '1\n" +
            "¡Oh, cantádmelas otra vez!\n" +
            "Bellas palabras de vida;\n" +
            "Hallo en ellas mi gozo y luz,\n" +
            "Bellas palabras de vida;\n" +
            "Sí, de luz y vida;\n" +
            "Son sostén y guía:\n" +
            "II¡Qué bellas son, qué bellas son!\n" +
            "bellas palabras de vida.II')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('138', 'YO ESPERO LA MAÑANA', '1\n" +
            "Yo espero la mañana\n" +
            "De aquel día sin igual,\n" +
            "De donde la dicha emana\n" +
            "Y do el gozo es eternal.', 'CORO:\n" +
            "Esperando, esperando\n" +
            "Otra vida sin dolor,\n" +
            "Do me den la bienvenida\n" +
            "De Jesús, mi Salvador.', '2\n" +
            "Yo espero la victoria,\n" +
            "De la muerte al fin triunfar,\n" +
            "Recibir la eterna gloria\n" +
            "Y mis sienes coronar.\n" +
            "3\n" +
            "Yo espero ir al cielo\n" +
            "Donde reina eterno amor,\n" +
            "Peregrino soy, y anhelo\n" +
            "Las moradas del Señor.\n" +
            "4\n" +
            "Pronto espero unir mi canto\n" +
            "Al triunfante y celestial,\n" +
            "Y poder cambiar mi llanto\n" +
            "Por un canto angelical.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('139', '¡OH JÓVENES VENID!', '1\n" +
            "¡Oh jóvenes, venid, su brillante pabellón\n" +
            "Cristo ha desplegado ante la nación;\n" +
            "A todos en sus filas os quiere recibir;\n" +
            "Y con Él a la pelea os hará salir!', 'CORO:\n" +
            "¡Vamos a Jesús, alistados sin temor;\n" +
            "Vamos a la lid, inflamados de valor!\n" +
            "Jóvenes, luchemos todos contra el mal,\n" +
            "En Jesús llevamos nuestro General.', '2\n" +
            "¡Oh jóvenes, venid, el Caudillo Salvador\n" +
            "Quiere recibiros en su derredor;\n" +
            "Con Él a la batalla salid sin vacilar,\n" +
            "Vamos pronto, compañeros, vamos a luchar!\n" +
            "3\n" +
            "Las armas invencibles del Jefe guiador\n" +
            "Son el evangelio y su grande amor;\n" +
            "Con ellas revestidos y llenos de poder,\n" +
            "Compañeros, acudamos, vamos a vencer.\n" +
            "4\n" +
            "Los fieros enemigos, engendros de Satán,\n" +
            "Se hallan sostenidos por su capitán;\n" +
            "¡Oh jóvenes, vosotros poneos sin temor\n" +
            "A la diestra del Caudillo, nuestro Salvador!\n" +
            "5\n" +
            "Quien venga a la pelea, su voz escuchará;\n" +
            "Cristo la victoria le concederá;\n" +
            "¡Salgamos, compañeros, luchemos bien por Él,\n" +
            "Con Jesús conquistaremos inmortal laurel!\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('140', 'NÍTIDO RAYO POR CRISTO', '1\n" +
            "Nítido rayo por Cristo\n" +
            "Yo quiero siempre ser;\n" +
            "En todo quiero agradarle\n" +
            "Y hacerlo con placer.', 'CORO:\n" +
            "Un nítido rayo,\n" +
            "Nítido rayo por Cristo;\n" +
            "Un nítido rayo,\n" +
            "Nítido rayo seré.', '2\n" +
            "A Cristo quiero llegarme\n" +
            "En mi temprana edad;\n" +
            "Por siempre quiero amarle\n" +
            "Y hacer su voluntad.\n" +
            "3\n" +
            "Nítido rayo en tinieblas\n" +
            "Deseo resplandecer;\n" +
            "Almas perdidas a Cristo\n" +
            "Anhelo conducir.\n" +
            "4\n" +
            "Una mansión en el cielo\n" +
            "Fue Cristo a preparar,\n" +
            "Que el niño tierno y amante\n" +
            "En ella pueda entrar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('141', 'LA LUCHA SIGUE', '1\n" +
            "Luchando estáis; aún suena la trompeta hoy\n" +
            "Llamando a los soldados a la lid;\n" +
            "A Jesucristo con valor decid: «Yo voy»;\n" +
            "Y Él os dirá: «¡Venid, oh sí, venid!»', 'CORO:\n" +
            "La lucha sigue, oh cristianos,\n" +
            "Y brazo a brazo lucharéis;\n" +
            "En Jesucristo seguid confiando\n" +
            "Y por la fe en Él venceréis;\n" +
            "La lucha sigue, oh cristianos,\n" +
            "Sed fieles y en Jesús confiad;\n" +
            "La lucha siempre seguid, hermanos,\n" +
            "Y la victoria esperad.', '2\n" +
            "Luchando estáis, soldados del Señor Jesús,\n" +
            "Luchando estáis en contra de Satán;\n" +
            "Es Jesucristo nuestra fortaleza y luz,\n" +
            "Y Él también es nuestro Capitán.\n" +
            "3\n" +
            "Luchando estáis; confiados en Jesús marchad,\n" +
            "Haciendo huir al enemigo vil,\n" +
            "Y Jesucristo nuestro Jefe, amante y fiel,\n" +
            "Sostén será de todos en la lid.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('142', 'LA SANTA CENA', '1\n" +
            "Santa Cena, para mí\n" +
            "Eres memorial aquí;\n" +
            "Tú me enseñas con verdad\n" +
            "El misterio de bondad;\n" +
            "Me recuerdas de la cruz,\n" +
            "Del Cordero, mi Jesús.', ' ', '2\n" +
            "Tú elevas nuestro ser\n" +
            "Al angélico placer;\n" +
            "Tipificas con señal\n" +
            "La crucifixión pascual.\n" +
            "Comulguemos al tomar\n" +
            "De Jesús y su penar.\n" +
            "3\n" +
            "Participe el corazón\n" +
            "De tu conmemoración;\n" +
            "Nos recuerdas el partir\n" +
            "De Jesús y su venir;\n" +
            "Eres tú nuestra señal\n" +
            "De su pacto divinal.\n" +
            "4\n" +
            "Como sello del amor\n" +
            "Del divino Redentor,\n" +
            "Volveremos a tomar,\n" +
            "Y con Cristo disfrutar,\n" +
            "De la cena del Señor,\n" +
            "Prenda fiel del viador.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('143', 'DIOS BENDIGA LAS ALMAS UNIDAS', '1\n" +
            "Dios bendiga las almas unidas\n" +
            "Por los lazos de amor sacrosanto,\n" +
            "Y las guarde de todo quebranto\n" +
            "En el mundo de espinas erial.\n" +
            "Que el hogar que a formarse comienza,\n" +
            "Con la unión de estos dos corazones,\n" +
            "Goce siempre de mil bendiciones\n" +
            "Al amparo del Dios de Israel.', ' ', '2\n" +
            "Que el Señor, con su dulce presencia,\n" +
            "Cariñoso estas bodas presida\n" +
            "Y conduzca por sendas de vida\n" +
            "A los que hoy se han jurado lealtad.\n" +
            "Les recuerde que nada en el mundo\n" +
            "Es eterno, que todo termina,\n" +
            "Y por tanto, con gracia divina,\n" +
            "Cifrar deben la dicha en su Dios.\n" +
            "3\n" +
            "Que los dos que al altar se aproximan\n" +
            "A jurarse su fe mutuamente,\n" +
            "Busquen siempre de Dios en la fuente\n" +
            "El secreto de dicha inmortal.\n" +
            "Y si acaso de duelo y tristeza\n" +
            "Se empañasen sus sendas un día,\n" +
            "En Jesús hallarán dulce guía\n" +
            "Que otra senda les muestre mejor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('144', ' ALLÍ LA PUERTA FRANCA ESTÁ', '1\n" +
            "Allí la puerta franca está,\n" +
            "Su luz es refulgente;\n" +
            "La cruz sea vista más allá,\n" +
            "Señal de amor ferviente.', 'CORO:\n" +
            "¡Oh, cuánto me ama Dios a mí!\n" +
            "La puerta franca está por mí;\n" +
            "¿Por mí?; por mí.\n" +
            "Bien franca está por mi.', '2\n" +
            "Y los que buscan salvación\n" +
            "La entrada libre tienen;\n" +
            "No hay pobre, rico ni nación\n" +
            "A cuantos a ella vienen.\n" +
            "3\n" +
            "Pasado el río, más allá,\n" +
            "En la feraz pradera,\n" +
            "El premio de la cruz está;\n" +
            "¡Eterna primavera!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('145', 'A LA BATALLA Y A LA VICTORIA', '1\n" +
            "¡A la batalla y a la victoria!\n" +
            "Vamos con Dios nuestro Rey,\n" +
            "Que con su brazo fuerte y robusto\n" +
            "Siempre defiende su grey.\n" +
            "Pues sin temor avancemos\n" +
            "Entusiasmados por fe,\n" +
            "Mientras alegres cantemos\n" +
            "Gloria a Dios nuestro Rey.', 'CORO:\n" +
            "No es la victoria de los ligeros,\n" +
            "No de los fuertes la paz;\n" +
            "Mas de los fieles en Cristo\n" +
            "Es el eterno solaz.', '2\n" +
            "¡A la batalla y a la victoria!\n" +
            "¿Quién será este buen Rey?\n" +
            "¿Cuáles las tropas que así lo siguen\n" +
            "En esta lucha de fe?\n" +
            "Es Jehová el Valiente\n" +
            "De los señores Señor,\n" +
            "Acompañado por todos\n" +
            "Los que aprecian su amor.\n" +
            "3\n" +
            "¡A la batalla y a la victoria!\n" +
            "Bajo tan buen General!\n" +
            "Derrotaremos, ya enseguida,\n" +
            "Todas las fuerzas del mal.\n" +
            "Reinos y tropas, aún mundos,\n" +
            "Todos al fin pasarán,\n" +
            "Mas los amados en Cristo\n" +
            "Vida eterna tendrán.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('146', 'VENID TODOS A LA LID', '1\n" +
            "Venid, ¡oh!, venid todos a la lid;\n" +
            "Marchad, sí, marchad tras el Señor;\n" +
            "Valor, sí, valor, firmes sin temor,\n" +
            "Vamos a vencer al tentador.', 'CORO:\n" +
            "¡Adelante!, ¡Oh soldados todos!\n" +
            "Estad firmes, todos con valor;\n" +
            "¡Adelante!, sí, gritando todos:\n" +
            "«¡La victoria es del Salvador!»', '2\n" +
            "Firmes siempre estad, en Dios sólo fiad,\n" +
            "Su pendón alzad, hoy por la fe;\n" +
            "Vamos a vencer, no hay que temer.\n" +
            "¡Viva Jesuscristo nuestro Rey!\n" +
            "3\n" +
            "Por el Rey Jesús, huestes de la luz,\n" +
            "Alzad hoy la cruz, y venceréis;\n" +
            "Pelead con tesón en la oración,\n" +
            "Galardón de Dios recibiréis.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('147', 'HAY MUCHOS QUE VIVEN EN DENSAS TINIEBLAS', '1\n" +
            "Hay muchos que viven en densas tinieblas\n" +
            "Por falta del buen Salvador;\n" +
            "Mas hoy mensajeros proclaman sus glorias\n" +
            "Y brilla doquier su fulgor.', 'CORO:\n" +
            "El reino ya viene, decid la historia,\n" +
            "El reino del buen Redentor;\n" +
            "Y todo el globo cubierto de gloria\n" +
            "La paz gozará del Señor.', '2\n" +
            "Avanzan veloces las huestes celestes,\n" +
            "Avanzan con fe y valor;\n" +
            "Conquistan do quiera en nombre de Cristo,\n" +
            "«Pro Cristo» es su gran clamor.\n" +
            "3\n" +
            "Con cantos y gritos y júbilo santo\n" +
            "A Cristo veremos allá;\n" +
            "Le coronaremos cual Rey Soberano,\n" +
            "Él siempre nos gobernará.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('148', 'NO HAY MÁS QUE UNO', '1\n" +
            "En el mundo no hay más que uno\n" +
            "Que puede las almas salvar;\n" +
            "Es Cristo que en el Calvario\n" +
            "Su vida en la cruz entregó.\n" +
            "Él es nuestra paz, nuestra vida;\n" +
            "La senda tan sólo es Él,\n" +
            "Que nos puede llevar a la gloria,\n" +
            "La patria feliz del mortal.', 'CORO:\n" +
            "En el mundo no hay más que uno\n" +
            "Que pue ........ de salvar,\n" +
            "Es Jesús, el camino glorioso,\n" +
            "El hijo amado de Dios.', '2\n" +
            "Es Jesús el camino glorioso\n" +
            "Que lleva las almas a Dios,\n" +
            "Y el que seguirlo desea,\n" +
            "Paz, gozo y luz hallará.\n" +
            "La senda de vida es angosta,\n" +
            "Muy pocos la hallan aquí.\n" +
            "Mas feliz es aquel que la sigue,\n" +
            "Perdón, vida eterna tendrá.\n" +
            "3\n" +
            "En el mundo no hay más que uno\n" +
            "Que puede las vidas cambiar,\n" +
            "La sangre de Cristo bien puede\n" +
            "Las manchas del alma borrar.\n" +
            "La roca de siglos es Cristo,\n" +
            "El gran Fundamento es Él,\n" +
            "De la Iglesia Él es la Cabeza.\n" +
            "La fuente de toda verdad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('149', ' ¡GLORIA A MI JESÚS!', '1\n" +
            "Por mí sufrió el Salvador,\n" +
            "¡Gloria, gloria a mi Jesús!\n" +
            "Load conmigo al Redentor.\n" +
            "¡Gloria, gloria a mi Jesús!', 'CORO:\n" +
            "¡Jesús, Jesús el Salvador!\n" +
            "Es dulce el nombre del Señor,\n" +
            "Él me rodea con santo amor,\n" +
            "¡Gloria, gloria a mi Jesús!', '2\n" +
            "Con mis maldades Él cargó,\n" +
            "¡Gloria, gloria a mi Jesús!\n" +
            "Y en la cruz me rescató,\n" +
            "¡Gloria, gloria a mi Jesús!\n" +
            "3\n" +
            "Yo sé que perdonado estoy,\n" +
            "¡Gloria, gloria a mi Jesús!\n" +
            "Y con certeza al cielo voy,\n" +
            "¡Gloria, gloria a mi Jesús!\n" +
            "4\n" +
            "Y al concluir la lucha acá.\n" +
            "¡Gloria, gloria a mi Jesús!\n" +
            "A mejor patria iré a cantar,\n" +
            "¡Gloria, gloria a mi Jesús!\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('150', ' CUANDO ESTEMOS EN GLORIA', '1\n" +
            "Cantad del amor de Cristo,\n" +
            "Ensalzad al Redentor;\n" +
            "Tributadle, santos todos,\n" +
            "Grande gloria y loor.', 'CORO:\n" +
            "Cuando estemos en gloria,\n" +
            "En presencia de nuestro Redentor,\n" +
            "¡A una voz la historia\n" +
            "Diremos del gran Vencedor!', '2\n" +
            "La victoria es segura\n" +
            "A las huestes del Señor;\n" +
            "¡Oh, pelead con la mirada\n" +
            "Puesta en nuestro Protector!\n" +
            "3\n" +
            "El pendón alzad, cristianos,\n" +
            "De la cruz, y caminad,\n" +
            "De triunfo en triunfo\n" +
            "Siempre firmes avanzad.\n" +
            "4\n" +
            "Adelante en la lucha,\n" +
            "¡Oh soldados de la fe!\n" +
            "Nuestro el triunfo, ¡oh, escuchad!\n" +
            "Los clamores: ¡Viva el Rey!" +
            "')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('151', 'TEMPLOS DE DIOS SOIS', '1\n" +
            "Templos de Dios sois,\n" +
            "Así está escrito:\n" +
            "Templos de su Espíritu de verdad.\n" +
            "¿A Él le es dada\n" +
            "Libre entrada?\n" +
            "¿Franca es la puerta de tu voluntad?', 'CORO:\n" +
            "Deja entrar...\n" +
            "Para morar...\n" +
            "Al Santo Espíritu.\n" +
            "Él ha venido\n" +
            "Pacto cumplido,\n" +
            "Bendito Espíritu de Dios.', '2\n" +
            "El que perdona\n" +
            "Quiere limpiarte;\n" +
            "Toda la escoria de tu alma quitar;\n" +
            "Purificado,\n" +
            "Muerto al pecado,\n" +
            "El Santo Espíritu podrá entrar.\n" +
            "3\n" +
            "¡Oh! peregrino,\n" +
            "En el desierto,\n" +
            "Entra en la tierra de leche y miel;\n" +
            "Santificado,\n" +
            "De Dios llenado,\n" +
            "Guiado serás por su Espíritu fiel.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('152', 'POR GRACIA ME SOSTENDRÁ', '1\n" +
            "Si estoy desalentado, con penas y temor.\n" +
            "Con cuitas oprimido, en pruebas y en dolor,\n" +
            "Entonces Cristo dice, mis pruebas al mirar,\n" +
            "Que su sostén y ayuda jamás me faltarán.', 'CORO:\n" +
            "Por gracia Jesús me sostendrá\n" +
            "Y nunca me faltará;\n" +
            "Si en sombras yo voy y triste estoy,\n" +
            "Su gracia me sostendrá.', '2\n" +
            "Cuando en la dura prueba conmigo el mundo es cruel,\n" +
            "Cuando en la ruda lucha no hallo un amigo fiel,\n" +
            "Entonces llega a mi alma un eco celestial,\n" +
            "Es el Señor que dice que ayuda me dará.\n" +
            "3\n" +
            "Cuando en mis aflicciones no puedo resistir,\n" +
            "Cuando a las tentaciones voy casi a sucumbir,\n" +
            "Entonces su socorro el Salvador me da,\n" +
            "Y Él ha prometido conmigo siempre estar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('153', 'GUARDA EL CONTACTO', '1\n" +
            "¿Quieres sobre el mundo ser un vencedor?\n" +
            "¿Quieres tú cantar aún cuando hay dolor?\n" +
            "¿Quieres ser alegre cual fiel luchador?\n" +
            "Guarda el contacto con el Salvador.', 'CORO:\n" +
            "Guarda el contacto con el Salvador,\n" +
            "Luego las tinieblas no te cubrirán;\n" +
            "Por la senda alegre tú caminarás,\n" +
            "A causa del contacto con el Salvador.', '2\n" +
            "En el mundo hay muchos, tristes en pecar,\n" +
            "Cuyos corazones lloran de pesar;\n" +
            "Dales el mensaje, no hay que callar,\n" +
            "Con Dios el contacto debes de guardar.\n" +
            "3\n" +
            "¿Quieres tú con Dios la comunión tener?\n" +
            "¿Y su gloria siempre en ti permanecer?\n" +
            "¿Que el mundo a Cristo pueda en ti hoy ver?\n" +
            "Guarda el contacto con el Supremo Ser.\n" +
            "4\n" +
            "Deja que el Espíritu implante en ti\n" +
            "La humildad de Cristo y su santo amor;\n" +
            "Ora siempre y vela, que Jesús vendrá;\n" +
            "Guarda el contacto con el Salvador.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('154', 'MÁS ALLÁ EL DÍA VIENE', '1\n" +
            "Más allá ........ el día viene\n" +
            "En que luchas ........ ya no habrá;\n" +
            "Los afanes ........ y cuidados\n" +
            "De este mundo ........ cesarán.', 'CORO:\n" +
            "Más allá ........ no habrá más llanto,\n" +
            "Sino notas ........de loor;\n" +
            "Más allá........ un día alegre\n" +
            "Que por siempre ........ ha de durar.', '2\n" +
            "¿Qué será ........ estar con Cristo?\n" +
            "Escuchar ........ su dulce voz;\n" +
            "Ver su rostro ........ tan brillante\n" +
            "Y andar ........ de Él en pos.\n" +
            "3\n" +
            "Con Jesús ...... por guía siempre\n" +
            "El camino ........ seguiré,\n" +
            "Con confianza ........ plena y dulce\n" +
            "Que al cielo........ llegaré.\n" +
            "4\n" +
            "Listo estoy ........ por pura gracia\n" +
            "A escuchar ........ su voz de amor,\n" +
            "Que me llama ........ a su lado\n" +
            "A vivir ........ en su fulgor.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('155', ' A LA LUCHA', '1\n" +
            "Ya las huestes se aprestan para la batalla,\n" +
            "Es Jesús el Capitán que a todos nos guiará,\n" +
            "Y con Él a la cabeza no hay que vacilar,\n" +
            "De seguro al triunfo nos llevará.', 'CORO:\n" +
            "Yo quiero estar con Cristo en lo rudo de la lid,\n" +
            "Yo quiero siempre listo, valiente, combatir\n" +
            "Hasta que en gloria pueda verle, mi carrera al terminar;\n" +
            "Y vida eterna con Él gozar.', '2\n" +
            "Las legiones de Jesús, de triunfo en triunfo avanzan,\n" +
            "¿No las ves con qué valor combaten contra el mal?\n" +
            "¿Puedes tú quedar dormido o indiferente\n" +
            "Cuando otros luchan sin descansar?\n" +
            "3\n" +
            "Date prisa, no vaciles, Él te necesita;\n" +
            "Si amas a Jesús, también a otros amarás,\n" +
            "Y si andan en las sendas de la iniquidad,\n" +
            "A los pies de Cristo los llevarás.\n" +
            "4\n" +
            "Es la mies muy grande y los obreros son muy pocos;\n" +
            "Desde hoy mi Salvador hallarme Él podrá\n" +
            "Trabajando en su mies en busca de las almas\n" +
            "Y con su poder Él me sostendrá.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('156', 'AMOROSO SALVADOR', '1\n" +
            "Amoroso Salvador,\n" +
            "Sin igual es tu bondad,\n" +
            "Eres tú mi mediador,\n" +
            "Mi perfecta santidad.', ' ', '2\n" +
            "Mi contrito corazón\n" +
            "Te confiesa su maldad;\n" +
            "Pide al Padre mi perdón\n" +
            "Por tu santa caridad.\n" +
            "3\n" +
            "Te contemplo sin cesar\n" +
            "En tu trono desde aquí;\n" +
            "¡Oh! cuán grato es meditar\n" +
            "Que intercedes tú por mí.\n" +
            "4\n" +
            "¡Fuente tú de compasión!\n" +
            "Siempre a ti te doy loor;\n" +
            "Siendo grato al corazón\n" +
            "Ensalzarte, ¡mi Señor!\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('157', 'LA GRACIA', '1\n" +
            "La gracia de Dios revelada\n" +
            "En Cristo Jesús, mi Señor,\n" +
            "Al mundo perdido presenta\n" +
            "De Dios su infinito favor.', 'CORO:\n" +
            "Gracia, gracia, me basta la gracia de Dios-Jesús;\n" +
            "Gracia, gracia, yo miro su gracia en Jesús.', '2\n" +
            "La gracia de Dios es más dulce\n" +
            "Que cosas terrestres aquí;\n" +
            "En su voluntad es mi goce,\n" +
            "En pruebas, su gracia en mí.\n" +
            "3\n" +
            "Más alta que cosa celeste,\n" +
            "Más hondo que profundo mar\n" +
            "La fuente perenne de balde\n" +
            "Ya fluye, la debes probar.\n" +
            "4\n" +
            "¡Oh, ven gusta hoy de su gracia!\n" +
            "Sí, ven, pronto tú la tendrás;\n" +
            "No hay fin de su eficacia,\n" +
            "En ella tú descansarás.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('158', 'HAY UN CANTO NUEVO EN MI SER', '1\n" +
            "Hay un canto nuevo en mi ser,\n" +
            "Es la voz de mi Jesús,\n" +
            "Que me dice: «Ven a descansar,\n" +
            "Tu paz conquisté en la cruz.»', 'CORO:\n" +
            "Cristo, Cristo, Cristo,\n" +
            "Nombre sin igual;\n" +
            "Llena siempre mi alma\n" +
            "De esa nota celestial.', '2\n" +
            "Náufrago en pecado me encontré,\n" +
            "Sin paz en mi corazón;\n" +
            "Mas en Cristo mi Señor hallé\n" +
            "Dulce paz y protección.\n" +
            "3\n" +
            "Tengo de su gracia celestial,\n" +
            "Bajo sus alas de amor,\n" +
            "Riquezas que fluyen a raudal\n" +
            "Desde el trono del Señor.\n" +
            "4\n" +
            "Por las aguas hondas me llevó\n" +
            "Pruebas en mi senda hallé,\n" +
            "Por áspero sendero me guió;\n" +
            "Mas sus huellas seguiré.\n" +
            "5\n" +
            "Cristo en las nubes volverá,\n" +
            "Bajo el bello cielo azul,\n" +
            "Él entonces mi alma llevará\n" +
            "A vivir en gloria y luz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('159', 'COMPRADO CON SANGRE\n" +
            "POR CRISTO', '1\n" +
            "Comprado con sangre por Cristo,\n" +
            "Con gozo al cielo yo voy;\n" +
            "Librado por gracia infinita,\n" +
            "Ya sé que su hijo yo soy.', 'CORO:\n" +
            "Lo sé ........ Lo sé\n" +
            "Comprado con sangre yo soy;\n" +
            "Lo sé ........ Lo sé\n" +
            "Con Cristo al cielo yo voy.', '2\n" +
            "Soy libre de pena y culpa,\n" +
            "Su gozo Él me hace sentir;\n" +
            "Él llena de gracia mi alma,\n" +
            "Con Él es tan dulce vivir.\n" +
            "3\n" +
            "En Cristo yo siempre medito\n" +
            "Y nunca le puedo olvidar;\n" +
            "Callar sus favores, no quiero\n" +
            "Voy siempre a Jesús alabar.\n" +
            "4\n" +
            "Seguro sé que la belleza\n" +
            "Del gran Rey yo voy a mirar.\n" +
            "Ahora me guarda y me guía,\n" +
            "Y siempre me quiere ayudar.\n" +
            "5\n" +
            "Yo sé que me espera corona,\n" +
            "La cual a los fieles dará,\n" +
            "Jesús Salvador; en el cielo,\n" +
            "Mi alma con Él estará.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('160', 'LOOR A TI SEÑOR', '1\n" +
            "¡Loor a ti, mi Dios, loor a ti!\n" +
            "Lo grande de tu amor es para mí;\n" +
            "Me diste un Salvador, Cristo Jesús.\n" +
            "¡Loor a ti, Señor, loor a ti!', ' ', '2\n" +
            "¡Gloria a mi Salvador, Cristo Jesús!\n" +
            "Él es el pan de vida para mí;\n" +
            "Su vida dió por mí allí en la cruz.\n" +
            "¡Loor a ti, Señor, loor a ti!\n" +
            "3\n" +
            "Hazme vivir, Señor, cerca de ti.\n" +
            "La deuda de tu amor la siento en mí;\n" +
            "Te entrego a ti mi ser, mi corazón.\n" +
            "¡Loor a ti, Señor, loor a ti!\n" +
            "4\n" +
            "Quiero ser limpio hoy de mi maldad,\n" +
            "Acudo a ti, Jesús, tal como soy;\n" +
            "«Ven a mí», dices tú con tierno amor.\n" +
            "¡Loor a ti, Señor, loor a ti!\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('161', 'CONFIANDO SÓLO EN JESÚS', '1\n" +
            "Aunque la furiosa tempestad\n" +
            "Amenace ruina sin piedad,\n" +
            "Yo tendré con Dios seguridad\n" +
            "Fiando en Jesús.', 'CORO:\n" +
            "Confiando sólo en Jesús,\n" +
            "Sé que su promesa cumplirá,\n" +
            "Fiando sólo en Jesús,\n" +
            "Él me salvará.', '2\n" +
            "Penas y dolor podré tener\n" +
            "Que congojas causen a mi ser,\n" +
            "Sobre todos yo podré vencer\n" +
            "Fiando en Jesús.\n" +
            "3\n" +
            "Otras esperanzas pasarán,\n" +
            "Otros goces, sí, fenecerán,\n" +
            "Mi esperanza y gozo durarán\n" +
            "Fiando en Jesús.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('162', ' LOORES DAD A CRISTO EL REY', '1\n" +
            "Loores dad a Cristo el Rey,\n" +
            "Suprema potestad;\n" +
            "IIDe su divino amor la ley,\n" +
            "Postrados aceptad.II', ' ', '2\n" +
            "Vosotros, hijos de Israel,\n" +
            "Residuo de la grey;\n" +
            "IILoores dad a Emmanuel\n" +
            "Y proclamadle Rey.II\n" +
            "3\n" +
            "Gentiles que por gracia de Él\n" +
            "Gozáis de libertad,\n" +
            "IIAl que de vuestro ajenjo\n" +
            "Y hiel os libra, hoy load.II\n" +
            "4\n" +
            "Naciones todas, escuchad\n" +
            "Y obedeced su ley\n" +
            "IIDe gracia y de santidad,\n" +
            "Y proclamadle Rey.II\n" +
            "5\n" +
            "Dios quiera que con los que están\n" +
            "Del trono en derredor.\n" +
            "IICantemos por la eternidad\n" +
            "A Cristo el Salvador.II')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('163', 'A CRISTO DOY MI CANTO', '1\n" +
            "A Cristo doy mi canto,\n" +
            "Él salva el alma mía;\n" +
            "Me libra del quebranto\n" +
            "Y con amor me guía.', 'CORO:\n" +
            "Ensalce nuestro canto\n" +
            "Tu sacrosanta historia;\n" +
            "Es nuestro anhelo santo\n" +
            "Mirar, Jesús tu gloria.', '2\n" +
            "Jamás dolor ni agravios\n" +
            "Enlutarán la mente,\n" +
            "Si a Cristo nuestros labios\n" +
            "Bendicen dulcemente.\n" +
            "3\n" +
            "Tu nombre bendecido\n" +
            "Alegra el alma mía;\n" +
            "Tu nombre es en mi oído\n" +
            "Dulcísima armonía.\n" +
            "4\n" +
            "Viviendo he de ensalzarte,\n" +
            "Y si abandono el suelo,\n" +
            "Veránme ir a adorarte\n" +
            "Los ángeles del cielo.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('164', '¡OH, PADRE, ETERNO DIOS!', '1\n" +
            "¡Oh! ¡Padre, eterno Dios!\n" +
            "Alzamos nuestra voz\n" +
            "En gratitud;\n" +
            "De cuanto tú nos das\n" +
            "Con sin igual amor,\n" +
            "Hallando nuestra paz\n" +
            "En ti, Señor.', ' ', '2\n" +
            "¡Bendito Salvador!\n" +
            "Te damos con amor,\n" +
            "El corazón\n" +
            "Y tú nos puedes ver,\n" +
            "Que humildes a tu altar,\n" +
            "Venimos a traer,\n" +
            "Precioso don.\n" +
            "3\n" +
            "¡Espíritu de Dios!\n" +
            "Escucha nuestra voz,\n" +
            "Y tu bondad,\n" +
            "Derrame en nuestro ser,\n" +
            "Divina claridad.\n" +
            "Para poder vivir\n" +
            "En santidad.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('165', 'NO ME PASES, NO ME OLVIDES', '1\n" +
            "No me pases, no me olvides,\n" +
            "Tierno Salvador;\n" +
            "Muchos gozan tus mercedes,\n" +
            "Oye mi clamor.', 'CORO:\n" +
            "Cristo, Cristo,\n" +
            "Oye tú mi voz.\n" +
            "Salvador, tu gracia dame,\n" +
            "Oye mi clamor.', '2\n" +
            "Ante el trono de tu gracia\n" +
            "Hallo dulce paz,\n" +
            "Nada aquí mi alma sacia;\n" +
            "Tú eres mi solaz.\n" +
            "3\n" +
            "Sólo fío en tus bondades,\n" +
            "Guíame en tu luz;\n" +
            "Y mi alma no deseches;\n" +
            "Sálvame, Jesús.\n" +
            "4\n" +
            "Fuente viva de consuelo\n" +
            "Tú eres para mí;\n" +
            "¿A quién tengo en este suelo\n" +
            "Sino sólo a ti?')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('166', 'YO CONFÍO EN JESÚS', '1\n" +
            "Yo confío en Jesús,\n" +
            "Y ya salvo soy;\n" +
            "Por su muerte en la cruz\n" +
            "A la gloria voy.', 'CORO:\n" +
            "Cristo dio por mí\n" +
            "Sangre carmesí;\n" +
            "Y por su muerte en la cruz\n" +
            "La vida me dio Jesús.', '2\n" +
            "Todo fue pagado ya,\n" +
            "Nada debo yo;\n" +
            "Salvación perfecta da\n" +
            "Quien por mí murió.\n" +
            "3\n" +
            "Mi perfecta salvación\n" +
            "Eres, mi Jesús;\n" +
            "Mi completa redención,\n" +
            "Mi gloriosa luz.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('167', 'TENGO UN AMIGO', '1\n" +
            "Tengo un amigo, Cristo el Señor,\n" +
            "Yo le bendigo con mi loor,\n" +
            "Porque en el mundo nadie como Él\n" +
            "Es en mi vida paciente y fiel.', 'CORO:\n" +
            "¡Cristo, mi Amigo, ya tuyo soy;\n" +
            "Todo, rendido, contigo voy!', '2\n" +
            "Tengo un Refugio que en el turbión\n" +
            "Del alma es siempre fiel protección;\n" +
            "Con Él seguro yo viviré\n" +
            "Porque a su amparo caminaré.\n" +
            "3\n" +
            "Tengo un Maestro doquier yo voy\n" +
            "Y sus senderos siguiendo estoy;\n" +
            "En las tinieblas jamás iré,\n" +
            "Porque sus luces y amor tendré.\n" +
            "4\n" +
            "¡Oh, Dulce Amigo! Tu compasión\n" +
            "Ha subyugado mi corazón,\n" +
            "¿Cómo rebelde pudiera ser,\n" +
            "Y tanta gracia desconocer?')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('168', 'VIVO POR CRISTO', '1\n" +
            "Vivo por Cristo, confiando en su amor,\n" +
            "Vida me imparte, poder y valor;\n" +
            "Grande es el gozo que tengo por Él,\n" +
            "Es de mi senda, Jesús guía fiel.', 'CORO:\n" +
            "¡Oh Salvador bendito! Me doy tan sólo a ti,\n" +
            "Porque tú en el Calvario te diste allí por mí;\n" +
            "No tengo más Maestro, yo fiel te serviré,\n" +
            "A ti me doy, pues tuyo soy de mi alma eterno Rey.', '2\n" +
            "Vivo por Cristo, murió pues por mí;\n" +
            "Siempre servirle yo quisiera aquí;\n" +
            "Porque me ha dado tal prueba de amor\n" +
            "Quiero rendirme por siempre al Señor.\n" +
            "3\n" +
            "Vivo por Cristo do quiera que esté,\n" +
            "Ya por su ayuda sus obras haré;\n" +
            "Pruebas hoy llevo con gozo y amor,\n" +
            "Pues veo en ellas la cruz del Señor.\n" +
            "4\n" +
            "Vivo sirviendo, siguiendo al Señor;\n" +
            "Quiero imitar a mi buen Salvador.\n" +
            "Busco a las almas hablándoles de Él,\n" +
            "Y es mi deseo ser constante y fiel.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('169', 'MÁS ALLÁ DEL SOL', '1\n" +
            "Aunque en esta vida no tengo riquezas\n" +
            "Sé que allá en la gloria tengo mi mansión\n" +
            "De mi alma perdida entre la pobreza,\n" +
            "Sólo Jesucristo tuvo compasión.', 'CORO:\n" +
            "Más allá del sol,\n" +
            "Más allá del sol.\n" +
            "Yo tengo un hogar,\n" +
            "Hogar, bello hogar\n" +
            "Más allá del sol.', '2\n" +
            "Así por el mundo yo voy caminando\n" +
            "De pruebas rodeado y de tentación;\n" +
            "Pero Jesucristo que me está probando,\n" +
            "Me llevará salvo hasta su mansión.\n" +
            "3\n" +
            "A todas las razas del linaje humano\n" +
            "Cristo quiere darles plena salvación;\n" +
            "También una casa no hecha de manos,\n" +
            "Fue a prepararnos a la santa Sión.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('170', 'JUNTO A LA CRUZ', '1\n" +
            "Junto a la cruz do Jesús murió,\n" +
            "Junto a la cruz do salud pedí,\n" +
            "Ya mis maldades Él perdonó,\n" +
            "¡A su nombre gloria!', 'CORO:\n" +
            "¡A su nombre gloria!\n" +
            "¡A su nombre gloria!\n" +
            "Ya mis maldades Él perdonó,\n" +
            "¡A su nombre gloria!', '2\n" +
            "Junto a la cruz donde le busqué,\n" +
            "¡Cuán admirable perdón me dio!\n" +
            "Ya con Jesús siempre viviré,\n" +
            "¡A su nombre gloria!\n" +
            "3\n" +
            "Fuente preciosa de salvación,\n" +
            "Qué grande gozo yo pude hallar,\n" +
            "Al encontrar en Jesús perdón,\n" +
            "¡A su nombre gloria!\n" +
            "4\n" +
            "Tú, pecador que perdido estás,\n" +
            "Hoy esta fuente ven a buscar,\n" +
            "Paz y perdón encontrar podrás,\n" +
            "¡A su nombre gloria!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('171', '¿A DÓNDE IRÉ?', '1\n" +
            "Viviendo aquí en mundo de maldad,\n" +
            "Nunca podreme confortar;\n" +
            "Duro es luchar con toda tentación.\n" +
            "¿A dónde iré sin mi Señor?', 'CORO:\n" +
            "Oh, ¿dónde iré? ¿A dónde iré Señor?\n" +
            "¿Dónde encontrar asilo y paz?\n" +
            "Yo necesito un gran amigo fiel.\n" +
            "¿A dónde iré sin ti, Señor?', '2\n" +
            "Hay quienes son muy llenos de bondad,\n" +
            "Y a los que tanto amo yo;\n" +
            "Mas cuando anhelo el celestial maná\n" +
            "¿A quién iré sino al Señor?\n" +
            "3\n" +
            "Aunque rodeado estoy de amigos mil,\n" +
            "Busco palabra de mi Dios,\n" +
            "Y cuando llegue de mi vida el fin\n" +
            "¿A dónde iré sino al Señor?')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('172', 'LOS CAMINOS FATIGADOS', '1\n" +
            "Si cruzas este valle tenebroso,\n" +
            "Sin luz, en tu camino fatigado.\n" +
            "Si nadie a tu clamor ha respondido,\n" +
            "No temas que el Señor está a tu lado.', 'CORO:\n" +
            "Trae al Señor cuidados y quebrantos,\n" +
            "Y ven a Él con toda tu impureza.\n" +
            "Limpio te hará, y en su bondad inmensa,\n" +
            "Te llenará de amor sublime y santo.', '2\n" +
            "Jesús es viva fuente de consuelo\n" +
            "Que calma los pesares de la vida:\n" +
            "Él trajo, cual paloma, desde el cielo,\n" +
            "El bálsamo de paz al alma herida.\n" +
            "3\n" +
            "Escucha el amoroso llamamiento\n" +
            "De Cristo inocentísimo Cordero,\n" +
            "Que vino a redimirte con su sangre,\n" +
            "Muriendo escarnecido en el madero.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('173', 'EN MALDAD... SIN ESPERANZA', '1\n" +
            "En maldad, sin esperanza,\n" +
            "Yo vagaba aquí sin Dios,\n" +
            "Mas Jesús ya me ha salvado\n" +
            "De este mundo tan atroz.', 'CORO:\n" +
            "II Sí, yo sé... sí, yo sé:\n" +
            "¡Mi Jesús acoge al más vil pecador! II', '2\n" +
            "Pecador, Jesús te llama;\n" +
            "Él te quiere perdonar;\n" +
            "Oye aquí la voz que dice:\n" +
            "«Ven, te haré yo descansar»\n" +
            "3\n" +
            "Aunque seas tú muy malo,\n" +
            "Salvación hay para ti,\n" +
            "Pues salvó al más malvado\n" +
            "Cuando me salvó a mí.\n" +
            "4\n" +
            "Hallarás perdón en Cristo,\n" +
            "Él es vida y es la luz.\n" +
            "Pecador, no te detengas.\n" +
            "Ven al Salvador Jesús.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('174', 'VOY FELIZ AL DULCE HOGAR', '1\n" +
            "Voy feliz al dulce hogar, por fe en Jesús,\n" +
            "Y luchando a traer, almas a la luz;\n" +
            "Dardos encendidos mil vienen contra mí,\n" +
            "Mas yo sé, por la fe, venceré aquí.', 'CORO:\n" +
            "Oh sí, quiero verle, ver al Salvador,\n" +
            "Quiero ver su rostro lleno de amor;\n" +
            "En aquel gran día yo he de cantar,\n" +
            "Ya pasó todo afán, todo mi pesar.', '2\n" +
            "En las olas del turbión Cristo guardará\n" +
            "Mi barquilla y guiará hasta el puerto allá;\n" +
            "Yo tranquilo puedo estar mi piloto es Él,\n" +
            "Es mi Rey, tengo fe, sé que Él es fiel.\n" +
            "3\n" +
            "En servir al Salvador por los valles voy,\n" +
            "Donde muchas sombras hay, mas seguro estoy;\n" +
            "Muchos triunfos obtendré, nunca faltará,\n" +
            "Mi Jesús, es la luz, Él me sostendrá.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('175', 'LA ÚLTIMA MILLA DEL CAMINO', '1\n" +
            "Si camino por recto sendero,\n" +
            "Si trabajo cumpliendo un deber,\n" +
            "Cuando mi último viaje termine,\n" +
            "Al Gran Rey Admirable veré.', 'CORO:\n" +
            "Cuando al tramo postrer llegue\n" +
            "Al fin de mi vida, en camino hacia Él,\n" +
            "Hasta entonces diré: «SOY FELIZ,»\n" +
            "Cuando el último paso yo dé.', '2\n" +
            "Si la historia de Cristo proclamo,\n" +
            "Si perdidas ovejas hallé,\n" +
            "Mostraráme el Señor su grandeza,\n" +
            "Cuando en la última milla yo esté.\n" +
            "3\n" +
            "Caros lazos habrán de ser rotos\n" +
            "Con gemidos de angustia al partir,\n" +
            "Mas todo eso será pasajero,\n" +
            "Cuando deje mi triste existir.\n" +
            "4\n" +
            "Y si aquí yo he ganado la lucha,\n" +
            "Esforzándome en obedecer,\n" +
            "Yo seré arrebatado hasta el cielo,\n" +
            "Cuando en la última milla yo esté.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('176', '¡LISTO!', '1\n" +
            "¡Listo para probado ser\n" +
            "Listo para sufrir\n" +
            "Para en mi hogar permanecer,\n" +
            "Y a otros hacer feliz!', 'CORO:\n" +
            "¡Para seguir, para quedar\n" +
            "Y a mi mansión llegar\n" +
            "Para el servicio de Cristo Rey\n" +
            "Listo a obedecer!', '2\n" +
            "¡Listo para avanzar con fe\n" +
            "Para velar y orar\n" +
            "Listo para confiar que Dios\n" +
            "Mi senda alumbrará!\n" +
            "3\n" +
            "¡Muy diligente para hablar\n" +
            "Listo para pensar.\n" +
            "Para escuchar al corazón\n" +
            "Y con paz aguardar!\n" +
            "4\n" +
            "¡Muy listo para aconsejar\n" +
            "Listo para vivir\n" +
            "Para las almas rescatar\n" +
            "Listo para morir!\n" +
            "5\n" +
            "¡Para esperar a mi Jesús\n" +
            "Muy listo debo estar,\n" +
            "Cuando regrese con gran luz\n" +
            "Pronto por mí vendrá!\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('177', ' HAY MUCHOS QUE NUNCA COMPRENDEN', '1\n" +
            "Hay muchos que nunca comprenden\n" +
            "Por qué estoy tan gozoso así:\n" +
            "Crucé el Jordán y llegué a Canaán.\n" +
            "¡Oh, sí, es un cielo aquí!', 'CORO:\n" +
            "II¡0h, sí, es un cielo aquí!II\n" +
            "Crucé el Jordán y llegué a Canaán.\n" +
            "¡Oh, sí, es un cielo aquí!', '2\n" +
            "Cuando alegres cantan los santos así,\n" +
            "La gente no sabe por qué:\n" +
            "Pues es el Espíritu Santo de Dios,\n" +
            "Que Cristo ha mandado aquí.\n" +
            "3\n" +
            "Tonadas celestes oímos cantar\n" +
            "Por tierra, el aire y el mar,\n" +
            "Resuena el mensaje de Cristo el Señor,\n" +
            "Que en nubes pronto ha de llegar.\n" +
            "4\n" +
            "Veremos a Cristo que en gloria vendrá,\n" +
            "El mismo que en la cruz murió;\n" +
            "Los ángeles mismos vendrán a llevar\n" +
            "Su Iglesia que Él mismo compró.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('178', 'EL LIRIO DE LOS VALLES', '1\n" +
            "Yo hallé un fiel amigo para siempre,\n" +
            "Más que hermano, padre o madre es Él;\n" +
            "Más que plata, o que oro, o que cobre,\n" +
            "Es de todos Jesucristo el más fiel.', 'CORO:\n" +
            "Sólo Cristo, sólo Cristo,\n" +
            "Es el lirio de los valles, mi Jesús;\n" +
            "Sólo Cristo, sólo cristo,\n" +
            "Es el lirio de los valles, mi Jesús.', '2\n" +
            "De Sarón Él es la rosa tan fragante,\n" +
            "Y del valle el lirio puro es Él;\n" +
            "En el alma quebrantada y tan triste,\n" +
            "Sus olores de amor exhala Él.\n" +
            "3\n" +
            "Es Jesús benigno, tierno, compasivo,\n" +
            "Lento en ira, grande en perdonar;\n" +
            "Él levanta con amor al abatido,\n" +
            "Sólo sabe Jesucristo cómo amar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('179', 'SUPREMA ALABANZA', '1\n" +
            "Demos suprema alabanza\n" +
            "A Cristo, el Salvador,\n" +
            "Porque nos dio la esperanza\n" +
            "De vida y de salvación.', 'CORO:\n" +
            "Por el mundo proclamemos\n" +
            "Sus dones y su bondad,\n" +
            "Y ricos frutos tendremos\n" +
            "En bien de la humanidad.', '2\n" +
            "Venid hoy y celebremos\n" +
            "Con alabanza al Señor,\n" +
            "Digno es que todos le demos\n" +
            "Loor a su eterno amor.\n" +
            "3\n" +
            "Dios, sobre todo te amamos\n" +
            "Y proclamamos tu amor;\n" +
            "Por Jesucristo entonamos\n" +
            "Cantos con todo fervor.\n" +
            "4\n" +
            "Digno tú eres, Señor\n" +
            "De honra, gloria y virtud,\n" +
            "Pues nos has dado el amor\n" +
            "Que existe en ti en plenitud.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('180', 'MARCHÉ YA DE EGIPTO', '1\n" +
            "Marché ya de Egipto a la tierra de Canaán,\n" +
            "Mi Salvador me guiaba con mano de poder,\n" +
            "Él me dio victoria sobre fuego y mar\n" +
            "Y cuando fui salvado, ya pude jubilar.', 'CORO:.\n" +
            "II¡En Egipto ya no me busquen más,\n" +
            "Porque habito ya en tierra de Canaán !II', '2\n" +
            "Mi amor lo puse en Él y al blanco yo miré:\n" +
            "Andando en su camino mi Canaán hallé\n" +
            "Allí me dio herencia en su fidelidad,\n" +
            "Y canto: ¡Aleluya! ¡Qué grande libertad!\n" +
            "3\n" +
            "Anduve sobre montes, a Escol yo bajé,\n" +
            "En donde uvas, higos, granadas, encontré;\n" +
            "¡Miel y leche mana la tierra de Canaán\n" +
            "Yo nunca más a Egipto deseo regresar!\n" +
            "4\n" +
            "Mi corazón rebosa de gozo y de paz,\n" +
            "Yo debo alabarle por cada día más.\n" +
            "Estoy marchando firme al celestial hogar,\n" +
            "Y pronto allí llevado iré a reposar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('181', 'HERMOSO AMOR', '1\n" +
            "Hermoso amor que me salvó de perdición\n" +
            "Culpable y vil pecador, iba a morir.\n" +
            "Sin esperanza de vivir... ¡Oh día feliz!\n" +
            "¡Cuando Jesús me levantó por su amor!', 'CORO:\n" +
            "¡Su grande amor a mí me salvó!\n" +
            "¡Su grande amor me libertó!\n" +
            "¡En una cruz mi Jesús sufrió,\n" +
            "Por ese amor que tiene para mí!', '2\n" +
            "En una cruz mi Salvador vino a morir,\n" +
            "Por un malvado como yo sangre vertió.\n" +
            "Por ese amor que en mí mostró, ¡gloria al Señor!\n" +
            "¡Soy un cautivo en libertad por su amor!\n" +
            "3\n" +
            "Jesús, mi Salvador, mi Rey, me prometió\n" +
            "Una mansión en do estaré siempre con Él;\n" +
            "Allí tristezas o dolor jamás tendré.\n" +
            "¡Esa mansión me preparó por su amor!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('182', 'EN EL VALLE FLORECE LA ROSA', '1\n" +
            "En el valle florece la Rosa,\n" +
            "La más bella del valle Sarón.\n" +
            "Oh, la vida en Jesús es hermosa\n" +
            "Si se acepta con el corazón.', 'CORO:\n" +
            "Yo estaré con Jesús en el cielo,\n" +
            "Do por siempre su rostro veré.\n" +
            "Con los santos en sus alabanzas,\n" +
            "Con mi canto también me uniré.', '2\n" +
            "En el valle florece la Rosa,\n" +
            "Es hermosa y trasciende su olor.\n" +
            "Como el alma que en Cristo reposa\n" +
            "Y ha encontrado la fuente de amor.\n" +
            "3\n" +
            "En el valle florece la Rosa,\n" +
            "Y embellece a los campos do está.\n" +
            "La palabra de Cristo es hermosa\n" +
            "En el alma que la acepta ya.\n" +
            "4\n" +
            "Si es hermosa la rosa del campo,\n" +
            "Que hermoseada por tiempos está,\n" +
            "Cuánto más es la vida de Cristo\n" +
            "Que Él ofrece por la eternidad.\n" +
            "5\n" +
            "Es Jesús la promesa divina:\n" +
            "¡Es la Rosa más bella que el sol!\n" +
            "Es la Rosa de toda la Iglesia,\n" +
            "Que le sirve con el corazón.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('183', ' HAY UN PRECIOSO MANANTIAL', '1\n" +
            "Que purifica a cada cual que se sumerge en Él.', 'CORO:\n" +
            "¡Recuerdo que un día yo lavado fui!\n" +
            "¡Oh célica fuente fuente carmesí!\n" +
            "!Hay un precioso III manantial III!\n" +
            "Hay un precioso manantial de sangre de Emmanuel\n" +
            "!Que purifica III a cada cual, III!', '2\n" +
            "El malhechor III¡se convirtió!III\n" +
            "El malhechor se convirtió pendiente de una cruz.\n" +
            "Él vio la fuente y se lavó creyendo en Jesús.\n" +
            "3\n" +
            "Oh, yo también III¡mi pobre ser!III\n" +
            "Oh, yo también mi pobre ser allí logré lavar\n" +
            "La gloria de su gran poder me gozo en ensalzar.\n" +
            "4\n" +
            "Eterna fuente III¡carmesí!III\n" +
            "Eterna fuente carmesí, raudal de puro amor\n" +
            "Se lavará por siempre en ti el pueblo del Señor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('184', 'MI BUEN PASTOR', '1\n" +
            "Yo tengo un Pastor sublime:\n" +
            "¡Oh, qué dulce es cantar a su amor!\n" +
            "Su brazo sutil redime\n" +
            "Del peligro al más vil pecador.', 'CORO:\n" +
            "Mi buen Pastor, tu cayado me guiará\n" +
            "Mi buen Pastor, con tu amor me sostendrás.\n" +
            "Mi buen Pastor, nada mi alma temerá.\n" +
            "Aunque en valle de sombra de muerte yo esté,\n" +
            "Sé conmigo y seguro estaré.', '2\n" +
            "Yo tengo un Pastor que vive\n" +
            "En el cielo, a la diestra de Dios,\n" +
            "Su vista mis pasos sigue,\n" +
            "Y dirige mi senda su voz.\n" +
            "!Él vio la fuente III y se lavó,III!\n" +
            "!La gloria de III su gran poder,III!\n" +
            "!Se lavará III por siempre en ti,III!\n" +
            "3\n" +
            "Perdiendo una oveja un día,\n" +
            "De su trono a buscarla bajó,\n" +
            "Y hallándola ya perdida,\n" +
            "Por salvarla su vida entregó.\n" +
            "4\n" +
            "Si acaso perdido, errante,\n" +
            "Sin Pastor vives hoy, pecador,\n" +
            "Si oyeres su voz amante,\n" +
            "Ven, entrégale tu corazón.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('185', 'EN EL PECADO SIEMPRE', '1\n" +
            "En el pecado siempre vagué yo sin Jesús,\n" +
            "Hasta que por su gracia me amaneció la luz.\n" +
            "Ya desde que soy salvo no temo nada aquí,\n" +
            "Pues hoy yo siento un cambio: ¡Él es mi todo aquí!', 'CORO:\n" +
            "¡Él es mi todo aquí!¡Él me salvó a mí!\n" +
            "Su paz, su amor, ha puesto en mi alma;\n" +
            "¡Bien lo sé! ¡Él es mi todo aquí!\n" +
            "¡Me guarda por la fe! Oh, gloria sea a su nombre:\n" +
            "¡Él es mi todo aquí!', 'CORO:\n" +
            "¡Él es mi todo aquí!¡Él me salvó a mí!\n" +
            "Su paz, su amor, ha puesto en mi alma;\n" +
            "¡Bien lo sé! ¡Él es mi todo aquí!\n" +
            "¡Me guarda por la fe! Oh, gloria sea a su nombre:\n" +
            "¡Él es mi todo aquí!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('186', ' ¡CUÁN GRANDE ES ÉL!', '1\n" +
            "Señor, mi Dios, al contemplar los cielos,\n" +
            "El firmamento y las estrellas mil,\n" +
            "Al oír tu voz en los potentes truenos\n" +
            "Y ver brillar al sol en su cenit.', 'CORO:\n" +
            "IIMi corazón entona la canción,\n" +
            "¡Cuán grande es Él! ¡Cuán grande es Él!II', '2\n" +
            "Al recorrer los montes y los valles\n" +
            "Y ver las bellas flores al pasar,\n" +
            "Al escuchar el canto de las aves\n" +
            "Y el murmurar del claro manantial.\n" +
            "3\n" +
            "Cuando recuerdo del amor divino\n" +
            "Que desde el cielo al Salvador envió,\n" +
            "Aquel Jesús que por salvarme vino\n" +
            "Y en una cruz sufrió por mí y murió.\n" +
            "4\n" +
            "Cuando el Señor me llame a su presencia,\n" +
            "Al dulce hogar, al cielo de esplendor,\n" +
            "Le adoraré cantando la grandeza\n" +
            "De su poder y su infinito amor.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('187', 'GRANDE ES TU FIDELIDAD', '1\n" +
            "Oh, Dios Eterno, tu misericordia\n" +
            "Ni una sombra de duda tendrá;\n" +
            "Tu compasión y bondad nunca fallan\n" +
            "Y por los siglos el mismo serás.', 'CORO:\n" +
            "¡Oh, tu fidelidad! ¡Oh, tu fidelidad!\n" +
            "Cada momento la veo en mí.\n" +
            "Nada me falta, pues todo provees,\n" +
            "¡Grande, Señor, es tu fidelidad!', '2\n" +
            "La noche oscura, el sol y la luna,\n" +
            "Las estaciones del año también,\n" +
            "Unen su canto cual fieles criaturas,\n" +
            "Porque eres bueno, por siempre eres fiel.\n" +
            "3\n" +
            "Tú me perdonas, me impartes el gozo,\n" +
            "Tierno me guías por sendas de paz;\n" +
            "Eres mi fuerza, mi fe, mi reposo\n" +
            "Y por los siglos mi Padre serás.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('188', 'JESÚS ES MI REY SOBERANO', '1\n" +
            "Jesús es mi Rey soberano.\n" +
            "Mi gozo es cantar su loor;\n" +
            "Es Rey, y me ve cual hermano,\n" +
            "Es Rey y me imparte su amor.\n" +
            "Dejando su trono de gloria,\n" +
            "Me vino a sacar de la escoria,\n" +
            "Y yo soy feliz, y yo soy feliz por Él.', ' ', '2\n" +
            "Jesús es mi amigo anhelado,\n" +
            "Y en sombras o en luz siempre va;\n" +
            "Paciente y humilde a mi lado,\n" +
            "Ayuda y socorro me da.\n" +
            "Por eso constante lo sigo,\n" +
            "Porque Él es mi Rey y mi amigo,\n" +
            "Y yo soy feliz, y yo soy feliz por Él.\n" +
            "3\n" +
            "Señor, ¿Qué pudiera yo darte\n" +
            "Por tanta bondad para mí;\n" +
            "Me basta servirte y amarte?\n" +
            "¿Es todo entregarme yo a ti?\n" +
            "Entonces acepta mi vida,\n" +
            "Que a ti sólo queda rendida,\n" +
            "Pues yo soy feliz, pues yo soy feliz por ti.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('189', ' ALABAD AL GRAN REY', '1\n" +
            "Solemnes resuenen las voces de amor,\n" +
            "Con gran regocijo tributen loor,\n" +
            "Al Rey Soberano, el Buen Salvador;\n" +
            "Dignísimo es Él del más alto honor.', 'CORO:\n" +
            "Alabad, alabad, alabad al gran Rey,\n" +
            "Adorad, adorad, adoradle su grey.\n" +
            "Es nuestro escudo, baluarte y sostén,\n" +
            "El Omnipotente por siglos. Amén.', '2\n" +
            "Su amor infinito, ¿Qué lengua dirá?\n" +
            "Y ¿Quién sus bondades jamás sondeará?\n" +
            "Su misericordia no puede faltar,\n" +
            "Mil himnos alaben su nombre sin par.\n" +
            "3\n" +
            "Inmensa la obra de Cristo en la cruz,\n" +
            "Enorme la culpa se ve por su luz.\n" +
            "Al mundo Él vino, nos iluminó,\n" +
            "Y por nuestras culpas el Justo murió.\n" +
            "4\n" +
            "Velad, fieles todos, velad con fervor,\n" +
            "Que viene muy pronto Jesús, el Señor,\n" +
            "Con notas alegres vendrá a reinar,\n" +
            "A su eterna gloria os ha de llevar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('190', 'SANTO, SANTO, GRANDE, ETERNO DIOS', '1\n" +
            "¡Santo! ¡Santo! Grande, eterno Dios,\n" +
            "Con alegría hoy te alabamos;\n" +
            "Rey de reyes, grande Capitán\n" +
            "Todopoderoso guerrero.\n" +
            "Honor y gloria, luz y dominio,\n" +
            "Tributaremos todos a ti.', 'CORO:\n" +
            "¡Santo! ¡Santo! Eres tú, Señor,\n" +
            "¡Dios de las batallas, glorioso!', '2\n" +
            "Alabadle cielos, tierra y mar,\n" +
            "Toda su Iglesia, sus mensajeros;\n" +
            "Alabanzas, cantos de loor,\n" +
            "Hoy unidos elevaremos.\n" +
            "Juez majestuoso y reverendo\n" +
            "Fuego y vida eres, Señor.\n" +
            "3\n" +
            "Rey de siglos, sólo eterno Dios,\n" +
            "Veraz y justo, incomprensible;\n" +
            "Inmortal, Autor de todo bien,\n" +
            "Eres tú el Anciano de Días.\n" +
            "Y para siempre entonaremos\n" +
            "El canto eterno de redención.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('191', ' ¡ADORADLE!', '1\n" +
            "Dad al Padre toda gloria,\n" +
            "Dad al Hijo todo honor,\n" +
            "Y al Espíritu Divino,\n" +
            "Alabanzas de loor.', 'CORO:\n" +
            "Adoradle, adoradle,\n" +
            "Adorad al Salvador\n" +
            "Tributadle toda gloria,\n" +
            "Pueblo suyo por su grande amor.', '2\n" +
            "Adoradle, ¡oh Iglesia!\n" +
            "Por Jesús tu Redentor,\n" +
            "Rescatada por su gracia,\n" +
            "Libre por su grande amor.\n" +
            "3\n" +
            "Entonadle un canto nuevo,\n" +
            "Huestes libres del Señor;\n" +
            "Tierra, cielo, mar y luna,\n" +
            "Gloria dan al Trino Dios.\n" +
            "CORO:\n" +
            "Yo te adoro, yo te adoro,\n" +
            "Yo te adoro, buen Jesús\n" +
            "Yo te adoro reverente,\n" +
            "¡Oh, Cordero santo de mi Dios!')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('192', ' ¡OH! QUE TUVIERA LENGUAS MIL', '1\n" +
            "¡Oh! que tuviera lenguas mil\n" +
            "Del Redentor cantar,\n" +
            "La gloria de mi Dios y Rey,\n" +
            "Los triunfos de su amor.', ' ', '2\n" +
            "Bendito mi Señor y Dios,\n" +
            "Te quiero proclamar;\n" +
            "Decir al mundo en derredor\n" +
            "Tu nombre sin igual.\n" +
            "3\n" +
            "Dulce es tu nombre para mí,\n" +
            "Pues quita mi temor;\n" +
            "En ella hay salud y paz\n" +
            "Al pobre pecador.\n" +
            "4\n" +
            "Rompe cadenas del pecar;\n" +
            "Al preso librará;\n" +
            "Su sangre limpia al ser más vil,\n" +
            "¡Gloria a Dios! Soy limpio ya.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('193', 'AL REY ADORAD', '1\n" +
            "Al Rey adorad, grandioso Señor,\n" +
            "Y con gratitud, cantad de su amor.\n" +
            "Anciano de días, nuestro defensor,\n" +
            "De gloria vestido, te damos loor.', ' ', '2\n" +
            "Decid de su amor, su gracia cantad;\n" +
            "Vestido de luz y de majestad.\n" +
            "Su carro de fuego en las nubes mirad,\n" +
            "Son negras sus huellas en la tempestad.\n" +
            "3\n" +
            "¿Quién puede tu providencia contar?\n" +
            "Pues tu aire me das para respirar.\n" +
            "En valles y en montes alumbra tu luz,\n" +
            "Y con gran dulzura me cuida Jesús.\n" +
            "4\n" +
            "Muy frágiles son los hombres aquí,\n" +
            "Mas por tu bondad confiamos en ti.\n" +
            "Tu misericordia, ¡cuán firme! ¡cuán fiel!\n" +
            "Creador nuestro, Amigo y Redentor es Él.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('194', 'ALABAD AL DIOS', '1\n" +
            "Alabad al Dios potente,\n" +
            "Rey de toda la creación;\n" +
            "Santo y puro, omnisciente\n" +
            "Con justicia da el perdón.', 'CORO:\n" +
            "¡ Aleluya! ¡ Aleluya!\n" +
            "¡ Aleluya! ¡ Gloria a Dios!\n" +
            "Con un cántico ferviente\n" +
            "Ya alcemos hoy la voz.', '2\n" +
            "Gloria al Padre, gloria al Hijo\n" +
            "Y al Espíritu también.\n" +
            "Adoradle con canciones,\n" +
            "Trino Dios, Eterno Bien.\n" +
            "3\n" +
            "Su poder es infinito,\n" +
            "El creó el cielo y mar,\n" +
            "Y en su gran omnipotencia\n" +
            "Quiere al pecador salvar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('195', 'LA MUJER SAMARITANA', '1\n" +
            "“De tu cántaro dame, dame tú de beber,”\n" +
            "A la samaritana, dijo un día Jesús.\n" +
            "“¿Por qué, siendo Judío me diriges la voz?”\n" +
            "IIRespondió con vehemencia la mujer\n" +
            "Que ignoraba la grandeza de Dios.II', ' ', '2\n" +
            "“¡Oh! Si tú conocieses este don que es de Dios\n" +
            "Y quién viene a rogarte que le des de beber,\n" +
            "Quizá tú pedirías y Él podríate dar\n" +
            "IIAgua más deleitosa, que en los\n" +
            "Pozos terrenos no podrás encontrar.”II\n" +
            "3\n" +
            "“Quien bebiere de esta agua volverá a tener sed.\n" +
            "Mas aquel que bebiere de la que le daré,\n" +
            "Para siempre declaro que más sed no tendrá;\n" +
            "IIMas será en Él la fuente que para\n" +
            "Vida eterna con poder saltará.”II')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('196', '¡MAESTRO, SE ENCRESPAN LAS AGUAS!', '1\n" +
            "¡Maestro, se encrespan las aguas!\n" +
            "Y ruge la tempestad!\n" +
            "Los grandes abismos del cielo\n" +
            "Se llenan de oscuridad;\n" +
            "¿No ves que aquí perecemos?\n" +
            "¿Puedes dormir así;\n" +
            "Cuando el mar agitado nos abre\n" +
            "Profundo sepulcro aquí?', 'CORO:\n" +
            "Los vientos, las ondas oirán tu voz,\n" +
            "«¡Sea la paz!»\n" +
            "Calmas las iras del negro mar,\n" +
            "Las luchas del alma las haces cesar,\n" +
            "Y así la barquilla do va el Señor,\n" +
            "Hundirse no puede en el mar traidor.\n" +
            "Doquier se cumple tu voluntad,\n" +
            "«¡Sea la paz! ¡Sea la paz!»\n" +
            "Tu voz resuena en la inmensidad,\n" +
            "«¡Sea la paz!»', '2\n" +
            "Maestro, mi ser angustiado\n" +
            "Te busca con ansiedad;\n" +
            "De mi alma en los antros profundos\n" +
            "Se libra cruel tempestad;\n" +
            "Pasa el pecado a torrentes\n" +
            "Sobre mi frágil ser,\n" +
            "Y perezco, perezco Maestro\n" +
            "Oh, quiéreme socorrer.\n" +
            "3\n" +
            "Maestro, pasó la tormenta,\n" +
            "Los vientos no rugen ya,\n" +
            "Y sobre el cristal de las aguas\n" +
            "El sol resplandecerá;\n" +
            "Maestro, prolonga esta calma,\n" +
            "No me abandones más,\n" +
            "Cruzaré los abismos contigo,\n" +
            "Gozando bendita paz.\n')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('197', 'MI PASTOR ES JESÚS', '1\n" +
            "Señor Jesús, tú eres mi Pastor\n" +
            "Y a tu cuidado yo vivo tan feliz.\n" +
            "Yo te conozco pues tu voz oí\n" +
            "Pacientemente llamándome al redil.', 'CORO:\n" +
            "IIMi pastor es Jesús,\n" +
            "Mi Buen Pastor es Jesús.II\n" +
            "En sus hombros Él me lleva\n" +
            "Cuando yo cansado estoy,\n" +
            "Mi Pastor es Jesús,\n" +
            "Mi Buen Pastor.', '2\n" +
            "La senda está colmada de abundancia,\n" +
            "El pasto delicioso es para mí.\n" +
            "Sediento no he de estar pues tu palabra\n" +
            "Muestra la fuente de salvación aquí.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('198', ' EL LIRIO DE LOS VALLES', '1\n" +
            "Hay un lirio que habita en los valles,\n" +
            "En los valles del huerto de Dios.\n" +
            "Ese lirio es Jesús, el dueño de mi amor;\n" +
            "Ese lirio es vida al corazón.', 'CORO:\n" +
            "Como el manzano crece en los prados,\n" +
            "Así crece mi Amado en mi ser.\n" +
            "En su sombra una vez, mi calor refresqué;\n" +
            "Desde entonces soy feliz con Él.', '2\n" +
            "Es la voz de mi Amado tan dulce,\n" +
            "Que al oirla yo gozo de amor.\n" +
            "Una vez mi Jesús a mi alma habló;\n" +
            "Desde entonces conozco su voz.\n" +
            "3\n" +
            "¡Oh qué hermoso es mi lirio escogido!\n" +
            "Para Él tengo esta dulce canción.\n" +
            "Hoy yo quiero cantar y a Cristo esperar\n" +
            "Cuando Él venga, su Iglesia a buscar.\n" +
            "4\n" +
            "“¡Oh levántate!» dice mi Amado,\n" +
            "«El invierno ha pasado ya.”\n" +
            "En su dulce canción, dice a mi corazón\n" +
            "Que a su Iglesia Él viene a buscar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('199', 'JEHOVÁ ES MI PASTOR', '1\n" +
            "Jehová es mi Pastor, me apacienta con amor\n" +
            "En sus pastos delicados paceré;\n" +
            "Descansando sin temor al abrigo del Señor,\n" +
            "De las aguas de reposo beberé.', 'CORO:\n" +
            "El Señor me pastorea, nada aquí me faltará;\n" +
            "Junto a Él caminaré, en su brazo confiaré,\n" +
            "Nada del amor de Dios me apartará.', '2\n" +
            "Mi pastor me guardará, siempre me confortará,\n" +
            "Por las sendas de justicia me guiará;\n" +
            "En el tiempo de dolor me será Consolador,\n" +
            "En mi corazón su paz infundirá.\n" +
            "3\n" +
            "¡Oh, tan fiel es mi Pastor! ¡Tan constante\n" +
            "Es en su amor! Que mi copa rebosando siempre está;\n" +
            "Cuando en valle oscuro esté, mal ninguno temeré,\n" +
            "A la casa de mi Dios iré a morar.')");
    db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('200', ' MI VIDA DI POR TI', '1\n" +
            "Mi vida di por ti,\n" +
            "Mi sangre derramé,\n" +
            "Por ti inmolado fui,\n" +
            "Por gracia te salvé;\n" +
            "IIPor ti, por ti inmolado fui,\n" +
            "¿Qué has dado tú por mi?II', ' ', '2\n" +
            "Mi celestial mansión,\n" +
            "Mi trono de esplendor,\n" +
            "Dejé por rescatar\n" +
            "Al mundo pecador;\n" +
            "IISí, todo yo dejé por ti,\n" +
            "¿Qué dejas tú por mí?II\n" +
            "3\n" +
            "Reproches, aflicción,\n" +
            "Y angustias yo sufrí,\n" +
            "La copa amarga fue\n" +
            "Que yo por ti bebí;\n" +
            "IIReproches yo por ti sufrí,\n" +
            "¿Qué sufres tú por mí?II\n" +
            "4\n" +
            "De mi celeste hogar\n" +
            "Te traigo el rico don\n" +
            "Del Padre Dios de amor\n" +
            "La plena salvación;\n" +
            "IIMi don de amor te traigo a ti,\n" +
            "¿Qué ofreces tú por mí?II')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('201','YO SÓLO ESPERO ESE DÍA','1\n" +
                "IIYo sólo espero ese día cuando Cristo volverá.II\n" +
                "Afán y todo trabajo para mí terminarán,\n" +
                "Cuando Cristo venga, a su reino me llevará.II','','2\n" +
                "Ya no me importa que el mundo me desprecie por doquier,\n" +
                "Ya no soy más de este mundo, soy del reino celestial.\n" +
                "Yo sólo espero ese día cuando me levantaré\n" +
                "IIDe la tumba fría con un cuerpo ya inmortal.II\n" +
                "3\n" +
                "Entonces allí triunfante y victorioso estaré,\n" +
                "A mi Señor Jesucristo cara a cara le veré.\n" +
                "Allí no habrá más tristezas, ni trabajos para mí,\n" +
                "IICon los redimidos al Cordero alabaré.II')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('202','AÑOS MI ALMA EN VANIDAD VIVIÓ','1\n" +
                "Años mi alma en vanidad vivió,\n" +
                "Ignorando a quien por mí sufrió,\n" +
                "O que en el Calvario sucumbió\n" +
                "El Salvador.','CORO:\n" +
                "Mi alma allí divina gracia halló,\n" +
                "Dios allí perdón y paz me dio,\n" +
                "Del pecado allí me libertó\n" +
                "El Salvador.','2\n" +
                "Por la Biblia miro que pequé,\n" +
                "Y su ley divina quebranté;\n" +
                "Mi alma entonces contempló con fe\n" +
                "Al Salvador.\n" +
                "3\n" +
                "Toda mi alma a Cristo ya entregué,\n" +
                "Hoy le quiero y sirvo como a Rey,\n" +
                "Por los siglos siempre cantaré\n" +
                "Al Salvador.\n" +
                "4\n" +
                "En la cruz su amor Dios demostró\n" +
                "Y de gracia al hombre revistió\n" +
                "Cuando por nosotros se entregó\n" +
                "El Salvador.\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('203','SOY FELIZ','1\n" +
                "Vagaba por el mundo sin fe, sin esperanza,\n" +
                "No sabiendo que había un Salvador,\n" +
                "Que, por librar mi alma de muerte y pecado,\n" +
                "En el Calvario murió el Buen Pastor.','CORO:\n" +
                "IISoy feliz, yo soy feliz,\n" +
                "Desde que Cristo me redimió.II','2\n" +
                "Cuando desalentado me encuentro en esta vida,\n" +
                "Con el alma imploro al Salvador,\n" +
                "Pidiéndole me mande del cielo su consuelo\n" +
                "Para poder aguantar el cruel dolor.\n" +
                "3\n" +
                "Eres, Jesús, el lirio que perfumó mi vida,\n" +
                "Me libraste de toda iniquidad;\n" +
                "Pusiste en mi boca un canto de alabanza,\n" +
                "Mi sólo anhelo es cumplir tu voluntad.\n" +
                "4\n" +
                "Cerca de ti, oh Cristo, andar yo siempre quiero,\n" +
                "Es mi amparo tu sacrosanto amor;\n" +
                "Sin ti la vida es triste, muy llena de amarguras,\n" +
                "Mas, Cristo, tú eres mi gran consolación.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('204','CANTEN CON ALEGRÍA','1\n" +
                "Canten con alegría las alabanzas\n" +
                "De Cristo el Rey;\n" +
                "Anden en los caminos que nos\n" +
                "Mostrará su augusta grey.\n" +
                "Vivan los redimidos en las\n" +
                "Victorias del Vencedor;\n" +
                "Para que todos juntos veamos\n" +
                "Las glorias del Redentor.','','2\n" +
                "Cristo es la luz del mundo,\n" +
                "Y el que le sigue, la luz tendrá;\n" +
                "Cristo es el pan de vida,\n" +
                "Y el que de Él come no morirá.\n" +
                "Cristo es la fuente viva,\n" +
                "Y el que de Él bebe no tendrá sed;\n" +
                "Y si queréis la vida,\n" +
                "Id a la fuente y allí bebed.\n" +
                "3\n" +
                "Cristo es, de las ovejas\n" +
                "Que Él redimiera, su Buen Pastor;\n" +
                "Vino para salvarlas pero\n" +
                "Sufriendo cruento dolor.\n" +
                "Y al derramar su sangre en\n" +
                "El madero de aquella cruz,\n" +
                "Vida, paz y esperanza, y eterna\n" +
                "Gloria nos dio Jesús.\n" +
                "4\n" +
                "Ahora ya no estoy triste\n" +
                "Si no que vivo siempre feliz,\n" +
                "Con la dulce esperanza de que\n" +
                "Algún día iré al país,\n" +
                "Ese país amado donde moradas\n" +
                "Fue a preparar Cristo,\n" +
                "El Pastor Eterno que a\n" +
                "Sus ovejas vino a salvar.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('205','SÓLO EN JESÚS','1\n" +
                "Sólo en Jesús serás feliz,\n" +
                "Sólo por Él tendrás amor;\n" +
                "Te librará de duda atroz,\n" +
                "Será tu amante protector.','CORO:\n" +
                "Guardado siempre por la fe\n" +
                "Se ahuyenta fácil el dolor;\n" +
                "No temas de confiar en Él,\n" +
                "Él es mi gozo, paz y amor.','2\n" +
                "Cuando vivimos por Jesús\n" +
                "La duda retrocederá,\n" +
                "Dios te dará su tierno amor\n" +
                "Y por la fe descansarás.\n" +
                "3\n" +
                "Él tiernamente me guiará\n" +
                "Por sendas de justicia y paz;\n" +
                "Duras las pruebas podrán ser,\n" +
                "Pero su amor es eficaz.\n" +
                "4\n" +
                "Jesús mi amante Salvador,\n" +
                "Confío en ti, mi buen Jesús,\n" +
                "Ansío verte siempre en mí,\n" +
                "Ayúdame a llevar tu cruz.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('206','NO HAY SENDA SINO ÉL','1\n" +
                "Si en esta vida andas sin gozo, sin rumbo,\n" +
                "Si encuentras sólo penas aquí;\n" +
                "Ven, busca a Jesucristo, quien es el camino;\n" +
                "Perfecta paz te ofrece a ti.','CORO:\n" +
                "No, no, no hay senda sino Él.\n" +
                "No, no, no hay otro que es tan fiel.\n" +
                "Si en esta vida andas con Cristo hacia el cielo,\n" +
                "Tendrás felicidad eternal.','2\n" +
                "Aunque te vengan penas y mil aflicciones,\n" +
                "Aunque aquí te hagan sufrir.\n" +
                "“Seré contigo siempre”, el Salvador dice;\n" +
                "Te invita en sus pisadas seguir.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('207','TOMA DE LA FUENTE DE AGUA VIVA','1\n" +
                "Vagué sediento en el pecado abrumador,\n" +
                "Y nada a mi alma dio satisfacción;\n" +
                "Mas cuando fui a la cruz de Cristo el Salvador,\n" +
                "Agua abundante halló mi corazón.','CORO:\n" +
                "Toma de la fuente de agua viva,\n" +
                "Fuente eternal, agua del raudal;\n" +
                "Toma de la fuente de agua viva,\n" +
                "Fuente de agua viva celestial.','2\n" +
                "¡Oh cuán dulce raudal de Dios brotando está!\n" +
                "Felicidad y gozo me brindó;\n" +
                "En gloria, gracia y bendición mi vida irá,\n" +
                "Por eso ¡Aleluya! canto yo.\n" +
                "3\n" +
                "Oh pecador ¿Por qué a Jesús no vienes hoy\n" +
                "Y así su agua de vida aceptar?\n" +
                "Él dice: “Fuente de agua eterna y libre soy,\n" +
                "La sed de tu alma puedo aplacar.”')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('208','UN NOMBRE NUEVO EN LA GLORIA','1\n" +
                "Una vez perdido vivía yo\n" +
                "Lejos y vagante en error;\n" +
                "Mas la voz de Cristo me alcanzó,\n" +
                "Me llamó con tierno amor.','CORO:\n" +
                "Hay un nombre nuevo en la gloria,\n" +
                "Mío es, sí, mío es;\n" +
                "Y los ángeles cantan la historia,\n" +
                "«Salvo es el pecador.»\n" +
                "Oh hay un nombre nuevo en la gloria,\n" +
                "Mío es, sí, mío es;\n" +
                "Todos mis pecados ya son perdonados,\n" +
                "¡Gloria al Señor!','2\n" +
                "En la Biblia dice, que salvo soy\n" +
                "Por la gracia de Jesucristo;\n" +
                "Ya por fe en su nombre a la gloria voy,\n" +
                "Desde que me rescató.\n" +
                "3\n" +
                "Cantos de alegría elevo hoy\n" +
                "A mi Rey y buen Salvador;\n" +
                "Es porque mis dones a Cristo doy,\n" +
                "Que me use por su amor.\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('209','NADIE PUDO AMARME COMO CRISTO','1\n" +
                "Yo quisiera hablarte del amor de Cristo,\n" +
                "Pues en Él hallé un amigo fuerte y fiel,\n" +
                "Por su gracia transformó mi vida entera.\n" +
                "Lo que en esta vida soy lo debo al Él.','CORO:\n" +
                "Nadie pudo amarme como Cristo,\n" +
                "Es incomparable su amistad;\n" +
                "Sólo Él pudo redimirme del pecado,\n" +
                "Por su amor y su bondad.','2\n" +
                "Mi alma estaba llena de ayes y tristezas,\n" +
                "Llena estaba de miserias y dolor;\n" +
                "Con ternura Cristo me tendió la mano,\n" +
                "Y me guió por el sendero del amor.\n" +
                "3\n" +
                "Cada día viene a darme nuevo aliento,\n" +
                "A mi corazón infunde dulce paz;\n" +
                "No comprenderé por qué vino a salvarme,\n" +
                "Hasta que en el cielo pueda ver su faz.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('210','SOY LA TRISTE OVEJA','1\n" +
                "Soy la triste oveja que dejó al Pastor;\n" +
                "Yo andaba perdido cuando Él me encontró.\n" +
                "Con un silbo suave luego me llamó,\n" +
                "Y en sus brazos al dulce hogar me llevó.\n" +
                "Las noventa y nueve dejó en el redil,\n" +
                "Y se fue al desierto a buscarme a mí.\n" +
                "Con afán inmenso luego me llamó,\n" +
                "Y hallóme gimiendo de acervo dolor.\n" +
                "Se sentó a mi lado y al verme lloró.',' ','2\n" +
                "Ven, mi triste oveja, escucha mi voz.\n" +
                "No me desconozcas, soy el Buen Pastor.\n" +
                "Vamos al rebaño do reina la paz;\n" +
                "Allí donde mora el Rey celestial.\n" +
                "Si por la fatiga no puedes andar,\n" +
                "Ven, pues en mis brazos te puedo llevar.\n" +
                "Ven, mi triste oveja vamos al redil\n" +
                "Que muy tiernos pastos tendré para ti.\n" +
                "Conmigo por siempre tú vas a vivir.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('211','CRISTO ES MÍO','1\n" +
                "El amor de Dios siento en mi corazón,\n" +
                "El amor de Dios, el amor de Dios;\n" +
                "Él me ha dado hoy también su salvación,\n" +
                "Gloria a Cristo por su amor','CORO:\n" +
                "Cristo es mío, mío, mío, mío, gloria sea a Él.\n" +
                "Él me ha dado paz y felicidad,\n" +
                "Cristo es mío, mío, mío, mío, gloria sea a Él.\n" +
                "Mío por la eternidad.','2\n" +
                "Él ha puesto en mi alma una dulce paz,\n" +
                "Es la santa paz, es la paz de Dios;\n" +
                "Y al momento Él me da la libertad,\n" +
                "Porque es mío en verdad.\n" +
                "3\n" +
                "Él me ha dado gozo y también amor,\n" +
                "Yo lo siento en mí, yo lo siento en mí,\n" +
                "Y a Él yo quiero siempre serle fiel\n" +
                "Y servirle sólo a Él.\n" +
                "4\n" +
                "Él me guarda siempre, me sostiene fiel,\n" +
                "Porque soy de Él, porque soy de Él,\n" +
                "Quiero yo también ser muy brillante luz\n" +
                "Y alabar a mi Jesús.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('212','A TU LADO QUIERO ANDAR','1\n" +
                "Débil soy, tu fuerza es tal\n" +
                "Que me guardarás del mal;\n" +
                "Satisfecho estoy, oh sí,\n" +
                "Al andar, oh Señor, junto a ti.','CORO:\n" +
                "A tu lado andar Señor,\n" +
                "Esta es mi oración.\n" +
                "Cada día en tu amor\n" +
                "Siempre guárdame, Salvador,','2\n" +
                "En la prueba y dolor\n" +
                "Cuídame, oh buen Señor.\n" +
                "Y al fin en tu mansión\n" +
                "Gozaré de tu comunión,')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('213','LA VID Y LOS PÁMPANOS','1\n" +
                "“Yo soy la vid y mi Padre el labrador,\n" +
                "Vosotros pámpanos” dice el Salvador.\n" +
                "“Estad en mí y yo en ti y fruto llevaréis;\n" +
                "Porque sin mí nada podréis hacer jamás”.\n" +
                "Dios nos ha puesto los frutos a llevar\n" +
                "Que permanezcan como un testimonio a Él.',' ','2\n" +
                "El que estuviere en la vid le limpiará,\n" +
                "Para que frutos abunden más y más.\n" +
                "Luego pedid sin desmayar lo que deseas tú;\n" +
                "El Dios de amor que te ama a ti te lo dará.\n" +
                "“Glorificado así mi Padre es en que llevéis\n" +
                "Mucho fruto y seáis siempre fiel”.\n" +
                "3\n" +
                "“Por mis palabras vosotros limpios sois;\n" +
                "Con el amor de mi Padre amo yo.\n" +
                "Dejad mi amor siempre brillar con todo\n" +
                "Su fulgor; grato será obedecer mi voluntad.\n" +
                "Todo mi gozo en vosotros estará\n" +
                "Y vuestro gozo con fruto cumplido será”.\n" +
                "\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('214','SOLO NO ESTOY','1\n" +
                "II Solo no estoy, Jesús está a mi lado,\n" +
                "Amigo fiel que no me dejará.\n" +
                "Solo no estoy en tempestad o en calma,\n" +
                "Mi buen Jesús su protección me da.\n" +
                "Aunque la tempestad me azote,\n" +
                "Y el mundo me desprecie,\n" +
                "No temeré llevar la cruz,\n" +
                "Pues me guía con su amor.\n" +
                "Así camino con pleno gozo,\n" +
                "Solo no estoy, Jesús conmigo está. II',' ',' ')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('215','FIRME ESTARÉ','1\n" +
                "Cristo guarda siempre, puedo en Él confiar;\n" +
                "No me deja nunca, puedo en Él confiar.\n" +
                "Pues, cual la Roca eterna de los siglos,\n" +
                "Firme estaré.','CORO:\n" +
                "II¡Nada, no, nada me ha de mover!II\n" +
                "Pues, cual la Roca eterna de los siglos,\n" +
                "Firme estaré.','2\n" +
                "Fuerte es Jesucristo, puedo en Él confiar;\n" +
                "Todo me ha provisto, puedo en Él confiar.\n" +
                "Pues, cual la Roca eterna de los siglos,\n" +
                "Firme estaré.\n" +
                "3\n" +
                "En la noche oscura, puedo en Él confiar;\n" +
                "Mi alma está segura, puedo en Él confiar.\n" +
                "Pues, cual la Roca eterna de los siglos,\n" +
                "Firme estaré.\n" +
                "4\n" +
                "Muchos me abandonan, puedo en Él confiar;\n" +
                "Otros me engañan, puedo en Él confiar.\n" +
                "Pues, cual la Roca eterna de los siglos,\n" +
                "Firme estaré.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('216','ENTENDEREMOS NUESTRAS ANGUSTIAS','1\n" +
                "Cuando tentado, yo he deseado\n" +
                "Saber por qué hay muchos aquí\n" +
                "Que andan sin pruebas y sin cuidado\n" +
                "Mientras el mal me acecha a mí.','CORO:\n" +
                "Entenderemos nuestras angustias,\n" +
                "Entenderemos nuestro pesar;\n" +
                "Hermano mío, nunca desmayes,\n" +
                "Todo en el cielo se ha de aclarar.','2\n" +
                "“Hasta la muerte,” dijo el Maestro,\n" +
                "“Serás tú fiel y trabajarás”;\n" +
                "Todo tu afán tan grande dejado\n" +
                "Cuando al celeste hogar entrarás.\n" +
                "3\n" +
                "Cuando vendrá Jesús de la gloria,\n" +
                "Todos al cielo nos llevará;\n" +
                "Cuando le veamos en aquel día,\n" +
                "Lo entenderemos sí, más allá.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('217','EL QUE HABITA AL ABRIGO DE DIOS','1\n" +
                "El que habita al abrigo de Dios\n" +
                "Morará bajo sombras de amor;\n" +
                "Sobre él no vendrá ningún mal\n" +
                "Y en sus alas feliz vivirá.','CORO:\n" +
                "Oh, yo quiero habitar al abrigo de Dios,\n" +
                "Sólo allí encontraré paz y profundo amor.\n" +
                "Mi delicia con Él comunión disfrutar\n" +
                "Y yo siempre su nombre alabar.','2\n" +
                "El que habita al abrigo de Dios\n" +
                "Ciertamente muy feliz será;\n" +
                "Ángeles guardarán su salud\n" +
                "Y sus pies nunca resbalarán.\n" +
                "3\n" +
                "El que habita al abrigo de Dios\n" +
                "Para siempre seguro estará;\n" +
                "Caerán mil y diez mil por doquier,\n" +
                "Mas a él no vendrá mortandad.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('218','EN LAS HORAS AMARGAS','1\n" +
                "Cantaré a mi Cristo,\n" +
                "Es mi prenda de amor.\n" +
                "Siempre está Él conmigo.\n" +
                "Aquel gran Salvador.','CORO:\n" +
                "Gloria a Dios que nos brinda\n" +
                "Gozo y felicidad;\n" +
                "IIY en las horas amargas,\n" +
                "Él nos ayudará.II','2\n" +
                "Es tan dulce servirle\n" +
                "Todo el tiempo al Señor,\n" +
                "Y en sus pasos seguirle\n" +
                "Con anhelo y amor.\n" +
                ".')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('219',' ¡BENDICIONES, CUÁNTAS TIENES YA!','1\n" +
                "Cuando combatido por la adversidad\n" +
                "Creas ya perdida tu felicidad;\n" +
                "Mira lo que el cielo para ti guardó,\n" +
                "Cuenta las riquezas que el Señor te dió.','CORO:\n" +
                "¡Bendiciones, cuántas tienes ya!\n" +
                "Bendiciones, Dios te manda más;\n" +
                "Bendiciones, te sorprenderás\n" +
                "Cuando veas lo que Dios por ti hará.','2\n" +
                "¿Andas agobiado por algún pesar?\n" +
                "¿Duro te parece amarga cruz llevar?\n" +
                "Cuenta las promesas del Señor Jesús,\n" +
                "Y de las tinieblas nacerá la luz.\n" +
                "3\n" +
                "Cuando de otros veas la prosperidad\n" +
                "Y tus pies claudiquen tras de su maldad,\n" +
                "Cuenta las riquezas que tendrás por fe\n" +
                "Donde el oro es polvo que hollará tu pie.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('220','ESCOGIDO FUI DE DIOS','1\n" +
                "Escogido fui de Dios en el Amado.\n" +
                "En lugares celestiales su bendición me dio.\n" +
                "Antes de la creación el plan fue hecho,\n" +
                "Por su santa voluntad.','CORO:\n" +
                "Escondido en Cristo estoy, nadie me apartará.\n" +
                "Y las fuerzas de este mundo no me podrán dañar.\n" +
                "Vivo y ando en esta vida con seguridad,\n" +
                "Porque me escogió mi Dios.','2\n" +
                "Tengo un sello que el Espíritu me ha dado.\n" +
                "Cuando mi confianza puse sólo en mi Salvador.\n" +
                "Prenda que el Señor me dio de vida eterna,\n" +
                "Escogido fui de Dios.\n" +
                "3\n" +
                "Me escogió para alabanza de su gloria,\n" +
                "Y sentóme en las alturas con Cristo mi Señor.\n" +
                "Grande fue la admiración al ver su gracia,\n" +
                "Cuando me escogió mi Dios.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('221','DESPUÉS DE LA TORMENTA','1\n" +
                "Después de la tormenta\n" +
                "Viene la calma, viene la paz.\n" +
                "Si a Cristo, de rodillas,\n" +
                "Tú se la pides, Él te la da.\n" +
                "No importa que legiones del\n" +
                "Enemigo te hagan sufrir;\n" +
                "IISi al nombre de mi Cristo,\n" +
                "Sagrado nombre, tendrán que huir.II',' ','2\n" +
                "La noche más oscura\n" +
                "Tiene su aurora, tiene su albor,\n" +
                "La vida más perdida tiene\n" +
                "Esperanza del Salvador.\n" +
                "No importa que el pecado\n" +
                "Te haya manchado con su maldad,\n" +
                "IIPues Cristo te perdona y\n" +
                "Te corona de santidad.II\n" +
                "3\n" +
                "Jesús hoy nos invita\n" +
                "Con voz bendita a ir a Él;\n" +
                "Su paz nos asegura y nos ofrece\n" +
                "Ser siempre fiel.\n" +
                "Con Cristo triunfaremos\n" +
                "Y en Él tenemos buen Capitán.\n" +
                "IIMarchemos victoriosos,\n" +
                "Siempre gozosos a Canaán.II')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('222','¡OH! CRISTO MÍO','1\n" +
                "Oh Cristo mío, Rey de mi alma,\n" +
                "Salvásteme del mal, lavóme en el raudal\n" +
                "De tu preciosa sangre purísima;\n" +
                "Ninguna mancha ya me contamina.','CORO:\n" +
                "Tanto me amaste, pues que te diste,\n" +
                "Sacrificándote sobre una cruz\n" +
                "Por mi redención con tanto amor;\n" +
                "Sé que te amo, Cristo mi Salvador.','2\n" +
                "Cuando iba errante, tú me buscaste,\n" +
                "No me dejaste perder el alma;\n" +
                "Por plena gracia compraste mi salud,\n" +
                "Impartiéndome la santa virtud.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('223','VEN EN POS DE MI','1\n" +
                "Viajaba en triste soledad y nadie me buscó,\n" +
                "La carga horrible de impiedad más grande se volvió\n" +
                "Le dije a Jesucristo que me trataban mal,\n" +
                "Entonces le oí así decir:\n" +
                " “Camino del calvario mi pie también sufrió,\n" +
                "La cruz que yo cargaba mi cuerpo doblegó.\n" +
                "Prosigue, peregrino que el alba ya vendrá;\n" +
                "Tu cruz levanta y ven en pos de mí.”',' ','2\n" +
                "A veces dije que por Él, penoso es trabajar,\n" +
                "Que mucho yo sacrifiqué su senda por andar;\n" +
                "“Mi fama y mi fortuna por ti yo la dejé”\n" +
                "Entonces le oí así decir:\n" +
                "“Mi hogar de eterna gloria por ti abandoné,\n" +
                "Mis manos enclavadas en cruenta cruz miré.\n" +
                "Mas hoy caminaremos unidos tú y yo;\n" +
                "Tu cruz levanta y ven en pos de mí”.\n" +
                "3\n" +
                "Jesús, si llego a morir muy lejos de mi hogar,\n" +
                "Ni así podría tu sufrir mi vida compensar;\n" +
                "Mejor amor de amigo jamás podré hallar,\n" +
                "Por eso al Salvador oí decir:\n" +
                "“Si sólo un vaso de agua, te pido que has de dar,\n" +
                "De ti un vaso de agua, sólo he de demandar.\n" +
                "Mas si en tus aflicciones un alma has de ayudar,\n" +
                "De ti muy cerca yo prometo estar.”')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('224',' YO SOY UN POBRE PEREGRINO','1\n" +
                "Yo soy un pobre peregrino,\n" +
                "Cargado de tribulación;\n" +
                "Mas con sincera fe espero\n" +
                "La eterna gloria de la Sión.','CORO:\n" +
                "En la hermosísima ribera\n" +
                "Del río de la vida y luz\n" +
                "Gozaré de dicha eterna\n" +
                "Al lado de mi buen Jesús.','2\n" +
                "Allá en el cielo no hay pecado,\n" +
                "En la presencia del Señor;\n" +
                "Encontraré seguro asilo\n" +
                "Muy cerca de mi Redentor.\n" +
                "3\n" +
                "El mundo no podrá quitarme\n" +
                "La paz que halló mi corazón;\n" +
                "Pues con Jesús podré gozarme\n" +
                "De la más dulce comunión.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('225','POR CRISTALINOS MARES','1\n" +
                "Por cristalinos mares\n" +
                "Un día cruzaré,\n" +
                "A los benditos brazos\n" +
                "De Cristo yo iré.','CORO:\n" +
                "Por cristalinos mares\n" +
                "Un día al cielo iré;\n" +
                "Tras cristalinos mares\n" +
                "Con Cristo moraré.','2\n" +
                "Dolores olvidados,\n" +
                "Sombras jamás habrá;\n" +
                "Lucha y sudor pasados,\n" +
                "¡Oh, qué gran día será!')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('226','BELLAS MANSIONES','1\n" +
                "Mansión gloriosa tengo yo en el cielo,\n" +
                "Do las maldades nunca entrarán.\n" +
                "Toda tristeza cambiará en consuelo,\n" +
                "Y en dulce canto el dolor y afán.','CORO:\n" +
                "Bellas mansiones hay allá en la gloria;\n" +
                "Tendré en la mía el gozo sin par.\n" +
                "Suenan las notas de la grata victoria;\n" +
                "Voy pues con gozo a mi dulce hogar.','2\n" +
                "En este mundo predomina el llanto,\n" +
                "Somos sujetos al dolor fatal.\n" +
                "Mas en el cielo cesará el quebranto\n" +
                "Y por los siglos nunca habrá más mal.\n" +
                "3\n" +
                "Amigo mío, cuánto anhelo yo verte\n" +
                "Libre de penas y de turbación.\n" +
                "A Jesucristo debes ya entregarte,\n" +
                "Tendrás también una bella mansión.\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('227','CAMINANDO, CAMINANDO','1\n" +
                "Gozándome yo voy al hogar celestial;\n" +
                "Caminando, caminando.\n" +
                "Pues no me encanta más el placer terrenal,\n" +
                "Caminando para aquel hogar.','CORO:\n" +
                "Caminando, caminando.\n" +
                "Para aquel hogar, donde está Jesús.\n" +
                "Caminando, caminando.\n" +
                "De la mano del Señor Jesús.','2\n" +
                "Yo quiero pecadores conmigo llevar;\n" +
                "Caminando, caminando.\n" +
                "Que en Cristo puedan ellos salud encontrar,\n" +
                "Caminando para aquel hogar.\n" +
                "3\n" +
                "Y entonces con mi Cristo por siempre estaré;\n" +
                "Caminando, caminando.\n" +
                "Su nombre sacrosanto yo alabaré,\n" +
                "Caminando para aquel hogar.\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('228','VEN AMIGO A JESÚS','1\n" +
                "Ven amigo a Jesús, pues Él murió por ti.\n" +
                "Recibirás la luz que quiere darte a ti.\n" +
                "Mi buen Jesús murió para darte perdón;\n" +
                "Abre tu corazón y dulce paz tendrás.','CORO:\n" +
                "Día fatal vendrá cuando no habrá lugar;\n" +
                "La puerta se abre hoy, y tú podrás entrar.\n" +
                "Mas gracia ya no habrá pues despreciaste hoy,\n" +
                "Acepta, pecador, la salvación de Dios.','2\n" +
                "Las manos del Señor se abren hoy para ti;\n" +
                "Ven y confía en Él, y serás muy feliz.\n" +
                "Tus cuitas pon en Dios, pues Él las llevará;\n" +
                "Quitará tu pesar por su consolación.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('229',' ¡BIENVENIDOS!','1\n" +
                "Con gran gozo y placer\n" +
                "Nos volvemos hoy a ver;\n" +
                "Nuestras manos otra vez\n" +
                "Estrechamos.\n" +
                "Se contenta el corazón\n" +
                "Ensanchándose de amor.\n" +
                "Todos a una voz a Dios\n" +
                "Gracias damos.','CORO:\n" +
                "¡Bienvenidos! ¡Bienvenidos!\n" +
                "Los hermanos hoy aquí\n" +
                "Nos gozamos en decir:\n" +
                "¡Bienvenidos! ¡Bienvenidos!\n" +
                "Al volvernos a reunir,\n" +
                "¡Bienvenidos!','2\n" +
                "Hasta aquí Dios te ayudó,\n" +
                "Ni un momento te dejó,\n" +
                "Y a nosotros te volvió\n" +
                "¡Bienvenidos!\n" +
                "El Señor te acompañó,\n" +
                "Su presencia te amparó,\n" +
                "Del Peligro te guardó,\n" +
                "¡Bienvenidos!\n" +
                "3\n" +
                "Dios nos guarde en este amor,\n" +
                "Para que de corazón,\n" +
                "Consagrados al Señor,\n" +
                "Le alabemos\n" +
                "En la eterna reunión\n" +
                "Do no habrá separación,\n" +
                "Ni tristeza ni aflicción.\n" +
                "¡Bienvenidos!')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('230','LA CRUZ Y LA GRACIA DE DIOS','1\n" +
                "La cruz no será más pesada\n" +
                "Que la gracia que Él me da;\n" +
                "Y si la tormenta me espanta\n" +
                "No podrá esconder su faz.','CORO:\n" +
                "La gracia de Dios me bastará,\n" +
                "Su ayuda jamás me faltará.\n" +
                "Consolado por su amor\n" +
                "Que echa fuera mi temor,\n" +
                "Confiaré en mi Señor.','2\n" +
                "Mi cáliz nunca es tan amargo,\n" +
                "Como el de Getsemaní;\n" +
                "En mis días más apurados\n" +
                "No se aparta Dios de mí.\n" +
                "3\n" +
                "La luz de su rostro me alumbra,\n" +
                "En el tiempo de aflicción;\n" +
                "Y mi alma gozosa vislumbra\n" +
                "El palacio de mi Dios.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('231','¿LLEVAS SOLO TU CARGA?','1\n" +
                "¿Has tratado de llevar tu carga?\n" +
                "Solo tú, solo tú,\n" +
                "¿No sabiendo que tendrás ayuda\n" +
                "Si acudieres al Señor Jesús?','CORO:\n" +
                "Si tengo cargas que solo debo llevar,\n" +
                "Paciente las alzo y acudo a mi Señor;\n" +
                "Si tengo cruces que nadie puede cargar,\n" +
                "Su ayuda siempre mi Señor, me presta con amor','2\n" +
                "Nunca olvides que al Calvario solo,\n" +
                "Fue Jesús, fue Jesús,\n" +
                "Para darte salvación y vida,\n" +
                "Cuando solo sucumbió en la cruz.\n" +
                "3\n" +
                "Sólo en Cristo protección y ayuda\n" +
                "Hallarás, hallarás;\n" +
                "Lleva siempre a Él tus cargas todas,\n" +
                "Que a ninguno rechazó jamás.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('232','ESTRELLAS EN MI CORONA','1\n" +
                "Sin cesar siempre pienso en la tierra mejor,\n" +
                "Do al ponerse mi sol llegaré,\n" +
                "Y al hallarme en los cielos con Cristo el Señor\n" +
                "¿Mi corona de estrellas tendré?','CORO:\n" +
                "¿Mi corona tendrá sus estrellas allí\n" +
                "En las almas que yo rescaté?\n" +
                "Cuando el sol ya decline y me encuentre yo en ti,\n" +
                "¿Mi corona de estrellas tendré?','2\n" +
                "De la fuerza de Dios esperando el poder,\n" +
                "Trabajar quiero siempre y salvar\n" +
                "A las almas, y al fin, cual estrellas saber\n" +
                "Que en mis sienes irán a brillar.\n" +
                "3\n" +
                "¡Oh!, qué gozo en los cielos será para mí\n" +
                "Vivas gemas poner a sus pies,\n" +
                "Y tener en mi frente corona que allí\n" +
                "¡Ornen joyas de tal brillantez!')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('233','MI FE ESPERA EN TI','1\n" +
                "Mi fe espera en ti,\n" +
                "Cordero, quien por mí\n" +
                "Fuiste a la cruz.\n" +
                "Escucha mi oración,\n" +
                "Dame tu bendición,\n" +
                "Llene mi corazón tu santa luz.',' ','2\n" +
                "Tu gracia en mi alma pon,\n" +
                "Guarde mi corazón\n" +
                "Tu sumo amor.\n" +
                "Tu sangre carmesí\n" +
                "Diste en la cruz por mí;\n" +
                "Que viva para ti, con fiel ardor.\n" +
                "3\n" +
                "A ruda lid iré,\n" +
                "Y pruebas hallaré,\n" +
                "Mi guía sé,\n" +
                "Líbrame de ansiedad,\n" +
                "Guárdame en santidad,\n" +
                "Y por la eternidad te alabaré.\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('234','DULCE ORACIÓN','1\n" +
                "Dulce oración, dulce oración,\n" +
                "De toda influencia mundanal\n" +
                "Elevas tú mi corazón,\n" +
                "Al tierno Padre celestial.\n" +
                "¡Oh, cuántas veces tuve en ti\n" +
                "Auxilio en ruda tentación,\n" +
                "Y cuántos bienes recibí,\n" +
                "Mediante ti, dulce oración!',' ','2\n" +
                "Dulce oración, dulce oración,\n" +
                "Al trono excelso de bondad;\n" +
                "Tú llevarás mi petición\n" +
                "A Dios, que escucha con piedad;\n" +
                "Por fe espero recibir\n" +
                "La gran divina bendición.\n" +
                "Y siempre a mi Señor servir\n" +
                "Por tu virtud, dulce oración.\n" +
                "3\n" +
                "Dulce oración, dulce oración,\n" +
                "Que aliento y gozo al alma das,\n" +
                "En esta tierra de aflicción\n" +
                "Consuelo siempre me serás.\n" +
                "Hasta el momento en que veré\n" +
                "Francas las puertas de Sión,\n" +
                "Entonces me despediré\n" +
                "Feliz, de ti, dulce oración.\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('235',' CERCA DE TI, SEÑOR','1\n" +
                "Cerca de ti, Señor,\n" +
                "Quiero morar;\n" +
                "Tu grande, tierno amor,\n" +
                "Quiero gozar.\n" +
                "Llena mi pobre ser,\n" +
                "Limpia mi corazón,\n" +
                "Hazme tu rostro ver\n" +
                "En comunión.',' ','2\n" +
                "Pasos inciertos doy,\n" +
                "El sol se va;\n" +
                "Mas si contigo estoy,\n" +
                "No temo ya.\n" +
                "Himnos de gratitud\n" +
                "Ferviente cantaré,\n" +
                "Y fiel a ti, Jesús,\n" +
                "Siempre seré.\n" +
                "3\n" +
                "Día feliz veré\n" +
                "Creyendo en ti,\n" +
                "En que yo habitaré,\n" +
                "Cerca de ti,\n" +
                "Mi voz alabará\n" +
                "Tu dulce nombre allí,\n" +
                "Y mi alma gozará\n" +
                "Cerca de ti.')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('236','iOH, QUÉ AMIGO!','1\n" +
                "¡Oh, qué Amigo nos es Cristo!\n" +
                "Él llevó nuestro dolor.\n" +
                "Y nos manda que llevemos\n" +
                "Todo a Dios en oración\n" +
                "¿Vive el hombre desprovisto\n" +
                "De paz, gozo y santo amor?\n" +
                "Esto es porque no llevamos\n" +
                "Todo a Dios en oración.',' ','2\n" +
                "¿Vives débil y cargado\n" +
                "De cuidados y temor?\n" +
                "A Jesús, refugio eterno,\n" +
                "Dile todo en oración.\n" +
                "¿Te desprecian tus amigos?\n" +
                "Cuéntaselo en oración.\n" +
                "En sus brazos de amor tierno\n" +
                "Paz tendrá tu corazón.\n" +
                "3\n" +
                "Jesucristo es nuestro Amigo,\n" +
                "De esto pruebas Él nos dio\n" +
                "Al sufrir el cruel castigo,\n" +
                "Que el culpable mereció;\n" +
                "Y su pueblo redimido,\n" +
                "Hallará seguridad,\n" +
                "Fiando en este Amigo eterno,\n" +
                "Y esperando en su bondad.\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('237','MI AMOR Y MI VIDA','1\n" +
                "Mi amor y vida doy a ti,\n" +
                "Jesús, quien en la cruz por mí\n" +
                "Vertiste sangre carmesí,\n" +
                "Mi Dios y Salvador.','CORO:\n" +
                "Mi amor y vida doy a ti,\n" +
                "Que fuiste a la cruz por mí,\n" +
                "Mi amor y vida doy a ti,\n" +
                "Jesús, mi Salvador.','2\n" +
                "Que tú me salvas, esto sé;\n" +
                "He puesto en ti mi débil fe;\n" +
                "Feliz entonces viviré\n" +
                "Contigo, mi Jesús.\n" +
                "3\n" +
                "Tú, que moriste en la cruz,\n" +
                "Concédeme, Señor Jesús,\n" +
                "Que siempre ande en tu luz,\n" +
                "En fiel consagración.\n" +
                "\n')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('238','¡OH DIOS DE AMOR PERFECTO!','1\n" +
                "¡Oh Dios de amor perfecto!\n" +
                "A ti venimos ante tu trono excelso, en oración;\n" +
                "Concede amor sin término a tus hijos,\n" +
                "Dales el gozo de tu bendición.',' ','2\n" +
                "Dios de la vida, dales tus virtudes\n" +
                "De caridad y de profunda fe;\n" +
                "La fe que dice ante el dolor: “No dudes”\n" +
                "El noble confiar de la niñez.\n" +
                "3\n" +
                "Concédeles, Señor, amor cumplido;\n" +
                "Dales tu paz, que calma la ansiedad;\n" +
                "Haz brillar tras el día ensombrecido\n" +
                "La aurora nueva de un amor sin par.\n" +
                "4\n" +
                "Bendice a los que unes, Padre bueno\n" +
                "Por el eterno y celestial Jesús;\n" +
                "Dios trino, de perdón y gracia lleno,\n" +
                "Que al universo inundas con tu luz. Amén')");


        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('239','','','','')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('240','','','','')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('241','','','','')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('243','','','','')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('243','','','','')");
        db.execSQL("INSERT INTO himno (id , nombre, contenido, coro, contenido_dos) values ('244','','','','')");


    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE himno");
    onCreate(db);
    }
}
