public class Main {
    public static void main(String[] args) {
        String input = "тётё тбсё цётщ. хфрё зёче сфтёс рцфзёшв.";
        StringBuilder output = new StringBuilder();
        int caesarShift = 6;
        int newSymbol, shift;
        char currentSymbol;
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч',
                'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я',
        };

        caesarShift = caesarShift % 33;
        for(int i=0; i<input.length(); i++){
            currentSymbol = input.charAt(i);
            for(int j=0; j<33; j++){
                if (currentSymbol == alphabet[j]) {
                    if(j - caesarShift<0){
                        shift = 33 - Math.abs(j-caesarShift);
                    }
                    else{
                        shift = j-caesarShift;
                    }
                    newSymbol = (shift) % 33;
                    output.append(alphabet[newSymbol]);
                    break;
                }
                if(j == 32){
                    output.append(currentSymbol);
                }
            }

        }
        System.out.println();
        System.out.println(input);
        System.out.println();
        System.out.println(output);
    }

}