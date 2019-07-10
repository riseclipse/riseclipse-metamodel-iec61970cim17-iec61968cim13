/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkActivityRecord;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Activity Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkActivityRecordImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WorkActivityRecordImpl#getBaseWork <em>Base Work</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkActivityRecordImpl extends ActivityRecordImpl implements WorkActivityRecord {
    /**
     * The default value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPercentComplete()
     * @generated
     * @ordered
     */
    protected static final Float PERCENT_COMPLETE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPercentComplete()
     * @generated
     * @ordered
     */
    protected Float percentComplete = PERCENT_COMPLETE_EDEFAULT;

    /**
     * This is true if the Percent Complete attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean percentCompleteESet;

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
    protected WorkActivityRecordImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWorkActivityRecord();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPercentComplete() {
        return percentComplete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPercentComplete( Float newPercentComplete ) {
        Float oldPercentComplete = percentComplete;
        percentComplete = newPercentComplete;
        boolean oldPercentCompleteESet = percentCompleteESet;
        percentCompleteESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WORK_ACTIVITY_RECORD__PERCENT_COMPLETE,
                    oldPercentComplete, percentComplete, !oldPercentCompleteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPercentComplete() {
        Float oldPercentComplete = percentComplete;
        boolean oldPercentCompleteESet = percentCompleteESet;
        percentComplete = PERCENT_COMPLETE_EDEFAULT;
        percentCompleteESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WORK_ACTIVITY_RECORD__PERCENT_COMPLETE,
                    oldPercentComplete, PERCENT_COMPLETE_EDEFAULT, oldPercentCompleteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPercentComplete() {
        return percentCompleteESet;
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
                    CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK, oldBaseWork, newBaseWork, !oldBaseWorkESet );
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
                    CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS, BaseWork.class, msgs );
            if( newBaseWork != null ) msgs = ( ( InternalEObject ) newBaseWork ).eInverseAdd( this,
                    CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS, BaseWork.class, msgs );
            msgs = basicSetBaseWork( newBaseWork, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseWorkESet = baseWorkESet;
            baseWorkESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK, newBaseWork, newBaseWork, !oldBaseWorkESet ) );
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
                    CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK, oldBaseWork, null, oldBaseWorkESet );
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
            msgs = ( ( InternalEObject ) baseWork ).eInverseRemove( this, CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS,
                    BaseWork.class, msgs );
            msgs = basicUnsetBaseWork( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseWorkESet = baseWorkESet;
            baseWorkESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK, null, null, oldBaseWorkESet ) );
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
        case CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK:
            if( baseWork != null ) msgs = ( ( InternalEObject ) baseWork ).eInverseRemove( this,
                    CimPackage.BASE_WORK__WORK_ACTIVITY_RECORDS, BaseWork.class, msgs );
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
        case CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK:
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
        case CimPackage.WORK_ACTIVITY_RECORD__PERCENT_COMPLETE:
            return getPercentComplete();
        case CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK:
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
        case CimPackage.WORK_ACTIVITY_RECORD__PERCENT_COMPLETE:
            setPercentComplete( ( Float ) newValue );
            return;
        case CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK:
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
        case CimPackage.WORK_ACTIVITY_RECORD__PERCENT_COMPLETE:
            unsetPercentComplete();
            return;
        case CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK:
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
        case CimPackage.WORK_ACTIVITY_RECORD__PERCENT_COMPLETE:
            return isSetPercentComplete();
        case CimPackage.WORK_ACTIVITY_RECORD__BASE_WORK:
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (percentComplete: " );
        if( percentCompleteESet )
            result.append( percentComplete );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WorkActivityRecordImpl
