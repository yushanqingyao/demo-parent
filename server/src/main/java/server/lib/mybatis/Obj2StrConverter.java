package server.lib.mybatis;

public interface Obj2StrConverter {
    String buildSqlParam();


    void buildResultObj(String data);
}
