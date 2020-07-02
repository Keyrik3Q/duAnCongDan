/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.congdan.service.persistence;

import com.congdan.NoSuchXaException;

import com.congdan.model.Xa;
import com.congdan.model.impl.XaImpl;
import com.congdan.model.impl.XaModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the xa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see XaPersistence
 * @see XaUtil
 * @generated
 */
public class XaPersistenceImpl extends BasePersistenceImpl<Xa>
	implements XaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link XaUtil} to access the xa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = XaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(XaModelImpl.ENTITY_CACHE_ENABLED,
			XaModelImpl.FINDER_CACHE_ENABLED, XaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(XaModelImpl.ENTITY_CACHE_ENABLED,
			XaModelImpl.FINDER_CACHE_ENABLED, XaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(XaModelImpl.ENTITY_CACHE_ENABLED,
			XaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public XaPersistenceImpl() {
		setModelClass(Xa.class);
	}

	/**
	 * Caches the xa in the entity cache if it is enabled.
	 *
	 * @param xa the xa
	 */
	@Override
	public void cacheResult(Xa xa) {
		EntityCacheUtil.putResult(XaModelImpl.ENTITY_CACHE_ENABLED,
			XaImpl.class, xa.getPrimaryKey(), xa);

		xa.resetOriginalValues();
	}

	/**
	 * Caches the xas in the entity cache if it is enabled.
	 *
	 * @param xas the xas
	 */
	@Override
	public void cacheResult(List<Xa> xas) {
		for (Xa xa : xas) {
			if (EntityCacheUtil.getResult(XaModelImpl.ENTITY_CACHE_ENABLED,
						XaImpl.class, xa.getPrimaryKey()) == null) {
				cacheResult(xa);
			}
			else {
				xa.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all xas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(XaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(XaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the xa.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Xa xa) {
		EntityCacheUtil.removeResult(XaModelImpl.ENTITY_CACHE_ENABLED,
			XaImpl.class, xa.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Xa> xas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Xa xa : xas) {
			EntityCacheUtil.removeResult(XaModelImpl.ENTITY_CACHE_ENABLED,
				XaImpl.class, xa.getPrimaryKey());
		}
	}

	/**
	 * Creates a new xa with the primary key. Does not add the xa to the database.
	 *
	 * @param Id the primary key for the new xa
	 * @return the new xa
	 */
	@Override
	public Xa create(long Id) {
		Xa xa = new XaImpl();

		xa.setNew(true);
		xa.setPrimaryKey(Id);

		return xa;
	}

	/**
	 * Removes the xa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the xa
	 * @return the xa that was removed
	 * @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Xa remove(long Id) throws NoSuchXaException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the xa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the xa
	 * @return the xa that was removed
	 * @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Xa remove(Serializable primaryKey)
		throws NoSuchXaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Xa xa = (Xa)session.get(XaImpl.class, primaryKey);

			if (xa == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchXaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(xa);
		}
		catch (NoSuchXaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Xa removeImpl(Xa xa) throws SystemException {
		xa = toUnwrappedModel(xa);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(xa)) {
				xa = (Xa)session.get(XaImpl.class, xa.getPrimaryKeyObj());
			}

			if (xa != null) {
				session.delete(xa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (xa != null) {
			clearCache(xa);
		}

		return xa;
	}

	@Override
	public Xa updateImpl(com.congdan.model.Xa xa) throws SystemException {
		xa = toUnwrappedModel(xa);

		boolean isNew = xa.isNew();

		Session session = null;

		try {
			session = openSession();

			if (xa.isNew()) {
				session.save(xa);

				xa.setNew(false);
			}
			else {
				session.merge(xa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(XaModelImpl.ENTITY_CACHE_ENABLED,
			XaImpl.class, xa.getPrimaryKey(), xa);

		return xa;
	}

	protected Xa toUnwrappedModel(Xa xa) {
		if (xa instanceof XaImpl) {
			return xa;
		}

		XaImpl xaImpl = new XaImpl();

		xaImpl.setNew(xa.isNew());
		xaImpl.setPrimaryKey(xa.getPrimaryKey());

		xaImpl.setId(xa.getId());
		xaImpl.setName(xa.getName());
		xaImpl.setType(xa.getType());
		xaImpl.setHuyenId(xa.getHuyenId());

		return xaImpl;
	}

	/**
	 * Returns the xa with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the xa
	 * @return the xa
	 * @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Xa findByPrimaryKey(Serializable primaryKey)
		throws NoSuchXaException, SystemException {
		Xa xa = fetchByPrimaryKey(primaryKey);

		if (xa == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchXaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return xa;
	}

	/**
	 * Returns the xa with the primary key or throws a {@link com.congdan.NoSuchXaException} if it could not be found.
	 *
	 * @param Id the primary key of the xa
	 * @return the xa
	 * @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Xa findByPrimaryKey(long Id)
		throws NoSuchXaException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the xa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the xa
	 * @return the xa, or <code>null</code> if a xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Xa fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Xa xa = (Xa)EntityCacheUtil.getResult(XaModelImpl.ENTITY_CACHE_ENABLED,
				XaImpl.class, primaryKey);

		if (xa == _nullXa) {
			return null;
		}

		if (xa == null) {
			Session session = null;

			try {
				session = openSession();

				xa = (Xa)session.get(XaImpl.class, primaryKey);

				if (xa != null) {
					cacheResult(xa);
				}
				else {
					EntityCacheUtil.putResult(XaModelImpl.ENTITY_CACHE_ENABLED,
						XaImpl.class, primaryKey, _nullXa);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(XaModelImpl.ENTITY_CACHE_ENABLED,
					XaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return xa;
	}

	/**
	 * Returns the xa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the xa
	 * @return the xa, or <code>null</code> if a xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Xa fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the xas.
	 *
	 * @return the xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Xa> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the xas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.XaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of xas
	 * @param end the upper bound of the range of xas (not inclusive)
	 * @return the range of xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Xa> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the xas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.XaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of xas
	 * @param end the upper bound of the range of xas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Xa> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Xa> list = (List<Xa>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_XA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_XA;

				if (pagination) {
					sql = sql.concat(XaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Xa>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Xa>(list);
				}
				else {
					list = (List<Xa>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the xas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Xa xa : findAll()) {
			remove(xa);
		}
	}

	/**
	 * Returns the number of xas.
	 *
	 * @return the number of xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_XA);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the xa persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.congdan.model.Xa")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Xa>> listenersList = new ArrayList<ModelListener<Xa>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Xa>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(XaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_XA = "SELECT xa FROM Xa xa";
	private static final String _SQL_COUNT_XA = "SELECT COUNT(xa) FROM Xa xa";
	private static final String _ORDER_BY_ENTITY_ALIAS = "xa.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Xa exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(XaPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Name", "Type", "HuyenId"
			});
	private static Xa _nullXa = new XaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Xa> toCacheModel() {
				return _nullXaCacheModel;
			}
		};

	private static CacheModel<Xa> _nullXaCacheModel = new CacheModel<Xa>() {
			@Override
			public Xa toEntityModel() {
				return _nullXa;
			}
		};
}