public enum Oblastar {
    CHUI("bul oblasta borborubus jaigashkan"),
    NARYN("Kyshynda abdan suuk"),
    TALAS("Buurchaktyn mekeni"),
    OSH("Sulaiman-Toosu menen ozgocho"),
    BATKEN("Oruktoru abdan daamdu"),
    YSSYK_KOL("Kyshynda tonbogon kolu bar"),
    JALAL_ABAD("Koon arbuz erte byshat");
    private String ozgocholugu;

    Oblastar(String ozgocholugu) {
        this.ozgocholugu = ozgocholugu;
    }

    @Override
    public String toString() {
        return "Oblastar{" +
                "ozgocholugu='" + ozgocholugu + '\'' +
                '}';
    }
}
