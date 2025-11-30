class SqueakyClean {

        static String clean(String identifier) {
            String id ="";
            char ch;
            for (int i= 0; i < identifier.length(); i++){
                ch = identifier.charAt(i);
                switch (ch){
                    case ' ' -> id += "_";
                    case '-' -> {
                        if ((i < identifier.length() - 1) && Character.isLetter(identifier.charAt(i + 1)) ) {
                            id += Character.toUpperCase(identifier.charAt(i + 1));
                            i++;
                        }

                    }
                    case '4' -> id += "a";
                    case '3' -> id += "e";
                    case '1' -> id += "l";
                    case '7' -> id += "t";
                    case '0' -> id += "o";
                    default -> {
                        if (Character.isLetter(ch)) id += ch;
                    }
                }
            }
            return id;
        }


}