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

package com.fds.vr.cop.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.cop.exception.NoSuchVRCOPProductTypeException;
import com.fds.vr.cop.model.VRCOPProductType;
import com.fds.vr.cop.model.impl.VRCOPProductTypeImpl;
import com.fds.vr.cop.model.impl.VRCOPProductTypeModelImpl;
import com.fds.vr.cop.service.persistence.VRCOPProductTypePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vrcop product type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductTypePersistence
 * @see com.fds.vr.cop.service.persistence.VRCOPProductTypeUtil
 * @generated
 */
@ProviderType
public class VRCOPProductTypePersistenceImpl extends BasePersistenceImpl<VRCOPProductType>
	implements VRCOPProductTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPProductTypeUtil} to access the vrcop product type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPProductTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COP_REPORT_NO =
		new FinderPath(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCOP_REPORT_NO",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO =
		new FinderPath(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCOP_REPORT_NO",
			new String[] { String.class.getName() },
			VRCOPProductTypeModelImpl.COPREPORTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COP_REPORT_NO = new FinderPath(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCOP_REPORT_NO",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vrcop product types where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @return the matching vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findByCOP_REPORT_NO(String COPReportNo) {
		return findByCOP_REPORT_NO(COPReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop product types where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop product types
	 * @param end the upper bound of the range of vrcop product types (not inclusive)
	 * @return the range of matching vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findByCOP_REPORT_NO(String COPReportNo,
		int start, int end) {
		return findByCOP_REPORT_NO(COPReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop product types where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop product types
	 * @param end the upper bound of the range of vrcop product types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findByCOP_REPORT_NO(String COPReportNo,
		int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		return findByCOP_REPORT_NO(COPReportNo, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vrcop product types where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop product types
	 * @param end the upper bound of the range of vrcop product types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findByCOP_REPORT_NO(String COPReportNo,
		int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO;
			finderArgs = new Object[] { COPReportNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COP_REPORT_NO;
			finderArgs = new Object[] { COPReportNo, start, end, orderByComparator };
		}

		List<VRCOPProductType> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductType vrcopProductType : list) {
					if (!Objects.equals(COPReportNo,
								vrcopProductType.getCOPReportNo())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VRCOPPRODUCTTYPE_WHERE);

			boolean bindCOPReportNo = false;

			if (COPReportNo == null) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1);
			}
			else if (COPReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3);
			}
			else {
				bindCOPReportNo = true;

				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCOPReportNo) {
					qPos.add(COPReportNo);
				}

				if (!pagination) {
					list = (List<VRCOPProductType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductType>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first vrcop product type in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop product type
	 * @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	 */
	@Override
	public VRCOPProductType findByCOP_REPORT_NO_First(String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException {
		VRCOPProductType vrcopProductType = fetchByCOP_REPORT_NO_First(COPReportNo,
				orderByComparator);

		if (vrcopProductType != null) {
			return vrcopProductType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("COPReportNo=");
		msg.append(COPReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductTypeException(msg.toString());
	}

	/**
	 * Returns the first vrcop product type in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	 */
	@Override
	public VRCOPProductType fetchByCOP_REPORT_NO_First(String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		List<VRCOPProductType> list = findByCOP_REPORT_NO(COPReportNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop product type in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop product type
	 * @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	 */
	@Override
	public VRCOPProductType findByCOP_REPORT_NO_Last(String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException {
		VRCOPProductType vrcopProductType = fetchByCOP_REPORT_NO_Last(COPReportNo,
				orderByComparator);

		if (vrcopProductType != null) {
			return vrcopProductType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("COPReportNo=");
		msg.append(COPReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductTypeException(msg.toString());
	}

	/**
	 * Returns the last vrcop product type in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	 */
	@Override
	public VRCOPProductType fetchByCOP_REPORT_NO_Last(String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		int count = countByCOP_REPORT_NO(COPReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductType> list = findByCOP_REPORT_NO(COPReportNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop product types before and after the current vrcop product type in the ordered set where COPReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop product type
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop product type
	 * @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	 */
	@Override
	public VRCOPProductType[] findByCOP_REPORT_NO_PrevAndNext(long id,
		String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException {
		VRCOPProductType vrcopProductType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductType[] array = new VRCOPProductTypeImpl[3];

			array[0] = getByCOP_REPORT_NO_PrevAndNext(session,
					vrcopProductType, COPReportNo, orderByComparator, true);

			array[1] = vrcopProductType;

			array[2] = getByCOP_REPORT_NO_PrevAndNext(session,
					vrcopProductType, COPReportNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPProductType getByCOP_REPORT_NO_PrevAndNext(Session session,
		VRCOPProductType vrcopProductType, String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRCOPPRODUCTTYPE_WHERE);

		boolean bindCOPReportNo = false;

		if (COPReportNo == null) {
			query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1);
		}
		else if (COPReportNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3);
		}
		else {
			bindCOPReportNo = true;

			query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(VRCOPProductTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCOPReportNo) {
			qPos.add(COPReportNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop product types where COPReportNo = &#63; from the database.
	 *
	 * @param COPReportNo the cop report no
	 */
	@Override
	public void removeByCOP_REPORT_NO(String COPReportNo) {
		for (VRCOPProductType vrcopProductType : findByCOP_REPORT_NO(
				COPReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductType);
		}
	}

	/**
	 * Returns the number of vrcop product types where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @return the number of matching vrcop product types
	 */
	@Override
	public int countByCOP_REPORT_NO(String COPReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COP_REPORT_NO;

		Object[] finderArgs = new Object[] { COPReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPPRODUCTTYPE_WHERE);

			boolean bindCOPReportNo = false;

			if (COPReportNo == null) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1);
			}
			else if (COPReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3);
			}
			else {
				bindCOPReportNo = true;

				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCOPReportNo) {
					qPos.add(COPReportNo);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1 = "vrcopProductType.COPReportNo IS NULL";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2 = "vrcopProductType.COPReportNo = ?";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3 = "(vrcopProductType.COPReportNo IS NULL OR vrcopProductType.COPReportNo = '')";

	public VRCOPProductTypePersistenceImpl() {
		setModelClass(VRCOPProductType.class);
	}

	/**
	 * Caches the vrcop product type in the entity cache if it is enabled.
	 *
	 * @param vrcopProductType the vrcop product type
	 */
	@Override
	public void cacheResult(VRCOPProductType vrcopProductType) {
		entityCache.putResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeImpl.class, vrcopProductType.getPrimaryKey(),
			vrcopProductType);

		vrcopProductType.resetOriginalValues();
	}

	/**
	 * Caches the vrcop product types in the entity cache if it is enabled.
	 *
	 * @param vrcopProductTypes the vrcop product types
	 */
	@Override
	public void cacheResult(List<VRCOPProductType> vrcopProductTypes) {
		for (VRCOPProductType vrcopProductType : vrcopProductTypes) {
			if (entityCache.getResult(
						VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductTypeImpl.class,
						vrcopProductType.getPrimaryKey()) == null) {
				cacheResult(vrcopProductType);
			}
			else {
				vrcopProductType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop product types.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPProductTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop product type.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCOPProductType vrcopProductType) {
		entityCache.removeResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeImpl.class, vrcopProductType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRCOPProductType> vrcopProductTypes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPProductType vrcopProductType : vrcopProductTypes) {
			entityCache.removeResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductTypeImpl.class, vrcopProductType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop product type with the primary key. Does not add the vrcop product type to the database.
	 *
	 * @param id the primary key for the new vrcop product type
	 * @return the new vrcop product type
	 */
	@Override
	public VRCOPProductType create(long id) {
		VRCOPProductType vrcopProductType = new VRCOPProductTypeImpl();

		vrcopProductType.setNew(true);
		vrcopProductType.setPrimaryKey(id);

		return vrcopProductType;
	}

	/**
	 * Removes the vrcop product type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop product type
	 * @return the vrcop product type that was removed
	 * @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	 */
	@Override
	public VRCOPProductType remove(long id)
		throws NoSuchVRCOPProductTypeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop product type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop product type
	 * @return the vrcop product type that was removed
	 * @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	 */
	@Override
	public VRCOPProductType remove(Serializable primaryKey)
		throws NoSuchVRCOPProductTypeException {
		Session session = null;

		try {
			session = openSession();

			VRCOPProductType vrcopProductType = (VRCOPProductType)session.get(VRCOPProductTypeImpl.class,
					primaryKey);

			if (vrcopProductType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPProductTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopProductType);
		}
		catch (NoSuchVRCOPProductTypeException nsee) {
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
	protected VRCOPProductType removeImpl(VRCOPProductType vrcopProductType) {
		vrcopProductType = toUnwrappedModel(vrcopProductType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopProductType)) {
				vrcopProductType = (VRCOPProductType)session.get(VRCOPProductTypeImpl.class,
						vrcopProductType.getPrimaryKeyObj());
			}

			if (vrcopProductType != null) {
				session.delete(vrcopProductType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopProductType != null) {
			clearCache(vrcopProductType);
		}

		return vrcopProductType;
	}

	@Override
	public VRCOPProductType updateImpl(VRCOPProductType vrcopProductType) {
		vrcopProductType = toUnwrappedModel(vrcopProductType);

		boolean isNew = vrcopProductType.isNew();

		VRCOPProductTypeModelImpl vrcopProductTypeModelImpl = (VRCOPProductTypeModelImpl)vrcopProductType;

		Session session = null;

		try {
			session = openSession();

			if (vrcopProductType.isNew()) {
				session.save(vrcopProductType);

				vrcopProductType.setNew(false);
			}
			else {
				vrcopProductType = (VRCOPProductType)session.merge(vrcopProductType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCOPProductTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopProductTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductTypeModelImpl.getOriginalCOPReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO,
					args);

				args = new Object[] { vrcopProductTypeModelImpl.getCOPReportNo() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO,
					args);
			}
		}

		entityCache.putResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductTypeImpl.class, vrcopProductType.getPrimaryKey(),
			vrcopProductType, false);

		vrcopProductType.resetOriginalValues();

		return vrcopProductType;
	}

	protected VRCOPProductType toUnwrappedModel(
		VRCOPProductType vrcopProductType) {
		if (vrcopProductType instanceof VRCOPProductTypeImpl) {
			return vrcopProductType;
		}

		VRCOPProductTypeImpl vrcopProductTypeImpl = new VRCOPProductTypeImpl();

		vrcopProductTypeImpl.setNew(vrcopProductType.isNew());
		vrcopProductTypeImpl.setPrimaryKey(vrcopProductType.getPrimaryKey());

		vrcopProductTypeImpl.setId(vrcopProductType.getId());
		vrcopProductTypeImpl.setMtCore(vrcopProductType.getMtCore());
		vrcopProductTypeImpl.setCOPReportRepositoryID(vrcopProductType.getCOPReportRepositoryID());
		vrcopProductTypeImpl.setCOPReportNo(vrcopProductType.getCOPReportNo());
		vrcopProductTypeImpl.setSequenceNo(vrcopProductType.getSequenceNo());
		vrcopProductTypeImpl.setVehicleClass(vrcopProductType.getVehicleClass());
		vrcopProductTypeImpl.setVehicleTypeCode(vrcopProductType.getVehicleTypeCode());
		vrcopProductTypeImpl.setVehicleTypeDescription(vrcopProductType.getVehicleTypeDescription());
		vrcopProductTypeImpl.setProductClassificationCode(vrcopProductType.getProductClassificationCode());
		vrcopProductTypeImpl.setProductClassificationDescription(vrcopProductType.getProductClassificationDescription());
		vrcopProductTypeImpl.setTradeMark(vrcopProductType.getTradeMark());
		vrcopProductTypeImpl.setTradeMarkName(vrcopProductType.getTradeMarkName());
		vrcopProductTypeImpl.setCommercialName(vrcopProductType.getCommercialName());
		vrcopProductTypeImpl.setModelCode(vrcopProductType.getModelCode());
		vrcopProductTypeImpl.setDesignSymbolNo(vrcopProductType.getDesignSymbolNo());
		vrcopProductTypeImpl.setSyncDate(vrcopProductType.getSyncDate());

		return vrcopProductTypeImpl;
	}

	/**
	 * Returns the vrcop product type with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop product type
	 * @return the vrcop product type
	 * @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	 */
	@Override
	public VRCOPProductType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCOPProductTypeException {
		VRCOPProductType vrcopProductType = fetchByPrimaryKey(primaryKey);

		if (vrcopProductType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPProductTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopProductType;
	}

	/**
	 * Returns the vrcop product type with the primary key or throws a {@link NoSuchVRCOPProductTypeException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop product type
	 * @return the vrcop product type
	 * @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	 */
	@Override
	public VRCOPProductType findByPrimaryKey(long id)
		throws NoSuchVRCOPProductTypeException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop product type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop product type
	 * @return the vrcop product type, or <code>null</code> if a vrcop product type with the primary key could not be found
	 */
	@Override
	public VRCOPProductType fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductTypeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPProductType vrcopProductType = (VRCOPProductType)serializable;

		if (vrcopProductType == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopProductType = (VRCOPProductType)session.get(VRCOPProductTypeImpl.class,
						primaryKey);

				if (vrcopProductType != null) {
					cacheResult(vrcopProductType);
				}
				else {
					entityCache.putResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductTypeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopProductType;
	}

	/**
	 * Returns the vrcop product type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop product type
	 * @return the vrcop product type, or <code>null</code> if a vrcop product type with the primary key could not be found
	 */
	@Override
	public VRCOPProductType fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPProductType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPProductType> map = new HashMap<Serializable, VRCOPProductType>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPProductType vrcopProductType = fetchByPrimaryKey(primaryKey);

			if (vrcopProductType != null) {
				map.put(primaryKey, vrcopProductType);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductTypeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCOPProductType)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPPRODUCTTYPE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (VRCOPProductType vrcopProductType : (List<VRCOPProductType>)q.list()) {
				map.put(vrcopProductType.getPrimaryKeyObj(), vrcopProductType);

				cacheResult(vrcopProductType);

				uncachedPrimaryKeys.remove(vrcopProductType.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPProductTypeModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductTypeImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the vrcop product types.
	 *
	 * @return the vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop product types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop product types
	 * @param end the upper bound of the range of vrcop product types (not inclusive)
	 * @return the range of vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop product types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop product types
	 * @param end the upper bound of the range of vrcop product types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findAll(int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop product types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop product types
	 * @param end the upper bound of the range of vrcop product types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop product types
	 */
	@Override
	public List<VRCOPProductType> findAll(int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache) {
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

		List<VRCOPProductType> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductType>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPPRODUCTTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPPRODUCTTYPE;

				if (pagination) {
					sql = sql.concat(VRCOPProductTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPProductType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductType>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vrcop product types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPProductType vrcopProductType : findAll()) {
			remove(vrcopProductType);
		}
	}

	/**
	 * Returns the number of vrcop product types.
	 *
	 * @return the number of vrcop product types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPPRODUCTTYPE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
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
	protected Map<String, Integer> getTableColumnsMap() {
		return VRCOPProductTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop product type persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPProductTypeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPPRODUCTTYPE = "SELECT vrcopProductType FROM VRCOPProductType vrcopProductType";
	private static final String _SQL_SELECT_VRCOPPRODUCTTYPE_WHERE_PKS_IN = "SELECT vrcopProductType FROM VRCOPProductType vrcopProductType WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPPRODUCTTYPE_WHERE = "SELECT vrcopProductType FROM VRCOPProductType vrcopProductType WHERE ";
	private static final String _SQL_COUNT_VRCOPPRODUCTTYPE = "SELECT COUNT(vrcopProductType) FROM VRCOPProductType vrcopProductType";
	private static final String _SQL_COUNT_VRCOPPRODUCTTYPE_WHERE = "SELECT COUNT(vrcopProductType) FROM VRCOPProductType vrcopProductType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopProductType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPProductType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPProductType exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPProductTypePersistenceImpl.class);
}