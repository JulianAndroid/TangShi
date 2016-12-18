package io.liamju.tangshi.data.source.local;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

import io.liamju.tangshi.data.Poetry;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig poetryDaoConfig;

    private final PoetryDao poetryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        poetryDaoConfig = daoConfigMap.get(PoetryDao.class).clone();
        poetryDaoConfig.initIdentityScope(type);

        poetryDao = new PoetryDao(poetryDaoConfig, this);

        registerDao(Poetry.class, poetryDao);
    }
    
    public void clear() {
        poetryDaoConfig.clearIdentityScope();
    }

    public PoetryDao getPoetryDao() {
        return poetryDao;
    }

}
