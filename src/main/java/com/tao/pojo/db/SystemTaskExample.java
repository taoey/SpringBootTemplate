package com.tao.pojo.db;

import java.util.ArrayList;
import java.util.List;

public class SystemTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemTaskExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andBeanIsNull() {
            addCriterion("bean is null");
            return (Criteria) this;
        }

        public Criteria andBeanIsNotNull() {
            addCriterion("bean is not null");
            return (Criteria) this;
        }

        public Criteria andBeanEqualTo(String value) {
            addCriterion("bean =", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanNotEqualTo(String value) {
            addCriterion("bean <>", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanGreaterThan(String value) {
            addCriterion("bean >", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanGreaterThanOrEqualTo(String value) {
            addCriterion("bean >=", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanLessThan(String value) {
            addCriterion("bean <", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanLessThanOrEqualTo(String value) {
            addCriterion("bean <=", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanLike(String value) {
            addCriterion("bean like", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanNotLike(String value) {
            addCriterion("bean not like", value, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanIn(List<String> values) {
            addCriterion("bean in", values, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanNotIn(List<String> values) {
            addCriterion("bean not in", values, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanBetween(String value1, String value2) {
            addCriterion("bean between", value1, value2, "bean");
            return (Criteria) this;
        }

        public Criteria andBeanNotBetween(String value1, String value2) {
            addCriterion("bean not between", value1, value2, "bean");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNull() {
            addCriterion("runtime is null");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNotNull() {
            addCriterion("runtime is not null");
            return (Criteria) this;
        }

        public Criteria andRuntimeEqualTo(Long value) {
            addCriterion("runtime =", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotEqualTo(Long value) {
            addCriterion("runtime <>", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThan(Long value) {
            addCriterion("runtime >", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThanOrEqualTo(Long value) {
            addCriterion("runtime >=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThan(Long value) {
            addCriterion("runtime <", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThanOrEqualTo(Long value) {
            addCriterion("runtime <=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIn(List<Long> values) {
            addCriterion("runtime in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotIn(List<Long> values) {
            addCriterion("runtime not in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeBetween(Long value1, Long value2) {
            addCriterion("runtime between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotBetween(Long value1, Long value2) {
            addCriterion("runtime not between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andTaskExplainIsNull() {
            addCriterion("task_explain is null");
            return (Criteria) this;
        }

        public Criteria andTaskExplainIsNotNull() {
            addCriterion("task_explain is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExplainEqualTo(String value) {
            addCriterion("task_explain =", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotEqualTo(String value) {
            addCriterion("task_explain <>", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainGreaterThan(String value) {
            addCriterion("task_explain >", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainGreaterThanOrEqualTo(String value) {
            addCriterion("task_explain >=", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainLessThan(String value) {
            addCriterion("task_explain <", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainLessThanOrEqualTo(String value) {
            addCriterion("task_explain <=", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainLike(String value) {
            addCriterion("task_explain like", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotLike(String value) {
            addCriterion("task_explain not like", value, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainIn(List<String> values) {
            addCriterion("task_explain in", values, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotIn(List<String> values) {
            addCriterion("task_explain not in", values, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainBetween(String value1, String value2) {
            addCriterion("task_explain between", value1, value2, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andTaskExplainNotBetween(String value1, String value2) {
            addCriterion("task_explain not between", value1, value2, "taskExplain");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimingIsNull() {
            addCriterion("timing is null");
            return (Criteria) this;
        }

        public Criteria andTimingIsNotNull() {
            addCriterion("timing is not null");
            return (Criteria) this;
        }

        public Criteria andTimingEqualTo(String value) {
            addCriterion("timing =", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotEqualTo(String value) {
            addCriterion("timing <>", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThan(String value) {
            addCriterion("timing >", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThanOrEqualTo(String value) {
            addCriterion("timing >=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThan(String value) {
            addCriterion("timing <", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThanOrEqualTo(String value) {
            addCriterion("timing <=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLike(String value) {
            addCriterion("timing like", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotLike(String value) {
            addCriterion("timing not like", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingIn(List<String> values) {
            addCriterion("timing in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotIn(List<String> values) {
            addCriterion("timing not in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingBetween(String value1, String value2) {
            addCriterion("timing between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotBetween(String value1, String value2) {
            addCriterion("timing not between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("params is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("params is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("params =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("params <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("params >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("params >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("params <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("params <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("params like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("params not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("params in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("params not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("params between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("params not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamcountIsNull() {
            addCriterion("paramcount is null");
            return (Criteria) this;
        }

        public Criteria andParamcountIsNotNull() {
            addCriterion("paramcount is not null");
            return (Criteria) this;
        }

        public Criteria andParamcountEqualTo(Short value) {
            addCriterion("paramcount =", value, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountNotEqualTo(Short value) {
            addCriterion("paramcount <>", value, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountGreaterThan(Short value) {
            addCriterion("paramcount >", value, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountGreaterThanOrEqualTo(Short value) {
            addCriterion("paramcount >=", value, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountLessThan(Short value) {
            addCriterion("paramcount <", value, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountLessThanOrEqualTo(Short value) {
            addCriterion("paramcount <=", value, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountIn(List<Short> values) {
            addCriterion("paramcount in", values, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountNotIn(List<Short> values) {
            addCriterion("paramcount not in", values, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountBetween(Short value1, Short value2) {
            addCriterion("paramcount between", value1, value2, "paramcount");
            return (Criteria) this;
        }

        public Criteria andParamcountNotBetween(Short value1, Short value2) {
            addCriterion("paramcount not between", value1, value2, "paramcount");
            return (Criteria) this;
        }

        public Criteria andRetryIsNull() {
            addCriterion("retry is null");
            return (Criteria) this;
        }

        public Criteria andRetryIsNotNull() {
            addCriterion("retry is not null");
            return (Criteria) this;
        }

        public Criteria andRetryEqualTo(Short value) {
            addCriterion("retry =", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotEqualTo(Short value) {
            addCriterion("retry <>", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryGreaterThan(Short value) {
            addCriterion("retry >", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryGreaterThanOrEqualTo(Short value) {
            addCriterion("retry >=", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryLessThan(Short value) {
            addCriterion("retry <", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryLessThanOrEqualTo(Short value) {
            addCriterion("retry <=", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryIn(List<Short> values) {
            addCriterion("retry in", values, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotIn(List<Short> values) {
            addCriterion("retry not in", values, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryBetween(Short value1, Short value2) {
            addCriterion("retry between", value1, value2, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotBetween(Short value1, Short value2) {
            addCriterion("retry not between", value1, value2, "retry");
            return (Criteria) this;
        }

        public Criteria andRunstatusIsNull() {
            addCriterion("runstatus is null");
            return (Criteria) this;
        }

        public Criteria andRunstatusIsNotNull() {
            addCriterion("runstatus is not null");
            return (Criteria) this;
        }

        public Criteria andRunstatusEqualTo(Short value) {
            addCriterion("runstatus =", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusNotEqualTo(Short value) {
            addCriterion("runstatus <>", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusGreaterThan(Short value) {
            addCriterion("runstatus >", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("runstatus >=", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusLessThan(Short value) {
            addCriterion("runstatus <", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusLessThanOrEqualTo(Short value) {
            addCriterion("runstatus <=", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusIn(List<Short> values) {
            addCriterion("runstatus in", values, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusNotIn(List<Short> values) {
            addCriterion("runstatus not in", values, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusBetween(Short value1, Short value2) {
            addCriterion("runstatus between", value1, value2, "runstatus");
            return (Criteria) this;
        }

        public Criteria andRunstatusNotBetween(Short value1, Short value2) {
            addCriterion("runstatus not between", value1, value2, "runstatus");
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