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

import com.congdan.NoSuchHuyenException;

import com.congdan.model.Huyen;
import com.congdan.model.impl.HuyenImpl;
import com.congdan.model.impl.HuyenModelImpl;

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
 * The persistence implementation for the huyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see HuyenPersistence
 * @see HuyenUtil
 * @generated
 */
public class HuyenPersistenceImpl extends BasePersistenceImpl<Huyen>
	implements HuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HuyenUtil} to access the huyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HuyenModelImpl.ENTITY_CACHE_ENABLED,
			HuyenModelImpl.FINDER_CACHE_ENABLED, HuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HuyenModelImpl.ENTITY_CACHE_ENABLED,
			HuyenModelImpl.FINDER_CACHE_ENABLED, HuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HuyenModelImpl.ENTITY_CACHE_ENABLED,
			HuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public HuyenPersistenceImpl() {
		setModelClass(Huyen.class);
	}

	/**
	 * Caches the huyen in the entity cache if it is enabled.
	 *
	 * @param huyen the huyen
	 */
	@Override
	public void cacheResult(Huyen huyen) {
		EntityCacheUtil.putResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
			HuyenImpl.class, huyen.getPrimaryKey(), huyen);

		huyen.resetOriginalValues();
	}

	/**
	 * Caches the huyens in the entity cache if it is enabled.
	 *
	 * @param huyens the huyens
	 */
	@Override
	public void cacheResult(List<Huyen> huyens) {
		for (Huyen huyen : huyens) {
			if (EntityCacheUtil.getResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
						HuyenImpl.class, huyen.getPrimaryKey()) == null) {
				cacheResult(huyen);
			}
			else {
				huyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all huyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the huyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Huyen huyen) {
		EntityCacheUtil.removeResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
			HuyenImpl.class, huyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Huyen> huyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Huyen huyen : huyens) {
			EntityCacheUtil.removeResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
				HuyenImpl.class, huyen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new huyen with the primary key. Does not add the huyen to the database.
	 *
	 * @param Id the primary key for the new huyen
	 * @return the new huyen
	 */
	@Override
	public Huyen create(long Id) {
		Huyen huyen = new HuyenImpl();

		huyen.setNew(true);
		huyen.setPrimaryKey(Id);

		return huyen;
	}

	/**
	 * Removes the huyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the huyen
	 * @return the huyen that was removed
	 * @throws com.congdan.NoSuchHuyenException if a huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Huyen remove(long Id) throws NoSuchHuyenException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the huyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the huyen
	 * @return the huyen that was removed
	 * @throws com.congdan.NoSuchHuyenException if a huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Huyen remove(Serializable primaryKey)
		throws NoSuchHuyenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Huyen huyen = (Huyen)session.get(HuyenImpl.class, primaryKey);

			if (huyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(huyen);
		}
		catch (NoSuchHuyenException nsee) {
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
	protected Huyen removeImpl(Huyen huyen) throws SystemException {
		huyen = toUnwrappedModel(huyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(huyen)) {
				huyen = (Huyen)session.get(HuyenImpl.class,
						huyen.getPrimaryKeyObj());
			}

			if (huyen != null) {
				session.delete(huyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (huyen != null) {
			clearCache(huyen);
		}

		return huyen;
	}

	@Override
	public Huyen updateImpl(com.congdan.model.Huyen huyen)
		throws SystemException {
		huyen = toUnwrappedModel(huyen);

		boolean isNew = huyen.isNew();

		Session session = null;

		try {
			session = openSession();

			if (huyen.isNew()) {
				session.save(huyen);

				huyen.setNew(false);
			}
			else {
				session.merge(huyen);
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

		EntityCacheUtil.putResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
			HuyenImpl.class, huyen.getPrimaryKey(), huyen);

		return huyen;
	}

	protected Huyen toUnwrappedModel(Huyen huyen) {
		if (huyen instanceof HuyenImpl) {
			return huyen;
		}

		HuyenImpl huyenImpl = new HuyenImpl();

		huyenImpl.setNew(huyen.isNew());
		huyenImpl.setPrimaryKey(huyen.getPrimaryKey());

		huyenImpl.setId(huyen.getId());
		huyenImpl.setName(huyen.getName());
		huyenImpl.setType(huyen.getType());
		huyenImpl.setTinhId(huyen.getTinhId());

		return huyenImpl;
	}

	/**
	 * Returns the huyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the huyen
	 * @return the huyen
	 * @throws com.congdan.NoSuchHuyenException if a huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Huyen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHuyenException, SystemException {
		Huyen huyen = fetchByPrimaryKey(primaryKey);

		if (huyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return huyen;
	}

	/**
	 * Returns the huyen with the primary key or throws a {@link com.congdan.NoSuchHuyenException} if it could not be found.
	 *
	 * @param Id the primary key of the huyen
	 * @return the huyen
	 * @throws com.congdan.NoSuchHuyenException if a huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Huyen findByPrimaryKey(long Id)
		throws NoSuchHuyenException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the huyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the huyen
	 * @return the huyen, or <code>null</code> if a huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Huyen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Huyen huyen = (Huyen)EntityCacheUtil.getResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
				HuyenImpl.class, primaryKey);

		if (huyen == _nullHuyen) {
			return null;
		}

		if (huyen == null) {
			Session session = null;

			try {
				session = openSession();

				huyen = (Huyen)session.get(HuyenImpl.class, primaryKey);

				if (huyen != null) {
					cacheResult(huyen);
				}
				else {
					EntityCacheUtil.putResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
						HuyenImpl.class, primaryKey, _nullHuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HuyenModelImpl.ENTITY_CACHE_ENABLED,
					HuyenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return huyen;
	}

	/**
	 * Returns the huyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the huyen
	 * @return the huyen, or <code>null</code> if a huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Huyen fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the huyens.
	 *
	 * @return the huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Huyen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the huyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.HuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of huyens
	 * @param end the upper bound of the range of huyens (not inclusive)
	 * @return the range of huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Huyen> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the huyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.HuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of huyens
	 * @param end the upper bound of the range of huyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Huyen> findAll(int start, int end,
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

		List<Huyen> list = (List<Huyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HUYEN;

				if (pagination) {
					sql = sql.concat(HuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Huyen>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Huyen>(list);
				}
				else {
					list = (List<Huyen>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the huyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Huyen huyen : findAll()) {
			remove(huyen);
		}
	}

	/**
	 * Returns the number of huyens.
	 *
	 * @return the number of huyens
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

				Query q = session.createQuery(_SQL_COUNT_HUYEN);

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
	 * Initializes the huyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.congdan.model.Huyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Huyen>> listenersList = new ArrayList<ModelListener<Huyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Huyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HUYEN = "SELECT huyen FROM Huyen huyen";
	private static final String _SQL_COUNT_HUYEN = "SELECT COUNT(huyen) FROM Huyen huyen";
	private static final String _ORDER_BY_ENTITY_ALIAS = "huyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Huyen exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HuyenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Name", "Type", "TinhId"
			});
	private static Huyen _nullHuyen = new HuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Huyen> toCacheModel() {
				return _nullHuyenCacheModel;
			}
		};

	private static CacheModel<Huyen> _nullHuyenCacheModel = new CacheModel<Huyen>() {
			@Override
			public Huyen toEntityModel() {
				return _nullHuyen;
			}
		};
}