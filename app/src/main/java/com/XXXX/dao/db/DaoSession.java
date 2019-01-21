package com.XXXX.dao.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.kehui.www.testapp.database.AssistanceDataInfo;
import com.kehui.www.testapp.database.ChartInfo;

import com.XXXX.dao.db.AssistanceDataInfoDao;
import com.XXXX.dao.db.ChartInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig assistanceDataInfoDaoConfig;
    private final DaoConfig chartInfoDaoConfig;

    private final AssistanceDataInfoDao assistanceDataInfoDao;
    private final ChartInfoDao chartInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        assistanceDataInfoDaoConfig = daoConfigMap.get(AssistanceDataInfoDao.class).clone();
        assistanceDataInfoDaoConfig.initIdentityScope(type);

        chartInfoDaoConfig = daoConfigMap.get(ChartInfoDao.class).clone();
        chartInfoDaoConfig.initIdentityScope(type);

        assistanceDataInfoDao = new AssistanceDataInfoDao(assistanceDataInfoDaoConfig, this);
        chartInfoDao = new ChartInfoDao(chartInfoDaoConfig, this);

        registerDao(AssistanceDataInfo.class, assistanceDataInfoDao);
        registerDao(ChartInfo.class, chartInfoDao);
    }
    
    public void clear() {
        assistanceDataInfoDaoConfig.getIdentityScope().clear();
        chartInfoDaoConfig.getIdentityScope().clear();
    }

    public AssistanceDataInfoDao getAssistanceDataInfoDao() {
        return assistanceDataInfoDao;
    }

    public ChartInfoDao getChartInfoDao() {
        return chartInfoDao;
    }

}
