package com.sparta.ap;

public class MovieClassifications {

    public static void main(String[] args) {
        int ageOfViewer = 0;
        String filmCategory = availableClassifications(ageOfViewer);
        System.out.println(filmCategory);
    }

    public static String availableClassifications(int ageOfViewer) {
        String result = "";
        if (ageOfViewer < 4) {
            result = "No film is available.";
        }
        else if (ageOfViewer < 8) {
            result = "U films are available.";
        } else if (ageOfViewer < 12) {
            result = "U and PG films are available.";
        } else if (ageOfViewer < 15) {
            result = "U, PG and 12 films are available.";
        } else if (ageOfViewer < 18) {
            result = "U, PG, 12 and 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }
}

