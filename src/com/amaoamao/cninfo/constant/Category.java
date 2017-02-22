package com.amaoamao.cninfo.constant;

public enum Category {
    ndbg(
            "category_ndbg_szsh;", "年度报告"
    ), bndbg(
            "category_bndbg_szsh;", "半年度报告"
    ), yjdbg(
            "category_yjdbg_szsh;", "一季度报告"
    ), sjdbg(
            "category_sjdbg_szsh;", "三季度报告"
    ), scgkfx(
            "category_scgkfx_szsh;", "首次公开发行及上市"
    ), pg(
            "category_pg_szsh;", "配股"
    ), zf(
            "category_zf_szsh;", "增发"
    ), kzhz(
            "category_kzhz_szsh;", "可转换债券"
    ), qzxg(
            "category_qzxg_szsh;", "权证相关公告"
    ), qtrz(
            "category_qtrz_szsh;", "其他融资"
    ), qyfpxzcs(
            "category_qyfpxzcs_szsh;", "权益及限制出售股份"
    ), gqbd(
            "category_gqbd_szsh;", "股权变动"
    ), jy(
            "category_jy_szsh;", "交易"
    ), gddh(
            "category_gddh_szsh;", "股东大会"
    ), cqfxyj(
            "category_cqfxyj_szsh;", "澄清风险业绩预告"
    ), tbclts(
            "category_tbclts_szsh;", "特别处理和退市"
    ), bcgz(
            "category_bcgz_szsh;", "补充及更正"
    ), zjjg(
            "category_zjjg_szsh;", "中介机构报告"
    ), ssgszd(
            "category_ssgszd_szsh;", "上市公司制度"
    ), zqgg(
            "category_zqgg_szsh;", "债券公告"
    ), qtzdsx(
            "category_qtzdsx_szsh;", "其它重大事项"
    ), dshgg(
            "category_dshgg_szsh;", "董事会公告"
    ), jshgg(
            "category_jshgg_szsh;", "监事会公告"
    );

    private String catName;
    private String des;

    Category(String catName, String des) {
        this.catName = catName;
        this.des = des;

    }

    public String getCatName() {
        return catName;
    }

    @Override
    public String toString() {
        return catName;
    }

    public String getDes() {
        return des;
    }
}
