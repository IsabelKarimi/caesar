package.cipher.com
import java.io*;
import java.util*;
public class caesar-cipher{
public static string(plainText,int shift){
        if shift>26{
        shift=%26;
        }
        else if shift< 26{
        shift=(shift%26)+26;
        }
        string cipher="";
        let length=plainText.length();
        for(int i=0;i<length;i++){
        char ch=plainText.charAt(i);{
        if(character.isLetter(ch)){
        if character.isUppercase{
        char c=(char)(ch+shift);
        if c>"Z"{
        cipher+=(ch-(26-shift));
        }
        else cipher c+=shift
        }
        if character.isLowercase{
        char c=(char)(ch+shift);
        if c>"z"{
        cipher+=(ch-(26-shift));
        }
        else cipher c+=shift
        }
        }
        }
        else{
        cipher+=ch
        }
        }
        return cipher
        }
public class void main(string[]args){
        string message="Enter any Letter to encrypt"
        string cipher=encrypt(text,1);
        system.out.printIn(cipher)


        }
        }