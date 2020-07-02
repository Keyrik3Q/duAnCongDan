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

import com.congdan.NoSuchTinhException;

import com.congdan.model.Tinh;
import com.congdan.model.impl.TinhImpl;
import com.congdan.model.impl.TinhModelImpl;

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
 * The persistence implementation for the tinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see TinhPersistence
 * @see TinhUtil
 * @generated
 */
public class TinhPersistenceImpl extends BasePersistenceImpl<Tinh>
	implements TinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TinhUtil} to access the tinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TinhModelImpl.ENTITY_CACHE_ENABLED,
			TinhModelImpl.FINDER_CACHE_ENABLED, TinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TinhModelImpl.ENTITY_CACHE_ENABLED,
			TinhModelImpl.FINDER_CACHE_ENABLED, TinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TinhModelImpl.ENTITY_CACHE_ENABLED,
			TinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TinhPersistenceImpl() {
		setModelClass(Tinh.class);
	}

	/**
	 * Caches the tinh in the entity cache if it is enabled.
	 *
	 * @param tinh the tinh
	 */
	@Override
	public void cacheResult(Tinh tinh) {
		EntityCacheUtil.putResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
			TinhImpl.class, tinh.getPrimaryKey(), tinh);

		tinh.resetOriginalValues();
	}

	/**
	 * Caches the tinhs in the entity cache if it is enabled.
	 *
	 * @param tinhs the tinhs
	 */
	@Override
	public void cacheResult(List<Tinh> tinhs) {
		for (Tinh tinh : tinhs) {
			if (EntityCacheUtil.getResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
						TinhImpl.class, tinh.getPrimaryKey()) == null) {
				cacheResult(tinh);
			}
			else {
				tinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tinh tinh) {
		EntityCacheUtil.removeResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
			TinhImpl.class, tinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Tinh> tinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Tinh tinh : tinhs) {
			EntityCacheUtil.removeResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
				TinhImpl.class, tinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tinh with the primary key. Does not add the tinh to the database.
	 *
	 * @param Id the primary key for the new tinh
	 * @return the new tinh
	 */
	@Override
	public Tinh create(long Id) {
		Tinh tinh = new TinhImpl();

		tinh.setNew(true);
		tinh.setPrimaryKey(Id);

		return tinh;
	}

	/**
	 * Removes the tinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tinh
	 * @return the tinh that was removed
	 * @throws com.congdan.NoSuchTinhException if a tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tinh remove(long Id) throws NoSuchTinhException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tinh
	 * @return the tinh that was removed
	 * @throws com.congdan.NoSuchTinhException if a tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tinh remove(Serializable primaryKey)
		throws NoSuchTinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Tinh tinh = (Tinh)session.get(TinhImpl.class, primaryKey);

			if (tinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tinh);
		}
		catch (NoSuchTinhException nsee) {
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
	protected Tinh removeImpl(Tinh tinh) throws SystemException {
		tinh = toUnwrappedModel(tinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tinh)) {
				tinh = (Tinh)session.get(TinhImpl.class, tinh.getPrimaryKeyObj());
			}

			if (tinh != null) {
				session.delete(tinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tinh != null) {
			clearCache(tinh);
		}

		return tinh;
	}

	@Override
	public Tinh updateImpl(com.congdan.model.Tinh tinh)
		throws SystemException {
		tinh = toUnwrappedModel(tinh);

		boolean isNew = tinh.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tinh.isNew()) {
				session.save(tinh);

				tinh.setNew(false);
			}
			else {
				session.merge(tinh);
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

		EntityCacheUtil.putResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
			TinhImpl.class, tinh.getPrimaryKey(), tinh);

		return tinh;
	}

	protected Tinh toUnwrappedModel(Tinh tinh) {
		if (tinh instanceof TinhImpl) {
			return tinh;
		}

		TinhImpl tinhImpl = new TinhImpl();

		tinhImpl.setNew(tinh.isNew());
		tinhImpl.setPrimaryKey(tinh.getPrimaryKey());

		tinhImpl.setId(tinh.getId());
		tinhImpl.setName(tinh.getName());
		tinhImpl.setType(tinh.getType());

		return tinhImpl;
	}

	/**
	 * Returns the tinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tinh
	 * @return the tinh
	 * @throws com.congdan.NoSuchTinhException if a tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTinhException, SystemException {
		Tinh tinh = fetchByPrimaryKey(primaryKey);

		if (tinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tinh;
	}

	/**
	 * Returns the tinh with the primary key or throws a {@link com.congdan.NoSuchTinhException} if it could not be found.
	 *
	 * @param Id the primary key of the tinh
	 * @return the tinh
	 * @throws com.congdan.NoSuchTinhException if a tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tinh findByPrimaryKey(long Id)
		throws NoSuchTinhException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tinh
	 * @return the tinh, or <code>null</code> if a tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Tinh tinh = (Tinh)EntityCacheUtil.getResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
				TinhImpl.class, primaryKey);

		if (tinh == _nullTinh) {
			return null;
		}

		if (tinh == null) {
			Session session = null;

			try {
				session = openSession();

				tinh = (Tinh)session.get(TinhImpl.class, primaryKey);

				if (tinh != null) {
					cacheResult(tinh);
				}
				else {
					EntityCacheUtil.putResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
						TinhImpl.class, primaryKey, _nullTinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TinhModelImpl.ENTITY_CACHE_ENABLED,
					TinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tinh;
	}

	/**
	 * Returns the tinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tinh
	 * @return the tinh, or <code>null</code> if a tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tinh fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tinhs.
	 *
	 * @return the tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.TinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tinhs
	 * @param end the upper bound of the range of tinhs (not inclusive)
	 * @return the range of tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tinh> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.TinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tinhs
	 * @param end the upper bound of the range of tinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tinh> findAll(int start, int end,
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

		List<Tinh> list = (List<Tinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINH;

				if (pagination) {
					sql = sql.concat(TinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Tinh>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Tinh>(list);
				}
				else {
					list = (List<Tinh>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the tinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Tinh tinh : findAll()) {
			remove(tinh);
		}
	}

	/**
	 * Returns the number of tinhs.
	 *
	 * @return the number of tinhs
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

				Query q = session.createQuery(_SQL_COUNT_TINH);

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
	 * Initializes the tinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.congdan.model.Tinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Tinh>> listenersList = new ArrayList<ModelListener<Tinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Tinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINH = "SELECT tinh FROM Tinh tinh";
	private static final String _SQL_COUNT_TINH = "SELECT COUNT(tinh) FROM Tinh tinh";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tinh exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Name", "Type"
			});
	private static Tinh _nullTinh = new TinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Tinh> toCacheModel() {
				return _nullTinhCacheModel;
			}
		};

	private static CacheModel<Tinh> _nullTinhCacheModel = new CacheModel<Tinh>() {
			@Override
			public Tinh toEntityModel() {
				return _nullTinh;
			}
		};
}