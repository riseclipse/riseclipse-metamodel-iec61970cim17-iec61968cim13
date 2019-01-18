/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Point Outage Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServicePointOutageSummaryImpl#getCriticalCount <em>Critical Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServicePointOutageSummaryImpl#getTotalCount <em>Total Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicePointOutageSummaryImpl extends MinimalEObjectImpl.Container implements ServicePointOutageSummary {
    /**
     * The default value of the '{@link #getCriticalCount() <em>Critical Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalCount()
     * @generated
     * @ordered
     */
    protected static final Integer CRITICAL_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCriticalCount() <em>Critical Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalCount()
     * @generated
     * @ordered
     */
    protected Integer criticalCount = CRITICAL_COUNT_EDEFAULT;

    /**
     * This is true if the Critical Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean criticalCountESet;

    /**
     * The default value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalCount()
     * @generated
     * @ordered
     */
    protected static final Integer TOTAL_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalCount()
     * @generated
     * @ordered
     */
    protected Integer totalCount = TOTAL_COUNT_EDEFAULT;

    /**
     * This is true if the Total Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean totalCountESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServicePointOutageSummaryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getServicePointOutageSummary();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getCriticalCount() {
        return criticalCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCriticalCount( Integer newCriticalCount ) {
        Integer oldCriticalCount = criticalCount;
        criticalCount = newCriticalCount;
        boolean oldCriticalCountESet = criticalCountESet;
        criticalCountESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__CRITICAL_COUNT,
                        oldCriticalCount, criticalCount, !oldCriticalCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCriticalCount() {
        Integer oldCriticalCount = criticalCount;
        boolean oldCriticalCountESet = criticalCountESet;
        criticalCount = CRITICAL_COUNT_EDEFAULT;
        criticalCountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__CRITICAL_COUNT, oldCriticalCount, CRITICAL_COUNT_EDEFAULT,
                oldCriticalCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCriticalCount() {
        return criticalCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTotalCount( Integer newTotalCount ) {
        Integer oldTotalCount = totalCount;
        totalCount = newTotalCount;
        boolean oldTotalCountESet = totalCountESet;
        totalCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__TOTAL_COUNT, oldTotalCount, totalCount, !oldTotalCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTotalCount() {
        Integer oldTotalCount = totalCount;
        boolean oldTotalCountESet = totalCountESet;
        totalCount = TOTAL_COUNT_EDEFAULT;
        totalCountESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__TOTAL_COUNT,
                        oldTotalCount, TOTAL_COUNT_EDEFAULT, oldTotalCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTotalCount() {
        return totalCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__CRITICAL_COUNT:
            return getCriticalCount();
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__TOTAL_COUNT:
            return getTotalCount();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__CRITICAL_COUNT:
            setCriticalCount( ( Integer ) newValue );
            return;
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__TOTAL_COUNT:
            setTotalCount( ( Integer ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__CRITICAL_COUNT:
            unsetCriticalCount();
            return;
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__TOTAL_COUNT:
            unsetTotalCount();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__CRITICAL_COUNT:
            return isSetCriticalCount();
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY__TOTAL_COUNT:
            return isSetTotalCount();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (criticalCount: " );
        if( criticalCountESet )
            result.append( criticalCount );
        else
            result.append( "<unset>" );
        result.append( ", totalCount: " );
        if( totalCountESet )
            result.append( totalCount );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServicePointOutageSummaryImpl
