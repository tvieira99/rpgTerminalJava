import java.util.*;

public class Main {

  static public Tree<Event> dungeonShowDoBobo(Player player) {
    String respostaErrada = "Apresentador: Errada! \n Você sente algo te perfurando, a sensação de dejávu é forte, você não aguenta e fecha os olhos... você abre os olhos e vê uma cadeira.";
    Dialog inicial = new Dialog("Inicio do Jogo:");
    Tree<Event> returnTree = new Tree<>(inicial);
    Dialog dialog1 = new Dialog("-Você vai em direção a cadeira-");
    Dialog dialog2 = new Dialog("-Você sente uma sensação de dejávu quando senta na cadeira-");
    Dialog dialog3 = new Dialog("Apresentador: Bem-vindo! Preparado?");
    Dialog dialog4 = new Dialog(
        "-A grande plateia te deixa nervoso, mas você estranhamente não sente estranheza, que engraçado-");
    Dialog dialog5 = new Dialog("-Você vê rostos familiares, mas não conhece essas pessoas-");
    Dialog dialog6 = new Dialog(player.getNome() + ": Sim.");
    Dialog dialog7 = new Dialog("Apresentador: Então vamos começar! Lembrando que errar não é uma boa ideia!");
    Dialog dialog8 = new Dialog(
        "-Ao mesmo tempo que parece que é sua primeira vez aqui, você sente que já sabe as regras-");

    ArrayList<String> customEvent1Answers = new ArrayList<>();
    customEvent1Answers.add("1. Goblin Assado\n");
    customEvent1Answers.add("2. Geleia de slime\n");
    customEvent1Answers.add("3. Batata assada com mel\n");
    customEvent1Answers.add("4. Melaxi");
    CustomEvent customEvent1 = new CustomEvent("Apresentador: Qual a comida preferida do Rei?\n", 2, customEvent1Answers,
        "Apresentador: Resposta exata!", respostaErrada);

    Dialog dialog9 = new Dialog(
        "Apresentador: Isso é de conhecimento público, nosso Rei ama batata assada com mel, quem vai o \nculpar não é mesmo? É realmente muuito bom!");
    Dialog dialog10 = new Dialog("Apresentador: Vamos a próxima, um pouco mais complicada.");

    ArrayList<String> customEvent2Answers = new ArrayList<>();
    customEvent2Answers.add("1. Super Classe\n");
    customEvent2Answers.add("2. Magia Pai\n");
    customEvent2Answers.add("3. Super Magia\n");
    customEvent2Answers.add("4. Magia Suprema");
    CustomEvent customEvent2 = new CustomEvent("Apresentador: Na magia, como é chamado as magias poderosas que tem magias mais fracas como filhos?\n", 0, customEvent2Answers, "Apresentador: Exatamente!", respostaErrada);
    
    Dialog dialog11 =  new Dialog("Apresentador: As Super Classes são chamadas assim graças a tecnologia!");
    Dialog dialog12 =  new Dialog("Apresentador: Ainda bem que *" + player.getNome() + "* lembra das regras!");
    Dialog dialog13 =  new Dialog("-A plateia ri-");
    Dialog dialog14 = new Dialog("Apresentador: Quantas vezes será que você caiu nessa?");
    Dialog dialog15 = new Dialog(player.getNome() + ": Como assim?");
    Dialog dialog16 = new Dialog("-Sua cabeça doi-");
    Dialog dialog17 = new Dialog("-O apresentador para de sorrir-");
    Dialog dialog18 = new Dialog("Apresentador: Sem perguntas.");
    Dialog dialog19 = new Dialog("-A plateia faz silêncio-");
    Dialog dialog20 = new Dialog("-O apresentador volta a sorrir-");
    Dialog dialog21 = new Dialog("Apresentador: Então vamos!!");
    Dialog dialog22 = new Dialog("-A plateia se anima-");
    Dialog dialog23 = new Dialog("Apresentador: Temos mais perguntas pela frente!");

    ArrayList<String> customEvent3Answers = new ArrayList<>();
    customEvent3Answers.add("1. Lua\n");
    customEvent3Answers.add("2. Europa\n");
    customEvent3Answers.add("3. Reia\n");
    customEvent3Answers.add("4. Titã");
    CustomEvent customEvent3 = new CustomEvent("Apresentador: Qual o nome da nossa maior lua?\n", 3, customEvent3Answers, "Apresentador: Corretamente!", respostaErrada);

    Dialog dialog24 = new Dialog("Apresentador: Temos tantas luas, mas aquela amarelinha lá no céu se destaca!");
    Dialog dialog25 = new Dialog("Apresentador: Eu não lembro quem deu o nome pra essa lua agora, mas é um bom nome!");
    Dialog dialog26 = new Dialog("Apresentador: Eu ainda lembro quando a valkyria quase destruiu ela, ia ser tão triste...");

    ArrayList<String> customEvent4Answers = new ArrayList<>();
    customEvent4Answers.add("1. Eu vim com os meus amigos\n");
    customEvent4Answers.add("2. Eu vim pelo deserto para ficar mais forte\n");
    customEvent4Answers.add("3. Eu estrou atrás de riquezas\n");
    customEvent4Answers.add("4. Eu abri um arquivo java");
    CustomEvent customEvent4 = new CustomEvent("Apresentador: Bom, você lembra como chegou aqui?\n", 1, customEvent4Answers, "Apresentador: Você só acerta!", respostaErrada);

    Dialog dialog27 = new Dialog("Apresentador: Você está indo bem, está batendo os seus recordes!");
    Dialog dialog28 = new Dialog("-Você pensa: Meus recordes?-");
    Dialog dialog29 = new Dialog("Apresentador: Esse é seu último aviso. Sem perguntas.");
    Dialog dialog30 = new Dialog("-Você se assusta-");
    Dialog dialog31 = new Dialog("Apresentador: Mas o SHOW não pode parar! Vamos a próxima pergunta!");
    
    ArrayList<String> customEvent5Answers = new ArrayList<>();
    customEvent5Answers.add("1. 24\n");
    customEvent5Answers.add("2. 66\n");
    customEvent5Answers.add("3. 1\n");
    customEvent5Answers.add("4. 29");
    CustomEvent customEvent5 = new CustomEvent("Apresentador: Qual o próximo número na sequência: 1, 12, 18 ?\n", 2, customEvent5Answers, "Apresentador: Certa! Padrões, padrões, quem gosta deles não é verdade?", respostaErrada);

    Dialog dialog32 = new Dialog("Apresentador: Vocês humanos são fixados em padrões, até quando chovia vocês achavam que era algo importante, tsc tsc.");
    
    ArrayList<String> customEvent6Answers = new ArrayList<>();
    customEvent6Answers.add("1. !\n");
    customEvent6Answers.add("2. ?");
    CustomEvent customEvent6 = new CustomEvent("?\n", 0, customEvent6Answers, "Apresentador: Haha, muito bem, isso é o que eu chamo de streak.\n", respostaErrada);

    Dialog dialog33 = new Dialog("Apresentador: Se bem que seus amigos foram muito mais rápidos que você.");
    Dialog dialog34 = new Dialog("-Você se lembra de alguns nomes-");
    Dialog dialog35 = new Dialog("-Evelynn, Osira, Keita, Gabriel-");
    Dialog dialog36 = new Dialog("Apresentador: Exatamente, a ************ foi incrível, inteligente até de mais.");
    Dialog dialog37 = new Dialog("-Você não entende como uma palavra pode ser redatada na vida real com alguém falando e não só em texto, mas você acabaou de ouvir e ver na sua frente-");
    Dialog dialog38 = new Dialog("Apresentador: Próxima pergunta!");

    ArrayList<String> customEvent7Answers = new ArrayList<>();
    customEvent7Answers.add("1. O Banco de Dados\n");
    customEvent7Answers.add("2. Guardião do Portão\n");
    customEvent7Answers.add("3. O Ponto Cego de Deus\n");
    customEvent7Answers.add("4. A Fechadura");
    CustomEvent customEvent7 = new CustomEvent("Apresentador: Quem é o verdadeiro SCP-001?\n", 0, customEvent7Answers, "Apresentador: Correta! O Banco de Dados é incrível não? Faz total sentido nós sermos a anomalia!", respostaErrada);

    ArrayList<String> customEvent8Answers = new ArrayList<>();
    customEvent8Answers.add("1. Sim, uma água\n");
    customEvent8Answers.add("2. Prefiro um suco\n");
    customEvent8Answers.add("3. Não");
    CustomEvent customEvent8 = new CustomEvent("Apresentador: Estamos quase no final do show, quer uma água ou algo assim?\n", 2, customEvent8Answers, "Apresentador: Hehe, correta! Ótimo.", respostaErrada);

    Dialog dialog39 = new Dialog("Apresentador vamos a nossa penúltima pergunta!");

    ArrayList<String> customEvent9Answers =  new ArrayList<>();
    customEvent9Answers.add("1. Aurora\n");
    customEvent9Answers.add("2. " + player.getNome() + "\n");
    customEvent9Answers.add("3. Hildo\n");
    customEvent9Answers.add("4. V");
    CustomEvent customEvent9 = new CustomEvent("Apresentador: Qual o seu nome?\n", 0, customEvent9Answers, "Apresentador: Mais ou menos correta, pelo menos no momento. Mas está VALENDO!", respostaErrada);

    Dialog dialog40 = new Dialog("Apresentador: Incrível, você chegou aqui!");
    Dialog dialog41 = new Dialog("Apresentador: Parabéns Aurora e " + player.getNome() + " grande equipe!");
    Dialog dialog42 = new Dialog("-Você fica confuso e sua dor de cabeça piora-");
    Dialog dialog43 = new Dialog("Apresentador: Vamos a ÚLTIMA pergunta!");

    ArrayList<String> customEvent10Answers = new ArrayList<>();
    customEvent10Answers.add("1. Kenichiro Yoshida\n");
    customEvent10Answers.add("2. Bill Gates\n");
    customEvent10Answers.add("3. Satya Nadella\n");
    customEvent10Answers.add("4. Steve Jobs");
    CustomEvent customEvent10 = new CustomEvent("Apresentador: Qual o nome do atual CEO da Microsoft?\n", 2, customEvent10Answers, "Apresentador: E a resposta está...", respostaErrada);

    Dialog dialog44 = new Dialog("Apresentador: Está...");
    Dialog dialog45 = new Dialog("-Você sente tudo derretendo, inclusive você mesmo-");
    Dialog dialog46 = new Dialog("-Tudo fica preto-");
    Dialog dialog47 = new Dialog("-De repente você lembra de inumeras coisas da sua vida, sua cabeça doi, mas ao mesmo tempo você sente um alívio-");
    Dialog dialog48 = new Dialog("-Aurora, Magia, Amigos, Dungeons, Aventura-");
    Dialog dialog49 = new Dialog("-Todas essas palavras vem na sua cabeça rapidamente-");
    Dialog dialog50 = new Dialog("-Nomes, pessoas, rostos, experiências-");
    Dialog dialog51 = new Dialog("-Você fecha os olhos-");
    Dialog dialog52 = new Dialog("???: Acorda cara, você foi o último!");
    Dialog dialog53 = new Dialog("???: Só joga água nele!");
    Dialog dialog54 = new Dialog("-Você abre os olhos-");
    Dialog dialog55 = new Dialog("-Água cai no seu rosto-");
    Dialog dialog56 = new Dialog("-Você fica assustado-");
    Dialog dialog57 = new Dialog("Aurora: Eu dormi?");
    Dialog dialog58 = new Dialog("Osira: Sim, você foi o último a completar...");
    Dialog dialog59 = new Dialog("-Você vê um popup na sua frente escrito: Você completou o Show do Bobo da Corte! +34000 de experiência adquirida! Pergaminho de Amnesia adicionado!-");
    Dialog dialog60 = new Dialog("-Outro popup aparece: Você avançou de tier! Tier atual: 34-");
    Dialog dialog61 = new Dialog("Aurora: Ah, entendi, eu acho...");
    Dialog dialog62 = new Dialog("Gabriel: Hahaha, eu achei que você era o mais inteligente de nós, mas foi o último!");
    Dialog dialog63 = new Dialog("Aurora: Eu... não tava em controle, tinha alguém ou algo...");
    Dialog dialog64 = new Dialog("Evelynn: Sim, eu também senti, não conseguia responder com minhas próprias forças, era um teste simples, mas..");
    Dialog dialog65 = new Dialog("Aurora: Mas tinha perguntas que não fazia sentido né?");
    Dialog dialog66 = new Dialog("Evelynn: É...");
    Dialog dialog67 = new Dialog("Aurora: O que é microsoft? O que é SCP?");
    Dialog dialog68 = new Dialog("-Todos aparecem confusos-");
    Dialog dialog69 = new Dialog("Aurora: Eu ainda sinto que tem alguém me escutando, aquele mesmo alguém ou algo que tentou me ajudar lá...");
    Dialog dialog70 = new Dialog("Osira: Eu não sabia nada, mas fui a primeira a completar, sorte que tinha esse alguém ajudando!");
    Dialog dialog71 = new Dialog("Keita: Bom, chega, temos que sair do deserto, depois discutimos!");
    Dialog dialog72 = new Dialog("Fim de Jogo.");
    Dialog dialog73 = new Dialog("");

    returnTree.addLeaf(inicial, dialog1);
    returnTree.addLeaf(dialog1, dialog2);
    returnTree.addLeaf(dialog2, dialog3);
    returnTree.addLeaf(dialog3, dialog4);
    returnTree.addLeaf(dialog4, dialog5);
    returnTree.addLeaf(dialog5, dialog6);
    returnTree.addLeaf(dialog6, dialog7);
    returnTree.addLeaf(dialog7, dialog8);
    returnTree.addLeaf(dialog8, customEvent1);
    returnTree.addLeaf(customEvent1, dialog9);
    returnTree.addLeaf(dialog9, dialog10);
    returnTree.addLeaf(dialog10, customEvent2);
    returnTree.addLeaf(customEvent2, dialog11);
    returnTree.addLeaf(dialog11, dialog12);
    returnTree.addLeaf(dialog12, dialog13);
    returnTree.addLeaf(dialog13, dialog14);
    returnTree.addLeaf(dialog14, dialog15);
    returnTree.addLeaf(dialog15, dialog16);
    returnTree.addLeaf(dialog16, dialog17);
    returnTree.addLeaf(dialog17, dialog18);
    returnTree.addLeaf(dialog18, dialog19);
    returnTree.addLeaf(dialog19, dialog20);
    returnTree.addLeaf(dialog20, dialog21);
    returnTree.addLeaf(dialog21, dialog22);
    returnTree.addLeaf(dialog22, dialog23);
    returnTree.addLeaf(dialog23, customEvent3);
    returnTree.addLeaf(customEvent3, dialog24);
    returnTree.addLeaf(dialog24, dialog25);
    returnTree.addLeaf(dialog25, dialog26);
    returnTree.addLeaf(dialog26, customEvent4);
    returnTree.addLeaf(customEvent4, dialog27);
    returnTree.addLeaf(dialog27, dialog28);
    returnTree.addLeaf(dialog28, dialog29);
    returnTree.addLeaf(dialog29, dialog30);
    returnTree.addLeaf(dialog30, dialog31);
    returnTree.addLeaf(dialog31, customEvent5);
    returnTree.addLeaf(customEvent5, dialog32);
    returnTree.addLeaf(dialog32, customEvent6);
    returnTree.addLeaf(customEvent6, dialog33);
    returnTree.addLeaf(dialog33, dialog34);
    returnTree.addLeaf(dialog34, dialog35);
    returnTree.addLeaf(dialog35, dialog36);
    returnTree.addLeaf(dialog36, dialog37);
    returnTree.addLeaf(dialog37, dialog38);
    returnTree.addLeaf(dialog38, customEvent7);
    returnTree.addLeaf(customEvent7, customEvent8);
    returnTree.addLeaf(customEvent8, dialog39);
    returnTree.addLeaf(dialog39, customEvent9);
    returnTree.addLeaf(customEvent9, dialog40);
    returnTree.addLeaf(dialog40, dialog41);
    returnTree.addLeaf(dialog41, dialog42);
    returnTree.addLeaf(dialog42, dialog43);
    returnTree.addLeaf(dialog43, customEvent10);
    returnTree.addLeaf(customEvent10, dialog44);
    returnTree.addLeaf(dialog44, dialog45);
    returnTree.addLeaf(dialog45, dialog46);
    returnTree.addLeaf(dialog46, dialog47);
    returnTree.addLeaf(dialog47, dialog48);
    returnTree.addLeaf(dialog48, dialog49);
    returnTree.addLeaf(dialog49, dialog50);
    returnTree.addLeaf(dialog50, dialog51);
    returnTree.addLeaf(dialog51, dialog52);
    returnTree.addLeaf(dialog52, dialog53);
    returnTree.addLeaf(dialog53, dialog54);
    returnTree.addLeaf(dialog54, dialog55);
    returnTree.addLeaf(dialog55, dialog56);
    returnTree.addLeaf(dialog56, dialog57);
    returnTree.addLeaf(dialog57, dialog58);
    returnTree.addLeaf(dialog58, dialog59);
    returnTree.addLeaf(dialog59, dialog60);
    returnTree.addLeaf(dialog60, dialog61);
    returnTree.addLeaf(dialog61, dialog62);
    returnTree.addLeaf(dialog62, dialog63);
    returnTree.addLeaf(dialog63, dialog64);
    returnTree.addLeaf(dialog64, dialog65);
    returnTree.addLeaf(dialog65, dialog66);
    returnTree.addLeaf(dialog66, dialog67);
    returnTree.addLeaf(dialog67, dialog68);
    returnTree.addLeaf(dialog68, dialog69);
    returnTree.addLeaf(dialog69, dialog70);
    returnTree.addLeaf(dialog70, dialog71);
    returnTree.addLeaf(dialog71, dialog72);
    returnTree.addLeaf(dialog72, dialog73);
    return returnTree;
  }

  static public void main(String [] args){
    //Crie o jogo criando uma árvore de eventos (Tree<Events> e passando ela para um objeto do EventHandling)
    Chat.newLine("Digite seu Nome");
    Scanner takingName = new Scanner(System.in);
    System.out.println("");
    String s = takingName.nextLine();
    Player player = new Player(s);

    EventHandling newGame = new EventHandling(dungeonShowDoBobo(player));
    newGame.start();
  }
}
