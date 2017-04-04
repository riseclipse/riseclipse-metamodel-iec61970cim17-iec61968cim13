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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTimeSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTimeScheduleKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkTimeScheduleImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkTimeScheduleImpl#getBaseWork <em>Base Work</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkTimeScheduleImpl extends TimeScheduleImpl implements WorkTimeSchedule {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final WorkTimeScheduleKind KIND_EDEFAULT = WorkTimeScheduleKind.ESTIMATE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected WorkTimeScheduleKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getBaseWork() <em>Base Work</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseWork()
     * @generated
     * @ordered
     */
    protected BaseWork baseWork;

    /**
     * This is true if the Base Work reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseWorkESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkTimeScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWorkTimeSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkTimeScheduleKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( WorkTimeScheduleKind newKind ) {
        WorkTimeScheduleKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WORK_TIME_SCHEDULE__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        WorkTimeScheduleKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WORK_TIME_SCHEDULE__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseWork getBaseWork() {
        return baseWork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseWork( BaseWork newBaseWork, NotificationChain msgs ) {
        BaseWork oldBaseWork = baseWork;
        baseWork = newBaseWork;
        boolean oldBaseWorkESet = baseWorkESet;
        baseWorkESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WORK_TIME_SCHEDULE__BASE_WORK, oldBaseWork, newBaseWork, !oldBaseWorkESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseWork( BaseWork newBaseWork ) {
        if( newBaseWork != baseWork ) {
            NotificationChain msgs = null;
            if( baseWork != null ) msgs = ( ( InternalEObject ) baseWork ).eInverseRemove( this,
                    CimPackage.BASE_WORK__TIME_SCHEDULES, BaseWork.class, msgs );
            if( newBaseWork != null ) msgs = ( ( InternalEObject ) newBaseWork ).eInverseAdd( this,
                    CimPackage.BASE_WORK__TIME_SCHEDULES, BaseWork.class, msgs );
            msgs = basicSetBaseWork( newBaseWork, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseWorkESet = baseWorkESet;
            baseWorkESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WORK_TIME_SCHEDULE__BASE_WORK, newBaseWork, newBaseWork, !oldBaseWorkESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseWork( NotificationChain msgs ) {
        BaseWork oldBaseWork = baseWork;
        baseWork = null;
        boolean oldBaseWorkESet = baseWorkESet;
        baseWorkESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WORK_TIME_SCHEDULE__BASE_WORK, oldBaseWork, null, oldBaseWorkESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBaseWork() {
        if( baseWork != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseWork ).eInverseRemove( this, CimPackage.BASE_WORK__TIME_SCHEDULES,
                    BaseWork.class, msgs );
            msgs = basicUnsetBaseWork( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseWorkESet = baseWorkESet;
            baseWorkESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WORK_TIME_SCHEDULE__BASE_WORK, null, null, oldBaseWorkESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseWork() {
        return baseWorkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WORK_TIME_SCHEDULE__BASE_WORK:
            if( baseWork != null ) msgs = ( ( InternalEObject ) baseWork ).eInverseRemove( this,
                    CimPackage.BASE_WORK__TIME_SCHEDULES, BaseWork.class, msgs );
            return basicSetBaseWork( ( BaseWork ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WORK_TIME_SCHEDULE__BASE_WORK:
            return basicUnsetBaseWork( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.WORK_TIME_SCHEDULE__KIND:
            return getKind();
        case CimPackage.WORK_TIME_SCHEDULE__BASE_WORK:
            return getBaseWork();
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
        case CimPackage.WORK_TIME_SCHEDULE__KIND:
            setKind( ( WorkTimeScheduleKind ) newValue );
            return;
        case CimPackage.WORK_TIME_SCHEDULE__BASE_WORK:
            setBaseWork( ( BaseWork ) newValue );
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
        case CimPackage.WORK_TIME_SCHEDULE__KIND:
            unsetKind();
            return;
        case CimPackage.WORK_TIME_SCHEDULE__BASE_WORK:
            unsetBaseWork();
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
        case CimPackage.WORK_TIME_SCHEDULE__KIND:
            return isSetKind();
        case CimPackage.WORK_TIME_SCHEDULE__BASE_WORK:
            return isSetBaseWork();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WorkTimeScheduleImpl
