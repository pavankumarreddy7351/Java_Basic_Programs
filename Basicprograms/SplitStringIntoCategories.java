package com.telus.Basicprograms;

public class SplitStringIntoCategories {
    public static void main(String[] args) {
        String input = "Test@#$For1234Here987&";
        
        // Define regular expressions to match numbers, alphabets, and special symbols
        String regexNumbers = "[0-9]+";
        String regexAlphabets = "[a-zA-Z]+";
        String regexSpecialSymbols = "[^a-zA-Z0-9]+";
        
        String numbers = extractMatching(input, regexNumbers);
        String alphabets = extractMatching(input, regexAlphabets);
        String specialSymbols = extractMatching(input, regexSpecialSymbols);
        
        System.out.println("Input: " + input);
        System.out.println("Numbers: \"" + numbers + "\"");
        System.out.println("Alphabets: \"" + alphabets + "\"");
        System.out.println("Special Symbols: \"" + specialSymbols + "\"");
    }

    public static String extractMatching(String input, String regex) {
        StringBuilder result = new StringBuilder();
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            result.append(matcher.group());
        }

        return result.toString();
    }
}
