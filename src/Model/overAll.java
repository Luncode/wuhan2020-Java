package Model;

import java.util.List;

public class overAll {

    /**
     * results : [{"infectSource":"野生动物，可能为中华菊头蝠","passWay":"经呼吸道飞沫传播，亦可通过接触传播","dailyPic":"https://img1.dxycdn.com/2020/0130/124/3393775338634369056-73.jpg","summary":"","countRemark":"","confirmedCount":7766,"suspectedCount":12139,"curedCount":132,"deadCount":170,"virus":"新型冠状病毒 2019-nCoV","remark1":"易感人群: 人群普遍易感。老年人及有基础疾病者感染后病情较重，儿童及婴幼儿也有发病","remark2":"潜伏期: 一般为 3~7 天，最长不超过 14 天，潜伏期内存在传染性","remark3":"","remark4":"","remark5":"","generalRemark":"疑似病例数来自国家卫健委数据，目前为全国数据，未分省市自治区等","abroadRemark":"","updateTime":1580369716841}]
     * success : true
     */

    private boolean success;
    private List<ResultsBean> results;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * infectSource : 野生动物，可能为中华菊头蝠
         * passWay : 经呼吸道飞沫传播，亦可通过接触传播
         * dailyPic : https://img1.dxycdn.com/2020/0130/124/3393775338634369056-73.jpg
         * summary :
         * countRemark :
         * confirmedCount : 7766
         * suspectedCount : 12139
         * curedCount : 132
         * deadCount : 170
         * virus : 新型冠状病毒 2019-nCoV
         * remark1 : 易感人群: 人群普遍易感。老年人及有基础疾病者感染后病情较重，儿童及婴幼儿也有发病
         * remark2 : 潜伏期: 一般为 3~7 天，最长不超过 14 天，潜伏期内存在传染性
         * remark3 :
         * remark4 :
         * remark5 :
         * generalRemark : 疑似病例数来自国家卫健委数据，目前为全国数据，未分省市自治区等
         * abroadRemark :
         * updateTime : 1580369716841
         */

        private String infectSource;
        private String passWay;
        private String dailyPic;
        private String summary;
        private String countRemark;
        private int confirmedCount;
        private int suspectedCount;
        private int curedCount;
        private int deadCount;
        private String virus;
        private String remark1;
        private String remark2;
        private String remark3;
        private String remark4;
        private String remark5;
        private String generalRemark;
        private String abroadRemark;
        private long updateTime;

        public String getInfectSource() {
            return infectSource;
        }

        public void setInfectSource(String infectSource) {
            this.infectSource = infectSource;
        }

        public String getPassWay() {
            return passWay;
        }

        public void setPassWay(String passWay) {
            this.passWay = passWay;
        }

        public String getDailyPic() {
            return dailyPic;
        }

        public void setDailyPic(String dailyPic) {
            this.dailyPic = dailyPic;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getCountRemark() {
            return countRemark;
        }

        public void setCountRemark(String countRemark) {
            this.countRemark = countRemark;
        }

        public int getConfirmedCount() {
            return confirmedCount;
        }

        public void setConfirmedCount(int confirmedCount) {
            this.confirmedCount = confirmedCount;
        }

        public int getSuspectedCount() {
            return suspectedCount;
        }

        public void setSuspectedCount(int suspectedCount) {
            this.suspectedCount = suspectedCount;
        }

        public int getCuredCount() {
            return curedCount;
        }

        public void setCuredCount(int curedCount) {
            this.curedCount = curedCount;
        }

        public int getDeadCount() {
            return deadCount;
        }

        public void setDeadCount(int deadCount) {
            this.deadCount = deadCount;
        }

        public String getVirus() {
            return virus;
        }

        public void setVirus(String virus) {
            this.virus = virus;
        }

        public String getRemark1() {
            return remark1;
        }

        public void setRemark1(String remark1) {
            this.remark1 = remark1;
        }

        public String getRemark2() {
            return remark2;
        }

        public void setRemark2(String remark2) {
            this.remark2 = remark2;
        }

        public String getRemark3() {
            return remark3;
        }

        public void setRemark3(String remark3) {
            this.remark3 = remark3;
        }

        public String getRemark4() {
            return remark4;
        }

        public void setRemark4(String remark4) {
            this.remark4 = remark4;
        }

        public String getRemark5() {
            return remark5;
        }

        public void setRemark5(String remark5) {
            this.remark5 = remark5;
        }

        public String getGeneralRemark() {
            return generalRemark;
        }

        public void setGeneralRemark(String generalRemark) {
            this.generalRemark = generalRemark;
        }

        public String getAbroadRemark() {
            return abroadRemark;
        }

        public void setAbroadRemark(String abroadRemark) {
            this.abroadRemark = abroadRemark;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }
    }
}
