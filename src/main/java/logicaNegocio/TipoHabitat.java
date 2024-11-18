package logicaNegocio;

public enum TipoHabitat {
    void EnumValues() {
        assertEquals(TipoHabitat.ACUATICO, TipoHabitat.valueOf("ACUATICO"));
        assertEquals(TipoHabitat.TERRESTRE, TipoHabitat.valueOf("TERRESTRE"));
        assertEquals(TipoHabitat.AEREO, TipoHabitat.valueOf("AEREO"));
}
    void testEnumSize() {
        assertEquals(3, TipoHabitat.values().length);
}