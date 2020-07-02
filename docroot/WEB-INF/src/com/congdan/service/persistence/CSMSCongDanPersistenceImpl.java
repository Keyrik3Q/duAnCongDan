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

import com.congdan.NoSuchCSMSCongDanException;

import com.congdan.model.CSMSCongDan;
import com.congdan.model.impl.CSMSCongDanImpl;
import com.congdan.model.impl.CSMSCongDanModelImpl;

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
 * The persistence implementation for the c s m s cong dan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see CSMSCongDanPersistence
 * @see CSMSCongDanUtil
 * @generated
 */
public class CSMSCongDanPersistenceImpl extends BasePersistenceImpl<CSMSCongDan>
	implements CSMSCongDanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CSMSCongDanUtil} to access the c s m s cong dan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CSMSCongDanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
			CSMSCongDanModelImpl.FINDER_CACHE_ENABLED, CSMSCongDanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
			CSMSCongDanModelImpl.FINDER_CACHE_ENABLED, CSMSCongDanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
			CSMSCongDanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CSMSCongDanPersistenceImpl() {
		setModelClass(CSMSCongDan.class);
	}

	/**
	 * Caches the c s m s cong dan in the entity cache if it is enabled.
	 *
	 * @param csmsCongDan the c s m s cong dan
	 */
	@Override
	public void cacheResult(CSMSCongDan csmsCongDan) {
		EntityCacheUtil.putResult(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
			CSMSCongDanImpl.class, csmsCongDan.getPrimaryKey(), csmsCongDan);

		csmsCongDan.resetOriginalValues();
	}

	/**
	 * Caches the c s m s cong dans in the entity cache if it is enabled.
	 *
	 * @param csmsCongDans the c s m s cong dans
	 */
	@Override
	public void cacheResult(List<CSMSCongDan> csmsCongDans) {
		for (CSMSCongDan csmsCongDan : csmsCongDans) {
			if (EntityCacheUtil.getResult(
						CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
						CSMSCongDanImpl.class, csmsCongDan.getPrimaryKey()) == null) {
				cacheResult(csmsCongDan);
			}
			else {
				csmsCongDan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c s m s cong dans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CSMSCongDanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CSMSCongDanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c s m s cong dan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CSMSCongDan csmsCongDan) {
		EntityCacheUtil.removeResult(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
			CSMSCongDanImpl.class, csmsCongDan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CSMSCongDan> csmsCongDans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CSMSCongDan csmsCongDan : csmsCongDans) {
			EntityCacheUtil.removeResult(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
				CSMSCongDanImpl.class, csmsCongDan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c s m s cong dan with the primary key. Does not add the c s m s cong dan to the database.
	 *
	 * @param IdcsmsCongDan the primary key for the new c s m s cong dan
	 * @return the new c s m s cong dan
	 */
	@Override
	public CSMSCongDan create(long IdcsmsCongDan) {
		CSMSCongDan csmsCongDan = new CSMSCongDanImpl();

		csmsCongDan.setNew(true);
		csmsCongDan.setPrimaryKey(IdcsmsCongDan);

		return csmsCongDan;
	}

	/**
	 * Removes the c s m s cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param IdcsmsCongDan the primary key of the c s m s cong dan
	 * @return the c s m s cong dan that was removed
	 * @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CSMSCongDan remove(long IdcsmsCongDan)
		throws NoSuchCSMSCongDanException, SystemException {
		return remove((Serializable)IdcsmsCongDan);
	}

	/**
	 * Removes the c s m s cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c s m s cong dan
	 * @return the c s m s cong dan that was removed
	 * @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CSMSCongDan remove(Serializable primaryKey)
		throws NoSuchCSMSCongDanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CSMSCongDan csmsCongDan = (CSMSCongDan)session.get(CSMSCongDanImpl.class,
					primaryKey);

			if (csmsCongDan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCSMSCongDanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(csmsCongDan);
		}
		catch (NoSuchCSMSCongDanException nsee) {
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
	protected CSMSCongDan removeImpl(CSMSCongDan csmsCongDan)
		throws SystemException {
		csmsCongDan = toUnwrappedModel(csmsCongDan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(csmsCongDan)) {
				csmsCongDan = (CSMSCongDan)session.get(CSMSCongDanImpl.class,
						csmsCongDan.getPrimaryKeyObj());
			}

			if (csmsCongDan != null) {
				session.delete(csmsCongDan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (csmsCongDan != null) {
			clearCache(csmsCongDan);
		}

		return csmsCongDan;
	}

	@Override
	public CSMSCongDan updateImpl(com.congdan.model.CSMSCongDan csmsCongDan)
		throws SystemException {
		csmsCongDan = toUnwrappedModel(csmsCongDan);

		boolean isNew = csmsCongDan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (csmsCongDan.isNew()) {
				session.save(csmsCongDan);

				csmsCongDan.setNew(false);
			}
			else {
				session.evict(csmsCongDan);
				session.saveOrUpdate(csmsCongDan);
			}

			session.flush();
			session.clear();
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

		EntityCacheUtil.putResult(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
			CSMSCongDanImpl.class, csmsCongDan.getPrimaryKey(), csmsCongDan);

		csmsCongDan.resetOriginalValues();

		return csmsCongDan;
	}

	protected CSMSCongDan toUnwrappedModel(CSMSCongDan csmsCongDan) {
		if (csmsCongDan instanceof CSMSCongDanImpl) {
			return csmsCongDan;
		}

		CSMSCongDanImpl csmsCongDanImpl = new CSMSCongDanImpl();

		csmsCongDanImpl.setNew(csmsCongDan.isNew());
		csmsCongDanImpl.setPrimaryKey(csmsCongDan.getPrimaryKey());

		csmsCongDanImpl.setIdcsmsCongDan(csmsCongDan.getIdcsmsCongDan());
		csmsCongDanImpl.setHo(csmsCongDan.getHo());
		csmsCongDanImpl.setDem(csmsCongDan.getDem());
		csmsCongDanImpl.setTen(csmsCongDan.getTen());
		csmsCongDanImpl.setNgaySinh(csmsCongDan.getNgaySinh());
		csmsCongDanImpl.setGioiTinhId(csmsCongDan.getGioiTinhId());
		csmsCongDanImpl.setNoiSinhChiTiet(csmsCongDan.getNoiSinhChiTiet());
		csmsCongDanImpl.setNoiSinhXaId(csmsCongDan.getNoiSinhXaId());
		csmsCongDanImpl.setNoiSinhHuyenId(csmsCongDan.getNoiSinhHuyenId());
		csmsCongDanImpl.setNoiSinhTinhId(csmsCongDan.getNoiSinhTinhId());
		csmsCongDanImpl.setDanTocId(csmsCongDan.getDanTocId());
		csmsCongDanImpl.setQuocTichId(csmsCongDan.getQuocTichId());
		csmsCongDanImpl.setTonGiaoId(csmsCongDan.getTonGiaoId());
		csmsCongDanImpl.setDiaChiThuongTru(csmsCongDan.getDiaChiThuongTru());
		csmsCongDanImpl.setDiaChiThuongTruXaId(csmsCongDan.getDiaChiThuongTruXaId());
		csmsCongDanImpl.setDiaChiThuongTruHuyenId(csmsCongDan.getDiaChiThuongTruHuyenId());
		csmsCongDanImpl.setDiaChiThuongTruTinhId(csmsCongDan.getDiaChiThuongTruTinhId());
		csmsCongDanImpl.setDiaChiHienNay(csmsCongDan.getDiaChiHienNay());
		csmsCongDanImpl.setDiaChiHienNayXaId(csmsCongDan.getDiaChiHienNayXaId());
		csmsCongDanImpl.setDiaChiHienNayHuyenId(csmsCongDan.getDiaChiHienNayHuyenId());
		csmsCongDanImpl.setDiaChiHienNayTinhId(csmsCongDan.getDiaChiHienNayTinhId());
		csmsCongDanImpl.setTinhTrang(csmsCongDan.getTinhTrang());
		csmsCongDanImpl.setTinhtTranghonNhanId(csmsCongDan.getTinhtTranghonNhanId());
		csmsCongDanImpl.setSocmnd(csmsCongDan.getSocmnd());
		csmsCongDanImpl.setNgayCapCMND(csmsCongDan.getNgayCapCMND());
		csmsCongDanImpl.setNoiCapCMND(csmsCongDan.getNoiCapCMND());
		csmsCongDanImpl.setSoHoKhau(csmsCongDan.getSoHoKhau());
		csmsCongDanImpl.setLaChuHo(csmsCongDan.getLaChuHo());
		csmsCongDanImpl.setQuanHeChuHoId(csmsCongDan.getQuanHeChuHoId());
		csmsCongDanImpl.setSoHoChieu(csmsCongDan.getSoHoChieu());
		csmsCongDanImpl.setNgayCapSHC(csmsCongDan.getNgayCapSHC());
		csmsCongDanImpl.setNgayHetHanSHC(csmsCongDan.getNgayHetHanSHC());
		csmsCongDanImpl.setNoiCapSHC(csmsCongDan.getNoiCapSHC());
		csmsCongDanImpl.setMaCongDan(csmsCongDan.getMaCongDan());
		csmsCongDanImpl.setImageData(csmsCongDan.getImageData());
		csmsCongDanImpl.setImgName(csmsCongDan.getImgName());
		csmsCongDanImpl.setTenCha(csmsCongDan.getTenCha());
		csmsCongDanImpl.setNgaySinhCha(csmsCongDan.getNgaySinhCha());
		csmsCongDanImpl.setTenMe(csmsCongDan.getTenMe());
		csmsCongDanImpl.setNgaySinhMe(csmsCongDan.getNgaySinhMe());
		csmsCongDanImpl.setTenVo(csmsCongDan.getTenVo());
		csmsCongDanImpl.setNgaySinhVo(csmsCongDan.getNgaySinhVo());
		csmsCongDanImpl.setSdt(csmsCongDan.getSdt());

		return csmsCongDanImpl;
	}

	/**
	 * Returns the c s m s cong dan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c s m s cong dan
	 * @return the c s m s cong dan
	 * @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CSMSCongDan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCSMSCongDanException, SystemException {
		CSMSCongDan csmsCongDan = fetchByPrimaryKey(primaryKey);

		if (csmsCongDan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCSMSCongDanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return csmsCongDan;
	}

	/**
	 * Returns the c s m s cong dan with the primary key or throws a {@link com.congdan.NoSuchCSMSCongDanException} if it could not be found.
	 *
	 * @param IdcsmsCongDan the primary key of the c s m s cong dan
	 * @return the c s m s cong dan
	 * @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CSMSCongDan findByPrimaryKey(long IdcsmsCongDan)
		throws NoSuchCSMSCongDanException, SystemException {
		return findByPrimaryKey((Serializable)IdcsmsCongDan);
	}

	/**
	 * Returns the c s m s cong dan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c s m s cong dan
	 * @return the c s m s cong dan, or <code>null</code> if a c s m s cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CSMSCongDan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CSMSCongDan csmsCongDan = (CSMSCongDan)EntityCacheUtil.getResult(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
				CSMSCongDanImpl.class, primaryKey);

		if (csmsCongDan == _nullCSMSCongDan) {
			return null;
		}

		if (csmsCongDan == null) {
			Session session = null;

			try {
				session = openSession();

				csmsCongDan = (CSMSCongDan)session.get(CSMSCongDanImpl.class,
						primaryKey);

				if (csmsCongDan != null) {
					cacheResult(csmsCongDan);
				}
				else {
					EntityCacheUtil.putResult(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
						CSMSCongDanImpl.class, primaryKey, _nullCSMSCongDan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CSMSCongDanModelImpl.ENTITY_CACHE_ENABLED,
					CSMSCongDanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return csmsCongDan;
	}

	/**
	 * Returns the c s m s cong dan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param IdcsmsCongDan the primary key of the c s m s cong dan
	 * @return the c s m s cong dan, or <code>null</code> if a c s m s cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CSMSCongDan fetchByPrimaryKey(long IdcsmsCongDan)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)IdcsmsCongDan);
	}

	/**
	 * Returns all the c s m s cong dans.
	 *
	 * @return the c s m s cong dans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CSMSCongDan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c s m s cong dans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMSCongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c s m s cong dans
	 * @param end the upper bound of the range of c s m s cong dans (not inclusive)
	 * @return the range of c s m s cong dans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CSMSCongDan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c s m s cong dans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMSCongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c s m s cong dans
	 * @param end the upper bound of the range of c s m s cong dans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c s m s cong dans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CSMSCongDan> findAll(int start, int end,
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

		List<CSMSCongDan> list = (List<CSMSCongDan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CSMSCONGDAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CSMSCONGDAN;

				if (pagination) {
					sql = sql.concat(CSMSCongDanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CSMSCongDan>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CSMSCongDan>(list);
				}
				else {
					list = (List<CSMSCongDan>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the c s m s cong dans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CSMSCongDan csmsCongDan : findAll()) {
			remove(csmsCongDan);
		}
	}

	/**
	 * Returns the number of c s m s cong dans.
	 *
	 * @return the number of c s m s cong dans
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

				Query q = session.createQuery(_SQL_COUNT_CSMSCONGDAN);

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
	 * Initializes the c s m s cong dan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.congdan.model.CSMSCongDan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CSMSCongDan>> listenersList = new ArrayList<ModelListener<CSMSCongDan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CSMSCongDan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CSMSCongDanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CSMSCONGDAN = "SELECT csmsCongDan FROM CSMSCongDan csmsCongDan";
	private static final String _SQL_COUNT_CSMSCONGDAN = "SELECT COUNT(csmsCongDan) FROM CSMSCongDan csmsCongDan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "csmsCongDan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CSMSCongDan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CSMSCongDanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"IdcsmsCongDan", "Ho", "Dem", "Ten", "NgaySinh", "GioiTinhId",
				"NoiSinhChiTiet", "NoiSinhXaId", "NoiSinhHuyenId",
				"NoiSinhTinhId", "DanTocId", "QuocTichId", "TonGiaoId",
				"DiaChiThuongTru", "DiaChiThuongTruXaId",
				"DiaChiThuongTruHuyenId", "DiaChiThuongTruTinhId",
				"DiaChiHienNay", "DiaChiHienNayXaId", "DiaChiHienNayHuyenId",
				"DiaChiHienNayTinhId", "TinhTrang", "TinhtTranghonNhanId",
				"NgayCapCMND", "NoiCapCMND", "SoHoKhau", "LaChuHo",
				"QuanHeChuHoId", "SoHoChieu", "NgayCapSHC", "NgayHetHanSHC",
				"NoiCapSHC", "MaCongDan", "ImageData", "ImgName", "TenCha",
				"NgaySinhCha", "TenMe", "NgaySinhMe", "TenVo", "NgaySinhVo",
				"Sdt"
			});
	private static CSMSCongDan _nullCSMSCongDan = new CSMSCongDanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CSMSCongDan> toCacheModel() {
				return _nullCSMSCongDanCacheModel;
			}
		};

	private static CacheModel<CSMSCongDan> _nullCSMSCongDanCacheModel = new CacheModel<CSMSCongDan>() {
			@Override
			public CSMSCongDan toEntityModel() {
				return _nullCSMSCongDan;
			}
		};
}