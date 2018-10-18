package me.Blen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Male> maleList = new ArrayList<>();
        ArrayList<Female> femalesList = new ArrayList<>();

        //instances of male and female objects
        Male maleOne = new Male();
        Male maleTwo = new Male();
        Male maleThree = new Male();

        Female femaleOne = new Female();
        Female femaleTwo = new Female();
        Female femaleThree = new Female();

        //giving the instances values
        maleOne.setName("John");
        maleOne.setDateCount(0);
        maleTwo.setName("Henry");
        maleTwo.setDateCount(0);
        maleThree.setName("Kebede");
        maleThree.setDateCount(0);
        maleList.add(maleOne);
        maleList.add(maleTwo);
        maleList.add(maleThree);

        femaleOne.setName("Helene");
        femaleOne.setDateCount(0);
        femaleTwo.setName("Hanna");
        femaleOne.setDateCount(0);
        femaleThree.setName("Lily");
        femaleOne.setDateCount(0);
        femalesList.add(femaleOne);
        femalesList.add(femaleTwo);
        femalesList.add(femaleThree);

        Male randomMale;
        Female randomFemale;

        Random rand = new Random();

        randomMale = maleList.get(rand.nextInt(maleList.size()));
        randomFemale = femalesList.get(rand.nextInt(femalesList.size()));

        Collections.shuffle(maleList, rand);
        ArrayList<Person> datesList = new ArrayList<>();

        for(int count= 0; count<10; count++){
            //picking a random male
            randomMale = maleList.get(rand.nextInt(maleList.size()));
            String randomName = randomMale.getName();

            //picking a random female
            randomFemale = femalesList.get(rand.nextInt(femalesList.size()));
            String randAnotherName = randomFemale.getName();

            //make the person free is they are assigned with them selves
            if(randomName.equalsIgnoreCase(randAnotherName)){
                System.out.println(randomMale.getName() + " is free");
            }else{
                //creating a dating list
                //add the male to the list
                datesList.add(randomMale);
                //adding on the date count for that person
                int trackingDateNum = randomMale.getDateCount();
                trackingDateNum = trackingDateNum + 1;
                randomMale.setDateCount(trackingDateNum);

                datesList.add(randomFemale);
                //adding on the date count for that person
                int trackingDateNumFem = randomFemale.getDateCount();
                trackingDateNumFem = trackingDateNumFem + 1;
                randomFemale.setDateCount(trackingDateNumFem);

                //printing who is ona date with whom
                System.out.println(randomFemale.getName() + "  asked him out, and " + randomMale.getName() + " accepted.");

                System.out.println(randomFemale.getName());
                System.out.println(randomFemale.getDateCount());

            }
        }

    }
    public String showPhrases(){
        ArrayList<String> phrasesArr = new ArrayList<>();

        phrasesArr.add(" played chess with ");
        phrasesArr.add(" visited ");
        phrasesArr.add(" went to dinner with t ");

        int index = new Random().nextInt(phrasesArr.size());
        String randomPhrase = phrasesArr.get(index);
        return randomPhrase;
    }

//    public static void check(ArrayList<Person> dateList, Female female, Male male){
//    }
   /* for(Person eachPerson: datesList){
        System.out.println(eachPerson.getName());

        eachPerson.setDateCount(+1);
        System.out.println(eachPerson.getDateCount());
    }*/
}
