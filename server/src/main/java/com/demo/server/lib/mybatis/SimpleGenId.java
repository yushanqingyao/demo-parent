package com.demo.server.lib.mybatis;

import tk.mybatis.mapper.genid.GenId;

/**
 * 不考虑任何特殊情况，不适用于生产环境
 */
public class SimpleGenId implements GenId<Long> {
    private Long    time;
    private Integer seq;

    public synchronized Long genId(String table, String column) {
        long current = System.currentTimeMillis();
        if (time == null || time != current) {
            time = current;
            seq = 1;
        } else if (current == time) {
            seq++;
        }
        return (time << 20) | seq;
    }
}
