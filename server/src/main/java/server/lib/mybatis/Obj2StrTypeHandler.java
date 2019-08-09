package server.lib.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.util.Assert;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Obj2StrTypeHandler <E extends Obj2StrConverter> extends BaseTypeHandler<E> {
    private final Class<E> type;

    public Obj2StrTypeHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        } else {
            this.type = type;
        }
    }

    private E convertToAddress(String resultStr){
        E e = null;
        try {
            e = type.newInstance();
            e.buildResultObj(resultStr);
        } catch (InstantiationException ex) {
            Assert.isTrue(false,ex.getMessage());
        } catch (IllegalAccessException ex) {
            Assert.isTrue(false,ex.getMessage());
        }
        return e;
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, e.buildSqlParam());

    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return convertToAddress(rs.getString(columnName));
    }

    @Override
    public E getNullableResult(ResultSet rs, int i) throws SQLException {
        return convertToAddress(rs.getString(i));
    }

    @Override
    public E getNullableResult(CallableStatement cs, int i) throws SQLException {
        return convertToAddress(cs.getString(i));
    }
}
