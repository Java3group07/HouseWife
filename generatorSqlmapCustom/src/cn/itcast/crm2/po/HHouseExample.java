package cn.itcast.crm2.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HHouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andGenreIsNull() {
            addCriterion("genre is null");
            return (Criteria) this;
        }

        public Criteria andGenreIsNotNull() {
            addCriterion("genre is not null");
            return (Criteria) this;
        }

        public Criteria andGenreEqualTo(String value) {
            addCriterion("genre =", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotEqualTo(String value) {
            addCriterion("genre <>", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreGreaterThan(String value) {
            addCriterion("genre >", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreGreaterThanOrEqualTo(String value) {
            addCriterion("genre >=", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLessThan(String value) {
            addCriterion("genre <", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLessThanOrEqualTo(String value) {
            addCriterion("genre <=", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLike(String value) {
            addCriterion("genre like", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotLike(String value) {
            addCriterion("genre not like", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreIn(List<String> values) {
            addCriterion("genre in", values, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotIn(List<String> values) {
            addCriterion("genre not in", values, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreBetween(String value1, String value2) {
            addCriterion("genre between", value1, value2, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotBetween(String value1, String value2) {
            addCriterion("genre not between", value1, value2, "genre");
            return (Criteria) this;
        }

        public Criteria andOrieIsNull() {
            addCriterion("orie is null");
            return (Criteria) this;
        }

        public Criteria andOrieIsNotNull() {
            addCriterion("orie is not null");
            return (Criteria) this;
        }

        public Criteria andOrieEqualTo(String value) {
            addCriterion("orie =", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieNotEqualTo(String value) {
            addCriterion("orie <>", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieGreaterThan(String value) {
            addCriterion("orie >", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieGreaterThanOrEqualTo(String value) {
            addCriterion("orie >=", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieLessThan(String value) {
            addCriterion("orie <", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieLessThanOrEqualTo(String value) {
            addCriterion("orie <=", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieLike(String value) {
            addCriterion("orie like", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieNotLike(String value) {
            addCriterion("orie not like", value, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieIn(List<String> values) {
            addCriterion("orie in", values, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieNotIn(List<String> values) {
            addCriterion("orie not in", values, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieBetween(String value1, String value2) {
            addCriterion("orie between", value1, value2, "orie");
            return (Criteria) this;
        }

        public Criteria andOrieNotBetween(String value1, String value2) {
            addCriterion("orie not between", value1, value2, "orie");
            return (Criteria) this;
        }

        public Criteria andLnumIsNull() {
            addCriterion("lnum is null");
            return (Criteria) this;
        }

        public Criteria andLnumIsNotNull() {
            addCriterion("lnum is not null");
            return (Criteria) this;
        }

        public Criteria andLnumEqualTo(String value) {
            addCriterion("lnum =", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumNotEqualTo(String value) {
            addCriterion("lnum <>", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumGreaterThan(String value) {
            addCriterion("lnum >", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumGreaterThanOrEqualTo(String value) {
            addCriterion("lnum >=", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumLessThan(String value) {
            addCriterion("lnum <", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumLessThanOrEqualTo(String value) {
            addCriterion("lnum <=", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumLike(String value) {
            addCriterion("lnum like", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumNotLike(String value) {
            addCriterion("lnum not like", value, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumIn(List<String> values) {
            addCriterion("lnum in", values, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumNotIn(List<String> values) {
            addCriterion("lnum not in", values, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumBetween(String value1, String value2) {
            addCriterion("lnum between", value1, value2, "lnum");
            return (Criteria) this;
        }

        public Criteria andLnumNotBetween(String value1, String value2) {
            addCriterion("lnum not between", value1, value2, "lnum");
            return (Criteria) this;
        }

        public Criteria andFitmentIsNull() {
            addCriterion("fitment is null");
            return (Criteria) this;
        }

        public Criteria andFitmentIsNotNull() {
            addCriterion("fitment is not null");
            return (Criteria) this;
        }

        public Criteria andFitmentEqualTo(String value) {
            addCriterion("fitment =", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentNotEqualTo(String value) {
            addCriterion("fitment <>", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentGreaterThan(String value) {
            addCriterion("fitment >", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentGreaterThanOrEqualTo(String value) {
            addCriterion("fitment >=", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentLessThan(String value) {
            addCriterion("fitment <", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentLessThanOrEqualTo(String value) {
            addCriterion("fitment <=", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentLike(String value) {
            addCriterion("fitment like", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentNotLike(String value) {
            addCriterion("fitment not like", value, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentIn(List<String> values) {
            addCriterion("fitment in", values, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentNotIn(List<String> values) {
            addCriterion("fitment not in", values, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentBetween(String value1, String value2) {
            addCriterion("fitment between", value1, value2, "fitment");
            return (Criteria) this;
        }

        public Criteria andFitmentNotBetween(String value1, String value2) {
            addCriterion("fitment not between", value1, value2, "fitment");
            return (Criteria) this;
        }

        public Criteria andSituationIsNull() {
            addCriterion("situation is null");
            return (Criteria) this;
        }

        public Criteria andSituationIsNotNull() {
            addCriterion("situation is not null");
            return (Criteria) this;
        }

        public Criteria andSituationEqualTo(Integer value) {
            addCriterion("situation =", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotEqualTo(Integer value) {
            addCriterion("situation <>", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThan(Integer value) {
            addCriterion("situation >", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("situation >=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThan(Integer value) {
            addCriterion("situation <", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThanOrEqualTo(Integer value) {
            addCriterion("situation <=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationIn(List<Integer> values) {
            addCriterion("situation in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotIn(List<Integer> values) {
            addCriterion("situation not in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationBetween(Integer value1, Integer value2) {
            addCriterion("situation between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("situation not between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("indate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("indate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Date value) {
            addCriterionForJDBCDate("indate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("indate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Date value) {
            addCriterionForJDBCDate("indate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("indate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Date value) {
            addCriterionForJDBCDate("indate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("indate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Date> values) {
            addCriterionForJDBCDate("indate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("indate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("indate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("indate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andConstimeIsNull() {
            addCriterion("constime is null");
            return (Criteria) this;
        }

        public Criteria andConstimeIsNotNull() {
            addCriterion("constime is not null");
            return (Criteria) this;
        }

        public Criteria andConstimeEqualTo(Date value) {
            addCriterionForJDBCDate("constime =", value, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("constime <>", value, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("constime >", value, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("constime >=", value, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeLessThan(Date value) {
            addCriterionForJDBCDate("constime <", value, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("constime <=", value, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeIn(List<Date> values) {
            addCriterionForJDBCDate("constime in", values, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("constime not in", values, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("constime between", value1, value2, "constime");
            return (Criteria) this;
        }

        public Criteria andConstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("constime not between", value1, value2, "constime");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("traffic is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("traffic is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("traffic =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("traffic <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("traffic >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("traffic >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("traffic <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("traffic <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("traffic like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("traffic not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("traffic in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("traffic not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("traffic between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("traffic not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}