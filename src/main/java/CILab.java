public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse()
    {
        String word = myString;
        boolean containsUpperCase = !word.equals(word.toLowerCase());
        return containsUpperCase;
    }

}

